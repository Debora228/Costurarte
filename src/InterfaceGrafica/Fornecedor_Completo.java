
package InterfaceGrafica;

import BEANS.ModeloTabela;
import DAO.Conexao;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;

public class Fornecedor_Completo extends javax.swing.JFrame {

    static void setAutoResizeMode(int AUTO_RESIZE_OFF) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    Conexao conecta = new Conexao();
    public Fornecedor_Completo() {
        initComponents();
        conecta.conexao();
        setLocationRelativeTo(null);
        preencherTableFornecedor("select * from fornecedor order by Fornecedor_Id ");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Fornecedor_Completo = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cod = new javax.swing.JTextField();
        num = new javax.swing.JTextField();
        nome = new javax.swing.JTextField();
        rua = new javax.swing.JTextField();
        tel = new javax.swing.JTextField();
        bairro = new javax.swing.JTextField();
        alterarCompleto = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        cnpj = new javax.swing.JTextField();
        deletarCompleto = new javax.swing.JButton();
        limparCompleto = new javax.swing.JButton();

        try {
            jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tabela Completa de Fornecedor");

        Fornecedor_Completo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        Fornecedor_Completo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Fornecedor_CompletoMouseClicked(evt);
            }
        });
        Fornecedor_Completo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Fornecedor_CompletoKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(Fornecedor_Completo);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Nome:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Código:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Telefone:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Rua:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Bairro:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Número:");

        cod.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        num.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        nome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        rua.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        tel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        bairro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        alterarCompleto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        alterarCompleto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ícones/lorry_link.png"))); // NOI18N
        alterarCompleto.setText("Alterar");
        alterarCompleto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarCompletoActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Cnpj:");

        cnpj.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        deletarCompleto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        deletarCompleto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ícones/lorry_delete.png"))); // NOI18N
        deletarCompleto.setText("Deletar");
        deletarCompleto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletarCompletoActionPerformed(evt);
            }
        });

        limparCompleto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        limparCompleto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ícones/Limpar.png"))); // NOI18N
        limparCompleto.setText("Limpar");
        limparCompleto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparCompletoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(bairro, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                    .addComponent(cod))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(rua, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(tel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(81, 81, 81))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)))
                    .addComponent(jLabel6)
                    .addComponent(num, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(limparCompleto)
                .addGap(200, 200, 200)
                .addComponent(alterarCompleto)
                .addGap(200, 200, 200)
                .addComponent(deletarCompleto)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 856, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(num, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deletarCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(alterarCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(limparCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void alterarCompletoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarCompletoActionPerformed
        try {
            PreparedStatement pst =  conecta.conn.prepareStatement("update fornecedor set Cnpj = ?,Nome = ?,Telefone = ?, Bairro=?, Rua=?, Numero=? where Fornecedor_Id=?");
            pst.setString(1,cnpj.getText() );
            pst.setString(2,nome.getText() );
            pst.setString(3,tel.getText());
            pst.setString(4,bairro.getText());
            pst.setString(5,rua.getText());
            pst.setInt(6,Integer.parseInt(num.getText()));
            pst.setInt(7,Integer.parseInt(cod.getText()));
            pst.execute();
            JOptionPane.showMessageDialog(null,"Alterado com sucesso");
            preencherTableFornecedor("select * from fornecedor order by Fornecedor_Id ");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao Alterar");
        }
    }//GEN-LAST:event_alterarCompletoActionPerformed

    private void deletarCompletoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletarCompletoActionPerformed
        try {
           // int op =Integer.parseInt( JOptionPane.showInputDialog("ATENÇÃO!!\n Ao deletar estes dados, excluirá tembém a relação desse fornecedor com o produto \n Deseja continuar a ação?(S-1/N-2)"));
            
               // PreparedStatement pst =  conecta.conn.prepareStatement("delete  from produto_fornecedor where fornecedor_id=?");
                //pst.setInt(1,Integer.parseInt(cod.getText()));
                //pst.execute();
                PreparedStatement pst2 =  conecta.conn.prepareStatement("delete from fornecedor where Fornecedor_Id=?");
                pst2.setInt(1,Integer.parseInt(cod.getText()));
                pst2.execute();
                JOptionPane.showMessageDialog(null,"Excluido com sucesso");
                preencherTableFornecedor("select * from fornecedor order by Fornecedor_Id ");
           
            /*if(op==2){
                JOptionPane.showMessageDialog(null,"Exclusão não efetuada");
            }*/
            } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao excluir\n Erro: " + ex);
        }
    }//GEN-LAST:event_deletarCompletoActionPerformed

    private void limparCompletoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparCompletoActionPerformed
        cod.setText(null);
        nome.setText(null);
        tel.setText(null);
        bairro.setText(null);
        rua.setText(null);
        num.setText(null);
        cnpj.setText(null);
    }//GEN-LAST:event_limparCompletoActionPerformed

    private void Fornecedor_CompletoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Fornecedor_CompletoMouseClicked
        if(Fornecedor_Completo.getSelectedRow() != -1){
            cod.setText(Fornecedor_Completo.getValueAt(Fornecedor_Completo.getSelectedRow(),0).toString());
            nome.setText(Fornecedor_Completo.getValueAt(Fornecedor_Completo.getSelectedRow(),1).toString());
            tel.setText(Fornecedor_Completo.getValueAt(Fornecedor_Completo.getSelectedRow(),2).toString());          
            cnpj.setText(Fornecedor_Completo.getValueAt(Fornecedor_Completo.getSelectedRow(),3).toString());
            bairro.setText(Fornecedor_Completo.getValueAt(Fornecedor_Completo.getSelectedRow(),4).toString());
            rua.setText(Fornecedor_Completo.getValueAt(Fornecedor_Completo.getSelectedRow(),5).toString());
            num.setText(Fornecedor_Completo.getValueAt(Fornecedor_Completo.getSelectedRow(),6).toString());
        }else{
           JOptionPane.showMessageDialog(null,"Selecione uma linha");
       }
    }//GEN-LAST:event_Fornecedor_CompletoMouseClicked

    private void Fornecedor_CompletoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Fornecedor_CompletoKeyReleased
        if(Fornecedor_Completo.getSelectedRow() != -1){
            cod.setText(Fornecedor_Completo.getValueAt(Fornecedor_Completo.getSelectedRow(),0).toString());
            nome.setText(Fornecedor_Completo.getValueAt(Fornecedor_Completo.getSelectedRow(),1).toString());
            tel.setText(Fornecedor_Completo.getValueAt(Fornecedor_Completo.getSelectedRow(),2).toString());          
            cnpj.setText(Fornecedor_Completo.getValueAt(Fornecedor_Completo.getSelectedRow(),3).toString());
            bairro.setText(Fornecedor_Completo.getValueAt(Fornecedor_Completo.getSelectedRow(),4).toString());
            rua.setText(Fornecedor_Completo.getValueAt(Fornecedor_Completo.getSelectedRow(),5).toString());
            num.setText(Fornecedor_Completo.getValueAt(Fornecedor_Completo.getSelectedRow(),6).toString());
        }else{
           JOptionPane.showMessageDialog(null,"Selecione uma linha");
       }
    }//GEN-LAST:event_Fornecedor_CompletoKeyReleased
    public void preencherTableFornecedor(String SQL) {
    ArrayList dados = new ArrayList();
        
        String [] Colunas = new String[]{"Código","Nome","Telefone","Cnpj","Bairro","Rua","Número"};
        
        try {
            conecta.executaSQL(SQL);
            conecta.rs.first();
            do{
                dados.add(new Object[]{conecta.rs.getInt("Fornecedor_Id"),conecta.rs.getString("Nome"),conecta.rs.getString("Telefone"),conecta.rs.getString("Cnpj"),conecta.rs.getString("Bairro"),conecta.rs.getString("Rua"),conecta.rs.getInt("Numero")});
            }while(conecta.rs.next());
         } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao preencher o ArrayList \nErro:" + ex);
        }
        ModeloTabela modelo = new ModeloTabela(dados,Colunas);
        Fornecedor_Completo.setModel(modelo);
        Fornecedor_Completo.getColumnModel().getColumn(0).setPreferredWidth(60);
        Fornecedor_Completo.getColumnModel().getColumn(0).setResizable(false);
        Fornecedor_Completo.getColumnModel().getColumn(1).setPreferredWidth(180);
        Fornecedor_Completo.getColumnModel().getColumn(1).setResizable(false);
        Fornecedor_Completo.getColumnModel().getColumn(2).setPreferredWidth(120);
        Fornecedor_Completo.getColumnModel().getColumn(2).setResizable(false);
        Fornecedor_Completo.getColumnModel().getColumn(3).setPreferredWidth(120);
        Fornecedor_Completo.getColumnModel().getColumn(3).setResizable(false);
        Fornecedor_Completo.getColumnModel().getColumn(4).setPreferredWidth(120);
        Fornecedor_Completo.getColumnModel().getColumn(4).setResizable(false);
        Fornecedor_Completo.getColumnModel().getColumn(5).setPreferredWidth(180);
        Fornecedor_Completo.getColumnModel().getColumn(5).setResizable(false);
        Fornecedor_Completo.getTableHeader().setReorderingAllowed(false);
        Fornecedor_Completo.setAutoResizeMode(Fornecedor_Completo.AUTO_RESIZE_OFF);
        Fornecedor_Completo.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fornecedor_Completo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Fornecedor_Completo;
    private javax.swing.JButton alterarCompleto;
    private javax.swing.JTextField bairro;
    private javax.swing.JTextField cnpj;
    private javax.swing.JTextField cod;
    private javax.swing.JButton deletarCompleto;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton limparCompleto;
    private javax.swing.JTextField nome;
    private javax.swing.JTextField num;
    private javax.swing.JTextField rua;
    private javax.swing.JTextField tel;
    // End of variables declaration//GEN-END:variables
}
