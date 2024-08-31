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
public class Comparacao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1, number2;
        
        System.out.print("Digite o primeiro numero: ");
        number1 = input.nextInt();
        
        System.out.print("Digite o segundo numero: ");
        number2 = input.nextInt();
        
        if(number1 == number2)
            System.out.printf("%d == %d%n", number1, number2 );
        
        if(number1 != number2)
            System.out.printf("%d != %d%n", number1, number2 );
        
        if(number1 < number2)
            System.out.printf("%d < %d%n", number1, number2 );
        
        if(number1 > number2)
            System.out.printf("%d > %d%n", number1, number2 );
        
        if(number1 <= number2)
            System.out.printf("%d <= %d%n", number1, number2 );
        
        if(number1 >= number2)
            System.out.printf("%d >= %d%n", number1, number2 );    
    }
}
