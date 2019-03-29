package br.edu.ifg.aula02;

import javax.swing.JOptionPane;

public class ClassPrincipal {

    public static void main(String[] args) {
        int retorno = JOptionPane.showConfirmDialog(null, "Olá Mundo... OO é legal...");
        JOptionPane.showMessageDialog(null, "O retorno foi "+retorno);
    }
    
}
