package br.ulbra.view;

import br.ulbra.controller.UsuarioController;
import br.ulbra.model.Usuario;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class UsuarioView extends javax.swing.JFrame {

    public UsuarioView() {
        initComponents();
        controller = new UsuarioController();
        atualizarTabela();
    }

    private void limparCampos() {
        txtIdUsu.setText("");
        txtNomeUsu.setText("");
        txtLoginUsu.setText("");
        txtSenhaUsu.setText("");
        rdAtivo.setSelected(false);
        DefaultTableModel model = (DefaultTableModel) tblUsuario.getModel();
        model.setRowCount(0);  // apaga todas as linhas;
    }
    private UsuarioController controller;

    private void atualizarTabela() {
        try {
            DefaultTableModel modelTbl = (DefaultTableModel) tblUsuario.getModel();
            modelTbl.setRowCount(0);
            List<Usuario> lista = controller.listar();
            for (Usuario u : lista) {
                modelTbl.addRow(new Object[]{u.getId(), u.getNome(), u.getLogin(), u.isAtivo()});
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "erro ao listar:" + ex.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtIdUsu = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNomeUsu = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        rdAtivo = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUsuario = new javax.swing.JTable();
        btnSalvarUsu = new javax.swing.JButton();
        btnAlterarUsu = new javax.swing.JButton();
        btnExcluirUsu = new javax.swing.JButton();
        btnListarUsu = new javax.swing.JButton();
        btnLimparUsu = new javax.swing.JButton();
        txtSenhaUsu = new javax.swing.JTextField();
        txtLoginUsu = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Id");

        txtIdUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdUsuActionPerformed(evt);
            }
        });

        jLabel2.setText("Nome");

        jLabel3.setText("Login");

        jLabel4.setText("Senha");

        rdAtivo.setText("Ativo");

        tblUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Login", "Ativo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblUsuario);

        btnSalvarUsu.setText("SALVAR");
        btnSalvarUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarUsuActionPerformed(evt);
            }
        });

        btnAlterarUsu.setText("ALTERAR");
        btnAlterarUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarUsuActionPerformed(evt);
            }
        });

        btnExcluirUsu.setText("EXCLUIR");
        btnExcluirUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirUsuActionPerformed(evt);
            }
        });

        btnListarUsu.setText("LISTAR");
        btnListarUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarUsuActionPerformed(evt);
            }
        });

        btnLimparUsu.setText("LIMPAR");
        btnLimparUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparUsuActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Liberation Sans", 3, 24)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\aluno.saolucas\\Downloads\\casaUsu.png")); // NOI18N
        jLabel6.setText("USUÁRIO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSalvarUsu)
                        .addGap(18, 18, 18)
                        .addComponent(btnAlterarUsu)
                        .addGap(18, 18, 18)
                        .addComponent(btnExcluirUsu)
                        .addGap(18, 18, 18)
                        .addComponent(btnListarUsu)
                        .addGap(18, 18, 18)
                        .addComponent(btnLimparUsu))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtLoginUsu, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSenhaUsu, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtIdUsu, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNomeUsu, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(rdAtivo)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(95, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdUsu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(txtNomeUsu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtLoginUsu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtSenhaUsu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(rdAtivo)
                .addGap(17, 17, 17)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvarUsu)
                    .addComponent(btnAlterarUsu)
                    .addComponent(btnExcluirUsu)
                    .addComponent(btnListarUsu)
                    .addComponent(btnLimparUsu))
                .addGap(57, 57, 57))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdUsuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdUsuActionPerformed

    private void btnSalvarUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarUsuActionPerformed
        try {
            String nome = txtNomeUsu.getText().trim();
            String login = txtLoginUsu.getText().trim();
            String senha = txtSenhaUsu.getText().trim();
            boolean ativo = rdAtivo.isSelected();
            if (nome.isEmpty() || login.isEmpty() || senha.isEmpty()) {
                javax.swing.JOptionPane.showMessageDialog(this, "Nome, login e senha é obrigatório");
                return;
            }
            Usuario u = new Usuario(0, nome, login, senha, ativo);
            controller.salvar(u);
            javax.swing.JOptionPane.showMessageDialog(this, "Usuario salvo (ID=" + u.getId());
            atualizarTabela();
            limparCampos();
        } catch (Exception ex) {
            javax.swing.JOptionPane.showMessageDialog(this, "Erro ao salvar: " + ex.getMessage());

        }    }//GEN-LAST:event_btnSalvarUsuActionPerformed

    private void btnAlterarUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarUsuActionPerformed
        try {
            // Tenta obter o ID pelo campo; se vazio, tenta pela tabela
            Integer id = null;
            String idCampo = txtIdUsu.getText().trim();
            if (!idCampo.isEmpty()) {
                try {
                    id = Integer.parseInt(idCampo);
                } catch (NumberFormatException e) {
                    javax.swing.JOptionPane.showMessageDialog(this, "ID inválido no campo ID.");
                    return;
                }
            } else {
                int linha = tblUsuario.getSelectedRow();
                if (linha >= 0) {
                    try {
                        id = Integer.parseInt(tblUsuario.getValueAt(linha, 0).toString());
                        txtIdUsu.setText(String.valueOf(id)); // opcional: refletir no campo
                    } catch (NumberFormatException e) {
                        javax.swing.JOptionPane.showMessageDialog(this, "ID inválido na tabela.");
                        return;
                    }
                }
            }

            if (id == null || id <= 0) {
                javax.swing.JOptionPane.showMessageDialog(this, "Selecione um usuário na tabela ou informe um ID válido para alterar.");
                return;
            }

            String nome = txtNomeUsu.getText().trim();
            String login = txtLoginUsu.getText().trim();
            String senha = txtSenhaUsu.getText().trim();
            boolean ativo = rdAtivo.isSelected();

            if (nome.isEmpty() || login.isEmpty() || senha.isEmpty()) {
                javax.swing.JOptionPane.showMessageDialog(this, "Nome, Login e Senha são obrigatórios!");
                return;
            }

            Usuario u = new Usuario(id, nome, login, senha, ativo);
            controller.atualizar(u);

            javax.swing.JOptionPane.showMessageDialog(this, "Usuário atualizado com sucesso!");
            atualizarTabela();
            limparCampos();
        } catch (Exception ex) {
            javax.swing.JOptionPane.showMessageDialog(this, "Erro ao alterar usuário: " + ex.getMessage());
        }       
    }//GEN-LAST:event_btnAlterarUsuActionPerformed

    public void setBotoes(int op) {
        switch (op) {
            case 1:
                btnSalvarUsu.setEnabled(false);
                btnAlterarUsu.setEnabled(true);
                btnExcluirUsu.setEnabled(true);
                break;
            default:
                btnSalvarUsu.setEnabled(true);
                btnAlterarUsu.setEnabled(false);
                btnExcluirUsu.setEnabled(false);

        }
    }

    private void btnListarUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarUsuActionPerformed
     atualizarTabela();
    }//GEN-LAST:event_btnListarUsuActionPerformed

    private void btnExcluirUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirUsuActionPerformed
         int linhaSelecionada = tblUsuario.getSelectedRow();

        if (linhaSelecionada == -1) {
            javax.swing.JOptionPane.showMessageDialog(this,
                    "Selecione um usuário para excluir!");
            return;
        }

        int confirm = javax.swing.JOptionPane.showConfirmDialog(this,
                "Tem certeza que deseja excluir este usuário?",
                "Confirmação",
                javax.swing.JOptionPane.YES_NO_OPTION);

        if (confirm != javax.swing.JOptionPane.YES_OPTION) {
            return;
        }

        try {
            int id = Integer.parseInt(tblUsuario.getValueAt(linhaSelecionada, 0).toString());
            controller.remover(id); // Seu controller deve ter um método excluir(int id)
            javax.swing.JOptionPane.showMessageDialog(this, "Usuário excluído com sucesso!");

            atualizarTabela();
            limparCampos();
        } catch (Exception ex) {
            javax.swing.JOptionPane.showMessageDialog(this,
                    "Erro ao excluir usuário: " + ex.getMessage());
        }
    }//GEN-LAST:event_btnExcluirUsuActionPerformed

    private void btnLimparUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparUsuActionPerformed
        txtIdUsu.setText(null);
        txtNomeUsu.setText(null);
        txtLoginUsu.setText(null);
        txtSenhaUsu.setText(null);
        rdAtivo.setText(null);
    }//GEN-LAST:event_btnLimparUsuActionPerformed

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
            java.util.logging.Logger.getLogger(UsuarioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UsuarioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UsuarioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UsuarioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UsuarioView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterarUsu;
    private javax.swing.JButton btnExcluirUsu;
    private javax.swing.JButton btnLimparUsu;
    private javax.swing.JButton btnListarUsu;
    private javax.swing.JButton btnSalvarUsu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdAtivo;
    private javax.swing.JTable tblUsuario;
    private javax.swing.JTextField txtIdUsu;
    private javax.swing.JTextField txtLoginUsu;
    private javax.swing.JTextField txtNomeUsu;
    private javax.swing.JTextField txtSenhaUsu;
    // End of variables declaration//GEN-END:variables
}
