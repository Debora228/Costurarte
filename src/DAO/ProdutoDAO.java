
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
            pst = conecta.conn.prepareStatement("insert into produto (Nome,Categoria,Descricao,Quantidade,cor,marca,Preco_venda,Preco_Custo) VALUES (?, ?, ?,?,?,?,?,?)");
            pst.setString(1,produto.getNome());
            pst.setInt(2, produto.getCategoria().getCod());
            pst.setString(3, produto.getDescricao());
            pst.setInt(4, produto.getQuantidade());
            pst.setString(5, produto.getCor());
            pst.setString(6, produto.getMarca());
            pst.setDouble(7, produto.getPrecoVenda());
            pst.setDouble(8, produto.getPrecoCusto());
            pst.executeUpdate();
            System.out.println( "Inserido com sucesso!");
            return true;
        } catch (SQLException ex) {
        	System.out.println("NÃo foi inserido!\n Erro: " + ex);
            return false;
        }
    }
    
	public boolean removerProduto(int cod) {
		try {
		PreparedStatement pst =  conecta.conn.prepareStatement("delete from Produto where Produto_Id=?");
		pst.setInt(1,cod);
	    pst.execute();
	    System.out.println("Removido com sucesso!");
			return true;
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}
	
     
     		
}
