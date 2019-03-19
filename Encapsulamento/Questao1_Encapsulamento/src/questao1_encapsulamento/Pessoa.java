/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao1_encapsulamento;

/**
 *
 * @author Usuário
 */
//Class Pessoa and you attributes;
public class Pessoa {
    private String nome;
    private String cpf;
    private String sobrenome;
    
    //Join Method
    public String getNomeCompleto(){
        return this.getNome()+ (" ") + this.getSobrenome();
    }
    //Constructor Method the of Class Pessoa
    public void Pessoa(){
        this.nome = "Wellington";
        this.cpf = "321.321.321-32";
        this.sobrenome = "Araújo";
    }
    //Getters Method
    public String getNome(){
        return this.nome;
    }
    public String getCpf(){
        return this.cpf;
    }
    public String getSobrenome(){
        return this.sobrenome;
    }
    //Setters Method
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setCpf(){
        this.cpf = cpf;
    }
    public void setSobrenome(){
        this.sobrenome = sobrenome;
    }
}
    
