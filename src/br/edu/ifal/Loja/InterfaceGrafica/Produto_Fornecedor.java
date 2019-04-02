package br.edu.ifal.Loja.InterfaceGrafica;

import br.edu.ifal.Loja.BEANS.ModeloTabela;
import br.edu.ifal.Loja.DAO.Conexao;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;

public class Produto_Fornecedor extends javax.swing.JFrame {
    Conexao conecta = new Conexao();
    public Produto_Fornecedor() {
        initComponents();
        conecta.conexao();
        preencherTableProduto("SELECT Nome,Produto_Id,cor,marca,descricao FROM produto order by Produto_Id");
        preencherTableFornecedor("SELECT Fornecedor_Id,Nome from fornecedor order by Fornecedor_Id ");
        preencherTableProduto_Fornecedor("SELECT * from Produto_Fornecedor order by Produto_Fornecedor_Id ");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaProduto = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        TabelaFornecedor = new javax.swing.JTable();
        CadastroProduto_Fornecedor = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Fornecedor_Id = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        PrecoCompra = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        TabelaProduto_Fornecedor = new javax.swing.JTable();
        ExcluirP_F = new javax.swing.JButton();
        AlterarP_F = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        codP = new javax.swing.JTextField();
        codF = new javax.swing.JTextField();
        preco = new javax.swing.JTextField();
        codP_F = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Limpar = new javax.swing.JButton();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        Produto_Id = new javax.swing.JTextField();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Fornecedor X Produto");

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

        TabelaFornecedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        TabelaFornecedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelaFornecedorMouseClicked(evt);
            }
        });
        TabelaFornecedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TabelaFornecedorKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(TabelaFornecedor);

        CadastroProduto_Fornecedor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        CadastroProduto_Fornecedor.setText("Adicionar");
        CadastroProduto_Fornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastroProduto_FornecedorActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Produto:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Fornecedor:");

        Fornecedor_Id.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Preço de compra");

        PrecoCompra.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        PrecoCompra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                PrecoCompraKeyPressed(evt);
            }
        });

        TabelaProduto_Fornecedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        TabelaProduto_Fornecedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelaProduto_FornecedorMouseClicked(evt);
            }
        });
        TabelaProduto_Fornecedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TabelaProduto_FornecedorKeyReleased(evt);
            }
        });
        jScrollPane3.setViewportView(TabelaProduto_Fornecedor);

        ExcluirP_F.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ExcluirP_F.setText("Deletar");
        ExcluirP_F.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExcluirP_FActionPerformed(evt);
            }
        });

        AlterarP_F.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        AlterarP_F.setText("Alterar");
        AlterarP_F.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlterarP_FActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Produto:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Fornecedor:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Preço:");

        codP.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        codF.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        codF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codFActionPerformed(evt);
            }
        });

        preco.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        codP_F.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Códiigo:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Passo 1: Selecione o fornecedor");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Passo 2: Selecione o produto");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("Passo 3: Digite o preço de compra");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Relações:");

        Limpar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Limpar.setText("Limpar");
        Limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimparActionPerformed(evt);
            }
        });

        jLayeredPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Produto_Id.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel10)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CadastroProduto_Fornecedor)
                .addGap(315, 315, 315))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addGap(40, 40, 40))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(Produto_Id, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(109, 109, 109)
                                        .addComponent(PrecoCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(15, 15, 15)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(Fornecedor_Id, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(AlterarP_F, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGap(76, 76, 76)
                                    .addComponent(ExcluirP_F))
                                .addComponent(Limpar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel5)
                                        .addComponent(codF, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(codP_F, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel8))
                                .addGap(28, 28, 28)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(preco, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6)
                                    .addComponent(codP, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 228, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codP_F, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(preco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addComponent(ExcluirP_F)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AlterarP_F)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Limpar)
                .addGap(57, 57, 57))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel3)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(PrecoCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Fornecedor_Id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Produto_Id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(42, 42, 42)
                                .addComponent(CadastroProduto_Fornecedor))
                            .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(57, 57, 57))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
