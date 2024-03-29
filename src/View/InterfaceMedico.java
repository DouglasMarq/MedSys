/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Consulta;
import java.awt.Dimension;
import java.awt.Toolkit;
import util.Botoes;

/**
 *
 * @author lucas
 */
public class InterfaceMedico extends javax.swing.JFrame {
    
    private String LaudoMedico;
    private String codigoConsulta;
    
    private void setLaudoMedico(){
        LaudoMedico = taLaudoMedico.getText() ;
        codigoConsulta = lblSetNumero.getText();
        Consulta consulta = new Consulta(codigoConsulta,LaudoMedico);
        consulta.Atualizar(codigoConsulta);
    }
    
    /**
     * Utilizado para preenchimento dos campos Codigo da consulta,Nome do paciente e nome do medico ao inicializar a view.
     * @param cd_consulta preencher com o codigo da consulta
     * @param Nomepac preencher com o nome do paciente
     * @param Nomemed  preencher com o nome do Medico */
    public InterfaceMedico(String cd_consulta, String Nomepac, String Nomemed) {
      initComponents();
        lblNomePacinetedf.setText(Nomepac);
        lblNomeMedicodf.setText(Nomemed);
        lblSetNumero.setText(cd_consulta);
      centralizarComponente();
    }
    /**
     * Creates new form InterfaceMedico
     */
    public InterfaceMedico() {
        initComponents();
        centralizarComponente();
    }
    /**
     * Centraliza a view na tela do usuario*/
        public void centralizarComponente() {
        Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension dw = getSize();
        setLocation((ds.width - dw.width) / 2, (ds.height - dw.height) / 2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNomePaciente = new javax.swing.JLabel();
        lblNomePacinetedf = new javax.swing.JLabel();
        jsSeparaInfos = new javax.swing.JSeparator();
        lblConsulta = new javax.swing.JLabel();
        lblNomeMedico = new javax.swing.JLabel();
        lblNomeMedicodf = new javax.swing.JLabel();
        lblLaudoMedico = new javax.swing.JLabel();
        jspLaudoMedico = new javax.swing.JScrollPane();
        taLaudoMedico = new javax.swing.JTextArea();
        lblbConfirmaConsulta = new javax.swing.JLabel();
        lblNumero = new javax.swing.JLabel();
        lblSetNumero = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consulta");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNomePaciente.setText("Nome do paciente");
        getContentPane().add(lblNomePaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        lblNomePacinetedf.setText("---");
        getContentPane().add(lblNomePacinetedf, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));
        getContentPane().add(jsSeparaInfos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 95, 739, 10));

        lblConsulta.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblConsulta.setText("Consulta");
        getContentPane().add(lblConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, -1, -1));

        lblNomeMedico.setText("Medico");
        getContentPane().add(lblNomeMedico, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        lblNomeMedicodf.setText("--");
        getContentPane().add(lblNomeMedicodf, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        lblLaudoMedico.setText("Laudo Médico");
        getContentPane().add(lblLaudoMedico, new org.netbeans.lib.awtextra.AbsoluteConstraints(331, 111, -1, -1));

        taLaudoMedico.setColumns(20);
        taLaudoMedico.setRows(5);
        jspLaudoMedico.setViewportView(taLaudoMedico);

        getContentPane().add(jspLaudoMedico, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 131, 719, -1));

        lblbConfirmaConsulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Inspection_50px.png"))); // NOI18N
        lblbConfirmaConsulta.setToolTipText("Concluir Consulta");
        lblbConfirmaConsulta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblbConfirmaConsultaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblbConfirmaConsultaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblbConfirmaConsultaMouseExited(evt);
            }
        });
        getContentPane().add(lblbConfirmaConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(679, 245, -1, -1));

        lblNumero.setText("Numero:");
        getContentPane().add(lblNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 40, -1, -1));

        lblSetNumero.setText("--");
        getContentPane().add(lblSetNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 40, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblbConfirmaConsultaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblbConfirmaConsultaMouseEntered
        // TODO add your handling code here:
        Botoes bt = new Botoes();
        bt.botabotao(lblbConfirmaConsulta);
    }//GEN-LAST:event_lblbConfirmaConsultaMouseEntered

    private void lblbConfirmaConsultaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblbConfirmaConsultaMouseExited
        // TODO add your handling code here:
        Botoes bt = new Botoes();
        bt.tirabotao(lblbConfirmaConsulta);
    }//GEN-LAST:event_lblbConfirmaConsultaMouseExited

    private void lblbConfirmaConsultaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblbConfirmaConsultaMouseClicked
        // TODO add your handling code here:
       setLaudoMedico();
    }//GEN-LAST:event_lblbConfirmaConsultaMouseClicked

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
            java.util.logging.Logger.getLogger(InterfaceMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceMedico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator jsSeparaInfos;
    private javax.swing.JScrollPane jspLaudoMedico;
    private javax.swing.JLabel lblConsulta;
    private javax.swing.JLabel lblLaudoMedico;
    private javax.swing.JLabel lblNomeMedico;
    private javax.swing.JLabel lblNomeMedicodf;
    private javax.swing.JLabel lblNomePaciente;
    private javax.swing.JLabel lblNomePacinetedf;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JLabel lblSetNumero;
    private javax.swing.JLabel lblbConfirmaConsulta;
    private javax.swing.JTextArea taLaudoMedico;
    // End of variables declaration//GEN-END:variables
}
