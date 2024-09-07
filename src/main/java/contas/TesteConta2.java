/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contas;

/**
 *
 * @author Alexandre
 */

//usando o construtor de Conta2 para inicializar a instância name no 
//momento em que cada objeto Conta2 é criado
public class TesteConta2 {
    public static void main(String[] args) {
        //cria dois obejtos Conta2
        Conta2 minhaConta1 = new Conta2("Alexandre");
        Conta2 minhaConta2 = new Conta2("Gomes");
        
        
        System.out.printf("Os nomes dos objetos são: %s %s",
                minhaConta1.getName(), minhaConta2.getName());   
    }           
}
