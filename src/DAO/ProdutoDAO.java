
package DAO;

import java.sql.PreparedStatement;

import java.sql.SQLException;
import javax.swing.JOptionPane;

import model.Produto;
import DataSource.DataSource;

public class ProdutoDAO {
	
	private Produto produto;
    DataSource conecta = new DataSource();
    public ProdutoDAO(){
        conecta.conexao();    
    }
    PreparedStatement pst;
    
    
    public boolean inserirProduto(Produto produto){
        try {
            pst = conecta.conn.prepareStatement("insert into produto (Produto_ID,Nome,Categoria,Descricao,Quantidade,cor,marca,Preco_venda,Preco_Custo) VALUES ( ?,?, ?, ?,?,?,?,?,?)");
            pst.setInt(1,produto.getCod());
            pst.setString(2,produto.getNome());
            pst.setInt(3, produto.getCategoria().getCod());
            pst.setString(4, produto.getDescricao());
            pst.setInt(5, produto.getQuantidade());
            pst.setString(6, produto.getCor());
            pst.setString(7, produto.getMarca());
            pst.setDouble(8, produto.getPrecoVenda());
            pst.setDouble(9, produto.getPrecoCusto());
            pst.executeUpdate();
            System.out.println( "Inserido com sucesso!");
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi inserido!\n Erro: " + ex.getMessage());
            return false;
        }
    }
    
	public boolean removerProduto(int cod) {
		try {
		PreparedStatement pst =  conecta.conn.prepareStatement("delete from Produto where Produto_Id=?");
		pst.setInt(1,cod);
	    pst.execute();
		//String sql = "DELETE FROM PRODUTO WHERE Produto_Id ='" + cod +"'";
		return true;
		//conecta.executarQueryGeral(sql);
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}
	
     
     		
}
