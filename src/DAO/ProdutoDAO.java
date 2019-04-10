
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
    
    
    public void inserirProduto(Produto produto){
        try {
            pst = conecta.conn.prepareStatement("insert into produto (Nome,Descricao,Categoria,Quantidade,Preco_venda,cor,marca) VALUES (?, ?, ?, ?,?,?,?)");
            pst.setString(1,produto.getNome());
            pst.setString(2, produto.getDescricao());
            pst.setInt(3, produto.getCategoria().getCod());
            pst.setDouble(5, produto.getPrecoVenda());
            pst.setString(6, produto.getCor());
            pst.setString(7, produto.getMarca());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Inserido com sucesso!");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi inserido!\n Erro: " + ex.getMessage());
        }
    }
    
	public void removerProduto(int id) {
		String sql = "DELETE FROM PRODUTO WHERE id ='" + id +"'";
		try {
		conecta.executaSQL(sql);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
