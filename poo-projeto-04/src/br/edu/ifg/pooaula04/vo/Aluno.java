package br.edu.ifg.pooaula04.vo;

public class Aluno {

    public String nome;
    public int matricula;
    private int periodo;
    
    public Aluno(){
        this.periodo = 1;
    }
    
    public Aluno(int periodo){
        this.periodo = periodo;
    }
    
    public void renovarMatricula(){
        this.periodo++;
    }

    public void imprimir(){
        System.out.println("------Aluno------");
        System.out.println("Nome: "+nome);
        System.out.println("Matricula: "+matricula);
        System.out.println("Período: "+periodo);
        System.out.println("-----------------");
    }
    
}
