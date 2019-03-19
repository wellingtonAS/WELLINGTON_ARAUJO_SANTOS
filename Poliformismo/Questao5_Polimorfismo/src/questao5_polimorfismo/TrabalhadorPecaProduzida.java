/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao5_polimorfismo;

/**
 *
 * @author Usuário
 */
public class TrabalhadorPecaProduzida extends Empregado{
    private double remuneracao;
    private int qtdProduzida;

    public double getRemuneracao() {
        return remuneracao;
    }

    public void setRemuneracao(double remuneracao) {
        this.remuneracao = remuneracao;
    }

    public int getQtdProduzida() {
        return qtdProduzida;
    }

    public void setQtdProduzida(int qtdProduzida) {
        this.qtdProduzida = qtdProduzida;
    }

    @Override
    public void calcularGanho(){
        System.out.println(this.getRemuneracao() * this.getQtdProduzida());
    }
    
    
}
