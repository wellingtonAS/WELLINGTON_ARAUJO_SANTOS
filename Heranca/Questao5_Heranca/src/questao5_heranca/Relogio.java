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
public interface Relogio {
    public abstract void setHorario(int horario);
    public abstract int getHorario();
    public abstract void setHorarioAlarme();
    public abstract int getHorarioAlarme();
    public void ligarAlarme();
    public void deligarAlarme();
    public abstract void setVolumeRelogio(int volume);
    public abstract int getVolumeRelogio();
}
