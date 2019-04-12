package DAO;


import model.Contato;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import DataSource.DataSource;

public class ContatoDAO {
	
	PreparedStatement pst;
	DataSource conecta = new DataSource();
    public ContatoDAO(){
        conecta.conexao();    
    }

	
	public void inserirContato(Contato contato) {
            try {
            pst = conecta.conn.prepareStatement("insert into Contato(Nome, Telefone,  Bairro, Rua,Numero) values (?,?,?,?,?)");
            pst.setString(1, contato.getNome());
            pst.setString(2, contato.getTelefone());
            pst.setString(3, contato.getBairro());
            pst.setString(4, contato.getRua());
            pst.setInt(5, contato.getNumero());
            pst.executeUpdate();
            System.out.println("Inserido com sucesso!");

        } catch (SQLException ex) {
        	System.out.println("NÃo foi inserido!\n Erro: " + ex);
        }
        }
    }
