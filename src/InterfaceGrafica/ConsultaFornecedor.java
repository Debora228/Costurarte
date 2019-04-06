
package InterfaceGrafica;

import BEANS.ModeloTabela;
import DAO.Conexao;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;

public class ConsultaFornecedor extends javax.swing.JInternalFrame {
    Conexao conecta = new Conexao();
    public ConsultaFornecedor() {
        initComponents();
        conecta.conexao();
        preencherTable("select Fornecedor_Id,Nome,Telefone from fornecedor order by Fornecedor_Id ");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cod = new javax.swing.JTextField();
        nome = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableFornecedor = new javax.swing.JTable();
        deletar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        Tel = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        alterar = new javax.swing.JButton();
        tableCompleta = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Consulta de Fornecedor");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Código:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Nome:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Telefone:");

        cod.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        nome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        TableFornecedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        TableFornecedor.setColumnSelectionAllowed(true);
        TableFornecedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableFornecedorMouseClicked(evt);
            }
        });
        TableFornecedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TableFornecedorKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(TableFornecedor);

        deletar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        deletar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ícones/lorry_delete.png"))); // NOI18N
        deletar.setText("Deletar");
        deletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletarActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ícones/Caminhao.png"))); // NOI18N

        Tel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Tel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TelActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ícones/Limpar.png"))); // NOI18N
        jButton1.setText("Limpar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        alterar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        alterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ícones/lorry_link.png"))); // NOI18N
        alterar.setText("Alterar");
        alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarActionPerformed(evt);
            }
        });

        tableCompleta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tableCompleta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ícones/lorry_go.png"))); // NOI18N
        tableCompleta.setText("Tabela Completa");
        tableCompleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tableCompletaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5))
                    .addComponent(jButton1))
                .addGap(70, 70, 70)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(alterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(deletar)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 33, Short.MAX_VALUE)
                        .addComponent(tableCompleta))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Tel, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(cod, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Tel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(alterar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deletar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tableCompleta, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tableCompletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tableCompletaActionPerformed
        Fornecedor_Completo FC = new Fornecedor_Completo();
        FC.setVisible(true);
        dispose();
        FC.setLocationRelativeTo(null);
    }//GEN-LAST:event_tableCompletaActionPerformed

    private void alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarActionPerformed
         try {
            PreparedStatement pst =  conecta.conn.prepareStatement("update Fornecedor set Nome = ?,Telefone = ? where Fornecedorira _Id=?");
            pst.setString(1,nome.getText() );
            pst.setString(2,Tel.getText());
            pst.setInt(3,Integer.parseInt(cod.getText()));
            pst.execute();
            JOptionPane.showMessageDialog(null,"Alterado com sucesso");
            preencherTable("select Fornecedor_Id,Nome,Telefone from fornecedor order by Fornecedor_Id  ");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao Alterar: " + ex);
        }
    }//GEN-LAST:event_alterarActionPerformed

    private void deletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletarActionPerformed
        try {
            PreparedStatement pst =  conecta.conn.prepareStatement("delete from Fornecedor where Fornecedor_Id=?");
            pst.setInt(1,Integer.parseInt(cod.getText()));
            pst.execute();
            JOptionPane.showMessageDialog(null,"Excluido com sucesso");
            preencherTable("select Fornecedor_Id,Nome,Telefone from fornecedor order by Fornecedor_Id  ");
                           
        }catch(SQLException ex){
            int op =Integer.parseInt( JOptionPane.showInputDialog("ATENÇÃO!!\n Ao deletar estes dados, excluirá também a relação desse fornecedor com o produto\n Deseja excluir esse fornecedor?(Sim-1/Não-2)"));
            if(op==1){
                Produto_Fornecedor pf = new Produto_Fornecedor();
                pf.setVisible(true);
            }
            if(op==2){
                JOptionPane.showMessageDialog(null,"Exclusão cancelada");
         }
        }
    }//GEN-LAST:event_deletarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        cod.setText(null);
        nome.setText(null);
        Tel.setText(null);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void TelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TelActionPerformed

    private void TableFornecedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableFornecedorMouseClicked
        if(TableFornecedor.getSelectedRow() != -1){
            cod.setText(TableFornecedor.getValueAt(TableFornecedor.getSelectedRow(),0).toString());
            nome.setText(TableFornecedor.getValueAt(TableFornecedor.getSelectedRow(),1).toString());
            Tel.setText(TableFornecedor.getValueAt(TableFornecedor.getSelectedRow(),2).toString());           
        }else{
           JOptionPane.showMessageDialog(null,"Selecione uma linha");
       }

    }//GEN-LAST:event_TableFornecedorMouseClicked

    private void TableFornecedorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TableFornecedorKeyReleased
        if(TableFornecedor.getSelectedRow() != -1){
            cod.setText(TableFornecedor.getValueAt(TableFornecedor.getSelectedRow(),0).toString());
            nome.setText(TableFornecedor.getValueAt(TableFornecedor.getSelectedRow(),1).toString());
            Tel.setText(TableFornecedor.getValueAt(TableFornecedor.getSelectedRow(),2).toString());           
        }else{
           JOptionPane.showMessageDialog(null,"Selecione uma linha");
       }
    }//GEN-LAST:event_TableFornecedorKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TableFornecedor;
    private javax.swing.JTextField Tel;
    private javax.swing.JButton alterar;
    private javax.swing.JTextField cod;
    private javax.swing.JButton deletar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nome;
    private javax.swing.JButton tableCompleta;
    // End of variables declaration//GEN-END:variables

    public void preencherTable(String SQL){
        ArrayList dados = new ArrayList();
        
        String [] Colunas = new String[]{"Código","Nome","Telefone"};
        
        try {
            conecta.executaSQL(SQL);
            conecta.rs.first();
            do{
                dados.add(new Object[]{conecta.rs.getInt("Fornecedor_Id"),conecta.rs.getString("Nome"),conecta.rs.getString("Telefone")});
            }while(conecta.rs.next());
         } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao preencher o ArrayList \nErro:" + ex);
        }
        ModeloTabela modelo = new ModeloTabela(dados,Colunas);
        TableFornecedor.setModel(modelo);
        TableFornecedor.getColumnModel().getColumn(0).setPreferredWidth(50);
        TableFornecedor.getColumnModel().getColumn(0).setResizable(false);
        TableFornecedor.getColumnModel().getColumn(1).setPreferredWidth(180);
        TableFornecedor.getColumnModel().getColumn(1).setResizable(false);
        TableFornecedor.getColumnModel().getColumn(2).setPreferredWidth(160);
        TableFornecedor.getColumnModel().getColumn(2).setResizable(false);
        TableFornecedor.getTableHeader().setReorderingAllowed(false);
        TableFornecedor.setAutoResizeMode(TableFornecedor.AUTO_RESIZE_OFF);
        TableFornecedor.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
                     
                }
            }
        
    
    

