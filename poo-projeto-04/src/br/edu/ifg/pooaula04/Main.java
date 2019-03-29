package br.edu.ifg.pooaula04;

import br.edu.ifg.pooaula04.vo.Aluno;

public class Main {

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno(3);
        aluno1.nome = "Danilo Souza";
        aluno1.matricula = 123456;
        
        aluno1.imprimir();
        aluno1.renovarMatricula();
        aluno1.imprimir();
    }
    
}
