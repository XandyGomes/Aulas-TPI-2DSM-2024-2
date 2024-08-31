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
public class Produto {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int x, y, z, result;
        
        System.out.print("Digite o 1º numero: ");
        x = input.nextInt();
        
        System.out.print("Digite o 2º numero: ");
        y = input.nextInt();
        
        System.out.print("Digite o 3º numero: ");
        z = input.nextInt();
        
        result = x * y * z;
        
        System.out.printf("O produto é %d%n", result );
    }
}
