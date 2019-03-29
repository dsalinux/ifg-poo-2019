
public class Aluno extends Object {//Toda classe tem herança de Object
    
    public String nome;
    public int matricula;
    public String dataNascimento;
    private int periodoLetivo;
    
    public void renovarMatricula(){
        periodoLetivo++;
    }
    
    public int getPeriodoLetivo(){
        return periodoLetivo;
    }
    
    public void imprimirFicha(){
        System.out.println("---------- FICHA ----------");
        System.out.println("Nome: "+nome);
        System.out.println("Matrícula: "+matricula);
        System.out.println("Data Nascimento: "+dataNascimento);
        System.out.println("Período Letivo: "+periodoLetivo);
        System.out.println("---------------------------");
    }
}
