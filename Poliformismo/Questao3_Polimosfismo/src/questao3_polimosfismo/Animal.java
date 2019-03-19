/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao3_polimosfismo;

/**
 *
 * @author Usuário
 */
public abstract class Animal {
    private String descricao;
    private String nome;
    public abstract  void locomover();
    public abstract void alimentar();

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
