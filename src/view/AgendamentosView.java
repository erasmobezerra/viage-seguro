package view;

import dao.AgendamentosDAO;
import javax.swing.JOptionPane;
import model.Agendamentos;
import table.AgendamentosTableModel;


public class AgendamentosView extends javax.swing.JFrame {

    Agendamentos agendamentos = new Agendamentos();
    AgendamentosDAO agendamentosDAO = new AgendamentosDAO();
    

    public AgendamentosView() {
        initComponents();
        setLocationRelativeTo(null);
        tbAgendamentos.setModel(new AgendamentosTableModel(new AgendamentosDAO().listarTodos()));
        btExcluir.setEnabled(false);
    }
    
    public void limparCampo() {
        tbAgendamentos.setModel(new AgendamentosTableModel(new AgendamentosDAO().listarTodos()));
        tfCodigo.setText("");
        tfNome.setText("");
        tfEmail.setText("");
        tfServico.setText("");
        tfValor.setText("");
        tfDataIda.setText("");
        tfDataRetorno.setText("");
        tfObservacao.setText("");
        tfPesquisarNome.setText(""); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        JLabel13 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfCodigo = new javax.swing.JTextField();
        tfObservacao = new javax.swing.JTextField();
        tfValor = new javax.swing.JTextField();
        btSalvar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbAgendamentos = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        tfPesquisarNome = new javax.swing.JTextField();
        tfNome = new javax.swing.JTextField();
        tfEmail = new javax.swing.JTextField();
        tfServico = new javax.swing.JTextField();
        tfDataIda = new javax.swing.JTextField();
        tfDataRetorno = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Viage Seguro - agendamentos");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setText("Código:");

        jLabel10.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel10.setText("Nome:");

        jLabel9.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel9.setText("Data de retorno:");

        JLabel13.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        JLabel13.setText("Data de ída:");

        jLabel11.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel11.setText("Email:");

        jLabel12.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel12.setText("Serviço:");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("Observação:");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setText("Valor:");

        tfCodigo.setEditable(false);
        tfCodigo.setBackground(new java.awt.Color(255, 102, 255));

        tfObservacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfObservacaoActionPerformed(evt);
            }
        });

        btSalvar.setText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        btExcluir.setText("Excluir");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));

        tbAgendamentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tbAgendamentos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbAgendamentosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbAgendamentos);

        jLabel4.setText("Pesquisar (Nome):");

        tfPesquisarNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfPesquisarNomeKeyPressed(evt);
            }
        });

        tfNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNomeActionPerformed(evt);
            }
        });

        tfEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfEmailActionPerformed(evt);
            }
        });

        tfServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfServicoActionPerformed(evt);
            }
        });

        tfDataIda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDataIdaActionPerformed(evt);
            }
        });

        tfDataRetorno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDataRetornoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfPesquisarNome)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 897, Short.MAX_VALUE)
                            .addComponent(tfEmail)
                            .addComponent(tfNome)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel12)
                            .addComponent(JLabel13)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfObservacao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 897, Short.MAX_VALUE)
                            .addComponent(tfValor, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tfDataIda, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tfDataRetorno, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tfServico)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 1006, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfObservacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfDataIda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLabel13))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfDataRetorno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btLimpar)
                    .addComponent(btSalvar)
                    .addComponent(btExcluir))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfPesquisarNome, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getAccessibleContext().setAccessibleName("agendamentos");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfObservacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfObservacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfObservacaoActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        if (tfObservacao.getText().equals("") || tfValor.getText().equals("") || tfNome.getText().equals("")
                || tfEmail.getText().equals("") || tfEmail.getText().equals("") || tfServico.getText().equals("")
                || tfDataIda.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Há campos em branco! Preencha todos.", "Agendamentos - Aviso", JOptionPane.WARNING_MESSAGE);
            } else {
            
            if (tfCodigo.getText().equals("")){
                agendamentos.setNome_cliente(tfNome.getText());
                agendamentos.setEmail_cliente(tfEmail.getText());
                agendamentos.setDescricao_servico(tfServico.getText());
                agendamentos.setValor(Double.parseDouble(tfValor.getText()));
                agendamentos.setData_ida(tfDataIda.getText());
                agendamentos.setData_retorno(tfDataRetorno.getText());
                agendamentos.setObservacao(tfObservacao.getText());
                agendamentosDAO.inserir(agendamentos);
            } else {
                agendamentos.setNome_cliente(tfNome.getText());
                agendamentos.setEmail_cliente(tfEmail.getText());
                agendamentos.setDescricao_servico(tfServico.getText());
                agendamentos.setValor(Double.parseDouble(tfValor.getText()));
                agendamentos.setData_ida(tfDataIda.getText());
                agendamentos.setData_retorno(tfDataRetorno.getText());
                agendamentos.setObservacao(tfObservacao.getText());   
                
                agendamentos.setCodigo_agendamento(Integer.parseInt(tfCodigo.getText()));
                agendamentosDAO.alterar(agendamentos);
            }             
        }        
        limparCampo();
        btExcluir.setEnabled(false);
    }//GEN-LAST:event_btSalvarActionPerformed

    private void tbAgendamentosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbAgendamentosMouseClicked
        tfCodigo.setText(tbAgendamentos.getValueAt(tbAgendamentos.getSelectedRow(), AgendamentosTableModel.COL_CODIGO_AGENDAMENTO).toString());
        tfNome.setText(tbAgendamentos.getValueAt(tbAgendamentos.getSelectedRow(), AgendamentosTableModel.COL_NOME_CLIENTE).toString());
        tfEmail.setText(tbAgendamentos.getValueAt(tbAgendamentos.getSelectedRow(), AgendamentosTableModel.COL_EMAIL_CLIENTE).toString());
        tfServico.setText(tbAgendamentos.getValueAt(tbAgendamentos.getSelectedRow(), AgendamentosTableModel.COL_DESCRICAO_SERVICO).toString());
        tfValor.setText(tbAgendamentos.getValueAt(tbAgendamentos.getSelectedRow(), AgendamentosTableModel.COL_VALOR).toString());
        tfDataIda.setText(tbAgendamentos.getValueAt(tbAgendamentos.getSelectedRow(), AgendamentosTableModel.COL_DATA_IDA).toString());
        tfDataRetorno.setText(tbAgendamentos.getValueAt(tbAgendamentos.getSelectedRow(), AgendamentosTableModel.COL_DATA_RETORNO).toString());
        tfObservacao.setText(tbAgendamentos.getValueAt(tbAgendamentos.getSelectedRow(), AgendamentosTableModel.COL_OBSERVACAO).toString());
        btExcluir.setEnabled(true);
    }//GEN-LAST:event_tbAgendamentosMouseClicked

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limparCampo();
    }//GEN-LAST:event_btLimparActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        int escolha = JOptionPane.showConfirmDialog(null, "Quer excluir?", "Produto - Excluir", JOptionPane.YES_NO_OPTION);
        if (escolha == 0) {
            int codigo = Integer.parseInt(tfCodigo.getText());
            agendamentosDAO.excluir(codigo);
            limparCampo();
            btExcluir.setEnabled(false);
        }
      
        
       
    }//GEN-LAST:event_btExcluirActionPerformed

    private void tfPesquisarNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfPesquisarNomeKeyPressed
        String pesquisa = tfPesquisarNome.getText();
        tbAgendamentos.setModel(new AgendamentosTableModel(new AgendamentosDAO().listarTodosDescricao(pesquisa)));       
    }//GEN-LAST:event_tfPesquisarNomeKeyPressed

    private void tfNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNomeActionPerformed

    private void tfEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfEmailActionPerformed

    private void tfServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfServicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfServicoActionPerformed

    private void tfDataIdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDataIdaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDataIdaActionPerformed

    private void tfDataRetornoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDataRetornoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDataRetornoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLabel13;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbAgendamentos;
    private javax.swing.JTextField tfCodigo;
    private javax.swing.JTextField tfDataIda;
    private javax.swing.JTextField tfDataRetorno;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfObservacao;
    private javax.swing.JTextField tfPesquisarNome;
    private javax.swing.JTextField tfServico;
    private javax.swing.JTextField tfValor;
    // End of variables declaration//GEN-END:variables
}
