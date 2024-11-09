package correcaoDaprova1b;


import correcaoDaprova1b.CalculadoraIPI;
import correcaoDaprova1b.DadosCompra;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Alexandre
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        //Leia a porcentagem do IPI do usuário.;
        System.out.print("Digite a porcentagem do IPI: ");
        double porcentagemIPI = scanner.nextDouble();
        
        //Leia os dados da compra do usuário.
        
        //Dados da peça 1
        System.out.println("**Dados da Peça 1:**");
        System.out.print("Código: ");
        int codigoPeca1 = scanner.nextInt();
        System.out.print("Valor unitário: ");
        double valorUnitarioPeca1 = scanner.nextDouble();
        System.out.print("Quantidade: ");
        int quantidadePeca1 = scanner.nextInt();
        
        //Dados da peça 2
        System.out.println("**Dados da Peça 2:**");
        System.out.print("Código: ");
        int codigoPeca2 = scanner.nextInt();
        System.out.print("Valor unitário: ");
        double valorUnitarioPeca2 = scanner.nextDouble();
        System.out.print("Quantidade: ");
        int quantidadePeca2 = scanner.nextInt();
  
       
        //Crie objetos das classes CalculadoraIPI e DadosCompra.
        CalculadoraIPI calculadoraIPI = new CalculadoraIPI(porcentagemIPI);
        DadosCompra produto1 = new DadosCompra(codigoPeca1, valorUnitarioPeca1, quantidadePeca1);
        DadosCompra produto2 = new DadosCompra(codigoPeca2, valorUnitarioPeca2, quantidadePeca2);
        
        //Calcule o valor total sem IPI.
        double valorTotalSemIpi = produto1.calcularValorTotalSemIpi() + produto2.calcularValorTotalSemIpi();
        
        //Calcule o valor total com IPI.
        double ValorTotalComIpi = calculadoraIPI.calcularValorTotalComIpi(valorTotalSemIpi);
        
        double ValorTotalIPI = ValorTotalComIpi - valorTotalSemIpi;
        
        //Imprima os resultados:
        System.out.println("\n**Resultados:**");
        System.out.printf("Valor total dos produtos sem IPI: R$ %.2f\n", valorTotalSemIpi);
        System.out.printf("Valor total dos IPI's: R$ %.2f\n", ValorTotalIPI);
        System.out.printf("Valor total dos produtos com IPI: R$ %.2f\n", ValorTotalComIpi);
        
        
    }
    
}
