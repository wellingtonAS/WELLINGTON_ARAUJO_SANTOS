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
public class Ingresso {
    private float valor;
    
    public void setValor(float valor){
        this.valor = valor;
    }
    public float getValor(){
        return this.valor;
    }
    
    public void Ingresso(){
        this.valor = 100;
    }
    @Override
    public String toString() {
        return "Ingresso{" + "valor=" + this.getValor() + '}';
    }
    
    
}
