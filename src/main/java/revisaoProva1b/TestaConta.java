/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package revisaoProva;

/**
 *
 * @author Alexandre
 */
public class TestaConta {
    public static void main(String[] args) {
        Conta conta1 = new Conta();
        conta1.inicializar(1234, 150.0);
        
        System.out.println("Saldo inicial=> Conta: "
                + conta1.getNumero() + " Saldo: " 
                + conta1.getSaldo());
        
        conta1.depositar(50.0);
        
        System.out.println("Saldo após depósito=> Conta: "
                + conta1.getNumero() + " Saldo: " 
                + conta1.getSaldo());
       
        Conta conta2 = new Conta();
        conta2.inicializar(4321, 500.0);
        
        System.out.println("Saldo inicial=> Conta: "
                + conta2.getNumero() + " Saldo: " 
                + conta2.getSaldo());        
        
        conta2.depositar(100.0);
        
        System.out.println("Saldo após depósito=> Conta: "
                + conta2.getNumero() + " Saldo: " 
                + conta2.getSaldo());
        
        conta1.transferir(100.0, conta2);
        
        System.out.println("Saldo após transferência=> Conta: "
                + conta1.getNumero() + " Saldo: " 
                + conta1.getSaldo());
        
        System.out.println("Saldo após transferência=> Conta: "
                + conta2.getNumero() + " Saldo: " 
                + conta2.getSaldo());
        
    }
}
