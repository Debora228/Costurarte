package br.edu.ifal.Loja.InterfaceGrafica;

import br.edu.BEANS.ModeloTabela;
import br.edu.ifal.Loja.DAO.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;

public class ConsultaCategoria extends javax.swing.JFrame {
   Conexao conecta =  new Conexao();
    public ConsultaCategoria() {
        initComponents();
        conecta.conexao();
         preencherTableCategoria("select Categoria_id, Nome from categoria order by Categoria_Id ");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaCategoria = new javax.swing.JTable();
        cod = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        nome = new javax.swing.JTextField();
        alterar = new javax.swing.JButton();
        deletar = new javax.swing.JButton();
        Limpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        TabelaCategoria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        TabelaCategoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelaCategoriaMouseClicked(evt);
            }
        });
        TabelaCategoria.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TabelaCategoriaKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(TabelaCategoria);

        cod.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Código:");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Nome:");

        nome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        alterar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        alterar.setText("Alterar");
        alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarActionPerformed(evt);
            }
        });

        deletar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        deletar.setText("Deletar");
        deletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletarActionPerformed(evt);
            }
        });

        Limpar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Limpar.setText("Limpar");
        Limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Limpar)
                        .addGap(31, 31, 31)
                        .addComponent(deletar)
                        .addGap(47, 47, 47)
                        .addComponent(alterar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cod, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(nome)
                                .addGap(29, 29, 29))))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel7)
                    .addContainerGap(326, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(alterar)
                    .addComponent(deletar)
                    .addComponent(Limpar))
                .addGap(0, 96, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(160, 160, 160)
                    .addComponent(jLabel7)
                    .addContainerGap(194, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarActionPerformed
        //alterar também todos os produtos que tem essa categoria
         try {
            String n = TabelaCategoria.getValueAt(TabelaCategoria.getSelectedRow(),1).toString();
            System.out.println("n: " + n);
            PreparedStatement pst =  conecta.conn.prepareStatement("update Categoria set Nome = ? where Categoria_Id=?");
            pst.setString(1,nome.getText() );
            pst.setInt(2,Integer.parseInt(cod.getText())); 
            pst.execute();
            JOptionPane.showMessageDialog(null,"Alterado com sucesso");
            
            int op = Integer.parseInt(JOptionPane.showInputDialog("Deseja alterar também em todos os produtos que contem essa categoria?(Sim-1/Não-2)"));
            if(op==1){
                
                PreparedStatement pst2 =  conecta.conn.prepareStatement("Select categoria from produto order by Produto_id");
                ResultSet rs =  pst2.executeQuery();
                while(rs.next()){
                    if(n.equals(rs.getString("categoria"))){
                        try{
                        PreparedStatement pst3 =  conecta.conn.prepareStatement("update produto set categoria = ? where categoria=?");
                        pst3.setString(1,n);
                        pst3.execute();
                        } catch (SQLException ex) {
                            JOptionPane.showMessageDialog(null,"Erro: "+ ex);
                        }
                    }
                }
            }
            preencherTableCategoria("select Categoria_Id,Nome from Categoria order by Categoria_Id");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao Alterar: "+ex);
        }
    }//GEN-LAST:event_alterarActionPerformed

    private void TabelaCategoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaCategoriaMouseClicked
        if(TabelaCategoria.getSelectedRow() != -1){
            cod.setText(TabelaCategoria.getValueAt(TabelaCategoria.getSelectedRow(),0).toString());
            nome.setText(TabelaCategoria.getValueAt(TabelaCategoria.getSelectedRow(),1).toString());
        }else{
           JOptionPane.showMessageDialog(null,"Selecione uma linha");
       }
    }//GEN-LAST:event_TabelaCategoriaMouseClicked

    private void TabelaCategoriaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TabelaCategoriaKeyReleased
        if(TabelaCategoria.getSelectedRow() != -1){
            cod.setText(TabelaCategoria.getValueAt(TabelaCategoria.getSelectedRow(),0).toString());
            nome.setText(TabelaCategoria.getValueAt(TabelaCategoria.getSelectedRow(),1).toString());
        }else{
           JOptionPane.showMessageDialog(null,"Selecione uma linha");
       }
    }//GEN-LAST:event_TabelaCategoriaKeyReleased

    private void deletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletarActionPerformed
        try {
            PreparedStatement pst =  conecta.conn.prepareStatement("delete from Categoria where Categoria_Id=?");
            pst.setInt(1,Integer.parseInt(cod.getText()));
            pst.execute();
            JOptionPane.showMessageDialog(null,"Excluido com sucesso");
            preencherTableCategoria("select Categoria_Id,Nome from categoria order by Categoria_Id");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao excluir");
        }
    }//GEN-LAST:event_deletarActionPerformed

    private void LimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimparActionPerformed
        nome.setText(null);
        cod.setText(null);
    }//GEN-LAST:event_LimparActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultaCategoria().setVisible(true);
            }
        });
    }
public void preencherTableCategoria(String SQL){
        ArrayList dados = new ArrayList();
        
        String [] Colunas = new String[]{"Código","Nome"};
        
        try {
            conecta.executaSQL(SQL);
            conecta.rs.first();
            do{
                dados.add(new Object[]{conecta.rs.getInt("Categoria_Id"),conecta.rs.getString("Nome")});
            }while(conecta.rs.next());
         } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao preencher o ArrayList \nErro:" + ex);
        }
        ModeloTabela modelo = new ModeloTabela(dados,Colunas);
        TabelaCategoria.setModel(modelo);
        TabelaCategoria.getColumnModel().getColumn(0).setPreferredWidth(50);
        TabelaCategoria.getColumnModel().getColumn(0).setResizable(false);
        TabelaCategoria.getColumnModel().getColumn(1).setPreferredWidth(250);
        TabelaCategoria.getColumnModel().getColumn(1).setResizable(false);
        TabelaCategoria.getTableHeader().setReorderingAllowed(false);
        TabelaCategoria.setAutoResizeMode(TabelaCategoria.AUTO_RESIZE_OFF);
        TabelaCategoria.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Limpar;
    private javax.swing.JTable TabelaCategoria;
    private javax.swing.JButton alterar;
    private javax.swing.JTextField cod;
    private javax.swing.JButton deletar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nome;
    // End of variables declaration//GEN-END:variables
}
