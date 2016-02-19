
package br.com.teste;


public class TesteUsuDao {
    
    public static void main(String[] args) {
        
        Usuario usu = new Usuario();
        usu.setNome("wiliam");
        usu.setLogin("ras");
        usu.setSenha("1234");
        
        UsuarioDao usudao = new UsuarioDao();
        usudao.cadastrar(usu);
        
        
    }
    
}
