package DataSource;

import java.sql.*;

public class DataSource {
    
	private String usuario = "root";
	private String senha = "123456";
	private String caminho = "jdbc:mysql://localhost/costurarte?useTimezone=true&serverTimezone=UTC";
    private String driver = "jdbc.mysql.Driver";
    public Connection conn = null;
    private Statement stm = null;
    ResultSet rs;
     
   
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
           System.out.println("Erro ao executar SQL! \n Erro:" + ex);
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
