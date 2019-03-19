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
public class Questao2_Heranca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Gerente gerente1 = new Gerente();
        Vendedor vendedorl = new Vendedor();
        gerente1.setNome("Wagner");
        gerente1.setSalario(2000);
        gerente1.setDepartamento("Administrativo");
        System.out.println(gerente1.toString());
    }
    
}
