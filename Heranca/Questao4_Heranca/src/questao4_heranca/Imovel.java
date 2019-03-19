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
public class Imovel {
    private String local;
    private float preco;
    
    public void setLocal(String local){
        this.local = local;
    }
    public void setPreco(float preco){
        this.preco = preco;
    }
    public String getLocal(){
        return local;
    }
    public float getPreco(){
        return preco;
    }
    
    public void Imovel(){
        this.preco = 100;
    }
}
