/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

// Herencia: LeyOhm hereda de Calculo
public class LeyOhm extends Calculo {
    private String tipoCalculo; // "V", "I" o "R"

    public LeyOhm(String tipoCalculo) {
        this.tipoCalculo = tipoCalculo;
    }

    // Polimorfismo: sobreescribimos el metodo calcular
    @Override
    public double calcular() {
        switch (tipoCalculo) {
            case "V":
                return corriente * resistencia; // V = I * R
            case "I":
                return voltaje / resistencia;   // I = V / R
            case "R":
                return voltaje / corriente;    // R = V / I
            default:
                return 0;
        }
    }
}
