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
public class ContaBancaria {

    private double saldo;
    private double saldoMinimo;

    public ContaBancaria(double saldo, double saldoMinimo) {
        this.saldo = saldo;
        this.saldoMinimo = saldoMinimo;
    }

    public void sacar(double qtd) {

        if (saldo - qtd > saldoMinimo) {

            saldo -= qtd;

        }else
            System.out.println("Saldo insuficiente");

    }

    public void depositar(double qtd) {

        saldo += qtd;

    }

    public double consultarSaldo() {

        return saldo;

    }

}
