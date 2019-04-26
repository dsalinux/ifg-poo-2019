package poo;

import java.util.logging.Level;
import java.util.logging.Logger;


public class Principal {

    public static void main(String[] args) {

        int valor1 = 1, valor2 = 2;
        Integer valor3 = 3;
        System.out.println(valor1);
        System.out.println(valor2);
        System.out.println(valor3);
        
        Produto p = new Produto();
        try {
            System.out.println(p.precoCusto.toString());
            System.out.println(p.precoVenda);
        }catch(NullPointerException ex){
            System.err.println("Opa... Calma ae, tem valor nulo!");
        }
        
    }
    
}
