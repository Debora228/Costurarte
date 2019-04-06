
package InterfaceGrafica;

import BEANS.ModeloTabela;
import DAO.Conexao;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;

public class Cliente_Completo extends javax.swing.JFrame {
    Conexao conecta =  new Conexao();
    public Cliente_Completo() {
        initComponents();
        conecta.conexao();
        setLocationRelativeTo(null);
        preencherTableCliente("select * from cliente order by Cliente_Id ");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        data = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Cliente_Completo = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        nome = new javax.swing.JTextField();
        rua = new javax.swing.JTextField();
        cod = new javax.swing.JTextField();
        num = new javax.swing.JTextField();
        bairro = new javax.swing.JTextField();
        alterar = new javax.swing.JButton();
        deletar = new javax.swing.JButton();
        limpar = new javax.swing.JButton();
        Data = new javax.swing.JFormattedTextField();
        cpf = new javax.swing.JFormattedTextField();
        tel = new javax.swing.JTextField();

        data.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        data.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tabela Completa de Clientes");

        Cliente_Completo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        Cliente_Completo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Cliente_CompletoMouseClicked(evt);
            }
        });
        Cliente_Completo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Cliente_CompletoKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(Cliente_Completo);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Código:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Nome:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Cpf:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Telefone:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Bairro:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Data de Nascimento:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Rua:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Número:");

        nome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        rua.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        cod.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        num.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        bairro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        alterar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        alterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ícones/user_edit.png"))); // NOI18N
        alterar.setText("Alterar");
        alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarActionPerformed(evt);
            }
        });

        deletar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        deletar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ícones/user_delete.png"))); // NOI18N
        deletar.setText("Deletar");
        deletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletarActionPerformed(evt);
            }
        });

        limpar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        limpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ícones/Limpar.png"))); // NOI18N
        limpar.setText("Limpar");
        limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparActionPerformed(evt);
            }
        });

        try {
            Data.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            cpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        tel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Data)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addComponent(cod))
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel7)
                        .addComponent(rua, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                        .addComponent(nome))
                    .addComponent(alterar))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(deletar)
                        .addGap(132, 132, 132)
                        .addComponent(limpar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(74, 74, 74))
                            .addComponent(bairro)
                            .addComponent(jLabel5)
                            .addComponent(tel))
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3)
                            .addComponent(cpf, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                            .addComponent(jLabel8)
                            .addComponent(num))
                        .addGap(158, 158, 158))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(bairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(num, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(limpar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deletar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(alterar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarActionPerformed
        try {
            PreparedStatement pst =  conecta.conn.prepareStatement("update Cliente set Cpf = ?,Nome = ?,Telefone = ?,DataNascimento =?, Bairro=?, Rua=?, Numero=? where Cliente_Id=?");
            pst.setString(1,cpf.getText() );
            pst.setString(2,nome.getText() );
            pst.setString(3,tel.getText());
            pst.setString(4,Data.getText());
            pst.setString(5,bairro.getText());
            pst.setString(6,rua.getText());
            pst.setInt(7,Integer.parseInt(num.getText()));
            pst.setInt(8,Integer.parseInt(cod.getText()));
            pst.execute();
            JOptionPane.showMessageDialog(null,"Alterado com sucesso");
            preencherTableCliente("select * from Cliente order by Cliente_Id ");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao Alterar");
        }
         
    }//GEN-LAST:event_alterarActionPerformed

    private void deletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletarActionPerformed
                             
        try {
            PreparedStatement pst =  conecta.conn.prepareStatement("delete from Cliente where Cliente_Id=?");
            pst.setInt(1,Integer.parseInt(cod.getText()));
            pst.execute();
            JOptionPane.showMessageDialog(null,"Excluido com sucesso");
            preencherTableCliente("select * from Cliente order by Cliente_Id ");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao excluir");
        }
    
    }//GEN-LAST:event_deletarActionPerformed

    private void limparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparActionPerformed
        cod.setText(null);
        nome.setText(null);
        tel.setText(null);
        bairro.setText(null);
        rua.setText(null);
        num.setText(null);
        cpf.setText(null);
    }//GEN-LAST:event_limparActionPerformed

    private void dataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dataActionPerformed

    private void Cliente_CompletoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Cliente_CompletoMouseClicked
        if(Cliente_Completo.getSelectedRow() != -1){
            cod.setText(Cliente_Completo.getValueAt(Cliente_Completo.getSelectedRow(),0).toString());
            nome.setText(Cliente_Completo.getValueAt(Cliente_Completo.getSelectedRow(),1).toString());
            tel.setText(Cliente_Completo.getValueAt(Cliente_Completo.getSelectedRow(),2).toString());
            cpf.setText(Cliente_Completo.getValueAt(Cliente_Completo.getSelectedRow(),3).toString());
            Data.setText(Cliente_Completo.getValueAt(Cliente_Completo.getSelectedRow(),4).toString());
            bairro.setText(Cliente_Completo.getValueAt(Cliente_Completo.getSelectedRow(),5).toString());
            rua.setText(Cliente_Completo.getValueAt(Cliente_Completo.getSelectedRow(),6).toString());
            num.setText(Cliente_Completo.getValueAt(Cliente_Completo.getSelectedRow(),7).toString());
        }else{
           JOptionPane.showMessageDialog(null,"Selecione uma linha");
       }
    }//GEN-LAST:event_Cliente_CompletoMouseClicked

    private void Cliente_CompletoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Cliente_CompletoKeyReleased
        if(Cliente_Completo.getSelectedRow() != -1){
            cod.setText(Cliente_Completo.getValueAt(Cliente_Completo.getSelectedRow(),0).toString());
            nome.setText(Cliente_Completo.getValueAt(Cliente_Completo.getSelectedRow(),1).toString());
            tel.setText(Cliente_Completo.getValueAt(Cliente_Completo.getSelectedRow(),2).toString());
            cpf.setText(Cliente_Completo.getValueAt(Cliente_Completo.getSelectedRow(),3).toString());
            Data.setText(Cliente_Completo.getValueAt(Cliente_Completo.getSelectedRow(),4).toString());
            bairro.setText(Cliente_Completo.getValueAt(Cliente_Completo.getSelectedRow(),5).toString());
            rua.setText(Cliente_Completo.getValueAt(Cliente_Completo.getSelectedRow(),6).toString());
            num.setText(Cliente_Completo.getValueAt(Cliente_Completo.getSelectedRow(),7).toString());
        }else{
           JOptionPane.showMessageDialog(null,"Selecione uma linha");
       }
    }//GEN-LAST:event_Cliente_CompletoKeyReleased
     public void preencherTableCliente(String SQL) {
        
        ArrayList dados = new ArrayList();
        
        String [] Colunas = new String[]{"Código","Nome","Telefone","Cpf","D. de Nascimento","Bairro","Rua","Número"};
        
        try {
            conecta.executaSQL(SQL);
            conecta.rs.first();
            do{
                dados.add(new Object[]{conecta.rs.getInt("Cliente_Id"),conecta.rs.getString("Nome"),conecta.rs.getString("Telefone"),conecta.rs.getString("Cpf"),conecta.rs.getString("DataNascimento"),conecta.rs.getString("Bairro"),conecta.rs.getString("Rua"),conecta.rs.getInt("Numero")});
            }while(conecta.rs.next());
         } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao preencher o ArrayList \nErro:" + ex);
        }
        ModeloTabela modelo = new ModeloTabela(dados,Colunas);
        Cliente_Completo.setModel(modelo);
        Cliente_Completo.getColumnModel().getColumn(0).setPreferredWidth(50);
        Cliente_Completo.getColumnModel().getColumn(0).setResizable(false);
        Cliente_Completo.getColumnModel().getColumn(1).setPreferredWidth(180);
        Cliente_Completo.getColumnModel().getColumn(1).setResizable(false);
        Cliente_Completo.getColumnModel().getColumn(3).setPreferredWidth(120);
        Cliente_Completo.getColumnModel().getColumn(3).setResizable(false);
        Cliente_Completo.getColumnModel().getColumn(4).setPreferredWidth(120);
        Cliente_Completo.getColumnModel().getColumn(4).setResizable(false);
        Cliente_Completo.getColumnModel().getColumn(5).setPreferredWidth(120);
        Cliente_Completo.getColumnModel().getColumn(5).setResizable(false);
        Cliente_Completo.getColumnModel().getColumn(6).setPreferredWidth(180);
        Cliente_Completo.getColumnModel().getColumn(6).setResizable(false);  
        Cliente_Completo.getTableHeader().setReorderingAllowed(false);
        Cliente_Completo.setAutoResizeMode(Cliente_Completo.AUTO_RESIZE_OFF);
        Cliente_Completo.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
    }
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cliente_Completo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Cliente_Completo;
    private javax.swing.JFormattedTextField Data;
    private javax.swing.JButton alterar;
    private javax.swing.JTextField bairro;
    private javax.swing.JTextField cod;
    private javax.swing.JFormattedTextField cpf;
    private javax.swing.JTextField data;
    private javax.swing.JButton deletar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton limpar;
    private javax.swing.JTextField nome;
    private javax.swing.JTextField num;
    private javax.swing.JTextField rua;
    private javax.swing.JTextField tel;
    // End of variables declaration//GEN-END:variables
}
