
package InterfaceGrafica;

import BEANS.ModeloTabela;
import DAO.Conexao;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;

public class ConsultaProduto extends javax.swing.JInternalFrame {
Conexao conecta = new Conexao();
    public ConsultaProduto() {
        initComponents();
        conecta.conexao();
        preencherTableProduto("select Nome,Produto_Id,cor,marca,preco_venda,descricao from produto order by Produto_Id ");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Deletar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaProduto = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        tableCompleto = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        nome = new javax.swing.JTextField();
        cor = new javax.swing.JTextField();
        preco = new javax.swing.JTextField();
        cod = new javax.swing.JTextField();
        marca = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        descricao = new javax.swing.JTextField();
        alterar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Consulta de Produto");

        Deletar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Deletar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ícones/basket_delete.png"))); // NOI18N
        Deletar.setText("Deletar");
        Deletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeletarActionPerformed(evt);
            }
        });

        TabelaProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        TabelaProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelaProdutoMouseClicked(evt);
            }
        });
        TabelaProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TabelaProdutoKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(TabelaProduto);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Nome:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Código:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Cor:");

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ícones/Limpar.png"))); // NOI18N
        jButton4.setText("Limpar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Preço:");

        tableCompleto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tableCompleto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ícones/TableCompleta.png"))); // NOI18N
        tableCompleto.setText("Tabela Completa");
        tableCompleto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tableCompletoActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Marca:");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ícones/ConsProd.jpg"))); // NOI18N

        nome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        cor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        preco.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        cod.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        marca.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Descrição:");

        alterar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        alterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ícones/basket_edit.png"))); // NOI18N
        alterar.setText("Alterar");
        alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 706, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addComponent(jLabel3))
                                .addGap(25, 25, 25)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(marca, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(129, 129, 129)
                                        .addComponent(jLabel2))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel4))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(cor, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel6))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(alterar)
                                .addGap(109, 109, 109)
                                .addComponent(Deletar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cod, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                                    .addComponent(preco)
                                    .addComponent(descricao))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(tableCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(preco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(descricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Deletar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(alterar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tableCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeletarActionPerformed
         try {
            PreparedStatement pst =  conecta.conn.prepareStatement("delete from Produto where Produto_Id=?");
            pst.setInt(1,Integer.parseInt(cod.getText()));
            pst.execute();
            JOptionPane.showMessageDialog(null,"Excluido com sucesso");
            preencherTableProduto("select Nome,Produto_Id,cor,marca,preco_venda,descricao from produto order by Produto_Id ");
                           
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
    }//GEN-LAST:event_DeletarActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        nome.setText(null);
        cor.setText(null);
        preco.setText(null);
        marca.setText(null);
        cod.setText(null);
        descricao.setText(null);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void tableCompletoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tableCompletoActionPerformed
        Produto_Completo PC = new Produto_Completo();
        PC.setVisible(true);
        dispose();
        PC.setLocationRelativeTo(null);
    }//GEN-LAST:event_tableCompletoActionPerformed

    private void alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarActionPerformed
        try {
            PreparedStatement pst =  conecta.conn.prepareStatement("update produto set Nome = ?,preco_venda=?,cor=?,marca=?, descricao=? where Produto_Id=?");
            pst.setString(1,nome.getText() );
            pst.setDouble(2,Double.parseDouble(preco.getText()));
            pst.setString(3,cor.getText() );
            pst.setString(4,marca.getText() );
            pst.setString(5,descricao.getText() );
            pst.setInt(6,Integer.parseInt(cod.getText()));
            pst.execute();
            JOptionPane.showMessageDialog(null,"Alterado com sucesso");
            preencherTableProduto("select Nome,Produto_Id,cor,marca,preco_venda,descricao from produto order by Produto_Id ");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao Alterar");
        }
    }//GEN-LAST:event_alterarActionPerformed

    private void TabelaProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaProdutoMouseClicked
       
        if(TabelaProduto.getSelectedRow() != -1){
            cod.setText(TabelaProduto.getValueAt(TabelaProduto.getSelectedRow(),0).toString());
            nome.setText(TabelaProduto.getValueAt(TabelaProduto.getSelectedRow(),1).toString());
            cor.setText(TabelaProduto.getValueAt(TabelaProduto.getSelectedRow(),2).toString());
            marca.setText(TabelaProduto.getValueAt(TabelaProduto.getSelectedRow(),3).toString());
            preco.setText(TabelaProduto.getValueAt(TabelaProduto.getSelectedRow(),4).toString());
            descricao.setText(TabelaProduto.getValueAt(TabelaProduto.getSelectedRow(),5).toString());
        }else{
           JOptionPane.showMessageDialog(null,"Selecione uma linha");
       }
    }//GEN-LAST:event_TabelaProdutoMouseClicked

    private void TabelaProdutoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TabelaProdutoKeyReleased
         if(TabelaProduto.getSelectedRow() != -1){
             if(TabelaProduto.getSelectedRow() != -1){
            cod.setText(TabelaProduto.getValueAt(TabelaProduto.getSelectedRow(),0).toString());
            nome.setText(TabelaProduto.getValueAt(TabelaProduto.getSelectedRow(),1).toString());
            cor.setText(TabelaProduto.getValueAt(TabelaProduto.getSelectedRow(),2).toString());
            marca.setText(TabelaProduto.getValueAt(TabelaProduto.getSelectedRow(),3).toString());
            preco.setText(TabelaProduto.getValueAt(TabelaProduto.getSelectedRow(),4).toString());
            descricao.setText(TabelaProduto.getValueAt(TabelaProduto.getSelectedRow(),5).toString());
        }else{
           JOptionPane.showMessageDialog(null,"Selecione uma linha");
       }
    }//GEN-LAST:event_TabelaProdutoKeyReleased
    }

    public void preencherTableProduto(String SQL){
        ArrayList dados = new ArrayList();
        
        String [] Colunas = new String[]{"Código","Nome","Cor","Marca","Preco", "Descrição"};
        
        try {
            conecta.executaSQL(SQL);
            conecta.rs.first();
            do{
                dados.add(new Object[]{conecta.rs.getInt("Produto_Id"),conecta.rs.getString("Nome"),conecta.rs.getString("cor"),conecta.rs.getString("marca"),conecta.rs.getDouble("preco_venda"),conecta.rs.getString("descricao")});
            }while(conecta.rs.next());
         } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao preencher o ArrayList \nErro:" + ex);
        }
        ModeloTabela modelo = new ModeloTabela(dados,Colunas);
        TabelaProduto.setModel(modelo);
        TabelaProduto.getColumnModel().getColumn(1).setPreferredWidth(100);
        TabelaProduto.getColumnModel().getColumn(1).setResizable(false);
        TabelaProduto.getColumnModel().getColumn(0).setPreferredWidth(50);
        TabelaProduto.getColumnModel().getColumn(0).setResizable(false);
        TabelaProduto.getColumnModel().getColumn(3).setPreferredWidth(50);
        TabelaProduto.getColumnModel().getColumn(3).setResizable(false);
        TabelaProduto.getColumnModel().getColumn(4).setPreferredWidth(50);
        TabelaProduto.getColumnModel().getColumn(4).setResizable(false);
        TabelaProduto.getColumnModel().getColumn(5).setPreferredWidth(150);
        TabelaProduto.getColumnModel().getColumn(5).setResizable(false);
        TabelaProduto.getTableHeader().setReorderingAllowed(false);
        TabelaProduto.setAutoResizeMode(TabelaProduto.AUTO_RESIZE_OFF);
        TabelaProduto.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Deletar;
    private javax.swing.JTable TabelaProduto;
    private javax.swing.JButton alterar;
    private javax.swing.JTextField cod;
    private javax.swing.JTextField cor;
    private javax.swing.JTextField descricao;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField marca;
    private javax.swing.JTextField nome;
    private javax.swing.JTextField preco;
    private javax.swing.JButton tableCompleto;
    // End of variables declaration//GEN-END:variables

}
