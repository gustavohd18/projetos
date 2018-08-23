/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamemarvel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ModuloConexao {
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String USER = "root";
    private static final String URL = "jdbc:mysql://localhost:8889/quiz?useTimezone=true&serverTimezone=UTC";
    private static final String PASS = "root";
    
    
    
    public static Connection getConnection(){
        try {
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL,USER,PASS);
        } catch (ClassNotFoundException | SQLException ex) {
            throw new RuntimeException("Erro na conexão: ",ex);
        }
        
    }
    
    public static void closeConnection(Connection conexao){
        try{
            if(conexao != null){
                conexao.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(ModuloConexao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void closeConnection(Connection conexao, PreparedStatement statement){
        closeConnection(conexao);
        
        try{
            if(statement != null){
                statement.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(ModuloConexao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void closeConnection(Connection conexao, PreparedStatement statement, ResultSet rs){
        closeConnection(conexao, statement);
        
        try{
            if(rs != null){
                rs.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(ModuloConexao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}


