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
public class TesteConta1 {
    public static void main(String[] args) {
        //criar um objeto Scanner para obter entreda a partir da janela de comando
        Scanner input = new Scanner(System.in);
        String nome;
        
        //cria um objeto Conta1 e o atribui a minhaConta
        Conta1 minhaConta = new Conta1();
        
        //exibe o valor inicia do nome (null)
        System.out.printf("O nome inicial é: %s%n%n", minhaConta.getName());
        
        System.out.print("Entre com o nome: ");
        nome = input.nextLine();
        minhaConta.setName(nome);
        
        System.out.printf("O nome do objeto em minhaConta é: %n%s", minhaConta.getName());
    }
}