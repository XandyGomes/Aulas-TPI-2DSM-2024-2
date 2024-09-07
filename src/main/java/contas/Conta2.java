/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contas;

/**
 *
 * @author Alexandre
 */
//a classe Conta2 com um construtor que inicializa o nome
public class Conta2 {
    private String name; //variavel de instância 
    
    //o construtor que inicializa name com o nome do parâmetro
    public Conta2(String name){
        this.name = name;
    }

    //método para recuperar o nome
    public String getName() {
        return name;
    }

    //método para configurar o nome
    public void setName(String name) {
        this.name = name;
    }
}
