/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamemarvel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author maivo
 */
public class PerguntaMarvelDao  {
 
    private static String tabela = "noticia";

    public static void setTabela(String tabela) {
        PerguntaMarvelDao.tabela = tabela;
    }
    
    public void insert(PerguntaMarvel p){
        
        Connection conexao = ModuloConexao.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = conexao.prepareStatement("INSERT INTO "+tabela+"(TITULO,PERGUNTA,RESPOSTA) VALUES(?,?,?)");
            stmt.setString(1, p.getTitulo());
            stmt.setString(2, p.getPergunta());
            stmt.setString(3,p.getResposta());
            
            stmt.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(PerguntaMarvelDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        ModuloConexao.closeConnection(conexao, stmt);
                
                

    }
    //so posso chamar esse metodo quando ja esta no banco de dados 
    public String resposta(PerguntaMarvel p){
        
        Connection conexao = ModuloConexao.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<PerguntaMarvel> perg = new LinkedList<>();
        String resp = null;
        String x=null;
         String resp1 = p.getTitulo();
    
        
        try {
            stmt = conexao.prepareStatement("SELECT * FROM NOTICIA WHERE TITULO ="+resp1+";");
            rs = stmt.executeQuery();
            
      
            
               
               
                
            
                if (rs.next()) x=rs.getString("resposta");	
                System.out.println(resp1);
              
                
  
             
         
            
        } catch (SQLException ex) {
            Logger.getLogger(PerguntaMarvelDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        ModuloConexao.closeConnection(conexao, stmt, rs);
         
        return x;
    }

    
    }
