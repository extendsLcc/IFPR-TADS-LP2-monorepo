/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio.Polimosfismo.ex19;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aluno
 */
public class CadastroPessoas {
    
    private int qtdAtual;
    List<Pessoa> pessoas = new ArrayList<>();
    
    public void cadastraPessoa( Pessoa pessoa ){
    
        pessoas.add(pessoa);
        qtdAtual++;
    
    }
    
    public void imprimeCadastro(){
    
        pessoas.forEach((e)->{ e.imprimeDados(); });
        
    }
    
}
