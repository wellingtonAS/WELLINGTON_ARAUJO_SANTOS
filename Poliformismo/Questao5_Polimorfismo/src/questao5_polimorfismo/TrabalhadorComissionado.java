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
public class TrabalhadorComissionado extends Empregado{
    private double salario;
    private double comissao;
    private double qtdVendas;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public double getQtdVendas() {
        return qtdVendas;
    }

    public void setQtdVendas(double qtdVendas) {
        this.qtdVendas = qtdVendas;
    }

    @Override
    public void calcularGanho(){
        System.out.println(this.getSalario() + this.getComissao() * this.getQtdVendas());
    }
    
    
}
