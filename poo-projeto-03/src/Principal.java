
public class Principal {

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        aluno1.nome = "Danilo";
        aluno1.matricula = 12345;
        aluno1.dataNascimento = "28/12/1987";
        aluno1.renovarMatricula();
        aluno1.renovarMatricula();
        aluno1.renovarMatricula();
        aluno1.renovarMatricula();
        aluno1.imprimirFicha();
        
        Aluno aluno2 = new Aluno();
        aluno2.nome = "Maria";
        aluno2.matricula = 123456;
        aluno2.dataNascimento = "10/10/1990";
        aluno2.renovarMatricula();
        aluno2.imprimirFicha();
        
        int periodoLetivoAluno1 = aluno1.getPeriodoLetivo();
        if(periodoLetivoAluno1 == 1){
            System.out.println("Aluno 1 é Calouro!");
        } else {
            System.out.println("Aluno 1 é Veterano!");
        }
        int periodoLetivoAluno2 = aluno2.getPeriodoLetivo();
        if(periodoLetivoAluno2 == 1){
            System.out.println("Aluno 2 é Calouro!");
        } else {
            System.out.println("Aluno 2 é Veterano!");
        }
    }
    
}
