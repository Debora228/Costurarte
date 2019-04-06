package InterfaceGrafica;

import BEANS.ModeloTabela;
import BEANS.ProdutoBEAN;
import DAO.Conexao;
import static java.lang.Math.floor;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;

public class Compra extends javax.swing.JInternalFrame {

    Conexao conecta = new Conexao();
    ArrayList<ProdutoBEAN> P = new ArrayList<ProdutoBEAN>();

    double precototal;
    String t = null;
        
    public Compra() {
        initComponents();
        conecta.conexao();
        JcomboxFornecedor();    
        JcomboxCategoria();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jLabel7 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jLabel15 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        fornecedor1 = new javax.swing.JTextField();
        total1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel25 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        AdicionarCarrinho = new javax.swing.JButton();
        Concluir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nomePES = new javax.swing.JTextField();
        codPES = new javax.swing.JTextField();
        CategoriaPES = new javax.swing.JComboBox();
        MostraPesquisa = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaProduto = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        RelacionarP_F = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        precoCompra = new javax.swing.JTextField();
        nome = new javax.swing.JTextField();
        cor = new javax.swing.JTextField();
        marca = new javax.swing.JTextField();
        descricao = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        quantidade = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        CancelarCompra = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        TableCarrinho = new javax.swing.JTable();
        totalB = new javax.swing.JButton();
        fornecedorConfirma = new javax.swing.JComboBox();
        mostrar = new javax.swing.JLabel();
        CadastroFornecedor = new javax.swing.JButton();
        Relacionar = new javax.swing.JButton();
        fornecedorPES = new javax.swing.JComboBox();
        limpar = new javax.swing.JButton();
        codProduto = new javax.swing.JTextField();
        alterarPreco = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        desconto = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        acrescimo = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();

        jScrollPane2.setViewportView(jTextPane1);

        jLabel19.setText("jLabel19");

        jLabel17.setText("jLabel17");

        jLabel7.setText("jLabel7");

        jLabel23.setText("jLabel23");

        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane5.setViewportView(jList1);

        jLabel15.setText("jLabel15");

        jLabel22.setText("jLabel22");

        fornecedor1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        total1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jButton1.setText("Cadastrar");

        jRadioButton1.setText("jRadioButton1");

        jLabel25.setText("jLabel25");

        setClosable(true);
        setIconifiable(true);
        setTitle("Compra");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Escolha o fornecedor:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Categoria:");

        AdicionarCarrinho.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        AdicionarCarrinho.setText("Adicionar ao carrinho");
        AdicionarCarrinho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdicionarCarrinhoActionPerformed(evt);
            }
        });

        Concluir.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Concluir.setText("Concluir");
        Concluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConcluirActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Nome:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Código:");

        nomePES.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        codPES.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        CategoriaPES.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        CategoriaPES.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione" }));

        MostraPesquisa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        MostraPesquisa.setText("Mostrar Produtos");
        MostraPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostraPesquisaActionPerformed(evt);
            }
        });

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

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Nome:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Descrição:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Cor:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Marca:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Quantidade:");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Preço de Compra:");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setText("Escolha uma opção para selecionar produtos:");

        RelacionarP_F.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        RelacionarP_F.setText("Fornecedor e Produto");
        RelacionarP_F.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RelacionarP_FActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setText("Fornecedor:");

        precoCompra.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        precoCompra.setToolTipText("Por Unidade");
        precoCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precoCompraActionPerformed(evt);
            }
        });

        nome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        cor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        marca.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        descricao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setText("Código:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("=");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("X");

        total.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        quantidade.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        quantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantidadeActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel21.setText("X");

        CancelarCompra.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        CancelarCompra.setText("Cancelar Compra");
        CancelarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarCompraActionPerformed(evt);
            }
        });

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
        jScrollPane4.setViewportView(TableCarrinho);

        totalB.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        totalB.setText("Total");
        totalB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalBActionPerformed(evt);
            }
        });

        fornecedorConfirma.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        fornecedorConfirma.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione" }));
        fornecedorConfirma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fornecedorConfirmaActionPerformed(evt);
            }
        });

        CadastroFornecedor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        CadastroFornecedor.setText("Cadastrar");
        CadastroFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastroFornecedorActionPerformed(evt);
            }
        });

        Relacionar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Relacionar.setText("Realacionar Produto");
        Relacionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RelacionarActionPerformed(evt);
            }
        });

        fornecedorPES.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        fornecedorPES.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione" }));

        limpar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        limpar.setText("Limpar");
        limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparActionPerformed(evt);
            }
        });

        codProduto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        alterarPreco.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        alterarPreco.setText("Preço de Venda");
        alterarPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarPrecoActionPerformed(evt);
            }
        });

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ícones/shopcartadd.png"))); // NOI18N

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel28.setText("Desconto:");

        desconto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        desconto.setText("0");
        desconto.setToolTipText("Porcentagem");
        desconto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descontoActionPerformed(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel29.setText("Acréscimo:");

        acrescimo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        acrescimo.setText("0");
        acrescimo.setToolTipText("Porcentagem");
        acrescimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acrescimoActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("%");

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel24.setText("%");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(153, 153, 153)
                        .addComponent(Concluir))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20)
                            .addComponent(codProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(cor, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(marca, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(descricao, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fornecedorConfirma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Relacionar)
                            .addComponent(CadastroFornecedor)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(CategoriaPES, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(40, 40, 40)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nomePES, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(codPES, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel1))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(47, 47, 47)
                                        .addComponent(fornecedorPES, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(97, 97, 97)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(MostraPesquisa)
                                        .addGap(137, 137, 137)
                                        .addComponent(RelacionarP_F))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(51, 51, 51)
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(precoCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel21))
                            .addComponent(jLabel12))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(totalB)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(jLabel28)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(desconto, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(2, 2, 2)
                                                .addComponent(jLabel24)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(mostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel14)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel29)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(acrescimo, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(limpar)
                                .addGap(18, 18, 18)
                                .addComponent(alterarPreco)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(AdicionarCarrinho))))
                    .addComponent(CancelarCompra))
                .addGap(156, 156, 156))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CategoriaPES, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nomePES, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(codPES, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fornecedorPES, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(RelacionarP_F)
                            .addComponent(MostraPesquisa))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel9)
                            .addComponent(jLabel18)
                            .addComponent(CadastroFornecedor)
                            .addComponent(jLabel20))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(descricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fornecedorConfirma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Relacionar)
                            .addComponent(codProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(42, 42, 42)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel29)
                                            .addComponent(acrescimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel24)))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(desconto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel28)
                                                .addComponent(jLabel14))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel5))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel13)
                                                .addComponent(jLabel12))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(precoCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel6)
                                                    .addComponent(quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel21))
                                                .addComponent(mostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(CancelarCompra)
                                                .addGap(5, 5, 5))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(totalB)
                                                    .addComponent(limpar)
                                                    .addComponent(alterarPreco)
                                                    .addComponent(AdicionarCarrinho))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Concluir)
                                        .addGap(126, 126, 126))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(153, 153, 153)
                                .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 11, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        jScrollPane7.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 987, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 621, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setBounds(0, 0, 1003, 651);
    }// </editor-fold>//GEN-END:initComponents

    private void AdicionarCarrinhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdicionarCarrinhoActionPerformed
        String S = (String) fornecedorPES.getSelectedItem();
        String fc = (String)fornecedorConfirma.getSelectedItem();
        ArrayList<String> nome = new ArrayList<String>();
        double desc = (Double.parseDouble(desconto.getText()))/100;
        double acres = (Double.parseDouble(acrescimo.getText()))/100;
        int codCompra=0;
            try {
                    
                    PreparedStatement pst1 = conecta.conn.prepareStatement("Select Max(Cod1) from Compra");
                    ResultSet rs1 = pst1.executeQuery();
                    while(rs1.next()){
                        codCompra = rs1.getInt("Max(Cod1)");
                    }
                    
                    
                    PreparedStatement pst2 = conecta.conn.prepareStatement("insert into Carrinho(codCompra,codP,codF,quant,preco_compra,taxa,precototal)VALUES(?,?,?,?,?,?,?)");
                    pst2.setInt(1,codCompra);
                    pst2.setInt(2,Integer.parseInt(codProduto.getText()));
                    PreparedStatement pst3 = conecta.conn.prepareStatement("Select Fornecedor_Id from fornecedor where nome = ?");
                    pst3.setString(1,fc);
                    ResultSet rs3 = pst3.executeQuery();

                    while(rs3.next()){
                        pst2.setInt(3,rs3.getInt("Fornecedor_Id"));
                    }
                    
                    pst2.setInt(4, Integer.parseInt(quantidade.getText()));
                    pst2.setDouble(5, Double.parseDouble(precoCompra.getText()));
                    
                    if (acres == 0 && desc!=0){
                        String t = ((new Double(desc).toString()));
                        pst2.setString(6,"-" + t);
                    }else if(desc==0 && acres!=0){
                        String t = ((new Double(acres).toString()));
                        pst2.setString(6,"+" + t);
                    }else{
                        pst2.setString(6,"0");
                    }
                    pst2.setDouble(7,Double.parseDouble(mostrar.getText()));
                    pst2.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Foi inserido!");
                    
                    preencherTableCarrinho("SELECT codCompra,codP,codF,quant,preco_Compra, taxa,precototal FROM carrinho where codCompra = "+ codCompra+" order by codCarrinho");           
                    } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Não foi inserido!\n Erro: " + ex.getMessage());
                
                }
        
    }//GEN-LAST:event_AdicionarCarrinhoActionPerformed

    private void ConcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConcluirActionPerformed
                        FinalizaçãoCompra f = new FinalizaçãoCompra();
                        f.setVisible(true);
                        f.setLocationRelativeTo(null);
    }//GEN-LAST:event_ConcluirActionPerformed
    private void MostraPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostraPesquisaActionPerformed
        int F_ID = 0;
        int c_id =0;
        String S = (String) fornecedorPES.getSelectedItem();
        String Categoria = (String) CategoriaPES.getSelectedItem();
        double PC = 0;
        ArrayList<Integer> P_ID = new ArrayList<Integer>();
        ArrayList<Double> Preco = new ArrayList<Double>();
         
        if (!nomePES.getText().equals("")) {
            preencherTableProduto("SELECT Produto_Id,Nome,cor,marca,descricao FROM produto where nome LIKE '%" + nomePES.getText() + "%'");
            //Mostrar que errou o nome
        } else if (!codPES.getText().equals("")) {
            preencherTableProduto("SELECT Produto_Id,Nome,cor,marca,descricao FROM produto where Produto_Id LIKE '%" + codPES.getText() + "%'");
            //Mostrar que não tem com esse código
        }else if(!S.equals("Selecione")) {
            try {
                PreparedStatement pst = conecta.conn.prepareStatement("Select Fornecedor_Id from fornecedor where nome = ?");
                pst.setString(1, S);
                ResultSet rs = pst.executeQuery();
                if (rs.next()) {
                    F_ID = rs.getInt("Fornecedor_id");
                    total1.setText(S);
                    System.out.println(F_ID);
                }
                PreparedStatement pst2 = conecta.conn.prepareStatement("Select  produto_Id,preco_Custo from produto_fornecedor where produto_fornecedor.Fornecedor_Id = ?");
                pst2.setInt(1, F_ID);
                ResultSet rs2 = pst2.executeQuery();
                while(rs2.next()){
                    P_ID.add(rs2.getInt("Produto_Id"));
                    Preco.add(rs2.getDouble("preco_Custo"));
                }
                PreparedStatement pst3 = conecta.conn.prepareStatement("Select  produto_Id,nome,marca,categoria,descricao,cor from produto where produto_Id = ?");
                for(int a =0; a<P_ID.size(); a++){
                    pst3.setInt(1,P_ID.get(a));
                    ResultSet rs3 = pst3.executeQuery();
                    while(rs3.next()) {
                        ProdutoBEAN p = new ProdutoBEAN();
                        p.setId(rs3.getInt("Produto_Id"));
                        p.setPreco_Custo(Preco.get(a));
                        p.setCategoria(rs3.getString("categoria"));
                        p.setDescricao(rs3.getString("descricao"));
                        p.setNome(rs3.getString("nome"));
                        p.setCor(rs3.getString("cor"));
                        p.setMarca(rs3.getString("marca"));
                        P.add(p);
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(Compra.class.getName()).log(Level.SEVERE, null, ex);
            }
            preencherTableProduto_Fornecedor();
            P.clear();
            
        }else if(!Categoria.equals("Selecione")){
            preencherTableProduto("SELECT Produto_Id,Nome,cor,marca,descricao FROM produto where categoria = '" + Categoria + "'");
        }else{
            JOptionPane.showMessageDialog(null,"Produto não encontrado!");
        }        
    }//GEN-LAST:event_MostraPesquisaActionPerformed

   
    private void TabelaProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaProdutoMouseClicked
        String S = (String) fornecedorPES.getSelectedItem();
        if (TabelaProduto.getSelectedRow() != -1) {
            codProduto.setText(TabelaProduto.getValueAt(TabelaProduto.getSelectedRow(),0).toString());
            nome.setText(TabelaProduto.getValueAt(TabelaProduto.getSelectedRow(),1).toString());
            cor.setText(TabelaProduto.getValueAt(TabelaProduto.getSelectedRow(),2).toString());
            marca.setText(TabelaProduto.getValueAt(TabelaProduto.getSelectedRow(),3).toString());
            descricao.setText(TabelaProduto.getValueAt(TabelaProduto.getSelectedRow(),4).toString());
            if(!S.equals("Selecione")){
                precoCompra.setText(TabelaProduto.getValueAt(TabelaProduto.getSelectedRow(),5).toString());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecione uma linha");
        }
    }//GEN-LAST:event_TabelaProdutoMouseClicked

    private void TabelaProdutoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TabelaProdutoKeyReleased
        String S = (String) fornecedorPES.getSelectedItem();
        if (TabelaProduto.getSelectedRow() != -1) {
            codProduto.setText(TabelaProduto.getValueAt(TabelaProduto.getSelectedRow(),0).toString());
            nome.setText(TabelaProduto.getValueAt(TabelaProduto.getSelectedRow(),1).toString());
            cor.setText(TabelaProduto.getValueAt(TabelaProduto.getSelectedRow(),2).toString());
            marca.setText(TabelaProduto.getValueAt(TabelaProduto.getSelectedRow(),3).toString());
            descricao.setText(TabelaProduto.getValueAt(TabelaProduto.getSelectedRow(),4).toString());
            if(!S.equals("Selecione")){
                precoCompra.setText(TabelaProduto.getValueAt(TabelaProduto.getSelectedRow(),5).toString());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecione uma linha");
        }
    }//GEN-LAST:event_TabelaProdutoKeyReleased

    private void RelacionarP_FActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RelacionarP_FActionPerformed
        Senha telaSenha = new Senha();
        telaSenha.setVisible(true);
        telaSenha.setLocationRelativeTo(null);
    }//GEN-LAST:event_RelacionarP_FActionPerformed

    private void precoCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precoCompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_precoCompraActionPerformed

    private void quantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantidadeActionPerformed

    private void totalBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalBActionPerformed
        //arredonda para o próximo inteiro -> ex; floor(prec);
        double p = Double.parseDouble(precoCompra.getText());
        double q = Integer.parseInt(quantidade.getText());
        double precoTotal = p * q;
        double desc = (Double.parseDouble(desconto.getText()))/100;
        double acres = (Double.parseDouble(acrescimo.getText()))/100;
        double prec=0;
                        if (acres == 0){
                                double a = (precoTotal * desc);
                                prec =  (precoTotal - a) ;
                            }else if(desc==0){
                                double a = (precoTotal * acres);
                                prec = precoTotal + a;
                            }
                       
        mostrar.setText((new Double(prec).toString()));
    }//GEN-LAST:event_totalBActionPerformed

    private void RelacionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RelacionarActionPerformed
        Double preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do produto com esse fornecedor: "));
        try {
            PreparedStatement pst = conecta.conn.prepareStatement("insert into produto_fornecedor(Produto_Id,Fornecedor_Id,Preco_Custo) values (?,?,?)");
            pst.setInt(1,Integer.parseInt(codProduto.getText()));
            String S = (String) fornecedorConfirma.getSelectedItem();    
                PreparedStatement pst2 = conecta.conn.prepareStatement("Select Fornecedor_Id from fornecedor where nome='" +S+"'");
                ResultSet rs = pst2.executeQuery();
                while(rs.next()){
                    pst.setInt(2, rs.getInt("Fornecedor_Id"));
                }
            pst.setDouble(3,preco);
            pst.execute();
            JOptionPane.showMessageDialog(null,"Relação inserida com sucesso  " );
            //Senha telaSenha = new Senha();
            //telaSenha.setVisible(true);
            //telaSenha.setLocationRelativeTo(null);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro: " + ex);
        }
    }//GEN-LAST:event_RelacionarActionPerformed

    private void CadastroFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastroFornecedorActionPerformed
        String nomeFor = JOptionPane.showInputDialog("Digite o nome do fornecedor: ");
        String cnpj = JOptionPane.showInputDialog("Digite o CNPJ do fornecedor: ");
        try {
            PreparedStatement pst = conecta.conn.prepareStatement("insert into fornecedor(Nome,Cnpj,Telefone,Bairro,Rua,Numero) values (?,?,null,null,null,0)");
            pst.setString(1, nomeFor);
            pst.setString(2, cnpj);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Inserido com sucesso!");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi inserido!" );
        }
    }//GEN-LAST:event_CadastroFornecedorActionPerformed

    private void CancelarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarCompraActionPerformed
        try {
            PreparedStatement pst1 = conecta.conn.prepareStatement("Select Max(Cod1) from Compra");
            ResultSet rs1 = pst1.executeQuery();
            int codCompra=0;
            while(rs1.next()){
                codCompra = rs1.getInt("Max(Cod1)");
            }
            PreparedStatement pst2 = conecta.conn.prepareStatement("delete  from carrinho where CodCompra = ?");
            pst2.setInt(1,codCompra);
            pst2.execute();
            PreparedStatement pst3 = conecta.conn.prepareStatement("delete  from compra where Cod1 = ?");
            pst3.setInt(1,codCompra);
            pst3.execute();
            //garantir que é a última forma
            PreparedStatement pst4= conecta.conn.prepareStatement("insert into Compra(preco_final,data)VALUES(0,null)");
            pst4.executeUpdate();
            JOptionPane.showMessageDialog(null, "Compra cancelada");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não Cancelado!\n Erro: " + ex.getMessage());
        }
        }
        /*
        private void CancelarCompraActionPerformed(java.awt.event.ActionEvent evt) {
    }//GEN-LAST:event_CancelarCompraActionPerformed
*/
    private void limparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparActionPerformed
        precoCompra.setText(null);
        quantidade.setText(null);
        desconto.setText("0");
        acrescimo.setText("0");
    }//GEN-LAST:event_limparActionPerformed

    private void alterarPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarPrecoActionPerformed
        int op1 = Integer.parseInt(JOptionPane.showInputDialog("Deseja alterar o Preço de Venda deste produto? (Sim - 1/ Não - 2)"));
        if(op1==1){
            try {
                int op2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o novo preço para este produto?"));
                PreparedStatement pst =  conecta.conn.prepareStatement("update Produto set Preco_Venda = ? where Produto_Id=?");
                pst.setInt(1,op2);
                pst.setInt(2,Integer.parseInt(codProduto.getText()));
                pst.execute();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"Erro: " + ex);
            }
        }
    }//GEN-LAST:event_alterarPrecoActionPerformed

    private void descontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descontoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_descontoActionPerformed

    private void acrescimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acrescimoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_acrescimoActionPerformed

    private void fornecedorConfirmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fornecedorConfirmaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fornecedorConfirmaActionPerformed

    private void JcomboxFornecedor(){
        try {
            PreparedStatement pst = conecta.conn.prepareStatement("Select nome from Fornecedor");
            ResultSet rs = pst.executeQuery();
                while(rs.next()) { 
                    fornecedorPES.addItem(rs.getString("nome"));
                    fornecedorConfirma.addItem(rs.getString("nome"));
                }
           
        } catch (SQLException ex) {
            Logger.getLogger(Compra.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void JcomboxCategoria(){
       try{
        PreparedStatement pst = conecta.conn.prepareStatement("Select nome from Categoria");
        ResultSet rs = pst.executeQuery();
        while(rs.next()) { 
                    CategoriaPES.addItem(rs.getString("nome"));
                }
        } catch (SQLException ex) {
            Logger.getLogger(Compra.class.getName()).log(Level.SEVERE, null, ex);
        }
    }        
    public void preencherTableProduto(String Sql) {
        ArrayList dados = new ArrayList();

        String[] Colunas = new String[]{"Código", "Nome", "Cor", "Marca", "Descrição"};

        try {
            conecta.executaSQL(Sql);
            conecta.rs.first();
            do{
                dados.add(new Object[]{conecta.rs.getInt("Produto_Id"), conecta.rs.getString("Nome"), conecta.rs.getString("cor"), conecta.rs.getString("marca"), conecta.rs.getString("descricao")});
            }while (conecta.rs.next());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao preencher o ArrayList \nErro:" + ex);
        }
        ModeloTabela modelo = new ModeloTabela(dados, Colunas);
        TabelaProduto.setModel(modelo);
        TabelaProduto.getColumnModel().getColumn(1).setPreferredWidth(100);
        TabelaProduto.getColumnModel().getColumn(1).setResizable(false);
        TabelaProduto.getColumnModel().getColumn(0).setPreferredWidth(50);
        TabelaProduto.getColumnModel().getColumn(0).setResizable(false);
        TabelaProduto.getColumnModel().getColumn(3).setPreferredWidth(50);
        TabelaProduto.getColumnModel().getColumn(3).setResizable(false);
        TabelaProduto.getTableHeader().setReorderingAllowed(false);
        TabelaProduto.setAutoResizeMode(TabelaProduto.AUTO_RESIZE_OFF);
        TabelaProduto.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }

    public void preencherTableProduto_Fornecedor() {
        //ArrayList<ProdutoBEAN> P2 = new ArrayList<ProdutoBEAN>();
        
        
        ArrayList dados = new ArrayList();

        String[] Colunas = new String[]{"Código", "Nome", "Cor", "Marca", "Descrição", "Preço"};
                int aux=0;
                do{
                    dados.add(new Object[]{P.get(aux).getId(), P.get(aux).getNome(), P.get(aux).getCor(), P.get(aux).getMarca(), P.get(aux).getDescricao(),P.get(aux).getPreco_Custo()});
                    aux++;
                }while (aux<P.size());
        ModeloTabela modelo = new ModeloTabela(dados, Colunas);
        TabelaProduto.setModel(modelo);
        TabelaProduto.getColumnModel().getColumn(1).setPreferredWidth(100);
        TabelaProduto.getColumnModel().getColumn(1).setResizable(false);
        TabelaProduto.getColumnModel().getColumn(0).setPreferredWidth(50);
        TabelaProduto.getColumnModel().getColumn(0).setResizable(false);
        TabelaProduto.getColumnModel().getColumn(3).setPreferredWidth(50);
        TabelaProduto.getColumnModel().getColumn(3).setResizable(false);
        TabelaProduto.getColumnModel().getColumn(5).setPreferredWidth(50);
        TabelaProduto.getColumnModel().getColumn(5).setResizable(false);
        TabelaProduto.getTableHeader().setReorderingAllowed(false);
        TabelaProduto.setAutoResizeMode(TabelaProduto.AUTO_RESIZE_OFF);
        TabelaProduto.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }
    
    public void preencherTableCarrinho(String SQL) {
               ArrayList dados = new ArrayList();
                String [] Colunas = new String[]{"Compra","Produto","Fornecedor","Quantidade","Preço","Taxa","Preço total"};
        
        try {
            conecta.executaSQL(SQL);
            conecta.rs.first();
            do{
                dados.add(new Object[]{conecta.rs.getInt("codCompra"),conecta.rs.getInt("codP"),conecta.rs.getInt("codF"),conecta.rs.getInt("quant"),conecta.rs.getDouble("preco_Compra"),conecta.rs.getString("taxa"),conecta.rs.getDouble("precototal")});
            }while(conecta.rs.next());
         } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao preencher o ArrayList \nErro:" + ex);
        }
        ModeloTabela modelo = new ModeloTabela(dados,Colunas);
        TableCarrinho.setModel(modelo);
        TableCarrinho.getColumnModel().getColumn(0).setPreferredWidth(50);
        TableCarrinho.getColumnModel().getColumn(0).setResizable(false);
        TableCarrinho.getColumnModel().getColumn(1).setPreferredWidth(50);
        TableCarrinho.getColumnModel().getColumn(1).setResizable(false);
        TableCarrinho.getColumnModel().getColumn(2).setPreferredWidth(60);
        TableCarrinho.getColumnModel().getColumn(2).setResizable(false);
        TableCarrinho.getTableHeader().setReorderingAllowed(false);
        TableCarrinho.setAutoResizeMode(TableCarrinho.AUTO_RESIZE_OFF);
        TableCarrinho.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AdicionarCarrinho;
    private javax.swing.JButton CadastroFornecedor;
    private javax.swing.JButton CancelarCompra;
    private javax.swing.JComboBox CategoriaPES;
    private javax.swing.JButton Concluir;
    private javax.swing.JButton MostraPesquisa;
    private javax.swing.JButton Relacionar;
    private javax.swing.JButton RelacionarP_F;
    private javax.swing.JTable TabelaProduto;
    private javax.swing.JTable TableCarrinho;
    private javax.swing.JTextField acrescimo;
    private javax.swing.JButton alterarPreco;
    private javax.swing.JTextField codPES;
    private javax.swing.JTextField codProduto;
    private javax.swing.JTextField cor;
    private javax.swing.JTextField desconto;
    private javax.swing.JTextField descricao;
    private javax.swing.JTextField fornecedor1;
    private javax.swing.JComboBox fornecedorConfirma;
    private javax.swing.JComboBox fornecedorPES;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JButton limpar;
    private javax.swing.JTextField marca;
    private javax.swing.JLabel mostrar;
    private javax.swing.JTextField nome;
    private javax.swing.JTextField nomePES;
    private javax.swing.JTextField precoCompra;
    private javax.swing.JTextField quantidade;
    private javax.swing.JLabel total;
    private javax.swing.JTextField total1;
    private javax.swing.JButton totalB;
    // End of variables declaration//GEN-END:variables
}
