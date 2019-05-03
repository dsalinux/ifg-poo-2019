package br.edu.ifg.pooprojeto11;

public class Main {

    public static void main(String[] args) {
        String[] cartas = {"A","1","2","3","4",
            "5","6","7","8","9","10","J","Q","K"};       
        
        try {
            System.out.println(cartas[6]);
            System.out.println(cartas[9]);
            System.out.println(cartas[13]);
            System.out.println(cartas.length);
            System.out.println(cartas[15]);
            System.out.println("Está linha não aparece pois");
            System.out.println("o erro para o restante");
            System.out.println("do código");
        } catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Tentou acessar uma posição inválida.");
        }
        
        for(int i = 0; i < cartas.length; i++){
        
            System.out.print("["+cartas[i]+"]");
            
            if((i+1)%3==0){
                System.out.println();
            }
        }
        
        for (String carta : cartas) {
            System.out.print(carta);
            System.out.print(", ");
        }

    }
    
}