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
        //Criando produto 1
        Produto p1 = new Produto();
        p1.setCodigo(1);
        p1.setNome("Arroz Parabolizado");
        p1.setPreco(11.9f);
        p1.setQuantidade(60);
        p1.setFabricante(new Fabricante(12345678, "Tio João"));
        //Criando produto 2
        Produto p2 = new Produto();
        p2.setCodigo(2);
        p2.setNome("Feijão Carioca");
        p2.setPreco(3.9f);
        p2.setQuantidade(35);
        p2.setFabricante(new Fabricante(12345678, "Tio João"));
        //Criando produto 3
        Produto p3 = new Produto();
        p3.setCodigo(3);
        p3.setNome("Óleo de Soja");
        p3.setPreco(2.9f);
        p3.setQuantidade(28);
        p3.setFabricante(new Fabricante(87654321, "ABC"));
        //Criando produto 4
        Produto p4 = new Produto();
        p4.setCodigo(4);
        p4.setNome("Margarina");
        p4.setPreco(4.9f);
        p4.setQuantidade(20);
        p4.setFabricante(new Fabricante(12435687, "Qualy"));
        
        //Adicionando produtos a lista
        listaDeProdutos.add(p1);
        listaDeProdutos.add(p2);
        listaDeProdutos.add(p3);
        listaDeProdutos.add(p4);
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
        System.out.println("Deletando produtdo.....");
        System.out.print("Informe o código do produto: ");
        produto.setCodigo(scanner.nextInt());
        listaDeProdutos.remove(produto);
        System.out.println("Produto removido com sucesso!\n\n");
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
         
            System.out.println("---------------------");
        }
        System.out.println("\n\n");
    }
    
}