/**/
    private void CadastroProduto_FornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastroProduto_FornecedorActionPerformed
        try {
            PreparedStatement pst = conecta.conn.prepareStatement("insert into Produto_Fornecedor (Produto_Id,Fornecedor_Id,Preco_Custo) VALUES (?,?,?)");   
            pst.setInt(1, Integer.parseInt(Produto_Id.getText()));
            pst.setInt(2, Integer.parseInt(Fornecedor_Id.getText()));
            pst.setDouble(3, Double.parseDouble(PrecoCompra.getText()));
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Inserido com sucesso!");
            preencherTableProduto_Fornecedor("SELECT Produto_Fornecedor_Id,Produto_Id,Fornecedor_Id,Preco_Custo from Produto_Fornecedor order by Produto_Fornecedor_Id ");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi inserido!\n Erro: " + ex.getMessage());
        }
    }//GEN-LAST:event_CadastroProduto_FornecedorActionPerformed

    private void TabelaProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaProdutoMouseClicked
        if(TabelaProduto.getSelectedRow() != -1){
            Produto_Id.setText(TabelaProduto.getValueAt(TabelaProduto.getSelectedRow(),0).toString());
        }else{
           JOptionPane.showMessageDialog(null,"Selecione uma linha");
       }
    }//GEN-LAST:event_TabelaProdutoMouseClicked

    private void TabelaProdutoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TabelaProdutoKeyReleased
        if(TabelaProduto.getSelectedRow() != -1){
            Produto_Id.setText(TabelaProduto.getValueAt(TabelaProduto.getSelectedRow(),0).toString());
        }else{
           JOptionPane.showMessageDialog(null,"Selecione uma linha");
       }
    }//GEN-LAST:event_TabelaProdutoKeyReleased

    private void TabelaFornecedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaFornecedorMouseClicked
        if(TabelaFornecedor.getSelectedRow() != -1){
            Fornecedor_Id.setText(TabelaFornecedor.getValueAt(TabelaFornecedor.getSelectedRow(),0).toString());
        }else{
           JOptionPane.showMessageDialog(null,"Selecione uma linha");
       }
    }//GEN-LAST:event_TabelaFornecedorMouseClicked

    private void TabelaFornecedorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TabelaFornecedorKeyReleased
        if(TabelaFornecedor.getSelectedRow() != -1){
            Fornecedor_Id.setText(TabelaFornecedor.getValueAt(TabelaFornecedor.getSelectedRow(),0).toString());
        }else{
           JOptionPane.showMessageDialog(null,"Selecione uma linha");
       }
    }//GEN-LAST:event_TabelaFornecedorKeyReleased

    private void PrecoCompraKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PrecoCompraKeyPressed
       /* try {
            PreparedStatement pst = conecta.conn.prepareStatement("insert into Produto_Fornecedor (Produto_Id,Fornecedor_Id,Preco_Custo) VALUES (?,?,?)");   
            pst.setInt(1, Integer.parseInt(Produto_Id.getText()));
            pst.setInt(2, Integer.parseInt(Fornecedor_Id.getText()));
            pst.setDouble(3, Double.parseDouble(PrecoCompra.getText()));
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Inserido com sucesso!");
            preencherTableProduto_Fornecedor("SELECT Produto_Fornecedor_Id,Produto_Id,Fornecedor_Id,Preco_Custo from Produto_Fornecedor order by Produto_Fornecedor_Id ");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi inserido!\n Erro: " + ex.getMessage());
        }*/
    }//GEN-LAST:event_PrecoCompraKeyPressed

    private void ExcluirP_FActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcluirP_FActionPerformed
        try {
            PreparedStatement pst =  conecta.conn.prepareStatement("delete from Produto_Fornecedor where Produto_Fornecedor_Id=?");
            pst.setInt(1,Integer.parseInt(codP_F.getText()));
            pst.execute();
            JOptionPane.showMessageDialog(null,"Excluido com sucesso");
            preencherTableProduto_Fornecedor("SELECT * from Produto_Fornecedor order by Produto_Fornecedor_Id ");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao excluir\n Erro: "+ex);
        }
    }//GEN-LAST:event_ExcluirP_FActionPerformed

    private void TabelaProduto_FornecedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaProduto_FornecedorMouseClicked
        if(TabelaProduto_Fornecedor.getSelectedRow() != -1){
            codP_F.setText(TabelaProduto_Fornecedor.getValueAt(TabelaProduto_Fornecedor.getSelectedRow(),0).toString());
            codP.setText(TabelaProduto_Fornecedor.getValueAt(TabelaProduto_Fornecedor.getSelectedRow(),1).toString());
            codF.setText(TabelaProduto_Fornecedor.getValueAt(TabelaProduto_Fornecedor.getSelectedRow(),2).toString());
            preco.setText(TabelaProduto_Fornecedor.getValueAt(TabelaProduto_Fornecedor.getSelectedRow(),3).toString());
        }else{
           JOptionPane.showMessageDialog(null,"Selecione uma linha");
       }
    }//GEN-LAST:event_TabelaProduto_FornecedorMouseClicked

    private void TabelaProduto_FornecedorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TabelaProduto_FornecedorKeyReleased
       if(TabelaProduto_Fornecedor.getSelectedRow() != -1){
            codP_F.setText(TabelaProduto_Fornecedor.getValueAt(TabelaProduto_Fornecedor.getSelectedRow(),0).toString());
            codP.setText(TabelaProduto_Fornecedor.getValueAt(TabelaProduto_Fornecedor.getSelectedRow(),1).toString());
            codF.setText(TabelaProduto_Fornecedor.getValueAt(TabelaProduto_Fornecedor.getSelectedRow(),2).toString());
            preco.setText(TabelaProduto_Fornecedor.getValueAt(TabelaProduto_Fornecedor.getSelectedRow(),3).toString());
        }else{
           JOptionPane.showMessageDialog(null,"Selecione uma linha");
       } 
    }//GEN-LAST:event_TabelaProduto_FornecedorKeyReleased

    private void AlterarP_FActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlterarP_FActionPerformed
        try {
            PreparedStatement pst =  conecta.conn.prepareStatement("update Produto_Fornecedor set Produto_Id= ?,Fornecedor_Id = ?, Preco_Custo=? where Produto_Fornecedor_Id=?");
            
            pst.setInt(1,Integer.parseInt(codP.getText()));
            pst.setInt(2,Integer.parseInt(codF.getText()));
            pst.setDouble(3,Double.parseDouble(preco.getText()));
            pst.setInt(4,Integer.parseInt(codP_F.getText()));
            pst.execute();
            JOptionPane.showMessageDialog(null,"Alterado com sucesso");
            preencherTableProduto_Fornecedor("SELECT * from Produto_Fornecedor order by Produto_Fornecedor_Id ");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao Alterar: " + ex);
        }
    }//GEN-LAST:event_AlterarP_FActionPerformed

    private void LimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimparActionPerformed
        codP_F.setText("");
        codP.setText("");
        codF.setText("");
        preco.setText("");
    }//GEN-LAST:event_LimparActionPerformed

    private void codFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codFActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Produto_Fornecedor().setVisible(true);
            }
        });
    }
    public void preencherTableProduto(String Sql){
        ArrayList dados = new ArrayList();
        
        String [] Colunas = new String[]{"Código","Nome","Cor","Marca", "Descrição"};
        
        try {
            conecta.executaSQL(Sql);
//            conecta.rs.first();
            while(conecta.rs.next()){
                dados.add(new Object[]{conecta.rs.getInt("Produto_Id"),conecta.rs.getString("Nome"),conecta.rs.getString("cor"),conecta.rs.getString("marca"),conecta.rs.getString("descricao")});
            };
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
        TabelaProduto.getColumnModel().getColumn(4).setPreferredWidth(100);
        TabelaProduto.getColumnModel().getColumn(4).setResizable(false);
        TabelaProduto.getTableHeader().setReorderingAllowed(false);
        TabelaProduto.setAutoResizeMode(TabelaProduto.AUTO_RESIZE_OFF);
        TabelaProduto.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }
    
    public void preencherTableFornecedor(String SQL){
        ArrayList dados = new ArrayList();
        
        String [] Colunas = new String[]{"Código","Nome"};
        
        try {
            conecta.executaSQL(SQL);
            conecta.rs.first();
            do{
                dados.add(new Object[]{conecta.rs.getInt("Fornecedor_Id"),conecta.rs.getString("Nome")});
            }while(conecta.rs.next());
         } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao preencher o ArrayList \nErro:" + ex);
        }
        ModeloTabela modelo = new ModeloTabela(dados,Colunas);
        TabelaFornecedor.setModel(modelo);
        TabelaFornecedor.getColumnModel().getColumn(0).setPreferredWidth(50);
        TabelaFornecedor.getColumnModel().getColumn(0).setResizable(false);
        TabelaFornecedor.getColumnModel().getColumn(1).setPreferredWidth(130);
        TabelaFornecedor.getColumnModel().getColumn(1).setResizable(false);
        TabelaFornecedor.getTableHeader().setReorderingAllowed(false);
        TabelaFornecedor.setAutoResizeMode(TabelaFornecedor.AUTO_RESIZE_OFF);
        TabelaFornecedor.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
                     
  }
        public void preencherTableProduto_Fornecedor(String SQL){
        ArrayList dados = new ArrayList();
        
        String [] Colunas = new String[]{"Código","Produto","Fornecedor","Preço"};
        
        try {
            conecta.executaSQL(SQL);
            conecta.rs.first();
            do{
                dados.add(new Object[]{conecta.rs.getInt("Produto_Fornecedor_Id"),conecta.rs.getInt("Produto_Id"),conecta.rs.getInt("Fornecedor_Id"),conecta.rs.getDouble("Preco_Custo")});
            }while(conecta.rs.next());
         } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao preencher o ArrayList \nErro:" + ex);
        }
        ModeloTabela modelo = new ModeloTabela(dados,Colunas);
        TabelaProduto_Fornecedor.setModel(modelo);
        TabelaProduto_Fornecedor.getColumnModel().getColumn(0).setPreferredWidth(50);
        TabelaProduto_Fornecedor.getColumnModel().getColumn(0).setResizable(false);
        TabelaProduto_Fornecedor.getColumnModel().getColumn(1).setPreferredWidth(50);
        TabelaProduto_Fornecedor.getColumnModel().getColumn(1).setResizable(false);
        TabelaProduto_Fornecedor.getTableHeader().setReorderingAllowed(false);
        TabelaProduto_Fornecedor.setAutoResizeMode(TabelaFornecedor.AUTO_RESIZE_OFF);
        TabelaProduto_Fornecedor.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
                     
  }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AlterarP_F;
    private javax.swing.JButton CadastroProduto_Fornecedor;
    private javax.swing.JButton ExcluirP_F;
    private javax.swing.JTextField Fornecedor_Id;
    private javax.swing.JButton Limpar;
    private javax.swing.JTextField PrecoCompra;
    private javax.swing.JTextField Produto_Id;
    private javax.swing.JTable TabelaFornecedor;
    private javax.swing.JTable TabelaProduto;
    private javax.swing.JTable TabelaProduto_Fornecedor;
    private javax.swing.JTextField codF;
    private javax.swing.JTextField codP;
    private javax.swing.JTextField codP_F;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField preco;
    // End of variables declaration//GEN-END:variables
}
