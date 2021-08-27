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
public class ControleRemoto {

    private Televisao tv;

    public ControleRemoto(Televisao tv) {
        this.tv = tv;
    }

    public Televisao getTv() {
        return tv;
    }

    public void setTv(Televisao tv) {
        this.tv = tv;
    }
    
    public void power(){
    
        tv.setLigado( !tv.isLigado() );
        
    }

    public void modificarVolume(int i) {

        if (i > 99 || i < 0 || tv.isLigado()) {
            return;
        }

        tv.setVolume(tv.getVolume() + i);

    }

    public void aumentarVolume() {

        if (tv.getVolume() < 100 && tv.isLigado()) {

            modificarVolume(1);

        }

    }

    public void diminuirVolume() {

        if (tv.getVolume() > 0 && tv.isLigado()) {

            modificarVolume(-1);

        }

    }

    public void modificarCanal(int i) {

        tv.setCanal(tv.getCanal() + i);

    }

    public void aumentarCanal() {

        if (tv.getCanal() < 999 && tv.isLigado()) {

            modificarCanal(1);

        }

    }

    public void diminuirCanal() {

        if (tv.getCanal() > 0 && tv.isLigado()) {

            modificarCanal(-1);

        }

    }

    public void escolherCanal(int i) {

        if (i >= 0 || i < 1000 && tv.isLigado()) {
            
            tv.setCanal(i);
            
        }

    }

    public void consultarVolume() {

        System.out.println("Volume atual: " + tv.getVolume());

    }

    public void consultarCanal() {

        System.out.println("Canal atual: " + tv.getCanal());

    }

}
