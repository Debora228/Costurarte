
package br.edu.ifal.Loja.InterfaceGrafica;

import br.edu.ifal.Loja.BEANS.ModeloTabela;
import br.edu.ifal.Loja.DAO.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;

public class ConsultaControle extends javax.swing.JFrame {
    Conexao conecta = new Conexao();
    public ConsultaControle() {
        initComponents();
        conecta.conexao();
        preencherTable("Select * from controle");
        JcomboxUsuario();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TableControle = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        usuarioPES = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        data = new javax.swing.JFormattedTextField();
        Mostrar = new javax.swing.JButton();
        Imprimir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consulta Controle");

        TableControle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(TableControle);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Escolha o usuário:");

        usuarioPES.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        usuarioPES.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione" }));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Escolha uma data:");

        try {
            data.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        Mostrar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Mostrar.setText("Mostrar");
        Mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarActionPerformed(evt);
            }
        });

        Imprimir.setText("Imprimir");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(usuarioPES, 0, 122, Short.MAX_VALUE)
                            .addComponent(data))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addComponent(Mostrar)
                        .addGap(25, 25, 25))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Imprimir)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(usuarioPES, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(Mostrar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(63, 63, 63)
                .addComponent(Imprimir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarActionPerformed
        String U = (String) usuarioPES.getSelectedItem();
        if (U.equals("Selecione") && (data.getText().equals("  /  /    "))){
            JOptionPane.showMessageDialog(null,"Selecione algum delemitador");
        }else if(!U.equals("Selecione") && (data.getText().equals("  /  /    "))){
            preencherTable("Select * from controle where nome='" + U +"'");
        }else if(U.equals("Selecione") && (!data.getText().equals("  /  /    "))){
            preencherTable("Select * from controle where data='" + data.getText() +"'");
        }else{
            preencherTable("Select * from controle where nome='" + U +"' and data='"+ data.getText() +"'");
        }
    }//GEN-LAST:event_MostrarActionPerformed
    public void preencherTable(String SQL) {
        
        ArrayList dados = new ArrayList();
        
        String [] Colunas = new String[]{"Código","Nome","Data","Hora Entrada", "Hora Saída"};
        
        try {
            conecta.executaSQL(SQL);
            conecta.rs.first();
            do{
                dados.add(new Object[]{conecta.rs.getInt("Cod_Controle"),conecta.rs.getString("Nome"),conecta.rs.getString("Data"),conecta.rs.getString("HoraEntrada"),conecta.rs.getString("HoraSaida")});
            }while(conecta.rs.next());
         } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao preencher o ArrayList \nErro:" + ex);
        }
        ModeloTabela modelo = new ModeloTabela(dados,Colunas);
        TableControle.setModel(modelo);
        TableControle.getColumnModel().getColumn(0).setPreferredWidth(50);
        TableControle.getColumnModel().getColumn(0).setResizable(false);
        TableControle.getColumnModel().getColumn(1).setPreferredWidth(100);
        TableControle.getColumnModel().getColumn(1).setResizable(false);  
        TableControle.getTableHeader().setReorderingAllowed(false);
        TableControle.setAutoResizeMode(TableControle.AUTO_RESIZE_OFF);
        TableControle.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
    }
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultaControle().setVisible(true);
                
            }
        });
    }
    
private void JcomboxUsuario(){
        try {
            PreparedStatement pst = conecta.conn.prepareStatement("Select nome from Login");
            ResultSet rs = pst.executeQuery();
                while(rs.next()) { 
                    usuarioPES.addItem(rs.getString("nome"));
                }
           
        } catch (SQLException ex) {
            Logger.getLogger(Compra.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Imprimir;
    private javax.swing.JButton Mostrar;
    private javax.swing.JTable TableControle;
    private javax.swing.JFormattedTextField data;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox usuarioPES;
    // End of variables declaration//GEN-END:variables
}
