/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import controle.camposControle;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modeloBeans.Agenda;
import modeloBeans.Medicos;
import modeloBeans.Pacientes;
import modeloDAO.AgendaDAO;
import modeloDAO.MedicosDAO;
import modeloDAO.PacientesDAO;

/**
 *
 * @author Saulo
 */
public class FormRelatorio extends javax.swing.JFrame {

    private DefaultTableModel dt;
    private List<Agenda> listaAgendamento = new ArrayList<>();
    private AgendaDAO aDao = new AgendaDAO();

    public FormRelatorio() {
        initComponents();
        montaTabela();
        populaMedicos();
        consultasVencidas();
        txtPaciente.setDocument(new camposControle("[^A-Za-z\\ç ]", 50));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtPaciente = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        comboMedico = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        comboTurno = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        dateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        dateChooser2 = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        comboSituacao = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaRelatorio = new javax.swing.JTable();
        btnPesquisar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setText("Pesquisar");

        jLabel3.setText("Paciente");

        txtPaciente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPacienteKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPacienteKeyTyped(evt);
            }
        });

        jLabel4.setText("Medico");

        jLabel5.setText("Turno");

        comboTurno.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione", "Matutino", "Vespertino", "Noturno" }));

        jLabel6.setText("Data");

        jLabel7.setText("e");

        jLabel8.setText("Situação");

        comboSituacao.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione", "Atendido", "Lista de Espera" }));
        comboSituacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboSituacaoActionPerformed(evt);
            }
        });

        tabelaRelatorio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tabelaRelatorio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaRelatorioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaRelatorio);

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboTurno, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(dateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnPesquisar)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(comboMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(comboTurno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel6)
                        .addComponent(dateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dateChooser2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(comboSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnPesquisar)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Relatorio");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(267, 267, 267)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(660, 401));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtPacienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPacienteKeyTyped

    }//GEN-LAST:event_txtPacienteKeyTyped

    private void tabelaRelatorioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaRelatorioMouseClicked

    }//GEN-LAST:event_tabelaRelatorioMouseClicked

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        List<Agenda> lista = new ArrayList<>();
        
        String medico = (String) comboMedico.getSelectedItem();
        String turno = (String) comboTurno.getSelectedItem();
        String situacao = (String) comboSituacao.getSelectedItem();
        String paciente = txtPaciente.getText();
        String msgErro = "";
        
        if(medico == "Selecione"){
            medico = null;
        }
        if(turno == "Selecione"){
            turno = null;
        }
        if(situacao == "Selecione"){
            situacao = null;
        }
        if(paciente.isEmpty()){
            paciente = null;
        }
        
        if(dateChooser1.getDate() != null && dateChooser2.getDate() != null){
            if(dateChooser1.getDate().after(dateChooser2.getDate())){
                JOptionPane.showMessageDialog(null, "Data inconsistente", "Aviso!", JOptionPane.WARNING_MESSAGE);
                msgErro = "\nData inconsistente";
            }
        }
        
        if(msgErro.length() == 0){
            lista = aDao.listar(paciente, medico, turno, situacao, dateChooser1.getDate(), dateChooser2.getDate());
            populaTabela(lista);
        } else{
            System.out.println("Faltam inserir dados " + msgErro);
        }
        
        
        
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void comboSituacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboSituacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboSituacaoActionPerformed

    private void txtPacienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPacienteKeyReleased
        String nome = txtPaciente.getText();
        List<Agenda> listaAux = new ArrayList<>();
        if(nome.length() > 0){
            listaAux.clear();
            for (Agenda a : listaAgendamento) {
                if(a.getCodPaciente().getNome().toLowerCase().startsWith(nome.toLowerCase())){
                   listaAux.add(a);
                }
            }
            populaTabela(listaAux);
            
        }else{
            populaTabela(listaAgendamento);
        }
    }//GEN-LAST:event_txtPacienteKeyReleased

    private void montaTabela() {
        dt = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        tabelaRelatorio.setModel(dt);

        dt.addColumn("Paciente");
        dt.addColumn("Medico");
        dt.addColumn("Data");
        dt.addColumn("Turno");
        dt.addColumn("Situação");
        dt.addColumn("Motivo");

        tabelaRelatorio.getColumnModel().getColumn(0).setPreferredWidth(60);
        tabelaRelatorio.getColumnModel().getColumn(0).setPreferredWidth(60);
        tabelaRelatorio.getColumnModel().getColumn(0).setPreferredWidth(40);
        tabelaRelatorio.getColumnModel().getColumn(0).setPreferredWidth(30);
        tabelaRelatorio.getColumnModel().getColumn(0).setPreferredWidth(80);
        tabelaRelatorio.getColumnModel().getColumn(0).setPreferredWidth(80);
        tabelaRelatorio.getTableHeader().setReorderingAllowed(false);
        tabelaRelatorio.getTableHeader().setResizingAllowed(false);
        
        listaAgendamento = aDao.listar();
        populaTabela(listaAgendamento);
    }

    public void populaTabela(List<Agenda> lista) {
        dt.setNumRows(0);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        for (Agenda a : lista) {
            dt.addRow(new Object[]{a.getCodPaciente().getNome(), a.getCodMedico().getNome(), sdf.format(a.getData()) , a.getTurno(), a.getStatus(), a.getMotivo()});
        }
    }

    public void populaMedicos() {
        Medicos M = new Medicos();
        MedicosDAO mDao = new MedicosDAO();
        List<Medicos> lista = new ArrayList<>();

        lista = mDao.consultar();
        comboMedico.addItem("Selecione");
        for (Medicos m : lista) {
            comboMedico.addItem(m.getNome());
        }
    }
    
    private void consultasVencidas(){
        Date dataAtual = new Date();
        for (Agenda a : listaAgendamento) {
            if(a.getData().before(dataAtual)){
                a.setStatus("Atendido");
                aDao.atualizar(a);
            }
        }
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
            java.util.logging.Logger.getLogger(FormRelatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormRelatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormRelatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormRelatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormRelatorio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JComboBox comboMedico;
    private javax.swing.JComboBox comboSituacao;
    private javax.swing.JComboBox comboTurno;
    private com.toedter.calendar.JDateChooser dateChooser1;
    private com.toedter.calendar.JDateChooser dateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaRelatorio;
    private javax.swing.JTextField txtPaciente;
    // End of variables declaration//GEN-END:variables
}
