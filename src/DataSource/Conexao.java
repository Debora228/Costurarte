package DataSource;

import java.sql.*;

public class Conexao {
    private Statement stm;
    public ResultSet rs;
    private String driver = "jdbc.mysql.Driver";
    private String caminho = "jdbc:mysql://localhost/costurarte";
    private String usuario = "root";
    private String senha = "123456";
    public Connection conn;
    
    public void conexao(){
        try {
            System.setProperty("jdbc.Drivers", driver);
            conn = DriverManager.getConnection(caminho,usuario,senha);// ATENÇÃO!!!
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
    
    public ResultSet executarSelect(String sql) throws Exception {
		try {
			if(this.stm == null)
				this.conexao();
			ResultSet resultado = this.stm.executeQuery(sql);
			return resultado;
		} catch (Exception e) {
			Exception e2 = new Exception("Erro ao executar query!", e);
			throw e2;
		}
	}
	public int executarQueryGeral(String sql) throws Exception {
		try {
			if(stm == null)
				this.conexao();
			int numeroTuplas = stm.executeUpdate(sql);
			return numeroTuplas;
		} catch (Exception e) {
			Exception e2 = new Exception("Erro ao executar query!", e);
			throw e2;
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
