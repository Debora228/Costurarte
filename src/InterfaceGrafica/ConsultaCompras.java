package InterfaceGrafica;

import BEANS.ModeloTabela;
import DAO.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;

public class ConsultaCompras extends javax.swing.JInternalFrame {
    Conexao conecta = new Conexao();
    
    public ConsultaCompras() {
        initComponents();
        conecta.conexao();
        preencherTable("select Cod1,data,Preco_final,taxa, forma, Parcela_Quant from compra order by Cod1");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TableCompra = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        alterar = new javax.swing.JButton();
        Deletar = new javax.swing.JButton();
        forma = new javax.swing.JTextField();
        data = new javax.swing.JTextField();
        taxa = new javax.swing.JTextField();
        parcela = new javax.swing.JTextField();
        cod1 = new javax.swing.JTextField();
        precoFinal = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Produtos = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setTitle("Consultar Compras");

        TableCompra.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        TableCompra.setColumnSelectionAllowed(true);
        TableCompra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableCompraMouseClicked(evt);
            }
        });
        TableCompra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TableCompraKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(TableCompra);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ícones/Limpar.png"))); // NOI18N
        jButton1.setText("Limpar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        alterar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        alterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ícones/basket_edit.png"))); // NOI18N
        alterar.setText("Alterar");
        alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarActionPerformed(evt);
            }
        });

        Deletar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Deletar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ícones/basket_delete.png"))); // NOI18N
        Deletar.setText("Deletar");
        Deletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeletarActionPerformed(evt);
            }
        });

        forma.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        data.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        taxa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        cod1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        precoFinal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Preço:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Código:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Parcela:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Taxa:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Data:");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Forma:");

        Produtos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Produtos.setText("Produtos");
        Produtos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProdutosActionPerformed(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ícones/shopcartapply.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cod1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(forma)
                            .addComponent(taxa, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(precoFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(data, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(jLabel1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(parcela, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Produtos)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(18, 18, 18)
                                .addComponent(alterar)))
                        .addGap(24, 24, 24)
                        .addComponent(Deletar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(cod1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(taxa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(forma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4)
                                        .addComponent(precoFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel6)
                                        .addComponent(parcela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(alterar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Deletar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(46, 46, 46)
                                .addComponent(Produtos, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel8)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TableCompraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableCompraMouseClicked
        if(TableCompra.getSelectedRow() != -1){
            cod1.setText(TableCompra.getValueAt(TableCompra.getSelectedRow(),0).toString());
            data.setText(TableCompra.getValueAt(TableCompra.getSelectedRow(),1).toString());
            precoFinal.setText(TableCompra.getValueAt(TableCompra.getSelectedRow(),2).toString());
            taxa.setText(TableCompra.getValueAt(TableCompra.getSelectedRow(),3).toString());
            forma.setText(TableCompra.getValueAt(TableCompra.getSelectedRow(),4).toString());
            parcela.setText(TableCompra.getValueAt(TableCompra.getSelectedRow(),5).toString());
        }else{
            JOptionPane.showMessageDialog(null,"Selecione uma linha");
        }
    }//GEN-LAST:event_TableCompraMouseClicked

    private void TableCompraKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TableCompraKeyReleased
        if(TableCompra.getSelectedRow() != -1){
            cod1.setText(TableCompra.getValueAt(TableCompra.getSelectedRow(),0).toString());
            data.setText(TableCompra.getValueAt(TableCompra.getSelectedRow(),1).toString());
            precoFinal.setText(TableCompra.getValueAt(TableCompra.getSelectedRow(),2).toString());
            taxa.setText(TableCompra.getValueAt(TableCompra.getSelectedRow(),3).toString());
            forma.setText(TableCompra.getValueAt(TableCompra.getSelectedRow(),4).toString());
            parcela.setText(TableCompra.getValueAt(TableCompra.getSelectedRow(),5).toString());
        }else{
            JOptionPane.showMessageDialog(null,"Selecione uma linha");
        }
    }//GEN-LAST:event_TableCompraKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        cod1.setText(null);
        data.setText(null);
        precoFinal.setText(null);
        taxa.setText(null);
        forma.setText(null);
        parcela.setText(null);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarActionPerformed
        try {
            PreparedStatement pst =  conecta.conn.prepareStatement("update compra set data=?,Preco_Final=?,taxa=?,forma=?,parcela_Quant=? where cod1=?");
            pst.setString(1,data.getText() );
            pst.setDouble(2,Double.parseDouble(precoFinal.getText()));
            pst.setString(3,taxa.getText() );
            pst.setString(4,forma.getText() );
            pst.setInt(5, Integer.parseInt(parcela.getText()));
            pst.setInt(6,Integer.parseInt(cod1.getText()));
            pst.execute();
            JOptionPane.showMessageDialog(null,"Alterado com sucesso");
            preencherTable("select Cod1,data,Preco_final,taxa, forma, Parcela_Quant from compra order by Cod1 ");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao Alterar");
        }
    }//GEN-LAST:event_alterarActionPerformed

    private void DeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeletarActionPerformed
        try {
            PreparedStatement pst =  conecta.conn.prepareStatement("delete from compra where cod1=?");
            pst.setInt(1,Integer.parseInt(cod1.getText()));
            pst.execute();
            JOptionPane.showMessageDialog(null,"Excluido com sucesso");
            preencherTable("select Cod1,data,Preco_final,taxa, forma, Parcela_Quant from compra order by Cod1");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao excluir \n Erro:"+ex);
        }
    }
    
    
    public void preencherTable(String SQL){
        ArrayList dados = new ArrayList();
        
        String [] Colunas = new String[]{"Código","Data","Preço Total", "Taxa", "Forma", "Parcela"};
        
        try {
        conecta.executaSQL(SQL);
        conecta.rs.first();
        
        do{
            dados.add(new Object[]{conecta.rs.getInt("Cod1"),conecta.rs.getString("data"),conecta.rs.getDouble("Preco_final"),conecta.rs.getString("taxa"),conecta.rs.getString("forma"),conecta.rs.getInt("Parcela_Quant")});
        }while(conecta.rs.next());
        } catch (SQLException ex) {
        }
        //dados.remove(dados.size()-1);
        ModeloTabela modelo = new ModeloTabela(dados,Colunas);
        TableCompra.setModel(modelo);
        TableCompra.getColumnModel().getColumn(0).setPreferredWidth(50);
        TableCompra.getColumnModel().getColumn(0).setResizable(false);
        TableCompra.getColumnModel().getColumn(1).setPreferredWidth(70);
        TableCompra.getColumnModel().getColumn(1).setResizable(false);
        TableCompra.getColumnModel().getColumn(2).setPreferredWidth(70);
        TableCompra.getColumnModel().getColumn(2).setResizable(false);
        TableCompra.getTableHeader().setReorderingAllowed(false);
        TableCompra.setAutoResizeMode(TableCompra.AUTO_RESIZE_OFF);
        TableCompra.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
                     
                
    }//GEN-LAST:event_DeletarActionPerformed

    private void ProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProdutosActionPerformed
        int codCar = 0;
        try {
            if(cod1.getText().equals(null)){
                JOptionPane.showMessageDialog(null,"Selecione um produto");
            }else{
               PreparedStatement pst = conecta.conn.prepareStatement("select codCarrinho from carrinho  where codCompra=? ");
                    pst.setInt(1,Integer.parseInt(cod1.getText()));
                    ResultSet rs = pst.executeQuery();
                    while(rs.next()) {
                        codCar = rs.getInt("codCarrinho");
                    }
                if(codCar==0){
                    JOptionPane.showMessageDialog(null,"A compra não tem produtos");
                }else{    
                ConsultaCarrinho cc = new ConsultaCarrinho();
                cc.exibir(Integer.parseInt(cod1.getText()));
                cc.setVisible(true);
                }
            }
        }catch (SQLException ex) {
         JOptionPane.showMessageDialog(null, ex );
}
    }//GEN-LAST:event_ProdutosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Deletar;
    private javax.swing.JButton Produtos;
    private javax.swing.JTable TableCompra;
    private javax.swing.JButton alterar;
    private javax.swing.JTextField cod1;
    private javax.swing.JTextField data;
    private javax.swing.JTextField forma;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField parcela;
    private javax.swing.JTextField precoFinal;
    private javax.swing.JTextField taxa;
    // End of variables declaration//GEN-END:variables

}
