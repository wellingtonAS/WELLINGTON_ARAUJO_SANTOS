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
public class Chefe extends Empregado{
    private double salarioMensal;

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }

    @Override
    public void calcularGanho(){
        System.out.println(this.getSalarioMensal());
    }
    
}
