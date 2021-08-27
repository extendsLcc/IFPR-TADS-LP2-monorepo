/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hierarquia;

/**
 *
 * @author aluno
 */
public class Cliente  extends Pessoa{
    
    private double limite;
    private double divida;

    public Cliente(double limite, double divida, String nome, String cpf, String endereco) {
        super(nome, cpf, endereco);
        this.limite = limite;
        this.divida = divida;
    }


    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double getDivida() {
        return divida;
    }

    public void setDivida(double divida) {
        this.divida = divida;
    }
    
    public double getSaldo(){
    
        return getLimite() - getDivida();
    
    }
    
}
