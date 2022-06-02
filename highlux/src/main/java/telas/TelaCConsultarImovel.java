package telas;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import DAO.ImovelDAO;
import java.awt.event.KeyEvent;
import javabeans.Imovel;
import javax.swing.JOptionPane;
//import javax.swing.table.TableRowSorter;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;
import validacao.validacaoBuyImovel;

public class TelaCConsultarImovel extends javax.swing.JFrame {

    public void Listar(){
        try {
            ImovelDAO dao = new ImovelDAO();
            List<Imovel> listaU = dao.listarImovel();
            DefaultTableModel modelo = (DefaultTableModel)tabela1.getModel();
            modelo.setNumRows(0);
            
            for(Imovel v : listaU){
                modelo.addRow(new Object[]{
                v.getIdimovel(),
                v.getLogradouro(),
                v.getNumero(),
                v.getComplemento(),
                v.getBairro(),
                v.getCidade(),
                v.getEstado() ,
                v.getCep(),
                v.getStatusToString(),
                v.getValor()
                });
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Erro ao buscar cidade!");
        }
    }
    public TelaCConsultarImovel() {
        initComponents();
        DefaultTableModel modelo = (DefaultTableModel)tabela1.getModel();
        tabela1.setRowSorter(new TableRowSorter(modelo));
        
        myInitComponents();
    }
    
    public void myInitComponents() {
        txtCon.setDocument(new JTextFieldLimit(45));
    }

        class JTextFieldLimit extends PlainDocument {

        private int limit;

        JTextFieldLimit(int limit) {
            super();
            this.limit = limit;
        }

        JTextFieldLimit(int limit, boolean upper) {
            super();
            this.limit = limit;
        }

        public void insertString(int offset, String str, AttributeSet attr) throws BadLocationException {
            if (str == null) {
                return;
            }

            if ((getLength() + str.length()) <= limit) {
                super.insertString(offset, str, attr);
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtCon = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 350));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        txtCon.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConActionPerformed(evt);
            }
        });
        txtCon.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtConKeyPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Consulta por cidade");

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Consulta de Imóveis");

        tabela1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Logradouro", "Número", "Complemento", "Bairro", "Cidade", "Estado", "CEP", "Status", "Valor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabela1.getTableHeader().setReorderingAllowed(false);
        tabela1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabela1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabela1);

        jButton1.setText("Enter");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Comprar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(260, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(290, 290, 290))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(267, 267, 267))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtCon, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addGap(216, 216, 216))))
            .addGroup(layout.createSequentialGroup()
                .addGap(319, 319, 319)
                .addComponent(jButton2)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(173, 173, 173)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                    .addGap(56, 56, 56)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtConActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        Listar();
    }//GEN-LAST:event_formWindowActivated

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String cidade = txtCon.getText();
        if (!cidade.isEmpty()){
            try {
                ImovelDAO dao = new ImovelDAO();
                List<Imovel> listaI = dao.listarEnderecoPorCid(cidade);
                DefaultTableModel modelo = (DefaultTableModel)tabela1.getModel();
                modelo.setNumRows(0);

                for(Imovel v : listaI){
                    modelo.addRow(new Object[]{
                    v.getIdimovel(),
                    v.getLogradouro(),
                    v.getNumero(),
                    v.getComplemento(),
                    v.getBairro(),
                    v.getCidade(),
                    v.getEstado() ,
                    v.getCep(),
                    v.getStatusToString(),
                    v.getValor()
                    });
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao buscar cidade!"); 
            }
        } else {
            JOptionPane.showMessageDialog(null, "Preencha a cidade e tente novamente!");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtConKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConKeyPressed
        char c = evt.getKeyChar();
        
        if(Character.isLetter(c)
                || evt.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE
                || evt.getExtendedKeyCode() == KeyEvent.VK_DELETE
                || evt.getExtendedKeyCode() == KeyEvent.VK_SPACE) {
            txtCon.setEditable(true);
        } else {
            txtCon.setEditable(false);
        }
    }//GEN-LAST:event_txtConKeyPressed

    int idimovel = 0;
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        validacaoBuyImovel validador = new validacaoBuyImovel();
        
        if(validador.valida(idimovel)){
            ImovelDAO dao = new ImovelDAO();
            if(dao.comprarImovel(idimovel)){
                JOptionPane.showMessageDialog(null, "Compra realizada com sucesso!");
                idimovel = 0;
            } else {
                JOptionPane.showMessageDialog(null, "Não foi possível comprar o imóvel");
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed
    
    private void tabela1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabela1MouseClicked
       idimovel = (int) tabela1.getValueAt(tabela1.getSelectedRow(), 0);
    }//GEN-LAST:event_tabela1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaCConsultarImovel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCConsultarImovel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCConsultarImovel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCConsultarImovel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCConsultarImovel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabela1;
    private javax.swing.JTextField txtCon;
    // End of variables declaration//GEN-END:variables
}
