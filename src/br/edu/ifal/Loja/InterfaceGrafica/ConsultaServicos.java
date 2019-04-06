
package br.edu.ifal.Loja.InterfaceGrafica;

import br.edu.BEANS.ModeloTabela;
import br.edu.ifal.Loja.DAO.Conexao;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;

public class ConsultaServicos extends javax.swing.JInternalFrame {
     Conexao conecta =  new Conexao();
    public ConsultaServicos() throws SQLException {
        initComponents(); 
        conecta.conexao();
        preencherTableServiço("select * from Serviço order by cod");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jComboBox1 = new javax.swing.JComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaServico = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        pesquisaNome = new javax.swing.JTextField();
        OkPesquisa = new javax.swing.JButton();
        alterar = new javax.swing.JButton();
        deletar = new javax.swing.JButton();
        Limpar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nome = new javax.swing.JTextField();
        quant = new javax.swing.JTextField();
        preco = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cod = new javax.swing.JTextField();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setClosable(true);
        setIconifiable(true);

        tabelaServico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tabelaServico);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Pesquisa:");

        pesquisaNome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        OkPesquisa.setText("OK");
        OkPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OkPesquisaActionPerformed(evt);
            }
        });

        alterar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        alterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ícones/pencil_go.png"))); // NOI18N
        alterar.setText("Alterar");
        alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarActionPerformed(evt);
            }
        });

        deletar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        deletar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ícones/pencil_delete.png"))); // NOI18N
        deletar.setText("Deletar");
        deletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletarActionPerformed(evt);
            }
        });

        Limpar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Limpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ícones/Limpar.png"))); // NOI18N
        Limpar.setText("Limpar");
        Limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimparActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Nome:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Quantidade:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Preço Total:");

        nome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        quant.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        preco.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Código:");

        cod.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(alterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(deletar)
                        .addGap(18, 18, 18)
                        .addComponent(Limpar)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(pesquisaNome, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(OkPesquisa)
                        .addGap(0, 27, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(preco, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(quant)
                            .addComponent(cod))
                        .addGap(80, 80, 80))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(pesquisaNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OkPesquisa))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(preco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deletar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(alterar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Limpar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OkPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OkPesquisaActionPerformed
         try {
             PreparedStatement pst = conecta.conn.prepareStatement("SELECT * FROM Serviço WHERE nome=?");
             pst.setString(1, pesquisaNome.getText());
             preencherTableServiço("SELECT * FROM Serviço WHERE Nome = '" + pst + "'");
             
         } catch (SQLException ex) {
             Logger.getLogger(ConsultaServicos.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_OkPesquisaActionPerformed

    private void alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarActionPerformed
        try {
            PreparedStatement pst =  conecta.conn.prepareStatement("update Serviço set Nome = ?,quant =?,precototal=? where cod=?");
            pst.setString(1,nome.getText() );
            pst.setInt(2,Integer.parseInt(quant.getText()));
            pst.setDouble(3,Double.parseDouble(preco.getText()));
            pst.setInt(4,Integer.parseInt(cod.getText()));
            pst.execute();
            JOptionPane.showMessageDialog(null,"Alterado com sucesso");
            preencherTableServiço("select * from Serviço order by cod");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao Alterar");
        }
    }//GEN-LAST:event_alterarActionPerformed

    private void deletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletarActionPerformed
      
        try {
            PreparedStatement pst =  conecta.conn.prepareStatement("delete from Serviço where cod=?");
            pst.setInt(1,Integer.parseInt(cod.getText()));
            pst.execute();
            JOptionPane.showMessageDialog(null,"Excluido com sucesso");
            preencherTableServiço("select * from Serviço order by cod  ");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao excluir");
        }
    }//GEN-LAST:event_deletarActionPerformed

    private void LimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimparActionPerformed
        cod.setText(null);
        nome.setText(null);
    }//GEN-LAST:event_LimparActionPerformed
    public void preencherTableServiço(String SQL) throws SQLException{
        ArrayList dados = new ArrayList();
        
        String [] Colunas = new String[]{"Nome","Quantidade","Preço Final", "cod"};
        try {
        conecta.executaSQL(SQL);
        conecta.rs.first();
        do{
            dados.add(new Object[]{conecta.rs.getString("Nome"),conecta.rs.getInt("quant"),conecta.rs.getDouble("precototal"),conecta.rs.getInt("cod")});
        }while(conecta.rs.next());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao preencher o ArrayList \nErro:" + ex);
        }
        ModeloTabela modelo = new ModeloTabela(dados,Colunas);
        tabelaServico.setModel(modelo);
        tabelaServico.getColumnModel().getColumn(0).setPreferredWidth(150);
        tabelaServico.getColumnModel().getColumn(0).setResizable(false);
        tabelaServico.getColumnModel().getColumn(1).setPreferredWidth(80);
        tabelaServico.getColumnModel().getColumn(1).setResizable(false);
        tabelaServico.getColumnModel().getColumn(2).setPreferredWidth(80);
        tabelaServico.getColumnModel().getColumn(2).setResizable(false);
        tabelaServico.getTableHeader().setReorderingAllowed(false);
        tabelaServico.setAutoResizeMode(tabelaServico.AUTO_RESIZE_OFF);
        tabelaServico.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Limpar;
    private javax.swing.JButton OkPesquisa;
    private javax.swing.JButton alterar;
    private javax.swing.JTextField cod;
    private javax.swing.JButton deletar;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField nome;
    private javax.swing.JTextField pesquisaNome;
    private javax.swing.JTextField preco;
    private javax.swing.JTextField quant;
    private javax.swing.JTable tabelaServico;
    // End of variables declaration//GEN-END:variables
}
