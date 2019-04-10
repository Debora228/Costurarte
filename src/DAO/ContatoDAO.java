package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import model.Contato;
import DataSource.Conexao;
import br.ufal.aracomp.jdbc.model.Cliente;

public class ContatoDAO {
	private Contato contato;

	Conexao conecta = new Conexao();
    public ContatoDAO(){
        conecta.conexao();    
    }
    PreparedStatement pst;
    
	
	public void inserirContato(Contato contato) {
            try {
            pst = conecta.conn.prepareStatement("insert into Contato(Nome, Telefone, Numero, Bairro, Rua) values (?,?,?,?,?)");
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
  
    }
