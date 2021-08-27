/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista.Encapsulamento.Composicao.empresa;

/**
 *
 * @author aluno
 */
public class MainEmpresa {
    
    public static void main(String[] args) {
        
        Empresa emp = new Empresa( "Empresa X" );
        
        for (int i = 0; i < 10; i++) {
            
            emp.contratarEmpregado(new Empregado("Empregado " + i, 10, 1.2 ));
            emp.getFuncionarios().get( i ).trabalhar( Math.round( Math.random() * 8 ) );
            emp.getFuncionarios().get( i ).trabalharHoraExtra( Math.round( Math.random() * 4 ) );
            
        }
        
        System.out.println(" Total de pagamento mensal da empresa: " + emp.getPagamentoMensal());
        
        for (Empregado arg : emp.getFuncionarios()) {
            
            System.out.println(arg);
            System.out.println("Salario do empregado " + arg.getNome() + " : " + arg.getSalario() );
            
        }
        
    }
    
}
