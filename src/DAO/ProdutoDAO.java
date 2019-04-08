
package DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

import BEANS.ProdutoBEAN;


public class ProdutoDAO {
	
	private ProdutoBEAN produto;
    Conexao conecta = new Conexao();
    public ProdutoDAO(){
        conecta.conexao();    
    }
    PreparedStatement pst;
    
    
    public void inserirProduto(ProdutoBEAN produto){
        try {
            pst = conecta.conn.prepareStatement("insert into produto (Nome,Descricao,Categoria,Quantidade,Preco_venda,cor,marca) VALUES (?, ?, ?, ?,?,?,?)");
            pst.setString(1,produto.getNome());
            pst.setString(2, produto.getDescricao());
            pst.setString(3, produto.getCategoria());
            pst.setInt(4, produto.getQuantidade());
            pst.setDouble(5, produto.getPreco_venda());
            pst.setString(6, produto.getCor());
            pst.setString(7, produto.getMarca());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Inserido com sucesso!");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi inserido!\n Erro: " + ex.getMessage());
        }
    }
}
