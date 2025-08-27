package polimaquilla;

import java.awt.event.*;
import java.util.*;

public class TiendaControlador {
    private List<Producto> productos;
    private TiendaVista vista;

    public TiendaControlador(TiendaVista vista) {
        this.vista = vista;
        productos = new ArrayList<>();
        inicializarProductos();
        vista.mostrarProductos(productos);

        // Listeners
        vista.getBtnAgregar().addActionListener(e -> agregarProducto());
        vista.getBtnLimpiar().addActionListener(e -> vista.limpiarFormulario());
        vista.getBtnComprar().addActionListener(e -> comprarProducto());
    }

    private void inicializarProductos() {
        productos.add(new Producto("Labial Rojo", 25000.0, 5));
        productos.add(new Producto("Base Liquida", 40000.0, 3));
        productos.add(new Producto("Sombras", 30000.0, 2));
    }

    private void agregarProducto() {
        String nombre = vista.getTxtNombre().getText().trim();
        String precioText = vista.getTxtPrecio().getText().trim();
        String stockText = vista.getTxtStock().getText().trim();

        if (nombre.isEmpty()) {
            vista.mostrarMensaje("El nombre no puede estar vacio.");
            return;
        }

        double precio;
        int stock;
        try {
            precio = Double.parseDouble(precioText);
            if (precio < 0) {
                vista.mostrarMensaje("El precio debe ser un numero positivo.");
                return;
            }
        } catch (NumberFormatException ex) {
            vista.mostrarMensaje("Precio invalido. Usa numeros, ejemplo: 25000 o 25000.0");
            return;
        }

        try {
            stock = Integer.parseInt(stockText);
            if (stock < 0) {
                vista.mostrarMensaje("El stock debe ser un entero >= 0.");
                return;
            }
        } catch (NumberFormatException ex) {
            vista.mostrarMensaje("Stock invalido. Usa un numero entero, ejemplo: 5");
            return;
        }

        Producto nuevo = new Producto(nombre, precio, stock);
        productos.add(nuevo);
        vista.mostrarProductos(productos);
        vista.mostrarMensaje("Producto agregado: " + nuevo.getNombre());
        vista.limpiarFormulario();
    }

    private void comprarProducto() {
        // Intentar comprar el producto seleccionado en la tabla
        int filaSeleccionada = vista.getTablaProductos().getSelectedRow();

        if (filaSeleccionada != -1 && filaSeleccionada < productos.size()) {
            Producto p = productos.get(filaSeleccionada);
            procesarCompra(p);
            return;
        }

        // Si no hay seleccion, buscar el primer producto con stock > 0
        for (Producto p : productos) {
            if (p.getStock() > 0) {
                procesarCompra(p);
                return;
            }
        }

        vista.mostrarMensaje("No hay productos disponibles para comprar.");
    }

    private void procesarCompra(Producto p) {
        if (p.getStock() <= 0) {
            vista.mostrarMensaje("El producto " + p.getNombre() + " esta sin stock.");
            return;
        }
        p.setStock(p.getStock() - 1);
        vista.mostrarProductos(productos);
        vista.mostrarMensaje("Has comprado: " + p.getNombre() + " por $" + p.getPrecio()
                + "\nStock restante: " + p.getStock());
    }
}
