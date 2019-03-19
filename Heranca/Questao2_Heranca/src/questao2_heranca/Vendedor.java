/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao2_heranca;

/**
 *
 * @author Usuário
 */
public class Vendedor extends Empregado{
    private float percentualComissao;
    public float calcularSalario(){
        return this.salario + percentualComissao;
    }
    
    public void setPercentualComissao(float percentualComissao){
        this.percentualComissao = percentualComissao;
    }
    public float getPecentualComissao(){
        return percentualComissao;
    }
    @Override
    public String toString() {
        return "Vendedor{" + "percentualComissao=" + percentualComissao + '}';
    }
    
    public void Vendedor(){
        this.percentualComissao = 15;
    }
}
