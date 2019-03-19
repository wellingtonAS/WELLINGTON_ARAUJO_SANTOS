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
public class Gerente extends Empregado{
    private String departamento;
    
    public void setDepartamento(String departamento){
        this.departamento = departamento;
    }
    public String getDepartamento(){
        return departamento;
    }
    public void Gerente(){
        this.departamento = "DRCA";
    }

    @Override
    public String toString() {
        return "Empregado{"+"nome=" + this.getNome() + " salario=" + this.getSalario() + " Gerente{" + "departamento=" + departamento + '}';
    }
    
}
