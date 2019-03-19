/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao1_polimorfismo;

/**
 *
 * @author Usuário
 */
public class Questao1_Polimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Funcionario f1 = new Funcionario();
        f1.setCpf("12345678996");
        f1.setNome("wellington");
        f1.setDataNascimento("02/07/1996");
        f1.setEmail("wellington.araujo@arapiraca.ufal.br");
        f1.setFuncao("Gerente");
        f1.setRg("123654789");
        f1.setSenha("ufalsong%$#");
        
        f1.realizarLogin();
    }
    
}
