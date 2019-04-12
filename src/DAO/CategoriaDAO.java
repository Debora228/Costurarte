package DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import DataSource.DataSource;
import model.Categoria;
import model.Contato;

public class CategoriaDAO {
	PreparedStatement pst;
	DataSource conecta = new DataSource();
    public CategoriaDAO(){
        conecta.conexao();    
    }
    public void inserirCategoria(Categoria categoria) {
        try {
        pst = conecta.conn.prepareStatement("insert into categoria(Nome) values (?)");
        //pst.setInt(1, categoria.getCod());
        pst.setString(1, categoria.getNome());
        pst.executeUpdate();
        JOptionPane.showMessageDialog(null, "Inserido com sucesso!");

    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Não foi inserido!" );
    }
    }
}
