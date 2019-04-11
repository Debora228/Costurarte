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
    
	
	public void inserirCliente(Cliente cliente) {
		
		try {
            pst = conecta.conn.prepareStatement("insert into Cliente(Cliente_Id,Cpf,DataNascimento, nome) values (?,?,?,?)");
            pst.setInt(1, cliente.getClienteId());
            pst.setString(2, cliente.getCpf());
            pst.setString(3, cliente.getDataNascimento());
            pst.setString(4, cliente.getContato().getNome());
            pst.executeUpdate();
            
            System.out.println("inserido " + cliente.getContato().getNome());
            JOptionPane.showMessageDialog(null, "Inserido com sucesso!");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi inserido!" );
        }
        }
    }
