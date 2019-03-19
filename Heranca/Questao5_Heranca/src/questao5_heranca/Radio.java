/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao5_heranca;

/**
 *
 * @author Usuário
 */
public interface Radio {
    public abstract void setEmissora();
    public abstract String getEmissora();
    public abstract int getTipoEmissora();
    public abstract void setVolumeRadio(int volume);
    public abstract int getVolume();
}
