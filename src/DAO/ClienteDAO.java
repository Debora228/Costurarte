package DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import BEANS.FornecedorBEAN;

import java.sql.PreparedStatement;

import java.sql.SQLException;
import javax.swing.JOptionPane;

import BEANS.ClienteBEAN;

public class ClienteDAO {
	private ClienteBEAN cliente;
	
	Conexao conecta = new Conexao();
    public ClienteDAO(){
        conecta.conexao();    
    }
    PreparedStatement pst;
    
	
	private void inserirCliente(ClienteBEAN cliente) {//GEN-FIRST:event_numeroKeyPressed
            try {
            pst = conecta.conn.prepareStatement("insert into Cliente(Cpf,Nome,Telefone,DataNascimento,Bairro,Rua,Numero) values (?,?,?,?,?,?,?)");
            pst.setString(1, cliente.getCpf());
            pst.setString(2, cliente.getContato().getNome());
            pst.setString(3, cliente.getContato().getTelefone());
            pst.setString(4, cliente.getData_nascimento());
            pst.setString(5, cliente.getContato().getBairro());
            pst.setInt(6, cliente.getContato().getNumero());

            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Inserido com sucesso!");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi inserido!" );
        }
        }
    }
