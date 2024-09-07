/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contas;

import java.util.Scanner;

/**
 *
 * @author Alexandre
 */
public class TodasContas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Conta1 primeiroObj = new Conta1();
        
        System.out.println("Digite o nome do primeiro objeto: ");
        String nome = input.nextLine();
        primeiroObj.setName(nome);
        
        Conta2 segundoObj = new Conta2("Gomes");
        Conta2 terceiroObj = new Conta2("Silva");
        
        System.out.printf("Os nomes de todos os objs: %s %s %s",
                primeiroObj.getName(),
                segundoObj.getName(), 
                terceiroObj.getName()
        );
    }
    
}
