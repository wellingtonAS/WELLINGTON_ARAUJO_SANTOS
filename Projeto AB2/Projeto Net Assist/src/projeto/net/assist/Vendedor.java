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
public class Vendedor extends Funcionario{
    private String credencial;
    
    public void setCredencial(String credecial){
        this.credencial = credencial;
    }
    public String getCredencial(){
        return credencial;
    }
    
    @Override
    public void iniciarSessao(){
        
    }
}
