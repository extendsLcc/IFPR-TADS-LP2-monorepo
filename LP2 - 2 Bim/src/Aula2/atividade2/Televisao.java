/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula2.atividade2;

/**
 *
 * @author aluno
 */
public class Televisao {
    
    private int volume;
    private int canal;
    private boolean ligado;

    public Televisao(int volume, int canal) {
        this.volume = volume;
        this.canal = canal;
        this.ligado = true;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    @Override
    public String toString() {
        return "Televisao{" + "volume=" + volume + ", canal=" + canal + '}';
    }
    
}
