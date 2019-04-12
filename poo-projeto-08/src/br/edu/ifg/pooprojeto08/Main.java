package br.edu.ifg.pooprojeto08;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        JFrame janela = new JFrame("Hello Swing");
        janela.setMinimumSize(new Dimension(250, 100));
//        janela.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        JTextField campoTexto = new JTextField();
        
        JButton botao = new JButton();
        botao.setAction(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(janela, 
                        "Olá "+campoTexto.getText());
            }
        });
        botao.setText("Ok..");
        
        janela.getContentPane().add(campoTexto);
        janela.getContentPane().add(botao);
        
        janela.setLayout(new GridLayout(2,1));
        
        janela.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        janela.setVisible(true);
    }
    
}
