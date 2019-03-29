package br.com.edu.ifg.projeto06.servico;

import br.com.edu.ifg.projeto06.vo.Fabricante;
import br.com.edu.ifg.projeto06.vo.Produto;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProdutoService {

    private List<Produto> listaDeProdutos;

    public ProdutoService() {
        listaDeProdutos = new ArrayList<>();
    }
    
    public void adicionar(){
        Scanner scanner = new Scanner(System.in);
        Produto produto = new Produto();
        
        System.out.println("Cadastrando Produdo...");
        
        System.out.print("Informe o código: ");
        produto.setCodigo(scanner.nextInt());
        System.out.print("Informe o nome: ");
        scanner = new Scanner(System.in);
        
        produto.setNome(scanner.nextLine());
        
        scanner = new Scanner(System.in);
        
        System.out.print("Informe o preço: ");
        produto.setPreco(scanner.nextFloat());
        System.out.print("Informe a quantidade: ");
        produto.setQuantidade(scanner.nextInt());
        
        Fabricante fabricante = new Fabricante();
        System.out.println("Fabricante: ");
        System.out.print("CNPJ fabricante: ");
        fabricante.setCnpj(scanner.nextInt());
        System.out.println("Nome Fabricante:");
        
        scanner = new Scanner(System.in);
        
        fabricante.setNome(scanner.nextLine());
        produto.setFabricante(fabricante);
        
        listaDeProdutos.add(produto);
    }
    
    public void remover(){
        Scanner scanner = new Scanner(System.in);
        Produto produto = new Produto();
        produto.setCodigo(scanner.nextInt());
        listaDeProdutos.remove(produto);
    }
    
    public void verDetalhes(int codigo){
        
    }
    
    public void listar(){
        for (Produto itemDaLista : listaDeProdutos) {
            System.out.println("------~Produto~------");
            
            System.out.println("Código: "+itemDaLista.getCodigo());
            System.out.println("Nome: "+itemDaLista.getNome());
            System.out.println("Fabricante: "+itemDaLista.getFabricante().getNome());
            System.out.println("Preço: "+itemDaLista.getPreco());
            System.out.println("Quantidade: "+itemDaLista.getQuantidade());
         
            System.out.println("---------------------\n");
        }
    }
    
}
