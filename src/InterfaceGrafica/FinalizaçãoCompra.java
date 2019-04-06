
package InterfaceGrafica;
import BEANS.ProdutoBEAN;
import DAO.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.SimpleTimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class FinalizaçãoCompra extends javax.swing.JFrame {
    
    Conexao conecta = new Conexao();
    ArrayList<ProdutoBEAN> P = new ArrayList<ProdutoBEAN>();
    int codCompra = 0;
    String d;
    int a;
    public FinalizaçãoCompra() {
        initComponents();
        conecta.conexao();
        PrecoTotal();        
        }
    private void PrecoTotal(){
            ArrayList<Double> preco = new ArrayList<Double>();
            double prec=0;
            try {
                PreparedStatement pst1 = conecta.conn.prepareStatement("Select Max(Cod1) from Compra");
                    ResultSet rs1 = pst1.executeQuery();
                    while(rs1.next()){
                                   codCompra = rs1.getInt("Max(Cod1)");
                               }
                
                PreparedStatement pst4 = conecta.conn.prepareStatement("select precototal from Carrinho where codCompra=?");
                pst4.setInt(1,codCompra);
                ResultSet rs4 = pst4.executeQuery();
                    while(rs4.next()) {
                       prec = prec + (rs4.getDouble("precototal")); 
                    }
                    precoTotal.setText((new Double(prec).toString()));
                
               Calendar c5 = Calendar.getInstance();
		Date data5 = c5.getTime();
		DateFormat f = DateFormat.getDateInstance();

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Data formatada: "+ sdf.format(data5));
                d = sdf.format(data5);
                dataText.setText(d);
            } catch (SQLException ex) {
                Logger.getLogger(FinalizaçãoCompra.class.getName()).log(Level.SEVERE, null, ex);
            } 
            }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        precoTotal = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        desconto = new javax.swing.JTextField();
        Ok = new javax.swing.JButton();
        precoFinal = new javax.swing.JTextField();
        dataText = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        acrescimo = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        Forma = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Preço Final");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Taxa:");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Finalizar Compra");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Data:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Preço Total:");

        precoTotal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        precoTotal.setToolTipText("");
        precoTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precoTotalActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Forma:");

        desconto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        desconto.setText("0");
        desconto.setToolTipText("Porcentagem");
        desconto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descontoActionPerformed(evt);
            }
        });

        Ok.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Ok.setText("OK");
        Ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OkActionPerformed(evt);
            }
        });

        precoFinal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        precoFinal.setToolTipText("Por Unidade");

        dataText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        dataText.setToolTipText("");
        dataText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataTextActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Desconto:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Acréscimo:");

        acrescimo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        acrescimo.setText("0");
        acrescimo.setToolTipText("Porcentagem");
        acrescimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acrescimoActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Preço:");

        Forma.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Forma.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Dinheiro", "Cartão" }));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ícones/shopcartdown.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(92, 92, 92))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(dataText, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(39, 39, 39)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(precoTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                                    .addComponent(jLabel2)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Forma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel10))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel6)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(desconto, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(acrescimo, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel5))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(jLabel11)))
                        .addGap(50, 50, 50))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(Ok)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(precoFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(acrescimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11))
                                .addGap(18, 18, 18)
                                .addComponent(precoFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14))
                            .addComponent(Ok)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(precoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dataText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(desconto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Forma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void precoTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precoTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_precoTotalActionPerformed

    private void descontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descontoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_descontoActionPerformed

    private void OkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OkActionPerformed
    ArrayList<Integer>quantVelha = new ArrayList<Integer>();
    ArrayList<Integer>QuantCarrinho = new ArrayList<Integer>();         
    ArrayList<Integer>codP = new ArrayList<Integer>();
                try {
                    PreparedStatement pst1 = conecta.conn.prepareStatement("Select Max(Cod1) from Compra");
                    ResultSet rs1 = pst1.executeQuery();
                    while(rs1.next()){
                                   codCompra = rs1.getInt("Max(Cod1)");
                               }   
                    
                    PreparedStatement pst2 =  conecta.conn.prepareStatement("select codP, quant from carrinho where CodCompra=?");
                        pst2.setInt(1,codCompra);
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
                        int quantFinal = quant + QuantCarrinho.get(i);
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

                        PreparedStatement pst5 =  conecta.conn.prepareStatement("update Compra set Preco_final=?,data=?, taxa=?, forma=?,Parcela_Quant=? where Cod1=?");    
                        if (acres == 0 && desc!=0){
                                String t = ((new Double(desc).toString()));
                                pst5.setString(3,"-" + t);
                                double a = (preco * desc);
                                prec =  (preco - a) ;
                            }else if(desc==0 && acres!=0){
                                String t = ((new Double(acres).toString()));
                                pst5.setString(3,"+" + t);
                                double a = (preco * acres);
                                prec = preco + a;
                            }else{
                                double taxa = 0;
                                String t = ((new Double(taxa).toString()));
                                prec = preco;
                                pst5.setString(3,t);
                            }
                        int op = Forma.getSelectedIndex();
                        String forma=null;
                        if(op==0){
                            forma="Dinheiro";
                            precoFinal.setText((new Double(prec).toString()));
                        }else{
                            int aux = Integer.parseInt(JOptionPane.showInputDialog("Deseja Parcelar? 1-Sim/2-Não"));
                            if (aux==1){
                                a = Integer.parseInt(JOptionPane.showInputDialog("Quantas Vezes?"));
                            }
                            forma="Cartão";
                            double var = Double.parseDouble(precoTotal.getText());
                            precoFinal.setText((new Double(var).toString()));
                        }
                        
                        precoFinal.setText(new Double(prec).toString());
                        pst5.setDouble(1,Double.parseDouble(precoFinal.getText()));
                        pst5.setString(2,d);        
                        pst5.setString(4,forma);
                        pst5.setInt(5,a);
                        pst5.setInt(6,codCompra);
                        pst5.executeUpdate();
                        
                        PreparedStatement pst6= conecta.conn.prepareStatement("insert into Compra(preco_final,data,taxa,forma,Parcela_Quant)VALUES(0,null,0,null,0)");
                        pst6.execute();
                        JOptionPane.showMessageDialog(null,"Alterado com sucesso");
                                   
                } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null,"Erro ao Alterar" + ex);
                    }
    }//GEN-LAST:event_OkActionPerformed

    private void dataTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dataTextActionPerformed

    private void acrescimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acrescimoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_acrescimoActionPerformed
    
/**/
    public static void main(String args[]) throws ParseException {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FinalizaçãoCompra().setVisible(true);
                
            }
            
        });
    }    
        

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox Forma;
    private javax.swing.JButton Ok;
    private javax.swing.JTextField acrescimo;
    private javax.swing.JTextField dataText;
    private javax.swing.JTextField desconto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField precoFinal;
    private javax.swing.JTextField precoTotal;
    // End of variables declaration//GEN-END:variables
}
