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
public class Atendente extends Funcionario implements Pagamento{
    
    public void receberChamadas(){
        
    }
    public void efetuarLigacoes(){
        
    } 
    public void abrirOs(){
        
    }
    public void direcionarOs(){
        
    }
    public void consultarCliente(){
        
    }
    //Initializing sessao with Atendente
    @Override
    public void iniciarSessao(){
        this.setSessao(true);
    }

    @Override
    public void receberPagamentos(){
        //Receber pagamentos
    }
    
}
