/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao4_encapsulamento;

/**
 *
 * @author Usuário
 */
public class Nota {
private String dono;
private String texto;
private boolean estado;
public Nota(String dono,String texto) {
    this.dono = dono;
    this.texto = texto;
    this.estado = true;
}
public String getDono(){
    return dono;
}
public void setDono(String dono){
    this.dono = dono;
}
public String getTexto(){
    return texto;
}
public void setTexto(String texto){
    this.texto = texto;
}
public boolean isEstado(){
    return estado;
}
public void setEstado(boolean estado){
    this.estado = estado;
}
}
