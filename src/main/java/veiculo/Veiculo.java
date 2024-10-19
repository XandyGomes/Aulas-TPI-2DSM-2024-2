/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package veiculo;

/**
 *
 * @author Alexandre
 */
public abstract class Veiculo implements IVeiculo {
    private Integer velocidade;
    private String placa;
    private String chassi;
    private Integer ano;
    private Double valor;
    
    public static Double calcularValorVenda(Veiculo valor){
        return valor.getValor() - (valor.getAno() * 0.10);
    }
    

    public Integer getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(Integer velocidade) {
        this.velocidade = velocidade;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
    
    @Override
    public void ligar(){
        System.out.println("Ligado");
    }

    @Override
    public void desligar(){
        System.out.println("Ligado");
    }

    
}
