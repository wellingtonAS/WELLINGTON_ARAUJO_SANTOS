/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao3_encapsulamento;

/**
 *
 * @author Usuário
 */
public class Conta {
    private int numero;
    private float saldo;
    
    public void deposito(float valor){
        this.saldo +=  valor;
    }
    public void saque(int num, float valor){
        if(this.validarSaque(valor)== true && this.validarConta(num) == true){
            this.saldo-= valor;
            System.out.println("Saque Realizado com Sucesso!");
        }
        else{
            System.out.println("Saldo insuficiente!");
        }
    }
    public boolean validarSaque(float valor){
        if(this.saldo >= valor){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean validarConta(int num){
        if(this.numero == num){
            return true;
        }
        else{
            return false;
        }
    }
    //Construct Method
    public Conta(){
        this.setSaldo(0);
        this.numero = 123;
    }
    //Setters Method
    public void setNumero(int numero){
        this.numero = numero;
    }
    public void setSaldo(int saldo){
        this.saldo = saldo;
    }
    //Getters Method
    public int getNumero(){
        return this.numero;
    }
    public float getSaldo(){
        return this.saldo;
    }
}
