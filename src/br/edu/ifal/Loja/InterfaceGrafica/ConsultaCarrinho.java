
package br.edu.ifal.Loja.InterfaceGrafica;

import br.edu.ifal.Loja.BEANS.CarrinhoBEAN;
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

public class ConsultaCarrinho extends javax.swing.JFrame {
    Conexao conecta = new Conexao();
    ArrayList<CarrinhoBEAN> C = new ArrayList<CarrinhoBEAN>();
    int codCompra = 0;
    public ConsultaCarrinho() {
        initComponents();
        conecta.conexao();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TableCarrinho = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Forn = new javax.swing.JTextField();
        marca = new javax.swing.JTextField();
        prod = new javax.swing.JTextField();
        cod = new javax.swing.JTextField();
        cor = new javax.swing.JTextField();
        descricao = new javax.swing.JTextField();
        quant = new javax.swing.JTextField();
        preco = new javax.swing.JTextField();
        taxa = new javax.swing.JTextField();
        alterar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        precoTotal = new javax.swing.JTextField();
        Limpar = new javax.swing.JButton();
        Excluir = new javax.swing.JButton();
        adcionar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Produtos da Compra");

        TableCarrinho.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        TableCarrinho.setColumnSelectionAllowed(true);
        TableCarrinho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableCarrinhoMouseClicked(evt);
            }
        });
        TableCarrinho.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TableCarrinhoKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(TableCarrinho);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ícones/ecommerce.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Código:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Taxa:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Fornecedor:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Produto:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Marca:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Cor:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Descrição:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Quantidade:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Preço Compra:");

        Forn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Forn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FornActionPerformed(evt);
            }
        });

        marca.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        prod.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        prod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prodActionPerformed(evt);
            }
        });

        cod.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codActionPerformed(evt);
            }
        });

        cor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                corActionPerformed(evt);
            }
        });

        descricao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        quant.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        quant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantActionPerformed(evt);
            }
        });

        preco.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        preco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precoActionPerformed(evt);
            }
        });

        taxa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        taxa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taxaActionPerformed(evt);
            }
        });

        alterar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        alterar.setText("Alterar");
        alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 0, 0));
        jLabel11.setText("Atenção! O sistema diferencia maiúscula e minúscula");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Preço Total:");

        precoTotal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        Limpar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Limpar.setText("Limpar");
        Limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimparActionPerformed(evt);
            }
        });

        Excluir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Excluir.setText("Deletar");
        Excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExcluirActionPerformed(evt);
            }
        });

        adcionar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        adcionar.setText("Adicionar");
        adcionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adcionarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(44, 44, 44)
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cod, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Forn, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel10)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel12)
                                            .addComponent(jLabel8))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(precoTotal)
                                                    .addComponent(prod)
                                                    .addComponent(quant, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                                                    .addComponent(preco))
                                                .addGap(8, 8, 8)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(34, 34, 34)
                                                        .addComponent(jLabel5)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(marca, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(40, 40, 40)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addComponent(jLabel6)
                                                            .addComponent(jLabel2))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                            .addComponent(cor, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                                                            .addComponent(taxa)))))
                                            .addComponent(descricao, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addComponent(jLabel11)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(Limpar)
                        .addGap(18, 18, 18)
                        .addComponent(alterar)
                        .addGap(18, 18, 18)
                        .addComponent(Excluir)
                        .addGap(46, 46, 46)
                        .addComponent(adcionar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 807, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(Forn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(prod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel9)
                                .addComponent(quant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6)
                                .addComponent(cor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(taxa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel10)
                                .addComponent(preco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(precoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(descricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(alterar)
                            .addComponent(Limpar)
                            .addComponent(Excluir)
                            .addComponent(adcionar)))
                    .addComponent(jLabel7))
                .addContainerGap(89, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TableCarrinhoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableCarrinhoMouseClicked
        if(TableCarrinho.getSelectedRow() != -1){
            cod.setText(TableCarrinho.getValueAt(TableCarrinho.getSelectedRow(),0).toString());
            Forn.setText(TableCarrinho.getValueAt(TableCarrinho.getSelectedRow(),1).toString());
            prod.setText(TableCarrinho.getValueAt(TableCarrinho.getSelectedRow(),2).toString());
            marca.setText(TableCarrinho.getValueAt(TableCarrinho.getSelectedRow(),3).toString());
            cor.setText(TableCarrinho.getValueAt(TableCarrinho.getSelectedRow(),4).toString());
            descricao.setText(TableCarrinho.getValueAt(TableCarrinho.getSelectedRow(),5).toString());
            quant.setText(TableCarrinho.getValueAt(TableCarrinho.getSelectedRow(),6).toString());
            preco.setText(TableCarrinho.getValueAt(TableCarrinho.getSelectedRow(),7).toString());
            taxa.setText(TableCarrinho.getValueAt(TableCarrinho.getSelectedRow(),8).toString());
            precoTotal.setText(TableCarrinho.getValueAt(TableCarrinho.getSelectedRow(),9).toString());
        }else{
            JOptionPane.showMessageDialog(null,"Selecione uma linha");
        }
    }//GEN-LAST:event_TableCarrinhoMouseClicked

    private void TableCarrinhoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TableCarrinhoKeyReleased
        if(TableCarrinho.getSelectedRow() != -1){
            cod.setText(TableCarrinho.getValueAt(TableCarrinho.getSelectedRow(),0).toString());
            Forn.setText(TableCarrinho.getValueAt(TableCarrinho.getSelectedRow(),1).toString());
            prod.setText(TableCarrinho.getValueAt(TableCarrinho.getSelectedRow(),2).toString());
            marca.setText(TableCarrinho.getValueAt(TableCarrinho.getSelectedRow(),3).toString());
            cor.setText(TableCarrinho.getValueAt(TableCarrinho.getSelectedRow(),4).toString());
            descricao.setText(TableCarrinho.getValueAt(TableCarrinho.getSelectedRow(),5).toString());
            quant.setText(TableCarrinho.getValueAt(TableCarrinho.getSelectedRow(),6).toString());
            preco.setText(TableCarrinho.getValueAt(TableCarrinho.getSelectedRow(),7).toString());
            taxa.setText(TableCarrinho.getValueAt(TableCarrinho.getSelectedRow(),8).toString());
            precoTotal.setText(TableCarrinho.getValueAt(TableCarrinho.getSelectedRow(),9).toString());
        }else{
            JOptionPane.showMessageDialog(null,"Selecione uma linha");
        }
    }//GEN-LAST:event_TableCarrinhoKeyReleased

    private void corActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_corActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_corActionPerformed

    private void quantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantActionPerformed

    private void precoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_precoActionPerformed

    private void taxaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taxaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_taxaActionPerformed

    private void alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarActionPerformed
        //PreparedStatement pst = conecta.conn.prepareStatement("update ")
            int cod2 = (int) TableCarrinho.getValueAt(TableCarrinho.getSelectedRow(),0);
            String Forn2 = TableCarrinho.getValueAt(TableCarrinho.getSelectedRow(),1).toString();
            String prod2 = TableCarrinho.getValueAt(TableCarrinho.getSelectedRow(),2).toString();
            String marca2 = TableCarrinho.getValueAt(TableCarrinho.getSelectedRow(),3).toString();
            String cor2 = TableCarrinho.getValueAt(TableCarrinho.getSelectedRow(),4).toString();
            String descricao2 = TableCarrinho.getValueAt(TableCarrinho.getSelectedRow(),5).toString();
            int quant2 = (int) TableCarrinho.getValueAt(TableCarrinho.getSelectedRow(),6);
            double preco2 = (double) TableCarrinho.getValueAt(TableCarrinho.getSelectedRow(),7);
            String taxa2 = (TableCarrinho.getValueAt(TableCarrinho.getSelectedRow(),8)).toString();
            
            int novo_id_for = 0;
            int novo_id_p=0;
            int aux = 0;
/////////////////////////////////////////////// ALTERAR FORNECEDOR/////////////////////////////////////////////////////////
            if (!Forn2.equals(Forn.getText())) {
                try {
                    PreparedStatement pst = conecta.conn.prepareStatement("select nome,fornecedor_id from fornecedor  order by Fornecedor_Id");
                    ResultSet rs = pst.executeQuery();
                    while(rs.next()){
                        String nome = rs.getString("nome");
                        if(nome.equals(Forn.getText())){
                           JOptionPane.showMessageDialog(null,"Fornecedor encontrado"); 
                           aux=1;
                           novo_id_for = rs.getInt("fornecedor_id");
                           JOptionPane.showMessageDialog(null, +novo_id_for);
                        }
                    }
                    if(aux==0){
                        JOptionPane.showMessageDialog(null,"Cadastrar um novo fornecedor");
                            try {
                                PreparedStatement pst2 = conecta.conn.prepareStatement("insert into fornecedor(Nome,Cnpj,Telefone,Bairro,Rua,Numero) values (?,?,null,null,null,0)");
                                pst2.setString(1, Forn.getText());
                                String CNPJ = JOptionPane.showInputDialog("Digite o CNPJ desse fornecedor: ");
                                pst2.setString(2, CNPJ);
                                pst2.executeUpdate();
                                JOptionPane.showMessageDialog(null, "Fornecedor inserido com sucesso!");
                                
                                PreparedStatement pst3 = conecta.conn.prepareStatement("select fornecedor_Id from fornecedor where nome=?");
                                pst3.setString(1, Forn.getText());
                                ResultSet rs3 = pst3.executeQuery();
                                while(rs.next()){
                                   novo_id_for = rs.getInt("fornecedor_id");
                                }
                            } catch (SQLException ex) {
                                JOptionPane.showMessageDialog(null, "Fornecedor não foi inserido!: " + ex);
                            }
                    }
                    
                    try {
                               PreparedStatement pst2 =  conecta.conn.prepareStatement("update Carrinho set codF = ? where codCarrinho = ?");
                               pst2.setInt(1,novo_id_for);
                               pst2.setInt(2,cod2);
                               pst2.execute();
                               JOptionPane.showMessageDialog(null,"Fornecedor Alterado com sucesso");
                               exibir(codCompra);
                    } catch (SQLException ex) {
                               JOptionPane.showMessageDialog(null,"Erro ao Alterar Fornecedor: " + ex);
                    }
                }catch (SQLException ex) {
                   JOptionPane.showMessageDialog(null, ex);
                }
                
            }
                
////////////////////////////////////////////////// ALTERAR PRODUTO ///////////////////////////////////////////////////////////
            String nome = null;    
            if ((!prod2.equals(prod.getText())) || (!cor2.equals(cor.getText())) || (!marca2.equals(marca.getText())) ||(!descricao2.equals(descricao.getText())) ){
                    try{
                    PreparedStatement pst4 = conecta.conn.prepareStatement("select nome,descricao, cor, marca from produto order by Produto_Id");
                    ResultSet rs4 = pst4.executeQuery();
                    while(rs4.next()){
                        int a=0,b=0,c=0,d=0;
                        if(rs4.getString("nome").equals(prod.getText())){
                           a=1;
                        }                        
                        if(rs4.getString("cor").equals(cor.getText())){
                           b=2;
                        }
                        if(rs4.getString("marca").equals(marca.getText())){
                           c=3;
                        }
                        
                        if(rs4.getString("descricao").equals(descricao.getText())){
                           d=4;
                        }
                        System.out.println("a: " + a + " b: " + b + " c: "+c +" d: "+d);
                        if(a==1 && b==2 && c==3 && d==4 ){
                            nome=rs4.getString("nome");
                            aux=1;
                        } 
                        System.out.println("nome: " + nome);
                        //se aux for igual a 1 quer dizer que ele encontrou um compatível, tem caastrado e não precisa cadastrar
                    }
                    
                        if(aux == 0){
                            JOptionPane.showMessageDialog(null,"Cadastre um novo Produto"); 
                            NovoProduto ap = new NovoProduto();
                            ap.setVisible(true);
                            ap.AlterarProduto(prod.getText(), marca.getText(), cor.getText(), descricao.getText(),cod2);
                            
                            
                        }else{
                            try {
                                PreparedStatement pst3 = conecta.conn.prepareStatement("select Produto_Id from produto where Nome=?");
                                pst3.setString(1,nome);
                                ResultSet rs3 = pst3.executeQuery();
                                while(rs3.next()){
                                   novo_id_p = rs3.getInt("Produto_Id");
                                }
                                JOptionPane.showMessageDialog(null,"certo a procurar: ");
                            }catch (SQLException ex) {
                               JOptionPane.showMessageDialog(null,"Erro a procurar: " + ex);
                            }
                            try{
                               PreparedStatement pst2 =  conecta.conn.prepareStatement("update Carrinho set codP = ? where codCarrinho = ?");
                               pst2.setInt(1,novo_id_p);
                               pst2.setInt(2,cod2);
                               pst2.execute();
                               JOptionPane.showMessageDialog(null,"Produto alterado com sucesso");
                            } catch (SQLException ex) {
                               JOptionPane.showMessageDialog(null,"Erro ao alterar produto: " + ex);
                            }
                            
                            
                        }
                    }catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null, ex);
                    }
                
                }
            
////////////////////////////////////////////////// ALTERAR TUDO ///////////////////////////////////////////////////////////            
            int quant3=Integer.parseInt(quant.getText());
            double preco3 = Double.parseDouble(preco.getText()); 
            if((quant2 !=quant3) || (preco2!=preco3) || (taxa2.equals(taxa.getText()))){
                try {
                    PreparedStatement pst2 = conecta.conn.prepareStatement("update Carrinho set quant = ?, preco_Compra=?, taxa= ?, precototal=? where codCarrinho = ?");
                    pst2.setInt(1,quant3);
                    pst2.setDouble(2,preco3);
                    pst2.setString(3,taxa.getText());
                    pst2.setDouble(4,Double.parseDouble(precoTotal.getText()));
                    pst2.setInt(5,cod2);
                    pst2.execute();
                } catch (SQLException ex) {
                    Logger.getLogger(ConsultaCarrinho.class.getName()).log(Level.SEVERE, null, ex);
                }
                }
    }//GEN-LAST:event_alterarActionPerformed

    private void FornActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FornActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FornActionPerformed

    private void codActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codActionPerformed

    private void LimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimparActionPerformed
        cod.setText(null);
        Forn.setText(null);
        prod.setText(null);
        marca.setText(null);
        cor.setText(null);
        quant.setText(null);
        preco.setText(null);
        taxa.setText(null);
        descricao.setText(null);
        precoTotal.setText(null);
    }//GEN-LAST:event_LimparActionPerformed

    private void ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcluirActionPerformed
        try {
            PreparedStatement pst =  conecta.conn.prepareStatement("delete from Carrinho where codCarrinho=?");
            pst.setInt(1,Integer.parseInt(cod.getText()));
            pst.execute();
            JOptionPane.showMessageDialog(null,"Excluido com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao excluir");
        }
    }//GEN-LAST:event_ExcluirActionPerformed

    private void prodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prodActionPerformed

    private void adcionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adcionarActionPerformed
        try {
                    
                    PreparedStatement pst1 = conecta.conn.prepareStatement("Select Max(Cod1) from Compra");
                    ResultSet rs1 = pst1.executeQuery();
                    while(rs1.next()){
                        codCompra = rs1.getInt("Max(Cod1)");
                    }
                    
                    
                    PreparedStatement pst2 = conecta.conn.prepareStatement("insert into Carrinho(codCompra,codP,codF,quant,preco_compra,taxa,precototal)VALUES(?,?,?,?,?,?,?)");
                    pst2.setInt(1,codCompra);
                    pst2.setInt(2,Integer.parseInt(cod.getText()));
                    PreparedStatement pst3 = conecta.conn.prepareStatement("Select Fornecedor_Id from fornecedor where nome = ?");
                    pst3.setString(1,Forn.getText());
                    ResultSet rs3 = pst3.executeQuery();

                    while(rs3.next()){
                        pst2.setInt(3,rs3.getInt("Fornecedor_Id"));
                    }
                    
                    pst2.setInt(4, Integer.parseInt(quant.getText()));
                    pst2.setDouble(5, Double.parseDouble(preco.getText()));
                    pst2.setString(6,taxa.getText());
                    pst2.setDouble(7,Double.parseDouble(precoTotal.getText()));
                    pst2.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Foi inserido!");
                    
                    } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Não foi inserido!\n Erro: " + ex.getMessage());
                    
                }
        exibir(codCompra);
    }//GEN-LAST:event_adcionarActionPerformed

   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultaCarrinho().setVisible(true);
            }
        });
    }
    public void exibir(int aux){
        codCompra = aux;
        
        ArrayList<String> F_Nome = new ArrayList<String>();
        ArrayList<Integer> codF = new ArrayList<Integer>();
        ArrayList<String> P_Nome = new ArrayList<String>();
        ArrayList<Integer> codP = new ArrayList<Integer>();
        ArrayList<String> cor = new ArrayList<String>();
        ArrayList<String> marca = new ArrayList<String>();
        ArrayList<String> descricao = new ArrayList<String>();
        ArrayList<Integer> codCarrinho = new ArrayList<Integer>();
        
        
        try {
                PreparedStatement pst = conecta.conn.prepareStatement("select codCarrinho,codP,codF from carrinho  where codCompra=? order by codCarrinho");
                pst.setInt(1,codCompra);
                ResultSet rs = pst.executeQuery();
                while(rs.next()){
                    codCarrinho.add(rs.getInt("codCarrinho"));
                    codF.add(rs.getInt("codF"));
                    codP.add(rs.getInt("codP"));
                }
                
                for(int a=0; a<codCarrinho.size(); a++){
                    PreparedStatement pst1 = conecta.conn.prepareStatement("Select nome from fornecedor where Fornecedor_Id= ? ");
                    pst1.setInt(1, codF.get(a));
                    ResultSet rs1 = pst1.executeQuery();               
                    if (rs1.next()) {
                        F_Nome.add(rs1.getString("nome"));
                    }
                }
                for(int a=0; a<codCarrinho.size(); a++){
                    PreparedStatement pst2 = conecta.conn.prepareStatement("Select  nome,descricao,cor,marca from produto where produto_Id = ?");
                    pst2.setInt(1, codP.get(a));
                    ResultSet rs2 = pst2.executeQuery();
                    while(rs2.next()){
                        P_Nome.add(rs2.getString("nome"));
                        cor.add(rs2.getString("cor"));
                        marca.add(rs2.getString("marca"));
                        descricao.add(rs2.getString("descricao"));
                    }
                }
                PreparedStatement pst3 = conecta.conn.prepareStatement("select quant,Precototal,taxa,preco_compra from carrinho  where codCompra='"+ codCompra +"'");
                    ResultSet rs3 = pst3.executeQuery();
                    for(int a =0; a<codCarrinho.size(); a++){    
                        if(rs3.next()== true){
                            CarrinhoBEAN c = new CarrinhoBEAN();
                            c.setDesconto(rs3.getDouble("taxa"));
                            c.setFornecedor(F_Nome.get(a));
                            c.setDescricao(descricao.get(a));
                            c.setNome(P_Nome.get(a));
                            c.setCor(cor.get(a));
                            c.setMarca(marca.get(a));
                            c.setQuant(rs3.getInt("quant"));
                            c.setPreco_compra(rs3.getDouble("preco_Compra"));
                            c.setCodCarrinho(codCarrinho.get(a));
                            c.setPreco_total(rs3.getDouble("Precototal"));
                            C.add(c);
                        }
                }
                }catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null,"Erro: " + ex );
                }
                preencherTable();
                
    }

    public void preencherTable(){
        ArrayList dados = new ArrayList();
        
        String [] Colunas = new String[]{"Código","Fornecedor","Produto","Marca","Cor","Descrição","Quantidade","Preço Compra", "Taxa", "Preço Total"};
        System.out.println(C);
        int aux=0;
                do{
                    dados.add(new Object[]{C.get(aux).getCodCarrinho(), C.get(aux).getFornecedor(), C.get(aux).getNome(), C.get(aux).getMarca(), C.get(aux).getCor(),C.get(aux).getDescricao(),C.get(aux).getQuant(),C.get(aux).getPreco_compra(),C.get(aux).getDesconto(),C.get(aux).getPreco_total()});
                    aux++;
                }while (aux<C.size());

       
        ModeloTabela modelo = new ModeloTabela(dados,Colunas);
        TableCarrinho.setModel(modelo);
        TableCarrinho.getColumnModel().getColumn(0).setPreferredWidth(50);
        TableCarrinho.getColumnModel().getColumn(0).setResizable(false);
        TableCarrinho.getColumnModel().getColumn(1).setPreferredWidth(100);
        TableCarrinho.getColumnModel().getColumn(1).setResizable(false);
        TableCarrinho.getColumnModel().getColumn(2).setPreferredWidth(100);
        TableCarrinho.getColumnModel().getColumn(2).setResizable(false);
        TableCarrinho.getColumnModel().getColumn(3).setPreferredWidth(100);
        TableCarrinho.getColumnModel().getColumn(3).setResizable(false);
        TableCarrinho.getColumnModel().getColumn(4).setPreferredWidth(100);
        TableCarrinho.getColumnModel().getColumn(4).setResizable(false);
        TableCarrinho.getColumnModel().getColumn(5).setPreferredWidth(100);
        TableCarrinho.getColumnModel().getColumn(5).setResizable(false);
        TableCarrinho.getColumnModel().getColumn(7).setPreferredWidth(100);
        TableCarrinho.getColumnModel().getColumn(7).setResizable(false);
        TableCarrinho.getTableHeader().setReorderingAllowed(false);
        TableCarrinho.setAutoResizeMode(TableCarrinho.AUTO_RESIZE_OFF);
        TableCarrinho.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);                                    
    } 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Excluir;
    private javax.swing.JTextField Forn;
    private javax.swing.JButton Limpar;
    private javax.swing.JTable TableCarrinho;
    private javax.swing.JButton adcionar;
    private javax.swing.JButton alterar;
    private javax.swing.JTextField cod;
    private javax.swing.JTextField cor;
    private javax.swing.JTextField descricao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField marca;
    private javax.swing.JTextField preco;
    private javax.swing.JTextField precoTotal;
    private javax.swing.JTextField prod;
    private javax.swing.JTextField quant;
    private javax.swing.JTextField taxa;
    // End of variables declaration//GEN-END:variables
}
