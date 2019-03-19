/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao1_polimorfismo;

/**
 *
 * @author Usuário
 */
public class Funcionario implements Login{
    private String nome;
    private String cpf;
    private String email;
    private String rg;
    private String dataNascimento;
    private String funcao;
    private String senha;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
        if(this.funcao =="Gerente"){
            System.out.println(this.getNome() + " É GERENTE");
        }
        else{
            if(this.getFuncao() == "Atendente"){
                System.out.println(this.getNome() + " É ATENDENTE");
            }
        }
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    @Override
    public void realizarLogin(){
        System.out.println("Login Realizado");
    }    
}
