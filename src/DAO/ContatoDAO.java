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
    
    /*
    public void adicionar(Contato contato) {
    	String sql = "insert into Contato(Nome, Telefone, Bairro, Rua, Numero) values('" + contato.getNome()+"','"+contato.getTelefone()+ "','"+contato.getBairro()+"','"+ contato.getRua()+"',"+ contato.getNumero()+")";
			//String sql2 = "INSERT INTO Contato(login, nome) VALUES('"+filme.getCodigo()+"','"+filme.getNome()+"')";
			try {
			dataSource.executarQueryGeral(sql);
			}catch(Exception e) {
				e.printStackTrace();
			}
		
	}

	public void remover(String nome) {
		String sql = "DELETE FROM Contato WHERE nome ='" + nome +"'";
		try {
		dataSource.executarQueryGeral(sql);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

    */
	
	public void inserirContato(Contato contato) {
            try {
            pst = conecta.conn.prepareStatement("insert into Contato(Nome, Telefone,  Bairro, Rua,Numero) values (?,?,?,?,?)");
            pst.setString(1, contato.getNome());
            pst.setString(2, contato.getTelefone());
            pst.setString(3, contato.getBairro());
            pst.setString(4, contato.getRua());
            pst.setInt(5, contato.getNumero());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Inserido com sucesso!");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi inserido!" );
        }
        }
	/*
	public Contato consultar(String login) {
		String sql = "SELECT nome FROM cliente WHERE login = '" + login + "'";
		try {
			ResultSet rs = this.conecta.executarSelect(sql);
			if(rs.next()) {
				return new Contato(login, rs.getString("nome"));
			}
		} catch(Exception e) {
			e.getStackTrace();
		}
		return null;
	}
  */
    }
