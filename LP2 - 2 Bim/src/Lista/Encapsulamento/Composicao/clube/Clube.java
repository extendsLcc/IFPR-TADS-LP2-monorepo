/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista.Encapsulamento.Composicao.clube;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aluno
 */
public class Clube {
    
    private String nome;
    private String endereco;
    private String telefone;
    private List<Socio> socios = new ArrayList<Socio>();

    public Clube(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public List<Socio> getSocio() {
        return socios;
    }

    public void setSocio(List<Socio> socio) {
        this.socios = socio;
    }
    
    public void venderAcao( Socio socio ){
    
        if ( socios.contains(socio)) {
            
            socios.remove( socio );
            System.out.println( socio.getNome() + " vendeu suas ações ");
            
        }else
            System.out.println(socio.getNome() + " não possui ações para vender");
    
    }
    
    public void comprarAcao( Socio socio ){
    
        if ( !socios.contains(socio)) {
            
            socios.add(socio);
            System.out.println( socio.getNome() + " comprou ações ");
            
        }else
            System.out.println(socio.getNome() + " já possui ações do clube");
    
    }
    
    public void mostrarSocios(){
    
        System.out.println("Socios atuais: ");
        
        for (Socio socio : socios) {
            
            System.out.println( socio );
            
        }
    
    }
    
}
