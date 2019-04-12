package DAO;

import java.sql.PreparedStatement;


import java.sql.SQLException;
import DataSource.DataSource;
import javax.swing.JOptionPane;

import model.Cliente;

public class ClienteDAO {
	PreparedStatement pst;
    DataSource conecta = new DataSource();
    public ClienteDAO(){
        conecta.conexao();    
    }
    
	
	public boolean inserirCliente(Cliente cliente) {
		
		try {
            pst = conecta.conn.prepareStatement("insert into Cliente(Cpf,DataNascimento, nome) values (?,?,?)");
            
            pst.setString(1, cliente.getCpf());
            pst.setString(2, cliente.getDataNascimento());
            pst.setString(3, cliente.getContato().getNome());
            pst.executeUpdate();
            
            System.out.println("Inserido com sucesso!");
            return true;
        } catch (SQLException ex) {
        	System.out.println("NÃo foi inserido!\n Erro: " + ex);
            return false;
        }
        }
    }
