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
public class Questao4_Heranca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Novo casa = new Novo();
        Velho ap = new Velho();
        casa.setPreco(150);
        casa.setAdicionarPreco(15);
        System.out.println(casa.getAdicionarPreco());
    }
    
}
