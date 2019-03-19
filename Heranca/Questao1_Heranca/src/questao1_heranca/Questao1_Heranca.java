/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao1_heranca;

/**
 *
 * @author Usuário
 */
public class Questao1_Heranca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Ingresso ingresso1 = new Ingresso();
        IngressoVip ingresso2 = new IngressoVip();
        ingresso2.Ingresso();
        ingresso2.IngressoVip();
        System.out.println(ingresso2.toString());
    }
    
}
