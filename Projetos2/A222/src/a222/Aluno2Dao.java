package a222;


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
 * @author Vinicius
 */
public class Aluno2Dao {
    private static String tabela = "aluno";

    public static void setTabela(String tabela) {
        Aluno2Dao.tabela = tabela;
    }
    
    public void insert(Aluno2 p){
        
        Connection conexao = ModuloConexao.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = conexao.prepareStatement("INSERT INTO "+tabela+"(NOME,MATRICULA,P1,P2,P3,ME) VALUES(?,?,?,?,?,?)");
            stmt.setString(1, p.getNome());
            stmt.setString(2, p.getMatricula());
            stmt.setDouble(3,p.getP1());
            stmt.setDouble(4,p.getP2());
            stmt.setDouble(5,p.getP3());
            stmt.setDouble(6,p.getMe());
            
            stmt.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(Aluno2Dao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        ModuloConexao.closeConnection(conexao, stmt);
                
                
    }
}
