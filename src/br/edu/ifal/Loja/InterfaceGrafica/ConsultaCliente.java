
package br.edu.ifal.Loja.InterfaceGrafica;
import br.edu.BEANS.ModeloTabela;
import br.edu.ifal.Loja.DAO.Conexao;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
public class ConsultaCliente extends javax.swing.JInternalFrame {

    Conexao conecta =  new Conexao();
    public ConsultaCliente() {
        initComponents();
        conecta.conexao();
        preencherTableCliente("select Cliente_Id, Nome, Telefone, DataNascimento from cliente order by Cliente_Id ");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        telefone = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaCliente = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        cod = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        TableComCliente = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        alterar = new javax.swing.JButton();
        nome = new javax.swing.JTextField();
        Limpar = new javax.swing.JButton();
        deletar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        data = new javax.swing.JFormattedTextField();

        setClosable(true);
        setIconifiable(true);
        setTitle("Consulta de Clientes");

        telefone.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        TabelaCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        TabelaCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelaClienteMouseClicked(evt);
            }
        });
        TabelaCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TabelaClienteKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(TabelaCliente);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Código:");

        cod.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Nome:");

        TableComCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TableComCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ícones/TableCompleta.png"))); // NOI18N
        TableComCliente.setText("Tabela Completa");
        TableComCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TableComClienteActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Telefone:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Data de Nascimento:");

        alterar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        alterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ícones/group_edit.png"))); // NOI18N
        alterar.setText("Alterar");
        alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarActionPerformed(evt);
            }
        });

        nome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        Limpar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Limpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ícones/Limpar.png"))); // NOI18N
        Limpar.setText("Limpar");
        Limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimparActionPerformed(evt);
            }
        });

        deletar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        deletar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ícones/group_delete.png"))); // NOI18N
        deletar.setText("Deletar");
        deletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletarActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ícones/ConsuCli.png"))); // NOI18N

        try {
            data.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cod)))
                    .addComponent(Limpar))
                .addGap(108, 108, 108)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(alterar))
                .addGap(73, 73, 73)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(deletar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TableComCliente)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(54, 54, 54)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(data))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(data, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(alterar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Limpar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(TableComCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(deletar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TableComClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TableComClienteActionPerformed
        Cliente_Completo CC = new Cliente_Completo();
        CC.setVisible(true);
        dispose();
        CC.setLocationRelativeTo(null);
    }//GEN-LAST:event_TableComClienteActionPerformed

    private void alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarActionPerformed
        try {
            PreparedStatement pst =  conecta.conn.prepareStatement("update Cliente set Nome = ?,Telefone = ?, DataNascimento=? where Cliente_Id=?");
            pst.setString(1,nome.getText() );
            pst.setString(2,telefone.getText());
            pst.setString(3,data.getText());
            pst.setInt(4,Integer.parseInt(cod.getText()));
            pst.execute();
            JOptionPane.showMessageDialog(null,"Alterado com sucesso");
            preencherTableCliente("select Cliente_Id,Nome,Telefone, DataNascimento from Cliente order by Cliente_Id");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao Alterar");
        }
    }//GEN-LAST:event_alterarActionPerformed

    private void LimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimparActionPerformed
        cod.setText(null);
        nome.setText(null);
        telefone.setText(null);
        data.setText(null);
    }//GEN-LAST:event_LimparActionPerformed

    private void deletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletarActionPerformed
        //System.out.println("Linha Selecionada: " + TabelaCliente.getSelectedRow());
        try {
            PreparedStatement pst =  conecta.conn.prepareStatement("delete from Cliente where Cliente_Id=?");
            pst.setInt(1,Integer.parseInt(cod.getText()));
            pst.execute();
            JOptionPane.showMessageDialog(null,"Excluido com sucesso");
            preencherTableCliente("select Cliente_Id,Nome,Telefone,DataNascimento from cliente order by Cliente_Id  ");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao excluir: " + ex);
        }
    }//GEN-LAST:event_deletarActionPerformed

    private void TabelaClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaClienteMouseClicked
        if(TabelaCliente.getSelectedRow() != -1){
            cod.setText(TabelaCliente.getValueAt(TabelaCliente.getSelectedRow(),0).toString());
            nome.setText(TabelaCliente.getValueAt(TabelaCliente.getSelectedRow(),1).toString());
            telefone.setText(TabelaCliente.getValueAt(TabelaCliente.getSelectedRow(),2).toString());           
            data.setText(TabelaCliente.getValueAt(TabelaCliente.getSelectedRow(),3).toString());
        }else{
           JOptionPane.showMessageDialog(null,"Selecione uma linha");
       }
    }//GEN-LAST:event_TabelaClienteMouseClicked

    private void TabelaClienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TabelaClienteKeyReleased
       if(TabelaCliente.getSelectedRow() != -1){
            cod.setText(TabelaCliente.getValueAt(TabelaCliente.getSelectedRow(),0).toString());
            nome.setText(TabelaCliente.getValueAt(TabelaCliente.getSelectedRow(),1).toString());
            telefone.setText(TabelaCliente.getValueAt(TabelaCliente.getSelectedRow(),2).toString());           
            data.setText(TabelaCliente.getValueAt(TabelaCliente.getSelectedRow(),3).toString());
        }else{
           JOptionPane.showMessageDialog(null,"Selecione uma linha");
       } 
    }//GEN-LAST:event_TabelaClienteKeyReleased
public void preencherTableCliente(String SQL){
        ArrayList dados = new ArrayList();
        
        String [] Colunas = new String[]{"Código","Nome","Telefone","D. de Nascimento"};
        
        try {
            conecta.executaSQL(SQL);
            conecta.rs.first();
            do{
                dados.add(new Object[]{conecta.rs.getInt("Cliente_Id"),conecta.rs.getString("Nome"),conecta.rs.getString("Telefone"),conecta.rs.getString("DataNascimento")});
            }while(conecta.rs.next());
         } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao preencher o ArrayList \nErro:" + ex);
        }
        ModeloTabela modelo = new ModeloTabela(dados,Colunas);
        TabelaCliente.setModel(modelo);
        TabelaCliente.getColumnModel().getColumn(0).setPreferredWidth(50);
        TabelaCliente.getColumnModel().getColumn(0).setResizable(false);
        TabelaCliente.getColumnModel().getColumn(1).setPreferredWidth(200);
        TabelaCliente.getColumnModel().getColumn(1).setResizable(false);
        TabelaCliente.getColumnModel().getColumn(2).setPreferredWidth(160);
        TabelaCliente.getColumnModel().getColumn(2).setResizable(false);
        TabelaCliente.getColumnModel().getColumn(3).setPreferredWidth(140);
        TabelaCliente.getColumnModel().getColumn(3).setResizable(false);
        TabelaCliente.getTableHeader().setReorderingAllowed(false);
        TabelaCliente.setAutoResizeMode(TabelaCliente.AUTO_RESIZE_OFF);
        TabelaCliente.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Limpar;
    private javax.swing.JTable TabelaCliente;
    private javax.swing.JButton TableComCliente;
    private javax.swing.JButton alterar;
    private javax.swing.JTextField cod;
    private javax.swing.JFormattedTextField data;
    private javax.swing.JButton deletar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nome;
    private javax.swing.JTextField telefone;
    // End of variables declaration//GEN-END:variables
}
