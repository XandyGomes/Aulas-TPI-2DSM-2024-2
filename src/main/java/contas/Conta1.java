/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contas;

/**
 *
 * @author Alexandre
 */

//classe Conta1 que contém uma variavel de instância "name"
//e métodos para configurar e obter seu valor
public class Conta1 {
    private String name; //variavel de instância
    
    //método para definir o nome no objeto
    public void setName(String name){
        this.name = name; // armazena o nome
    }
    
    //método para recuprear o nome do objeto
    public String getName(){
        return name; //retorna valor do nome para chamador
    }
}//fim da classe Conta1