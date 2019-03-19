/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao1_heranca;

/**
 *
 * @author Usuário
 */
public class IngressoVip extends Ingresso{
    private float valorAdicional;
    
    public float getValorTotal(){
        return this.getValorAdicional() + this.getValor();
    }
    
    public void setValorAdicional(float valorAdicional){
        this.valorAdicional = valorAdicional;
    }
    public float getValorAdicional(){
        return this.valorAdicional;
    }
    
    public void IngressoVip(){
        this.valorAdicional = 50;
    }
    @Override
    public String toString() {
        return "IngressoVip{" + "valorAdicional=" + this.getValorTotal() + '}';
    }
    
    
}
