
package br.com.teste;

import br.com.persistencia.jdbc.ConexaoFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;




    public class UsuarioDao{
        private Connection con = ConexaoFactory.getConnection();
        public void cadastrar(Usuario usu){
    
        String sql = "insert into usuario (nome,login,senha) values (?,?,?)";
        
            try {
                        PreparedStatement preparador = con.prepareStatement(sql);
                        
                        preparador.setString(1, usu.getNome());
                        preparador.setString(2, usu.getLogin());
                        preparador.setString(3, usu.getSenha());
                        
                        preparador.execute();
                        preparador.close();
                        
                        
                        } catch (SQLException ex) {
                Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
            }
       
        
    
    }
    
}

