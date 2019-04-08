
package DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ProdutoDAO {
    Conexao conecta = new Conexao();
    public ProdutoDAO(){
        conecta.conexao();
        
    }
    PreparedStatement pst;
    
    
    public void inserirProduto(String categoria,String nomeProduto, String descricao, int quantidade, double precoUnitario, String cor,String medida, String marca){
        try {
            pst = conecta.conn.prepareStatement("insert into produto (Nome,Descricao,Categoria,Quantidade,Preco_venda,cor,unidade_de_medida,marca) VALUES (?, ?, ?, ?,?,?,?,?)");
            pst.setString(1, nomeProduto);
            pst.setString(2, descricao);
            pst.setString(3, categoria);
            pst.setInt(4, quantidade);
            pst.setDouble(5, precoUnitario);
            pst.setString(6, cor);
            pst.setString(7, medida);
            pst.setString(8, marca);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Inserido com sucesso!");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi inserido!\n Erro: " + ex.getMessage());
        }
    }
}
