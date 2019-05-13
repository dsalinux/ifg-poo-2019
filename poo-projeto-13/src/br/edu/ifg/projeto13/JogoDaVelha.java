/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifg.projeto13;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author danilo
 */
public class JogoDaVelha extends javax.swing.JFrame {
    
    private int[][] vitorias  = new int[][]{
        {1,2,3},{4,5,6},{7,8,9},//Linhas
        {1,4,7},{2,5,8},{3,6,9},//Colunas
        {1,5,9},{3,5,7}//Diagonais
    };
    private JButton[] botoes;
    private boolean jogador = false;//false = O e true = X
    /**
     * Creates new form JogoDaVelha
     */
    public JogoDaVelha() {
        initComponents();
        botoes = new JButton[]{
            btnL0C0,btnL0C1,btnL0C2,
            btnL1C0,btnL1C1,btnL1C2,
            btnL2C0,btnL2C1,btnL2C2
        };
        limparBotoes();
        for (JButton botao : botoes) {
            botao.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int p = Integer.parseInt(botao.getActionCommand());
                    marcar(p);
                }
            });
        }
    }
    
    private void limparBotoes(){
        int i = 0;
        for(JButton botao : botoes){
            botao.setText("");
            botao.setActionCommand(""+i++);
        }
    }
    
    private void marcar(int posicao){
        if(!"".equals(botoes[posicao].getText())){
            return;
        }
        if(jogador){//X
            botoes[posicao].setText("X");
        } else {//O
            botoes[posicao].setText("O");
        }
        verificaDeuVelha();
        verificaGanhador();
        
        jogador = !jogador;
    }
    
    public void verificaGanhador(){
        for (int[] vitoria : vitorias) {
            int v1 = vitoria[0]-1;
            int v2 = vitoria[1]-1;
            int v3 = vitoria[2]-1;
            if(botoes[v1].getText().equals(botoes[v2].getText()) &&
                    botoes[v2].getText().equals(botoes[v3].getText())
                ){
                if("".equals(botoes[v1].getText()) ||
                        "".equals(botoes[v2].getText())||
                        "".equals(botoes[v3].getText())){
                    break;
                }
                String ganhador = jogador?"X":"O";
                JOptionPane.showMessageDialog(rootPane, 
                        ganhador +
                        " venceu na posição ["+v1+", "+v2+", "+v3+"]");
            }
        }
    }
    
    public void verificaDeuVelha(){
        boolean naoEVazio = true;
        for (JButton botao : botoes) {
            if("".equals(botao.getText())){
                naoEVazio = false;
                break;
            }
        }
        if(naoEVazio){
            JOptionPane.showMessageDialog(rootPane, "Deu velha.");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnL0C0 = new javax.swing.JButton();
        btnL0C1 = new javax.swing.JButton();
        btnL0C2 = new javax.swing.JButton();
        btnL1C0 = new javax.swing.JButton();
        btnL1C1 = new javax.swing.JButton();
        btnL1C2 = new javax.swing.JButton();
        btnL2C0 = new javax.swing.JButton();
        btnL2C1 = new javax.swing.JButton();
        btnL2C2 = new javax.swing.JButton();
        btnRestart = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(135, 135, 135));
        jPanel1.setLayout(new java.awt.GridLayout(3, 3));

        btnL0C0.setFont(new java.awt.Font("Noto Sans", 1, 60)); // NOI18N
        btnL0C0.setText("1");
        jPanel1.add(btnL0C0);

        btnL0C1.setFont(new java.awt.Font("Noto Sans", 1, 60)); // NOI18N
        btnL0C1.setText("2");
        jPanel1.add(btnL0C1);

        btnL0C2.setFont(new java.awt.Font("Noto Sans", 1, 60)); // NOI18N
        btnL0C2.setText("3");
        jPanel1.add(btnL0C2);

        btnL1C0.setFont(new java.awt.Font("Noto Sans", 1, 60)); // NOI18N
        btnL1C0.setText("4");
        jPanel1.add(btnL1C0);

        btnL1C1.setFont(new java.awt.Font("Noto Sans", 1, 60)); // NOI18N
        btnL1C1.setText("5");
        jPanel1.add(btnL1C1);

        btnL1C2.setFont(new java.awt.Font("Noto Sans", 1, 60)); // NOI18N
        btnL1C2.setText("6");
        jPanel1.add(btnL1C2);

        btnL2C0.setFont(new java.awt.Font("Noto Sans", 1, 60)); // NOI18N
        btnL2C0.setText("7");
        jPanel1.add(btnL2C0);

        btnL2C1.setFont(new java.awt.Font("Noto Sans", 1, 60)); // NOI18N
        btnL2C1.setText("8");
        jPanel1.add(btnL2C1);

        btnL2C2.setFont(new java.awt.Font("Noto Sans", 1, 60)); // NOI18N
        btnL2C2.setText("9");
        jPanel1.add(btnL2C2);

        btnRestart.setText("Reiniciar");
        btnRestart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestartActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRestart, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 561, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnRestart, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRestartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestartActionPerformed
        limparBotoes();
    }//GEN-LAST:event_btnRestartActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JogoDaVelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JogoDaVelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JogoDaVelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JogoDaVelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JogoDaVelha().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnL0C0;
    private javax.swing.JButton btnL0C1;
    private javax.swing.JButton btnL0C2;
    private javax.swing.JButton btnL1C0;
    private javax.swing.JButton btnL1C1;
    private javax.swing.JButton btnL1C2;
    private javax.swing.JButton btnL2C0;
    private javax.swing.JButton btnL2C1;
    private javax.swing.JButton btnL2C2;
    private javax.swing.JButton btnRestart;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}