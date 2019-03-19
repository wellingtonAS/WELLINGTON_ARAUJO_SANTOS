/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questão5_encapsulamento;

/**
 *
 * @author Usuário
 */
public class Base {
    protected int a;
    private int b;
    public int c;
}
public class Basinha extends Base {
    public int c;
    public void fazerMetodo(){
        a=b+c;
    }
}

Baseado no conceito de encapsulamento, torna-se perceptível na Classe fazerMetodo()
o problema gerado na atribuição do valor "a", pois como resultado temos adição do valor
"b", que por sua vez tem sua visibilidade privada, ou seja, é apenas visível na classe Base, e não
fora dela. Logo necessita dos método acessor e modificar(gettres e setters) para realizar tal atribição! 
