
package telas;

import DAO.ImovelDAO;
import java.awt.event.KeyEvent;
import java.util.List;
import javabeans.Imovel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;
import validacao.validacaoEditImovel;


public class TelaGEditarImovel extends javax.swing.JFrame {
    
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
                v.getStatus(),
                v.getValor()
                });
            }
        } catch (Exception e) {
        }
    }
    /**
     * Creates new form TelaGEditaImovel
     */
    public TelaGEditarImovel() {
        initComponents();
        
        myInitComponents();
    }
    
    public void myInitComponents() {
        txtLog.setDocument(new JTextFieldLimit(45));
        txtNum.setDocument(new JTextFieldLimit(4));
        txtBairro.setDocument(new JTextFieldLimit(45));
        txtCid.setDocument(new JTextFieldLimit(30));
        txtEst.setDocument(new JTextFieldLimit(25));
        txtCep.setDocument(new JTextFieldLimit(8));
        txtComplemento.setDocument(new JTextFieldLimit(45));
        txtVal.setDocument(new JTextFieldLimit(45));
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabelLog = new javax.swing.JLabel();
        txtLog = new javax.swing.JTextField();
        jLabelNum = new javax.swing.JLabel();
        txtNum = new javax.swing.JTextField();
        jLabelBairro = new javax.swing.JLabel();
        txtBairro = new javax.swing.JTextField();
        jLabelCid = new javax.swing.JLabel();
        txtCep = new javax.swing.JTextField();
        jLabelEst = new javax.swing.JLabel();
        txtEst = new javax.swing.JTextField();
        jLabelComp = new javax.swing.JLabel();
        txtComplemento = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtVal = new javax.swing.JTextField();
        jLabelInfo = new javax.swing.JLabel();
        jLabelStatus = new javax.swing.JLabel();
        jLabelValor = new javax.swing.JLabel();
        jButtonEditar = new javax.swing.JButton();
        txtCod = new javax.swing.JTextField();
        jLabelCod = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabela1 = new javax.swing.JTable();
        btnD = new javax.swing.JRadioButton();
        btnND = new javax.swing.JRadioButton();
        jLabelCep = new javax.swing.JLabel();
        txtCid = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabelLog.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabelLog.setText("Logradouro: ");

        txtLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLogActionPerformed(evt);
            }
        });
        txtLog.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtLogKeyPressed(evt);
            }
        });

        jLabelNum.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabelNum.setText("Número: ");

        txtNum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNumKeyPressed(evt);
            }
        });

        jLabelBairro.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabelBairro.setText("Bairro: ");

        txtBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBairroActionPerformed(evt);
            }
        });
        txtBairro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBairroKeyPressed(evt);
            }
        });

        jLabelCid.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabelCid.setText("Cidade: ");

        txtCep.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCepKeyPressed(evt);
            }
        });

        jLabelEst.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabelEst.setText("Estado: ");

        txtEst.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEstKeyPressed(evt);
            }
        });

        jLabelComp.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabelComp.setText("Complemento: ");

        txtComplemento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtComplementoActionPerformed(evt);
            }
        });
        txtComplemento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtComplementoKeyPressed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel9.setText("Endereço");

        txtVal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValActionPerformed(evt);
            }
        });
        txtVal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtValKeyPressed(evt);
            }
        });

        jLabelInfo.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabelInfo.setText("Outras informações");

        jLabelStatus.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabelStatus.setText("Status: ");

        jLabelValor.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabelValor.setText("Valor: ");

        jButtonEditar.setText("Editar");
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });

        txtCod.setEditable(false);
        txtCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodActionPerformed(evt);
            }
        });

        jLabelCod.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabelCod.setText("Código: ");

        tabela1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Logradouro", "Numero", "Complemento", "Bairro", "Cidade", "Estado", "CEP", "Status", "Valor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabela1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabela1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabela1);

        btnD.setText("Disponível");
        btnD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDActionPerformed(evt);
            }
        });

        btnND.setText("Não Disponivel");
        btnND.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNDActionPerformed(evt);
            }
        });

        jLabelCep.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabelCep.setText("CEP: ");

        txtCid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCidKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(294, 294, 294)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelValor)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(txtVal, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(120, 120, 120)
                                .addComponent(jButtonEditar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelStatus)
                                .addGap(18, 18, 18)
                                .addComponent(btnD)
                                .addGap(18, 18, 18)
                                .addComponent(btnND))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(251, 251, 251)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelEst)
                                .addGap(18, 18, 18)
                                .addComponent(txtEst, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabelBairro)
                                            .addComponent(jLabelComp)
                                            .addComponent(jLabelCod)
                                            .addComponent(jLabelLog)
                                            .addComponent(jLabelNum)
                                            .addComponent(jLabelCep))
                                        .addGap(18, 18, 18))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabelCid)
                                        .addGap(18, 18, 18)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCid, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNum, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtLog, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(373, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(170, 170, 170)
                            .addComponent(jLabel9))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(140, 140, 140)
                            .addComponent(jLabelInfo))
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE))
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 903, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCod, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelLog))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNum))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelComp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabelBairro))
                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCep))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCid))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEst))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnD)
                    .addComponent(btnND)
                    .addComponent(jLabelStatus))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelValor)
                    .addComponent(txtVal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jButtonEditar)))
                .addGap(135, 135, 135))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel9)
                    .addGap(274, 274, 274)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabelInfo)
                    .addGap(148, 148, 148)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLogActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLogActionPerformed

    private void txtComplementoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtComplementoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtComplementoActionPerformed

    private void txtValActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        int codigo = Integer.parseInt(txtCod.getText());
        String logradouro = txtLog.getText();
        String numero = txtNum.getText();
        String bairro = txtBairro.getText();
        String cidade = txtCid.getText();
        String estado = txtEst.getText();
        String cep = txtCep.getText();
        String complemento = txtComplemento.getText();
        String status = "";
        if(btnD.isSelected()){
            status = "1";   
        }
        if(btnND.isSelected()){
            status = "2";   
        }
        String valor = txtVal.getText();
        
        validacaoEditImovel validador = new validacaoEditImovel();
        if(validador.valida(
                logradouro,
                numero,
                bairro,
                cidade,
                estado,
                cep,
                complemento,
                status,
                valor
            )){
        }
        
        try{
            Imovel obj = new Imovel();

            obj.setIdimovel(codigo);
            obj.setLogradouro(logradouro);
            obj.setNumero(numero);
            obj.setComplemento(complemento);
            obj.setBairro(bairro);
            obj.setCidade(cidade);
            obj.setEstado(estado);
            obj.setStatus(status);   
            obj.setCep(cep);
            obj.setValor(valor);
            
            ImovelDAO dao = new ImovelDAO();
            if(dao.editarImovel(obj)){
                JOptionPane.showMessageDialog(null, "Edição realizada com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Não foi possível editar o imóvel");
            }
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao editar o imóvel" + e);
        }
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void txtCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodActionPerformed
        
    }//GEN-LAST:event_txtCodActionPerformed

    private void tabela1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabela1MouseClicked
        btnD.setSelected(false);
        btnND.setSelected(false);
        txtCod.setText(tabela1.getValueAt(tabela1.getSelectedRow(), 0).toString());
        txtLog.setText(tabela1.getValueAt(tabela1.getSelectedRow(), 1).toString());
        txtNum.setText(tabela1.getValueAt(tabela1.getSelectedRow(), 2).toString());
        txtComplemento.setText(tabela1.getValueAt(tabela1.getSelectedRow(), 3).toString());
        txtBairro.setText(tabela1.getValueAt(tabela1.getSelectedRow(), 4).toString());
        txtCid.setText(tabela1.getValueAt(tabela1.getSelectedRow(), 5).toString());
        txtEst.setText(tabela1.getValueAt(tabela1.getSelectedRow(), 6).toString());
        txtCep.setText(tabela1.getValueAt(tabela1.getSelectedRow(), 7).toString());
        String status = tabela1.getValueAt(tabela1.getSelectedRow(), 8).toString();
        if (status.equals("Disponivel")) {
            btnD.setSelected(true);
        } else if (status.equals("Não disponivel")) {
            btnND.setSelected(true);
        }
        //btnD.setText(tabela1.getValueAt(tabela1.getSelectedRow(), 7).toString());
        txtVal.setText(tabela1.getValueAt(tabela1.getSelectedRow(), 9).toString());
    }//GEN-LAST:event_tabela1MouseClicked

    private void btnDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDActionPerformed

    private void btnNDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNDActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        Listar();
    }//GEN-LAST:event_formWindowActivated

    private void txtBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBairroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBairroActionPerformed

    private void txtLogKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLogKeyPressed
        char c = evt.getKeyChar();

        if(Character.isLetter(c)
                || evt.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE
                || evt.getExtendedKeyCode() == KeyEvent.VK_DELETE
                || evt.getExtendedKeyCode() == KeyEvent.VK_SPACE) {
            txtLog.setEditable(true);
        } else {
            txtLog.setEditable(false);
            
        }
    }//GEN-LAST:event_txtLogKeyPressed

    private void txtNumKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumKeyPressed
        char c = evt.getKeyChar();
        
        if(Character.isLetter(c)
                || evt.getExtendedKeyCode() == KeyEvent.VK_SPACE) {
            txtNum.setEditable(false);
        } else {
            txtNum.setEditable(true);
        }
    }//GEN-LAST:event_txtNumKeyPressed

    private void txtComplementoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtComplementoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtComplementoKeyPressed

    private void txtBairroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBairroKeyPressed
        char c = evt.getKeyChar();
        
        if(Character.isLetter(c)  
                || evt.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE
                || evt.getExtendedKeyCode() == KeyEvent.VK_DELETE
                || evt.getExtendedKeyCode() == KeyEvent.VK_SPACE) {
            txtBairro.setEditable(true);
        } else {
            txtBairro.setEditable(false);
        }
    }//GEN-LAST:event_txtBairroKeyPressed

    private void txtCepKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCepKeyPressed
        char c = evt.getKeyChar();
            
        if(Character.isLetter(c)
                || evt.getExtendedKeyCode() == KeyEvent.VK_SPACE) {
            txtCep.setEditable(false);
        } else {
            txtCep.setEditable(true);
        }
    }//GEN-LAST:event_txtCepKeyPressed

    private void txtCidKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCidKeyPressed
        char c = evt.getKeyChar();
               
        if(Character.isLetter(c)
                || evt.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE
                || evt.getExtendedKeyCode() == KeyEvent.VK_DELETE
                || evt.getExtendedKeyCode() == KeyEvent.VK_SPACE) {
            txtCid.setEditable(true);
        } else {
            txtCid.setEditable(false);
        }
    }//GEN-LAST:event_txtCidKeyPressed

    private void txtEstKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEstKeyPressed
        char c = evt.getKeyChar();
        
        if(Character.isLetter(c)
                || evt.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE
                || evt.getExtendedKeyCode() == KeyEvent.VK_DELETE
                || evt.getExtendedKeyCode() == KeyEvent.VK_SPACE) {
            txtEst.setEditable(true);
        } else {
            txtEst.setEditable(false);
        }
    }//GEN-LAST:event_txtEstKeyPressed

    private void txtValKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValKeyPressed
        char c = evt.getKeyChar();
        
        if(Character.isLetter(c)
                || evt.getExtendedKeyCode() == KeyEvent.VK_SPACE) {
            txtVal.setEditable(false);
        } else {
            txtVal.setEditable(true);
        }
    }//GEN-LAST:event_txtValKeyPressed

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
            java.util.logging.Logger.getLogger(TelaGEditarImovel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaGEditarImovel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaGEditarImovel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaGEditarImovel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaGEditarImovel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton btnD;
    private javax.swing.JRadioButton btnND;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelBairro;
    private javax.swing.JLabel jLabelCep;
    private javax.swing.JLabel jLabelCid;
    private javax.swing.JLabel jLabelCod;
    private javax.swing.JLabel jLabelComp;
    private javax.swing.JLabel jLabelEst;
    private javax.swing.JLabel jLabelInfo;
    private javax.swing.JLabel jLabelLog;
    private javax.swing.JLabel jLabelNum;
    private javax.swing.JLabel jLabelStatus;
    private javax.swing.JLabel jLabelValor;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tabela1;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtCep;
    private javax.swing.JTextField txtCid;
    private javax.swing.JTextField txtCod;
    private javax.swing.JTextField txtComplemento;
    private javax.swing.JTextField txtEst;
    private javax.swing.JTextField txtLog;
    private javax.swing.JTextField txtNum;
    private javax.swing.JTextField txtVal;
    // End of variables declaration//GEN-END:variables
}
