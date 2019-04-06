package InterfaceGrafica;

import BEANS.ModeloTabela;
import DAO.Conexao;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;

public class ProdutosFalta extends javax.swing.JInternalFrame {
    Conexao conecta = new Conexao();
    public ProdutosFalta() {
        initComponents();
        conecta.conexao();
        preencherTableProduto("select Nome,cor,marca,descricao from produto  where Quantidade = 0");
    }
    
public void preencherTableProduto(String SQL){
        ArrayList dados = new ArrayList();
        
        String [] Colunas = new String[]{"Nome","Cor","Marca", "Descrição"};
        
        try {
            conecta.executaSQL(SQL);
            conecta.rs.first();
            do{
                dados.add(new Object[]{conecta.rs.getString("Nome"),conecta.rs.getString("cor"),conecta.rs.getString("marca"),conecta.rs.getString("descricao")});
            }while(conecta.rs.next());
         } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao preencher o ArrayList \nErro:" + ex);
        }
        ModeloTabela modelo = new ModeloTabela(dados,Colunas);
        FaltaProduto.setModel(modelo);
        FaltaProduto.getColumnModel().getColumn(0).setPreferredWidth(130);
        FaltaProduto.getColumnModel().getColumn(0).setResizable(false);
        FaltaProduto.getColumnModel().getColumn(1).setPreferredWidth(100);
        FaltaProduto.getColumnModel().getColumn(1).setResizable(false);
        FaltaProduto.getColumnModel().getColumn(2).setPreferredWidth(100);
        FaltaProduto.getColumnModel().getColumn(2).setResizable(false);
        FaltaProduto.getColumnModel().getColumn(3).setPreferredWidth(130);
        FaltaProduto.getColumnModel().getColumn(3).setResizable(false);
        FaltaProduto.getTableHeader().setReorderingAllowed(false);
        FaltaProduto.setAutoResizeMode(FaltaProduto.AUTO_RESIZE_OFF);
        FaltaProduto.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        FaltaProduto = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        bemvindo = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setTitle("Produtos em Falta");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 29, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        FaltaProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        FaltaProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FaltaProdutoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(FaltaProduto);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("ok");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(bemvindo, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 4, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(bemvindo, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        bemvindo.setText("Bem Vinda!");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void FaltaProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FaltaProdutoMouseClicked
        
    }//GEN-LAST:event_FaltaProdutoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable FaltaProduto;
    private javax.swing.JLabel bemvindo;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
