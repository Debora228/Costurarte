package DAO;

import java.sql.PreparedStatement;


import java.sql.SQLException;
import DataSource.DataSource;
import javax.swing.JOptionPane;

import model.Cliente;

public class ClienteDAO {
	private Cliente cliente;
	
	DataSource conecta = new DataSource();
    public ClienteDAO(){
        conecta.conexao();    
    }
    PreparedStatement pst;
    
	
	public void inserirCliente(Cliente cliente) {//GEN-FIRST:event_numeroKeyPressed
            try {
            pst = conecta.conn.prepareStatement("insert into Cliente(Cpf,DataNascimento, Contato_FK) values (?,?,?)");
            pst.setString(1, cliente.getCpf());
            pst.setString(2, cliente.getDataNascimento());
            pst.setInt(3,cliente.getContato().getContato_Id());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Inserido com sucesso!");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi inserido!" );
        }
        }
    }
