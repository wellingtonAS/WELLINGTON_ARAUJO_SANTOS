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
public class Novo extends Imovel{
    private float adicionarPreco;
    public void Novo(){
        this.adicionarPreco = 15;
    }
    public void setAdicionarPreco(float adicionarPreco){
        this.adicionarPreco = adicionarPreco + this.getPreco();
    }
    public float getAdicionarPreco(){
        return adicionarPreco;
    }
    @Override
    public String toString() {
        return "Novo{" + "adicionarPreco=" + adicionarPreco + '}';
    }
    
}
