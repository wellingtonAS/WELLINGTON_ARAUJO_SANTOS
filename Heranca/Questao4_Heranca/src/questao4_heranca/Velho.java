/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao4_heranca;

/**
 *
 * @author Usuário
 */
public class Velho {
    private float descontoPreco;
    
    public void setDescontoPreco(float descontoPreco){
        this.descontoPreco = descontoPreco;
    }
    public float getDescontoPreco(){
        return descontoPreco;
    }
    public void Velho(){
        this.descontoPreco = 10;
    }

    @Override
    public String toString() {
        return "Velho{" + "descontoPreco=" + descontoPreco + '}';
    }
    
}
