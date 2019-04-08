package DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import model.ContatoBEAN;

public class ContatoDAO {
	private ContatoBEAN contato;

	Conexao conecta = new Conexao();
    public ContatoDAO(){
        conecta.conexao();    
    }
    PreparedStatement pst;
    
	
	private void inserirContato(ContatoBEAN cliente) {//GEN-FIRST:event_numeroKeyPressed
            try {
            pst = conecta.conn.prepareStatement("insert into Cliente(Nome, Telefone, Numero, Bairro, Rua) values (?,?,?,?,?)");
            pst.setString(1, contato.getNome());
            pst.setString(2, contato.getTelefone());
            pst.setInt(3, contato.getNumero());
            pst.setString(4, contato.getBairro());
            pst.setString(5, contato.getRua());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Inserido com sucesso!");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi inserido!" );
        }
        }
    }
