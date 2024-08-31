/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alexandre.aulajava;

import java.util.Scanner;

/**
 *
 * @author Alexandre
 */
public class Soma {
    public static void main(String[] args) {
        //cria um Scanner para obter entrada a partir da janela de comando
        Scanner entrada = new Scanner(System.in);
        int numberOne, n2, sum;
        
        System.out.print("Digite o primeiro número: ");
        numberOne = entrada.nextInt();
        
        System.out.print("Digite o segundo número: ");
        n2 = entrada.nextInt();
        
        sum = numberOne + n2;
        
        System.out.println("A soma é: "+ sum);
    }
}
