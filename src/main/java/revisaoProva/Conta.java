/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package revisaoProva;

/**
 *
 * @author Alexandre
 */
public class Conta {
    private int numero;
    private double saldo;
    
    public Conta(){
        this.numero = 0;
        this.saldo = 0.0;
    }
    
    public void inicializar(int numero, double saldo){
        this.numero = numero;
        this.saldo = saldo;
    }    
            
    public void depositar(double valor){
        this.saldo += valor;
    }
    
    public void sacar(double valor){
        if(valor <= this.saldo){
            this.saldo -= valor;        
        }else{
            System.out.println("Saldo insuficiente");
        }
        
    }
                            
    public void transferir(double valor, Conta contaDestino){
        if(valor <= this.saldo){
            this.sacar(valor);
            contaDestino.depositar(valor);
        }else{
            System.out.println("Não há saldo para tranferência");
        }
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
      
}
