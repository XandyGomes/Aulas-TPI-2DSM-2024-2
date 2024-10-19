/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package correcaodaprova1b;

/**
 *
 * @author Alexandre
 */
public class CalculadoraIPI {
    
    private double porcentagemIPI;
    
    public CalculadoraIPI(double porcetagemIPI){
        this.porcentagemIPI = porcetagemIPI;
    }
    
    
    public double calcularValorTotalComIpi(double valorTotalSemIpi){
        double valorIPI = valorTotalSemIpi * (porcentagemIPI / 100);
        return valorTotalSemIpi + valorIPI;
    }
    
}
