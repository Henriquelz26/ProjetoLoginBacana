/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.CadastroUsuariosController;
import Model.CadastroUsuarioModel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;
import View.TelaOpCadastroUsuarios;
import javax.swing.JFrame;

/**
 *
 * @author Aluno
 */
public class TelaAtualizacaoUsuario extends javax.swing.JFrame {
//    private void TelaOpCadastroUsuarios telaOpCadastroUsuarios;

    public TelaAtualizacaoUsuario(/*TelaOpCadastroUsuarios telaOpCadastroUsuarios*/) {
//         this.telaOpCadastroUsuarios = telaOpCadastroUsuarios;
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        initComponents();
        txtIdUser.setEnabled(false);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {

            }
        });

    }

    ;

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBase = new javax.swing.JPanel();
        pnlTop = new javax.swing.JPanel();
        pnlLogo = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        pnlTitulo = new javax.swing.JPanel();
        lblTitutlo = new javax.swing.JLabel();
        pnlLeft = new javax.swing.JPanel();
        pnlBottom = new javax.swing.JPanel();
        pnlButtons = new javax.swing.JPanel();
        btnResetSenha = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        pnlRight = new javax.swing.JPanel();
        pnlCenter = new javax.swing.JPanel();
        pnlDadosUsuario = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtIdUser = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        txtNomeCompleto = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblLogin = new javax.swing.JLabel();
        txtLogin = new javax.swing.JTextField();
        lblPerfil = new javax.swing.JLabel();
        txtPerfilUser = new javax.swing.JPanel();
        rbtnAdmin = new javax.swing.JRadioButton();
        rbtnUser = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        pnlBase.setLayout(new java.awt.BorderLayout());

        pnlTop.setPreferredSize(new java.awt.Dimension(550, 60));

        lblLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8-usu�rio-40.png"))); // NOI18N

        javax.swing.GroupLayout pnlLogoLayout = new javax.swing.GroupLayout(pnlLogo);
        pnlLogo.setLayout(pnlLogoLayout);
        pnlLogoLayout.setHorizontalGroup(
            pnlLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLogoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlLogoLayout.setVerticalGroup(
            pnlLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLogoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        lblTitutlo.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lblTitutlo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitutlo.setText("Atualizar Dados de Usu�rio");

        javax.swing.GroupLayout pnlTituloLayout = new javax.swing.GroupLayout(pnlTitulo);
        pnlTitulo.setLayout(pnlTituloLayout);
        pnlTituloLayout.setHorizontalGroup(
            pnlTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitutlo, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
        );
        pnlTituloLayout.setVerticalGroup(
            pnlTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitutlo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnlTopLayout = new javax.swing.GroupLayout(pnlTop);
        pnlTop.setLayout(pnlTopLayout);
        pnlTopLayout.setHorizontalGroup(
            pnlTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTopLayout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(pnlLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );
        pnlTopLayout.setVerticalGroup(
            pnlTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTopLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlBase.add(pnlTop, java.awt.BorderLayout.PAGE_START);

        pnlLeft.setPreferredSize(new java.awt.Dimension(15, 103));

        javax.swing.GroupLayout pnlLeftLayout = new javax.swing.GroupLayout(pnlLeft);
        pnlLeft.setLayout(pnlLeftLayout);
        pnlLeftLayout.setHorizontalGroup(
            pnlLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 15, Short.MAX_VALUE)
        );
        pnlLeftLayout.setVerticalGroup(
            pnlLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 347, Short.MAX_VALUE)
        );

        pnlBase.add(pnlLeft, java.awt.BorderLayout.LINE_START);

        pnlBottom.setPreferredSize(new java.awt.Dimension(550, 40));

        pnlButtons.setLayout(new java.awt.GridLayout(1, 2, 5, 5));

        btnResetSenha.setText("Reset Senha");
        btnResetSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetSenhaActionPerformed(evt);
            }
        });
        pnlButtons.add(btnResetSenha);

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        pnlButtons.add(btnCancelar);

        btnAtualizar.setText("Atualizar");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });
        pnlButtons.add(btnAtualizar);

        javax.swing.GroupLayout pnlBottomLayout = new javax.swing.GroupLayout(pnlBottom);
        pnlBottom.setLayout(pnlBottomLayout);
        pnlBottomLayout.setHorizontalGroup(
            pnlBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBottomLayout.createSequentialGroup()
                .addContainerGap(353, Short.MAX_VALUE)
                .addComponent(pnlButtons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        pnlBottomLayout.setVerticalGroup(
            pnlBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBottomLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlButtons, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlBase.add(pnlBottom, java.awt.BorderLayout.PAGE_END);

        pnlRight.setPreferredSize(new java.awt.Dimension(15, 103));

        javax.swing.GroupLayout pnlRightLayout = new javax.swing.GroupLayout(pnlRight);
        pnlRight.setLayout(pnlRightLayout);
        pnlRightLayout.setHorizontalGroup(
            pnlRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 15, Short.MAX_VALUE)
        );
        pnlRightLayout.setVerticalGroup(
            pnlRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 347, Short.MAX_VALUE)
        );

        pnlBase.add(pnlRight, java.awt.BorderLayout.LINE_END);

        pnlCenter.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados do Usu�rio"));

        pnlDadosUsuario.setLayout(new java.awt.GridLayout(10, 1, 5, 5));

        jLabel1.setText("ID:");
        pnlDadosUsuario.add(jLabel1);
        pnlDadosUsuario.add(txtIdUser);

        lblNome.setText("Nome Completo:");
        lblNome.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        pnlDadosUsuario.add(lblNome);
        pnlDadosUsuario.add(txtNomeCompleto);

        lblEmail.setText("Email:");
        lblEmail.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        pnlDadosUsuario.add(lblEmail);
        pnlDadosUsuario.add(txtEmail);

        lblLogin.setText("Login:");
        lblLogin.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        pnlDadosUsuario.add(lblLogin);
        pnlDadosUsuario.add(txtLogin);

        lblPerfil.setText("Selecione o Perfil de Usu�rio:");
        pnlDadosUsuario.add(lblPerfil);

        txtPerfilUser.setLayout(new java.awt.GridLayout(1, 2, 5, 5));

        rbtnAdmin.setText("ADMIN");
        rbtnAdmin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rbtnAdmin.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbtnAdminItemStateChanged(evt);
            }
        });
        txtPerfilUser.add(rbtnAdmin);

        rbtnUser.setText("USER");
        rbtnUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rbtnUser.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbtnUserItemStateChanged(evt);
            }
        });
        txtPerfilUser.add(rbtnUser);

        pnlDadosUsuario.add(txtPerfilUser);

        javax.swing.GroupLayout pnlCenterLayout = new javax.swing.GroupLayout(pnlCenter);
        pnlCenter.setLayout(pnlCenterLayout);
        pnlCenterLayout.setHorizontalGroup(
            pnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCenterLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlDadosUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlCenterLayout.setVerticalGroup(
            pnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCenterLayout.createSequentialGroup()
                .addComponent(pnlDadosUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlBase.add(pnlCenter, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        // Recuperar os dados modificados dentro dos campos de texto
        String id_user = txtIdUser.getText();
        String username = txtNomeCompleto.getText();
        String email = txtEmail.getText();
        String login = txtLogin.getText();
        String perfil = null;
        if (rbtnAdmin.isSelected()) {
            perfil = "admin";
        } else {
            perfil = "colaborador";
        }

        //Repassas essas informa��es para o controller
        CadastroUsuariosController op = new CadastroUsuariosController();
        op.atualizarUsuariosController(id_user, username, email, login, perfil);

        //Apagar os dados 
        txtIdUser.setText(null);
        txtNomeCompleto.setText(null);
        txtEmail.setText(null);
        txtLogin.setText(null);
        ;
        //Fecha a janela
        this.dispose();
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void rbtnAdminItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbtnAdminItemStateChanged
        rbtnUser.setSelected(false);
    }//GEN-LAST:event_rbtnAdminItemStateChanged

    private void rbtnUserItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbtnUserItemStateChanged
        rbtnAdmin.setSelected(false);
    }//GEN-LAST:event_rbtnUserItemStateChanged

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        //Limpar Campos
        txtNomeCompleto.setText(null);
        txtEmail.setText(null);
        txtLogin.setText(null);
        //Fecha a tela
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnResetSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetSenhaActionPerformed
        String password = "123456";
        String id_user = txtIdUser.getText().toString();
        CadastroUsuariosController op = new CadastroUsuariosController();
        op.resetSenhaBDController(id_user, password);
        JOptionPane.showMessageDialog(null, "Senha resetada com sucesso!");

    }//GEN-LAST:event_btnResetSenhaActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaAtualizacaoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAtualizacaoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAtualizacaoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAtualizacaoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAtualizacaoUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnResetSenha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblPerfil;
    private javax.swing.JLabel lblTitutlo;
    private javax.swing.JPanel pnlBase;
    private javax.swing.JPanel pnlBottom;
    private javax.swing.JPanel pnlButtons;
    private javax.swing.JPanel pnlCenter;
    private javax.swing.JPanel pnlDadosUsuario;
    private javax.swing.JPanel pnlLeft;
    private javax.swing.JPanel pnlLogo;
    private javax.swing.JPanel pnlRight;
    private javax.swing.JPanel pnlTitulo;
    private javax.swing.JPanel pnlTop;
    private javax.swing.JRadioButton rbtnAdmin;
    private javax.swing.JRadioButton rbtnUser;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtIdUser;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JTextField txtNomeCompleto;
    private javax.swing.JPanel txtPerfilUser;
    // End of variables declaration//GEN-END:variables

    public void atualizaCamposTela(String id_user, String nomeUser, String email, String login, String perfil) {

        txtIdUser.setText(id_user);
        txtNomeCompleto.setText(nomeUser);
        txtLogin.setText(login);
        txtEmail.setText(email);
        if (perfil.equals("admin")) {
            rbtnAdmin.setSelected(true);
            rbtnUser.setSelected(false);
        } else {
            rbtnUser.setSelected(true);
            rbtnAdmin.setSelected(false);
        }
    }
}
