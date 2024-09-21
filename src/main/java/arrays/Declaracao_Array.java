/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays;

import java.awt.datatransfer.DataFlavor;

/**
 *
 * @author Alexandre
 */
public class Declaracao_Array {
    public static void main(String[] args) {
        // uma forma de fazer uma declaraçao de array [] 
        int[] a = new int[4];
        
        //outra maneira
        int[] b;
        b = new int[10];
        
        //declarar variso arrays
        int[] r = new int[44], k = new int[23];
        
        //inicializar valores em um array na declaração {}
        int[] iniciar = {12, 32, 54, 6, 8, 89, 64, 6};
        String[] nomes = {"ale", "jose", "sergio"};
        double[] numeros = {10.1, 15.6, 7.8};
        
        int[] meuArray;
        meuArray = new int[10];
        
        meuArray [0] = 100;
        meuArray [1] = 102;
        meuArray [2] = 105;
        meuArray [3] = 109;
        meuArray [4] = 115;
        meuArray [5] = 120;
        meuArray [6] = 130;
        meuArray [7] = 1154;
        meuArray [8] = 125;
        meuArray [9] = 111;
//        meuArray [10] = 1125; //estoura a pilha;
        
        System.out.println(meuArray[9]);
//        System.out.println(meuArray[10]);
    }
}
