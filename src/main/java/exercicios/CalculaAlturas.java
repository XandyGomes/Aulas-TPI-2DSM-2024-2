/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

 /*

Tem-se um conjunto de dados contendo a altura e o sexo “M” Masculino
e “F” Feminino de 5 pessoas.
Fazer um programa em JAVA que calcule e escreva:

a) A maior e a menor altura do grupo;
b) A média de altura dos homens;
c) A quantidade de mulheres.
 */
package exercicios;

import java.util.Scanner;

/**
 *
 * @author Alexandre
 */
public class CalculaAlturas {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double maiorAltura = 0.0;
        double menorAltura = 5.0;
        double somaAlturasHomens = 0.0;
        int numMulheres = 0;
        int numHomens = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite a altura da pessoa " + i + ": ");
            double altura = entrada.nextDouble();
            System.out.print("Digite o sexo da pessoa " + i + " (M/F: ");
            String sexo = entrada.next();

            if (altura > maiorAltura) {
                maiorAltura = altura;
            }
            if (altura < menorAltura) {
                menorAltura = altura;
            }
            if ("M".equals(sexo) || "m".equals(sexo)) {
                somaAlturasHomens += altura;
                numHomens++;
            } else {
                numMulheres++;
            }
        }

        double mediaAlturasHomens = somaAlturasHomens / numHomens;
        System.out.println("Maior altura: " + maiorAltura);
        System.out.println("Menor altura: " + menorAltura);
        System.out.println("Média de altura dos Homens: " + mediaAlturasHomens);
        System.out.println("Número de mulheres: " + numMulheres);

    }
}
