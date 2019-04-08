
package DAO;

import java.sql.*;

public class Conexao {
    private Statement stm;
    public ResultSet rs;
    private String driver = "jdbc.mysql.Driver";
    private String caminho = "jdbc:mysql://localhost/costurarte";
    private String usuario = "root";
    private String senha = "";
    public Connection conn;
    
    public void conexao(){
        try {
            System.setProperty("jdbc.Drivers", driver);
            conn = DriverManager.getConnection(caminho,usuario,senha);
            System.out.println("Conexao com o banco de dados realizada com sucesso");
        } catch (SQLException ex) {
            System.out.println("Erro na conexao com o banco:\n Erro: "+ex.getMessage());
        }
    }
    public void executaSQL(String sql){
        try {
            stm = conn.createStatement(rs.TYPE_SCROLL_INSENSITIVE,rs.CONCUR_READ_ONLY);
            rs = stm.executeQuery(sql);
        } catch (SQLException ex) {
           // JOptionPane.showMessageDialog(null,"Erro ao executar SQL! \n Erro:" + ex.Message());
        }
    }
    public void desconecta(){
        try{
            conn.close();
            System.out.println("Desconexao do banco realizada com sucesso:");
        }catch(SQLException ex){
             System.out.println("Erro na desconexao com o banco:\n Erro: "+ex.getMessage());
        }
    }
    
}
