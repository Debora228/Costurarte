
package br.edu.ifal.Loja.InterfaceGrafica;

import br.edu.ifal.Loja.BEANS.ModeloTabela;
import br.edu.ifal.Loja.DAO.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;

public class FinalizaçãoVenda extends javax.swing.JFrame {
        int codVenda = 0;
        Conexao conecta = new Conexao();
        String d;
    public FinalizaçãoVenda() {
        initComponents();
        conecta.conexao();
        PrecoTotal();
        preencherTableCliente("Select cliente_Id,nome,telefone from cliente");
        Calendar c5 = Calendar.getInstance();
		Date data5 = c5.getTime();
		DateFormat f = DateFormat.getDateInstance();

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Data formatada: "+ sdf.format(data5));
                d = sdf.format(data5);
                dataText.setText(d);
    }
    
    private void PrecoTotal(){
            ArrayList<Double> preco = new ArrayList<Double>();
            double prec=0;
            try {
                PreparedStatement pst1 = conecta.conn.prepareStatement("Select Max(Venda_Id) from Venda");
                    ResultSet rs1 = pst1.executeQuery();
                    while(rs1.next()){
                                   codVenda = rs1.getInt("Max(venda_id)");
                               }
                
                PreparedStatement pst4 = conecta.conn.prepareStatement("select precototal from CarrinhoVenda where codVenda=?");
                pst4.setInt(1,codVenda);
                ResultSet rs4 = pst4.executeQuery();
                    while(rs4.next()) {
                       prec = prec + (rs4.getDouble("precototal")); 
                    }
                    precoTotal.setText((new Double(prec).toString()));
            } catch (SQLException ex) {
                Logger.getLogger(FinalizaçãoCompra.class.getName()).log(Level.SEVERE, null, ex);
            }
            
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        nomePES = new javax.swing.JTextField();
        CadastrarCliente = new javax.swing.JButton();
        tel = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cod = new javax.swing.JTextField();
        Pesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaCliente = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        RadioParcelado = new javax.swing.JRadioButton();
        RadioAvista = new javax.swing.JRadioButton();
        parcela = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel120 = new javax.swing.JLabel();
        prazo = new javax.swing.JFormattedTextField();
        jPanel3 = new javax.swing.JPanel();
        dataText = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        desconto = new javax.swing.JTextField();
        acrescimo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        Forma = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        precoTotal = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        precoFinal = new javax.swing.JTextField();
        Ok = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Finalização de Venda");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Definição do Cliente", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Nome:");

        nomePES.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        CadastrarCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        CadastrarCliente.setText("Cadastrar");
        CadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarClienteActionPerformed(evt);
            }
        });

        tel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Telefone:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Cod");

        cod.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        Pesquisar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Pesquisar.setText("Pesquisar");
        Pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(nomePES, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Pesquisar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CadastrarCliente))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tel, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(cod, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(49, 49, 49))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CadastrarCliente)
                    .addComponent(nomePES, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Pesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

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

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Forma", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        RadioParcelado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        RadioParcelado.setText("Parcelado");
        RadioParcelado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioParceladoActionPerformed(evt);
            }
        });

        RadioAvista.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        RadioAvista.setText("À vista");

        parcela.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        parcela.setText("0");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Quant. Parcelas:");

        jLabel120.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel120.setText("Prazo:");

        try {
            prazo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RadioParcelado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(RadioAvista)
                .addGap(83, 83, 83))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(parcela, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel120)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(prazo, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(148, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RadioParcelado)
                    .addComponent(RadioAvista))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(parcela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel120)
                    .addComponent(prazo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Finalizando", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        dataText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Data:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Desconto:");

        desconto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        desconto.setText("0");
        desconto.setToolTipText("Porcentagem");
        desconto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descontoActionPerformed(evt);
            }
        });

        acrescimo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        acrescimo.setText("0");
        acrescimo.setToolTipText("Porcentagem");
        acrescimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acrescimoActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Acréscimo:");

        Forma.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Forma.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Dinheiro", "Cartão", "À vista" }));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Forma:");

        precoTotal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        precoTotal.setToolTipText("");
        precoTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precoTotalActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Preço Total:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Preço:");

        precoFinal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        precoFinal.setToolTipText("");

        Ok.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Ok.setText("OK");
        Ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OkActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(71, 71, 71)
                        .addComponent(jLabel2))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(70, 70, 70)
                                .addComponent(jLabel8)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(acrescimo, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(desconto, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(precoFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11)))))
                    .addComponent(Forma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(dataText, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(precoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(193, 193, 193)
                    .addComponent(Ok)
                    .addContainerGap(191, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(9, 9, 9)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dataText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(precoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8)
                            .addComponent(desconto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Forma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(precoFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(acrescimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(54, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap(159, Short.MAX_VALUE)
                    .addComponent(Ok)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void CadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarClienteActionPerformed
try {
            PreparedStatement pst = conecta.conn.prepareStatement("insert into cliente (Cpf,Nome,Telefone,DataNascimento, Bairro, Rua, Numero) VALUES (0, ?, ?, null,null,null,0)");
            pst.setString(1, nomePES.getText());
            pst.setString(2, tel.getText());
            pst.executeUpdate();
            PreparedStatement pst1 = conecta.conn.prepareStatement("Select Max(Produto_Id) from Produto");
                    ResultSet rs1 = pst1.executeQuery();
                    while(rs1.next()){
                        int a = rs1.getInt("Max(Produto_id)");
                        cod.setText(new Integer(a).toString());
                    }
            JOptionPane.showMessageDialog(null, "Inserido com sucesso!");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi inserido!\n Erro: " + ex.getMessage());
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_CadastrarClienteActionPerformed

    private void TabelaClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaClienteMouseClicked
        if(TabelaCliente.getSelectedRow() != -1){
            cod.setText(TabelaCliente.getValueAt(TabelaCliente.getSelectedRow(),0).toString());
            nomePES.setText(TabelaCliente.getValueAt(TabelaCliente.getSelectedRow(),1).toString());
            tel.setText(TabelaCliente.getValueAt(TabelaCliente.getSelectedRow(),2).toString());
        }else{
            JOptionPane.showMessageDialog(null,"Selecione uma linha");
        }
    }//GEN-LAST:event_TabelaClienteMouseClicked

    private void TabelaClienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TabelaClienteKeyReleased
        if(TabelaCliente.getSelectedRow() != -1){
            cod.setText(TabelaCliente.getValueAt(TabelaCliente.getSelectedRow(),0).toString());
            nomePES.setText(TabelaCliente.getValueAt(TabelaCliente.getSelectedRow(),1).toString());
            tel.setText(TabelaCliente.getValueAt(TabelaCliente.getSelectedRow(),2).toString());
        }else{
            JOptionPane.showMessageDialog(null,"Selecione uma linha");
        }
    }//GEN-LAST:event_TabelaClienteKeyReleased

    private void PesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PesquisarActionPerformed
            preencherTableCliente("SELECT Cliente_Id,Nome,telefone FROM cliente where nome LIKE '%"+nomePES.getText()+"%'");        
    }//GEN-LAST:event_PesquisarActionPerformed

    private void RadioParceladoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioParceladoActionPerformed
        jLabel7.setEnabled(true);
        parcela.setEnabled(true);
    }//GEN-LAST:event_RadioParceladoActionPerformed

    private void descontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descontoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_descontoActionPerformed

    private void acrescimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acrescimoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_acrescimoActionPerformed

    private void precoTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precoTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_precoTotalActionPerformed

    private void OkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OkActionPerformed
        ArrayList<Integer>quantVelha = new ArrayList<Integer>();
        ArrayList<Integer>QuantCarrinho = new ArrayList<Integer>();
        ArrayList<Integer>codP = new ArrayList<Integer>();
        try {
            PreparedStatement pst1 = conecta.conn.prepareStatement("Select Max(venda_id) from venda");
            ResultSet rs1 = pst1.executeQuery();
            while(rs1.next()){
                codVenda = rs1.getInt("Max(venda_id)");
            }

            PreparedStatement pst2 =  conecta.conn.prepareStatement("select codP, quant from carrinhoVenda where CodVenda=?");
            pst2.setInt(1,codVenda);
            ResultSet rs2 = pst2.executeQuery();
            while(rs2.next()){
                codP.add(rs2.getInt("codP"));
                QuantCarrinho.add(rs2.getInt("quant"));
            }

            for(int i= 0; i<codP.size();i++){
                PreparedStatement pst3 =  conecta.conn.prepareStatement("select quantidade from produto where Produto_Id=?");
                pst3.setInt(1,codP.get(i));
                ResultSet rs3 = pst3.executeQuery();
                int quant=0;
                while(rs3.next()) {
                    quant = rs3.getInt("Quantidade");
                }
                
                int quantFinal = quant - QuantCarrinho.get(i);
                PreparedStatement pst4 =  conecta.conn.prepareStatement("update produto set quantidade=? where Produto_Id=?");
                pst4.setInt(1,quantFinal);
                pst4.setInt(2,codP.get(i));
                pst4.execute();

            }

            JOptionPane.showMessageDialog(null,"Alterado com sucesso");

            double desc = Double.parseDouble(desconto.getText())/100;
            double acres = Double.parseDouble(acrescimo.getText())/100;
            double prec=0;
            double preco = Double.parseDouble(precoTotal.getText());

            PreparedStatement pst5 =  conecta.conn.prepareStatement("update Venda set Preco_final=?,data=?, taxa=?, forma=?,Parcela=?,tipoCliente=?,prazo=?,cliente_id=? where venda_id=?");
            if (acres == 0){
                String t = ((new Double(desc).toString()));
                pst5.setString(3,"-" + t);
                double a = (preco * desc);
                prec =  (preco - a) ;
            }else if(desc==0){
                String t = ((new Double(acres).toString()));
                pst5.setString(3,"+" + t);
                double a = (preco * acres);
                prec = preco + a;
            }else{
                double taxa = acres - desc;
                String t = ((new Double(taxa).toString()));
                pst5.setString(3,t);
            }
            int op = Forma.getSelectedIndex();
            String forma=null;
            if(op==0){
                forma="Dinheiro";
                precoFinal.setText((new Double(prec).toString()));
            }else{
                
                forma="Cartão";
                double var = Double.parseDouble(precoTotal.getText());
                precoFinal.setText((new Double(var).toString()));
            }

            precoFinal.setText(new Double(prec).toString());
            String TipoCliente = null;
            if(RadioParcelado.isSelected()){
                TipoCliente = "Parcelado";
            }
            if(RadioAvista.isSelected()){
                TipoCliente = "À vista";
            }
            pst5.setDouble(1,Double.parseDouble(precoFinal.getText()));
            pst5.setString(2,d);
            pst5.setString(4,forma);
            pst5.setInt(5,Integer.parseInt(parcela.getText()));
            pst5.setString(6,TipoCliente);
            pst5.setString(7,prazo.getText());
            pst5.setInt(8,Integer.parseInt(cod.getText()));
            pst5.setInt(9,codVenda);
            pst5.executeUpdate();

            PreparedStatement pst6= conecta.conn.prepareStatement("insert into Venda(data,taxa,forma,Preco_final,parcela,cliente_id,tipoCliente,prazo)VALUES(null,0,null,0,0,0,null,null)");
            pst6.execute();
            JOptionPane.showMessageDialog(null,"Alterado com sucesso");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao Alterar" + ex);
        }
    }//GEN-LAST:event_OkActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FinalizaçãoVenda().setVisible(true);
            }
        });
    }
