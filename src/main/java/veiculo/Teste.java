/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package veiculo;

/**
 *
 * @author Alexandre
 */
public class Teste {
    public static void main(String[] args) {
        
        Automovel auto = new Automovel();
        Motocicleta moto = new Motocicleta();
        
        System.out.println("###AUTOMÓVEL###");
        auto.ligar();
        auto.acelerar(100);
        auto.frear(20);
        auto.desligar();
        auto.setValor(75000.0);
        auto.setAno(2024);
        
        System.out.println("Valor de venda à vista do automóvel é: "
                + Veiculo.calcularValorVenda(auto) + " e o ano do automóvel é "
                + auto.getAno()
        );
        
        System.out.println("===============================");
        System.out.println();
        
        System.out.println("###MOTOCICLETA###");
        moto.ligar();
        moto.acelerar(70);
        moto.frear(10);
        moto.desligar();
        moto.setValor(15000.0);
        moto.setAno(2020);
        
        System.out.println("Valor de venda à vista da motocicleta é: "
                + Veiculo.calcularValorVenda(moto) + " e o ano da motocicleta é "
                + moto.getAno()
        ); 
    }
}
