/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package veiculo;

/**
 *
 * @author Alexandre
 */
public class Motocicleta extends Veiculo{

    @Override
    public void acelerar(Integer valor) {
        System.out.println("Acelerou: " + valor + " km");
        
    }

    @Override
    public void frear(Integer valor) {
        System.out.println("Freou: " + valor + " km");
    }
    
}