public void preencherTableCliente(String SQL){
        ArrayList dados = new ArrayList();
        
        String [] Colunas = new String[]{"Código","Nome","Telefone"};
        
        try {
            conecta.executaSQL(SQL);
            conecta.rs.first();
            do{
                dados.add(new Object[]{conecta.rs.getInt("Cliente_Id"),conecta.rs.getString("Nome"),conecta.rs.getString("Telefone")});
            }while(conecta.rs.next());
         } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao preencher o ArrayList \nErro:" + ex);
        }
        ModeloTabela modelo = new ModeloTabela(dados, Colunas);
        TabelaCliente.setModel(modelo);
        TabelaCliente.getColumnModel().getColumn(0).setPreferredWidth(50);
        TabelaCliente.getColumnModel().getColumn(0).setResizable(false);
        TabelaCliente.getColumnModel().getColumn(1).setPreferredWidth(200);
        TabelaCliente.getColumnModel().getColumn(1).setResizable(false);
        TabelaCliente.getColumnModel().getColumn(2).setPreferredWidth(90);
        TabelaCliente.getColumnModel().getColumn(2).setResizable(false);
        TabelaCliente.getTableHeader().setReorderingAllowed(false);
        TabelaCliente.setAutoResizeMode(TabelaCliente.AUTO_RESIZE_OFF);
        TabelaCliente.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CadastrarCliente;
    private javax.swing.JComboBox Forma;
    private javax.swing.JButton Ok;
    private javax.swing.JButton Pesquisar;
    private javax.swing.JRadioButton RadioAvista;
    private javax.swing.JRadioButton RadioParcelado;
    private javax.swing.JTable TabelaCliente;
    private javax.swing.JTextField acrescimo;
    private javax.swing.JTextField cod;
    private javax.swing.JTextField dataText;
    private javax.swing.JTextField desconto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nomePES;
    private javax.swing.JTextField parcela;
    private javax.swing.JFormattedTextField prazo;
    private javax.swing.JTextField precoFinal;
    private javax.swing.JTextField precoTotal;
    private javax.swing.JTextField tel;
    // End of variables declaration//GEN-END:variables
}
