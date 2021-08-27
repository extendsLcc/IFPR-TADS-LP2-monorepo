/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaligada;

import java.util.List;

/**
 *
 * @author aluno
 */
public class ListaLigada implements Lista{

    private Celula primeira;
    private Celula ultima;
    private int quantidade;

    @Override
    public void adicionaInicio( Object elemento ){
        if( estaVazia() ){
            primeira = new Celula( elemento );
            ultima = primeira;
        }else{
            Celula celula = new Celula( elemento );
            celula.setProxima( primeira );
            primeira = celula;
        }
        quantidade++;
    }

    @Override
    public void adicionaFim( Object elemento ){
        if( estaVazia() ){
            primeira = new Celula( elemento );
            ultima = primeira;
        }else{
            Celula node = new Celula( elemento );
            ultima.setProxima( node );
            ultima = node;
        }
        quantidade++;
    }

    @Override
    public void adicionaIndice( Object elemento, int indice ){
        if( indice >= 0 || indice <= quantidade ){
            if( estaVazia() ){
                adicionaInicio( elemento );
            }else if( indice == 0 ){
                adicionaInicio( elemento );
            }else if( indice == quantidade ){
                adicionaFim( elemento );
            }else{
                Celula celula = primeira;
                for( int i = 0; i < indice - 1; i++ ){
                    celula = celula.getProxima();
                }
                Celula novaCelula = new Celula( elemento );
                novaCelula.setProxima( celula.getProxima() );
                celula.setProxima( novaCelula );
                quantidade++;
            }
        }else{
            System.out.println( "Posição Invalida!" );
        }
    }

    @Override
    public boolean remover( Object elemento ){
        if( primeira.getElemento().equals( elemento ) ){
            primeira = primeira.getProxima();
            quantidade--;
            return true;
        }
        Celula celulaAtual = primeira.getProxima();
        Celula celulaAnterior = primeira;
        while( celulaAtual != null ){
            if( celulaAtual.getElemento().equals( elemento ) ){
                if( celulaAtual.getProxima() == null ){
                    ultima = celulaAnterior;
                }else{
                    celulaAnterior.setProxima( celulaAtual.getProxima() );
                }
                quantidade--;
                return true;
            }
            celulaAnterior = celulaAtual;
            celulaAtual = celulaAtual.getProxima();
        }
        return false;
    }

    @Override
    public boolean remover( int indice ){

        return remover( encontrar( indice ) );

    }

    @Override
    public Object encontrar( int indice ){
        Celula celulaAtual = primeira;
        if( !estaVazia() && indice >= 0 && indice < quantidade ){
            //for( ; indice > 0; indice-- ){
            for( int i = 0; indice > i; i++ ){
                celulaAtual = celulaAtual.getProxima();
            }
        }else{
            System.out.println( "Posição invalida!" );
            celulaAtual = null;
        }
        return celulaAtual == null ? null : celulaAtual.getElemento();
    }

    @Override
    public boolean possuiElemento( Object elemento ){
        Celula celulaAtual = primeira;
        while( celulaAtual != null ){
            if( celulaAtual.getElemento().equals( elemento ) ){
                return true;
            }
            celulaAtual = celulaAtual.getProxima();
        }
        return false;
    }

    @Override
    public boolean estaVazia(){
        return ultima == null;
    }

    @Override
    public void limparLista(){
        while( !estaVazia() ){
            System.out.println( this );
            remover( 0 );
        }
    }


    @Override
    public int tamanho(){
        return this.quantidade;
    }

    public ListaLigada mergeSort( ListaLigada listaLigada ){
        if( listaLigada.tamanho() > 1 ){
            ListaLigada menores = new ListaLigada();
            ListaLigada maiores = new ListaLigada();
            Object elementoMeio = listaLigada.encontrar( (int) listaLigada.tamanho() / 2 );
            int valorMeio = Integer.parseInt( elementoMeio.toString() );
            listaLigada.remover( elementoMeio );
            for( int i = 0; i < listaLigada.tamanho(); i++ ){
                int valorAtual = Integer.parseInt( listaLigada.encontrar( i ).toString() );
                if( valorAtual > valorMeio ){
                    menores.adicionaFim( listaLigada.encontrar( i ) );
                }else{
                    maiores.adicionaFim( listaLigada.encontrar( i ) );
                }
            }
            
            listaLigada.limparLista();
            listaLigada.copiaElementos( mergeSort( menores ) );
            listaLigada.adicionaFim( elementoMeio );
            listaLigada.copiaElementos( maiores );
            return listaLigada;
        }
        return listaLigada;
    }

    public void copiaElementos( ListaLigada copiarLista ){
        for( int i = 0; i < copiarLista.tamanho(); i++ ){
            this.adicionaFim( copiarLista.encontrar( i ) );
        }
    }

    @Override
    public String toString(){
        String elementos = "";
        Celula celulaAtual = primeira;
        while( celulaAtual != null ){
            elementos += "[" + celulaAtual.getElemento() + "], ";
            celulaAtual = celulaAtual.getProxima();
        }
        elementos = elementos.substring( 0, Math.max( elementos.length() - 2, 0 ) );
        return "ListaLigada{" + "primeira=" + primeira.getElemento() + ", ultima=" + ultima.getElemento() + ", quantidade=" + quantidade + " elementos= " + elementos + '}';
    }
}
