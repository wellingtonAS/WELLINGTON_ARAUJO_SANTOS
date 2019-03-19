/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao2_heranca;

/**
 *
 * @author Usuário
 */
public class Empregado {
    private String nome;
    protected float salario;
    
  
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    public void setSalario(float salario){
        this.salario = salario;
    }
    public float getSalario(){
        return salario;
    }
    public void Empregado(){
        this.nome = "Wellington";
        this.salario = 1100;
    }
    @Override
    public String toString() {
        return "Empregado{" + "nome=" + nome + ", salario=" + salario + '}';
    }
    
}
