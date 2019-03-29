package br.edu.ifg.aula5;

import br.edu.ifg.aula5.vo.Produto;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String opcao = "s";
        List<Produto> produtos = new ArrayList();
        while(!"n".equalsIgnoreCase(opcao)){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Informe uma opção:");
            System.out.println("1: Cadastrar Produto");
            System.out.println("2: Listar Produtos");
            System.out.println("N: Sair");
            opcao = scanner.next();
            switch (opcao) {
                case "1":
                    Produto produto = new Produto();
                    System.out.print("Código: ");
                    produto.setCodigo(scanner.nextInt());
                    
                    System.out.print("Nome: ");
                    produto.setNome(scanner.next());
                    
                    System.out.print("Marca: ");
                    produto.setMarca(scanner.next());
                    
                    System.out.print("Preço: ");
                    produto.setPreco(scanner.nextFloat());
                    
                    System.out.print("Quantidade: ");
                    produto.setQuantidade(scanner.nextInt());
                    
                    produtos.add(produto);
                    
                    break;
                case "2":
                    for(Produto p : produtos){
                        System.out.println("-------------------");
                        System.out.println("Código: "+p.getCodigo());
                        System.out.println("Nome: "+p.getNome());
                        System.out.println("Marca: "+p.getMarca());
                        System.out.println("Preço: "+p.getPreco());
                        System.out.println("Quantidade: "+p.getQuantidade());
                    }
                    System.out.println("-------------------");
                    break;
            }
        }
        
    }
    
}
