/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package politecnico_calculadora_2;

/**
 *
 * @author Harol
 */


/**
 * Clase Calculadora que realiza operaciones básicas entre dos números.
 */
public class Calculadora {
    // Atributos privados
    private double numero1;
    private double numero2;

    /**
     * Constructor de la clase Calculadora.
     * @param numero1 Primer número para las operaciones.
     * @param numero2 Segundo número para las operaciones.
     */
    public Calculadora(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    // Métodos Getter y Setter
    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    /**
     * Método para sumar los dos números.
     * @return Resultado de la suma.
     */
    public double sumar() {
        return numero1 + numero2;
    }

    /**
     * Método para restar los dos números.
     * @return Resultado de la resta.
     */
    public double restar() {
        return numero1 - numero2;
    }

    /**
     * Método para multiplicar los dos números.
     * @return Resultado de la multiplicación.
     */
    public double multiplicar() {
        return numero1 * numero2;
    }

    /**
     * Método para dividir los dos números.
     * @return Resultado de la división.
     * @throws ArithmeticException Si se intenta dividir por cero.
     */
    public double dividir() {
        if (numero2 == 0) {
            throw new ArithmeticException("Error: No se puede dividir por cero.");
        }
        return numero1 / numero2;
    }

    /**
     * Método para calcular la potencia de numero1 elevado a numero2.
     * @return Resultado de la potencia.
     * @throws ArithmeticException Si hay una operación indefinida como 0^0.
     */
    public double potencia() {
        if (numero1 == 0 && numero2 == 0) {
            throw new ArithmeticException("Error: La potencia 0^0 es indefinida.");
        }
        return Math.pow(numero1, numero2);
    }
}
