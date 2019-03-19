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
public class Questao5_Polimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Chefe c1 = new Chefe();
        TrabalhadorComissionado tc1 = new TrabalhadorComissionado();
        TrabalhadorPecaProduzida tpp1 = new TrabalhadorPecaProduzida();
        TrabalhadorHora th1 = new TrabalhadorHora();
        
        c1.setSalarioMensal(1000);
        
        tc1.setComissao(15);
        tc1.setSalario(1000);
        tc1.setQtdVendas(10);
        
        tpp1.setQtdProduzida(100);
        tpp1.setRemuneracao(800);
        
        th1.setQtdHoras(40);
        th1.setSalarioHora(10);
        
        th1.calcularGanho();
        
        
    }
    
}
