package DAO;


import java.sql.PreparedStatement;

import java.sql.SQLException;
import javax.swing.JOptionPane;

import BEANS.FornecedorBEAN;

public class FornecedorDAO {
	
		private FornecedorBEAN fornecedor;
		
	    Conexao conecta = new Conexao();
	    public FornecedorDAO(){
	        conecta.conexao();    
	    }
	    PreparedStatement pst;
	    
		
		private void inserirFonecedor(FornecedorBEAN fornecedor) {//GEN-FIRST:event_numeroKeyPressed
	            try {
	            pst = conecta.conn.prepareStatement("insert into fornecedor(Nome,Cnpj,Telefone,Bairro,Rua,Numero) values (?,?,?,?,?,?)");
	            pst.setString(1, fornecedor.getCon().getNome());
	            pst.setString(2, fornecedor.getCnpj());
	            pst.setString(3, fornecedor.getCon().getTelefone());
	            pst.setString(4, fornecedor.getCon().getBairro());
	            pst.setString(5, fornecedor.getCon().getRua());
	            pst.setInt(6, fornecedor.getCon().getNumero());

	            pst.executeUpdate();
	            JOptionPane.showMessageDialog(null, "Inserido com sucesso!");

	        } catch (SQLException ex) {
	            JOptionPane.showMessageDialog(null, "Não foi inserido!" );
	        }
	        }
	    }


