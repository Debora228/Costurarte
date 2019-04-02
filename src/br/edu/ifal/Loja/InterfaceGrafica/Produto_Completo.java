
package br.edu.ifal.Loja.InterfaceGrafica;

import br.edu.ifal.Loja.BEANS.ModeloTabela;
import br.edu.ifal.Loja.DAO.Conexao;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;

public class Produto_Completo extends javax.swing.JFrame {
    Conexao conecta = new Conexao();
    public Produto_Completo() {
        initComponents();
        conecta.conexao();
        setLocationRelativeTo(null);
        preencherTable("select * from produto order by Produto_Id ");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        telMostrar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaProduto = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        marca = new javax.swing.JTextField();
        cod = new javax.swing.JTextField();
        medidaMostrar = new javax.swing.JLabel();
        preco = new javax.swing.JTextField();
        categoria = new javax.swing.JTextField();
        cor = new javax.swing.JTextField();
        deletar = new javax.swing.JButton();
        nome = new javax.swing.JTextField();
        alterar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        descricao = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        quant = new javax.swing.JTextField();
        medida = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        limpar = new javax.swing.JButton();

        telMostrar.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consultar Produtos");
        setResizable(false);

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
        TabelaProduto.getTableHeader().setReorderingAllowed(false);
        TabelaProduto.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                TabelaProdutoAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
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
        jLabel2.setText("Marca:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Código:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Medida:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Preço:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Categoria:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Cor:");

        marca.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        cod.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codActionPerformed(evt);
            }
        });

        preco.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        preco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precoActionPerformed(evt);
            }
        });

        categoria.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        cor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        deletar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        deletar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ícones/basket_delete.png"))); // NOI18N
        deletar.setText("Deletar");
        deletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletarActionPerformed(evt);
            }
        });

        nome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        alterar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        alterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ícones/basket_edit.png"))); // NOI18N
        alterar.setText("Alterar");
        alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Descrição:");

        descricao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Quantidade:");

        quant.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        medida.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("R$");

        limpar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        limpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ícones/Limpar.png"))); // NOI18N
        limpar.setText("Limpar");
        limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(81, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 764, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
            .addGroup(layout.createSequentialGroup()
                .addGap(207, 207, 207)
                .addComponent(alterar)
                .addGap(127, 127, 127)
                .addComponent(deletar)
                .addGap(113, 113, 113)
                .addComponent(limpar)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(nome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addGap(108, 108, 108))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(categoria)
                                                .addGap(32, 32, 32)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel3)
                                            .addComponent(cod, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                                            .addComponent(jLabel10)
                                            .addComponent(quant)))
                                    .addComponent(jLabel1))
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cor, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel5)
                                    .addComponent(medida))
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel2)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(preco)
                                            .addComponent(marca, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel4)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 139, Short.MAX_VALUE)
                        .addComponent(medidaMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(descricao, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(jLabel6)
                        .addComponent(jLabel5)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(quant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(preco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(medida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(medidaMostrar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(descricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(alterar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deletar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(limpar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void codActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codActionPerformed

    private void precoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_precoActionPerformed

    private void deletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletarActionPerformed
        try {
            PreparedStatement pst =  conecta.conn.prepareStatement("delete from produto where Produto_Id=?");
            pst.setInt(1,Integer.parseInt(cod.getText()));
            pst.execute();
            JOptionPane.showMessageDialog(null,"Excluido com sucesso");
            preencherTable("select * from produto order by Produto_Id ");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao excluir");
        }
    }//GEN-LAST:event_deletarActionPerformed

    private void alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarActionPerformed
        try {
            PreparedStatement pst =  conecta.conn.prepareStatement("update produto set Nome = ?, Categoria=?,descricao=?,Quantidade=?,"
                    + "preco_venda=?,cor=?,unidade_de_medida=?,marca=? where Produto_Id=?");
            pst.setString(1,nome.getText() );
            pst.setString(2,categoria.getText());
            pst.setString(3,descricao.getText());
            pst.setInt(4,Integer.parseInt(quant.getText()));
            pst.setDouble(5,Double.parseDouble(preco.getText()));
            pst.setString(6,cor.getText());
            pst.setString(7,medida.getText());
            pst.setString(8,marca.getText());
            pst.setInt(9,Integer.parseInt(cod.getText()));
            pst.execute();
            JOptionPane.showMessageDialog(null,"Alterado com sucesso");
            preencherTable("select * from produto order by Produto_Id ");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao Alterar");
        }
    }//GEN-LAST:event_alterarActionPerformed

    private void TabelaProdutoAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_TabelaProdutoAncestorAdded
        
    }//GEN-LAST:event_TabelaProdutoAncestorAdded

    private void limparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparActionPerformed
        nome.setText(null);
        cor.setText(null);
        descricao.setText(null);
        categoria.setText(null);
        medida.setText(null);
        preco.setText(null);
        quant.setText(null);
        cod.setText(null);
        marca.setText(null);
    }//GEN-LAST:event_limparActionPerformed

    private void TabelaProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaProdutoMouseClicked
        if(TabelaProduto.getSelectedRow() != -1){
            cod.setText(TabelaProduto.getValueAt(TabelaProduto.getSelectedRow(),1).toString());
            nome.setText(TabelaProduto.getValueAt(TabelaProduto.getSelectedRow(),0).toString());
            cor.setText(TabelaProduto.getValueAt(TabelaProduto.getSelectedRow(),2).toString());
            marca.setText(TabelaProduto.getValueAt(TabelaProduto.getSelectedRow(),3).toString());
            preco.setText(TabelaProduto.getValueAt(TabelaProduto.getSelectedRow(),6).toString());
            descricao.setText(TabelaProduto.getValueAt(TabelaProduto.getSelectedRow(),8).toString());
            quant.setText(TabelaProduto.getValueAt(TabelaProduto.getSelectedRow(),5).toString());
            categoria.setText(TabelaProduto.getValueAt(TabelaProduto.getSelectedRow(),4).toString());
            medida.setText(TabelaProduto.getValueAt(TabelaProduto.getSelectedRow(),7).toString());
        }else{
           JOptionPane.showMessageDialog(null,"Selecione uma linha");
       }
    }//GEN-LAST:event_TabelaProdutoMouseClicked

    private void TabelaProdutoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TabelaProdutoKeyReleased
        if(TabelaProduto.getSelectedRow() != -1){
            cod.setText(TabelaProduto.getValueAt(TabelaProduto.getSelectedRow(),1).toString());
            nome.setText(TabelaProduto.getValueAt(TabelaProduto.getSelectedRow(),0).toString());
            cor.setText(TabelaProduto.getValueAt(TabelaProduto.getSelectedRow(),2).toString());
            marca.setText(TabelaProduto.getValueAt(TabelaProduto.getSelectedRow(),3).toString());
            preco.setText(TabelaProduto.getValueAt(TabelaProduto.getSelectedRow(),6).toString());
            descricao.setText(TabelaProduto.getValueAt(TabelaProduto.getSelectedRow(),8).toString());
            quant.setText(TabelaProduto.getValueAt(TabelaProduto.getSelectedRow(),5).toString());
            categoria.setText(TabelaProduto.getValueAt(TabelaProduto.getSelectedRow(),4).toString());
            medida.setText(TabelaProduto.getValueAt(TabelaProduto.getSelectedRow(),7).toString());
        }else{
           JOptionPane.showMessageDialog(null,"Selecione uma linha");
       }
    }//GEN-LAST:event_TabelaProdutoKeyReleased

    public void preencherTable(String SQL){
        ArrayList dados = new ArrayList();
        
        String [] Colunas = new String[]{"Nome","Código","Cor","Marca","Categoria","Quantidade","Preço","Medida","Descrição"};
        
        try {
            conecta.executaSQL(SQL);
            conecta.rs.first();
            do{
                dados.add(new Object[]{conecta.rs.getString("Nome"),conecta.rs.getInt("Produto_Id"),conecta.rs.getString("cor"),conecta.rs.getString("marca"),conecta.rs.getString("Categoria"),conecta.rs.getInt("Quantidade"),conecta.rs.getDouble("preco_venda"),conecta.rs.getString("unidade_de_medida"),conecta.rs.getString("descricao")});
            }while(conecta.rs.next());
         } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao preencher o ArrayList \nErro:" + ex);
        }
        ModeloTabela modelo = new ModeloTabela(dados,Colunas);
        TabelaProduto.setModel(modelo);
        TabelaProduto.getColumnModel().getColumn(0).setPreferredWidth(100);
        TabelaProduto.getColumnModel().getColumn(0).setResizable(false);
        TabelaProduto.getColumnModel().getColumn(1).setPreferredWidth(50);
        TabelaProduto.getColumnModel().getColumn(1).setResizable(false);
        TabelaProduto.getColumnModel().getColumn(8).setPreferredWidth(160);
        TabelaProduto.getColumnModel().getColumn(8).setResizable(false);
        TabelaProduto.getTableHeader().setReorderingAllowed(false);
        TabelaProduto.setAutoResizeMode(TabelaProduto.AUTO_RESIZE_OFF);
        TabelaProduto.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
    }
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Produto_Completo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TabelaProduto;
    private javax.swing.JButton alterar;
    private javax.swing.JTextField categoria;
    private javax.swing.JTextField cod;
    private javax.swing.JTextField cor;
    private javax.swing.JButton deletar;
    private javax.swing.JTextField descricao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton limpar;
    private javax.swing.JTextField marca;
    private javax.swing.JTextField medida;
    private javax.swing.JLabel medidaMostrar;
    private javax.swing.JTextField nome;
    private javax.swing.JTextField preco;
    private javax.swing.JTextField quant;
    private javax.swing.JTextField telMostrar;
    // End of variables declaration//GEN-END:variables
}
