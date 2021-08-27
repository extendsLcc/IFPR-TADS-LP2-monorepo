/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista.Encapsulamento.Composicao.empresa;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aluno
 */
public class Empresa {
    
    private String nome;
    private List< Empregado > funcionarios = new ArrayList< Empregado >();

    public Empresa(String nome) {
        this.nome = nome;
    }

    public List<Empregado> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<Empregado> funcionarios) {
        this.funcionarios = funcionarios;
    }
    
    public int contarEmpregados(){
    
        return this.funcionarios.size();
        
    }
    
    public void contratarEmpregado( Empregado empregado ){
    
        funcionarios.add( empregado );
    
    }
    
    public double getPagamentoMensal(){
    
        return funcionarios.stream().mapToDouble(Empregado::getSalario).sum();
        
    }
    
}
