package View;

import Model.Consulta;
import java.awt.Dimension;
import java.awt.Toolkit;
import util.Botoes;

public class TelaConsultas extends javax.swing.JFrame {

    /**
     * Creates new form TelaConsultas
     */
    
    private String codigoConsulta;
    private String status;
    private String dataConsulta;
    private String laudoMedico;
    private String medicoNome;
    private String pacienteNome;

    
    private void setTable(){

        Consulta con = new Consulta(codigoConsulta,status,dataConsulta,laudoMedico,medicoNome,pacienteNome);
        
        tbConsultaAberta.setModel(con.TableConsulta());
        tbConsultasBaixadas.setModel(con.CFechado());

    }
    
    public TelaConsultas() {
        initComponents();
        setTable();
        centralizarComponente();
        lblSelectConsulta.setVisible(false);
    }
    
    public void centralizarComponente() {
        Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension dw = getSize();
        setLocation((ds.width - dw.width) / 2, (ds.height - dw.height) / 2);
    }
    
    public void Medico(){
        lblNovaConsulta.setVisible(false);
        lblCancelaConsulta.setVisible(false);
        lblSelectConsulta.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtpConsultas = new javax.swing.JTabbedPane();
        spAbertas = new javax.swing.JScrollPane();
        tbConsultaAberta = new javax.swing.JTable();
        pnBaixadas = new javax.swing.JPanel();
        spBaixadas = new javax.swing.JScrollPane();
        tbConsultasBaixadas = new javax.swing.JTable();
        lblCancelar = new javax.swing.JLabel();
        lblConsultas = new javax.swing.JLabel();
        lblFiltro = new javax.swing.JLabel();
        cbFiltro = new javax.swing.JComboBox<>();
        tfFiltro = new javax.swing.JTextField();
        lblCancelaConsulta = new javax.swing.JLabel();
        lblNovaConsulta = new javax.swing.JLabel();
        lblPesquisaFiltro = new javax.swing.JLabel();
        lblSelectConsulta = new javax.swing.JLabel();
        lblbDelete = new javax.swing.JLabel();

        setTitle("Consultas");

        tbConsultaAberta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Código da Consulta", "Status", "Data da Consulta", "Paciente", "Medico", "SID", "Tipo de Exame"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        spAbertas.setViewportView(tbConsultaAberta);
        if (tbConsultaAberta.getColumnModel().getColumnCount() > 0) {
            tbConsultaAberta.getColumnModel().getColumn(0).setResizable(false);
            tbConsultaAberta.getColumnModel().getColumn(1).setResizable(false);
            tbConsultaAberta.getColumnModel().getColumn(2).setResizable(false);
            tbConsultaAberta.getColumnModel().getColumn(3).setResizable(false);
            tbConsultaAberta.getColumnModel().getColumn(4).setResizable(false);
            tbConsultaAberta.getColumnModel().getColumn(5).setResizable(false);
            tbConsultaAberta.getColumnModel().getColumn(6).setResizable(false);
        }

        jtpConsultas.addTab("Abertas", spAbertas);

        tbConsultasBaixadas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        spBaixadas.setViewportView(tbConsultasBaixadas);

        javax.swing.GroupLayout pnBaixadasLayout = new javax.swing.GroupLayout(pnBaixadas);
        pnBaixadas.setLayout(pnBaixadasLayout);
        pnBaixadasLayout.setHorizontalGroup(
            pnBaixadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(spBaixadas, javax.swing.GroupLayout.DEFAULT_SIZE, 912, Short.MAX_VALUE)
        );
        pnBaixadasLayout.setVerticalGroup(
            pnBaixadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(spBaixadas, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
        );

        jtpConsultas.addTab("Baixadas", pnBaixadas);

        lblCancelar.setToolTipText("");

        lblConsultas.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblConsultas.setText("Consultas");

        lblFiltro.setText("Filtro");

        cbFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "N/A", "Codigo da consulta", "Paciente", "Data da consulta" }));

        lblCancelaConsulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icons8_Delete_File_50px.png"))); // NOI18N
        lblCancelaConsulta.setToolTipText("Cancelar Consulta");
        lblCancelaConsulta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCancelaConsultaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblCancelaConsultaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblCancelaConsultaMouseExited(evt);
            }
        });

        lblNovaConsulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icons8_New_File_50px.png"))); // NOI18N
        lblNovaConsulta.setToolTipText("Nova Consulta");
        lblNovaConsulta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNovaConsultaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblNovaConsultaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblNovaConsultaMouseExited(evt);
            }
        });

        lblPesquisaFiltro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Search_20px.png"))); // NOI18N
        lblPesquisaFiltro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPesquisaFiltroMouseClicked(evt);
            }
        });

        lblSelectConsulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Inspection_50px.png"))); // NOI18N
        lblSelectConsulta.setToolTipText("Selecionar consulta");
        lblSelectConsulta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSelectConsultaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblSelectConsultaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblSelectConsultaMouseExited(evt);
            }
        });

        lblbDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icons8_Cancel_50px.png"))); // NOI18N
        lblbDelete.setToolTipText("Excluir consulta");
        lblbDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblbDeleteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblbDeleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblbDeleteMouseExited(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jtpConsultas)
                        .addGap(10, 10, 10))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(lblCancelar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblNovaConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblCancelaConsulta)
                        .addGap(18, 18, 18)
                        .addComponent(lblbDelete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblSelectConsulta))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(lblFiltro))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(cbFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblPesquisaFiltro)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(403, 403, 403)
                .addComponent(lblConsultas)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblConsultas, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jtpConsultas, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblCancelaConsulta)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblFiltro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(cbFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tfFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lblPesquisaFiltro))
                                .addGap(18, 18, 18)
                                .addComponent(lblNovaConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblbDelete)
                            .addComponent(lblSelectConsulta)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(lblCancelar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblPesquisaFiltroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPesquisaFiltroMouseClicked
        // TODO add your handling code here:
        //BOTÃO DE BUSCA DO FILTRO
    }//GEN-LAST:event_lblPesquisaFiltroMouseClicked

    private void lblNovaConsultaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNovaConsultaMouseEntered
        // TODO add your handling code here:
        Botoes bt = new Botoes();
        bt.botabotão(lblNovaConsulta);
    }//GEN-LAST:event_lblNovaConsultaMouseEntered

    private void lblNovaConsultaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNovaConsultaMouseExited
        // TODO add your handling code here:
        Botoes bt = new Botoes();
        bt.tirabotão(lblNovaConsulta);
    }//GEN-LAST:event_lblNovaConsultaMouseExited

    private void lblCancelaConsultaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCancelaConsultaMouseEntered
        // TODO add your handling code here:
        Botoes bt = new Botoes();
        bt.botabotão(lblCancelaConsulta);
    }//GEN-LAST:event_lblCancelaConsultaMouseEntered

    private void lblCancelaConsultaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCancelaConsultaMouseExited
        // TODO add your handling code here:
        Botoes bt = new Botoes();
        bt.tirabotão(lblCancelaConsulta);
    }//GEN-LAST:event_lblCancelaConsultaMouseExited

    private void lblNovaConsultaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNovaConsultaMouseClicked
        // TODO add your handling code here:
        TelaConsultaNova tl = new TelaConsultaNova();
        tl.setVisible(true);
    }//GEN-LAST:event_lblNovaConsultaMouseClicked

    private void lblSelectConsultaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSelectConsultaMouseClicked
        // TODO add your handling code here:
        int row = tbConsultaAberta.getSelectedRow();
        int[] col = {0,3,4};
        String cd_consulta = tbConsultaAberta.getModel().getValueAt(row, col[0]).toString();
        String nm_pac = tbConsultaAberta.getModel().getValueAt(row, col[1]).toString();
        String nm_med = tbConsultaAberta.getModel().getValueAt(row, col[2]).toString();
        System.out.println(cd_consulta + " " + nm_pac + " " + nm_med);
        InterfaceMedico im = new InterfaceMedico(cd_consulta, nm_pac, nm_med);
        im.setVisible(true);
    }//GEN-LAST:event_lblSelectConsultaMouseClicked

    private void lblSelectConsultaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSelectConsultaMouseEntered
        // TODO add your handling code here:
        Botoes bt = new Botoes();
        bt.botabotão(lblSelectConsulta);
    }//GEN-LAST:event_lblSelectConsultaMouseEntered

    private void lblSelectConsultaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSelectConsultaMouseExited
        // TODO add your handling code here:
        Botoes bt = new Botoes();
        bt.tirabotão(lblSelectConsulta);
    }//GEN-LAST:event_lblSelectConsultaMouseExited

    private void lblCancelaConsultaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCancelaConsultaMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_lblCancelaConsultaMouseClicked

    private void lblbDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblbDeleteMouseClicked
        // TODO add your handling code here:
        int row = tbConsultaAberta.getSelectedRow();
        int col = 0;
        String value = tbConsultaAberta.getModel().getValueAt(row, col).toString();
        Consulta c = new Consulta(value );
         c.excluir();
    }//GEN-LAST:event_lblbDeleteMouseClicked

    private void lblbDeleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblbDeleteMouseEntered
        // TODO add your handling code here:
        Botoes bt = new Botoes();
        bt.botabotão(lblbDelete);
    }//GEN-LAST:event_lblbDeleteMouseEntered

    private void lblbDeleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblbDeleteMouseExited
        // TODO add your handling code here:
        Botoes bt = new Botoes();
        bt.tirabotão(lblbDelete);
    }//GEN-LAST:event_lblbDeleteMouseExited

    public void CacelaConsulta(){
        long idFind;
        String cpfFind;
        String nomeFind;
        
        
    }
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
            java.util.logging.Logger.getLogger(TelaConsultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaConsultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaConsultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaConsultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaConsultas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbFiltro;
    private javax.swing.JTabbedPane jtpConsultas;
    private javax.swing.JLabel lblCancelaConsulta;
    private javax.swing.JLabel lblCancelar;
    private javax.swing.JLabel lblConsultas;
    private javax.swing.JLabel lblFiltro;
    private javax.swing.JLabel lblNovaConsulta;
    private javax.swing.JLabel lblPesquisaFiltro;
    private javax.swing.JLabel lblSelectConsulta;
    private javax.swing.JLabel lblbDelete;
    private javax.swing.JPanel pnBaixadas;
    private javax.swing.JScrollPane spAbertas;
    private javax.swing.JScrollPane spBaixadas;
    private javax.swing.JTable tbConsultaAberta;
    private javax.swing.JTable tbConsultasBaixadas;
    private javax.swing.JTextField tfFiltro;
    // End of variables declaration//GEN-END:variables
}
