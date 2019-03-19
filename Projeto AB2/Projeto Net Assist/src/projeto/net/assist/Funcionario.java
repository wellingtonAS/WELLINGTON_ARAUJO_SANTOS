/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.net.assist;

/**
 *
 * @author Usuário
 */
public abstract class Funcionario extends Pessoa{
    private boolean sessao;
    public abstract void iniciarSessao();
    
    //Set Method
    public void setSessao(boolean sessao){
        this.sessao = sessao;
    }
    //Get Method
    public boolean getSessao(){
        return sessao;
    }
    //Constructor Method to initialize 'sessao' like false
    public Funcionario(){
        this.sessao = false;
    }
}
