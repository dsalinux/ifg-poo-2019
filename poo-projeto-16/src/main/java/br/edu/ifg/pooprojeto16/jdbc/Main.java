package br.edu.ifg.pooprojeto16.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static String URL = "jdbc:mysql://10.8.230.161/aulajdbc";
    public static String USUARIO = "ifg";
    public static String SENHA = "ifg";

    public static void main(String[] args) {
        try {
            Connection conexao
                    = DriverManager.getConnection(URL, USUARIO, SENHA);
            encerra:
            while(true){
                System.out.println("1: Inserir");
                System.out.println("2: Listar");
                System.out.println("3: Sair");
                String op = new Scanner(System.in).next();
                switch (op) {
                    case "1":
                        adicionar(conexao);
                        break;
                    case "2":
                        String nome = new Scanner(System.in).nextLine();
                        listar(conexao, nome);
                        break;
                    case "3":
                        break encerra;
                }
            }

            conexao.close();
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void adicionar(Connection conexao) throws SQLException {
        String nome, email;
        nome = new Scanner(System.in).nextLine();
        email = new Scanner(System.in).nextLine();
        Statement st = conexao.createStatement();

        st.execute("insert into usuario (nome, email)"
                + " values ('" + nome + "', '" + email + "') ");

        System.out.println("Adicionado com sucesso.");
    }

    public static void listar(Connection conexao, String nome) throws SQLException {
        Statement st = conexao.createStatement();
        
        ResultSet rs = st.executeQuery("select * from usuario "
                + "where nome like '%"+nome+"%'");

        while (rs.next()) {
            System.out.println(rs.getString("nome"));
            System.out.println(rs.getString("email"));
            System.out.println("------------------");
        }
    }
}
