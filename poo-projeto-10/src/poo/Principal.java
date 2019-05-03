package poo;

public class Principal {

    public static void main(String[] args) {

        int valor1 = 1, valor2 = 2;
        Integer valor3 = 3;
//        System.out.println(valor1);
//        System.out.println(valor2);
//        System.out.println(valor3);
        
        Produto p = new Produto();
        try {
            //Não informou nada,tipo primitivo (int) é zero por padrão
            System.out.println(p.precoVenda);
            //Não informou nada,tipo objeto (Integer) é nulo por padrão
            System.out.println(p.precoCusto.toString());
        }catch(NullPointerException ex){
            System.err.println("Opa... Calma ae, tem valor nulo!");
        }
        
    }
    
}
