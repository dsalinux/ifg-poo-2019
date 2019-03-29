package br.com.edu.ifg.projeto06;

import br.com.edu.ifg.projeto06.servico.ProdutoService;
import java.util.Scanner;

/**
 *
 * @author danilo
 */
public class Main {

    public static void main(String[] args) {
        
        System.out.println("Inicializando o sistema.....\n\n");
        ProdutoService service = new ProdutoService();
        
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        
        whilePrograma:
        while (true) {            
            System.out.println("Selecione uma opção:");
            System.out.println("[1] Adicionar Produto");
            System.out.println("[2] Deletar Produto");
            System.out.println("[3] Listar Produto");
            System.out.println("[4] Sair do Sistema");
            opcao = scanner.nextInt();
            System.out.println("\n\n");
            switch (opcao) {
                case 1:
                    
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    break whilePrograma;
            }
        }
        
    }
    
}
