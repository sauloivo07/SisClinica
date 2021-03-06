/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import controle.camposControle;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modeloBeans.Bairro;
import modeloBeans.Pacientes;
import modeloDAO.PacientesDAO;

/**
 *
 * @author Saulo
 */
public class FormPaciente extends javax.swing.JFrame {

    Pacientes p = new Pacientes();
    PacientesDAO pDao = new PacientesDAO();
    List<Bairro> lista = new ArrayList<>();
    List<Pacientes> listaPacientes = new ArrayList<>();
    DefaultTableModel dt;
    

    /**
     * Creates new form FormPaciente
     */
    public FormPaciente() {
        initComponents();
        preecherBairros();
        montarTabela();
        campos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtFormatoTel = new javax.swing.JFormattedTextField();
        txtFormatoNasc = new javax.swing.JFormattedTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtRua = new javax.swing.JTextField();
        txtComplemento = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtFormatoCEP = new javax.swing.JFormattedTextField();
        comboBoxBairro = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtNum = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        btnNovo = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txtPesquisar = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnDeletar = new javax.swing.JButton();
        txtRg = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setText("Nome:");

        jLabel3.setText("RG:");

        jLabel4.setText("Nascimento:");

        jLabel5.setText("Telefone:");

        txtNome.setEnabled(false);

        try {
            txtFormatoTel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtFormatoTel.setEnabled(false);

        try {
            txtFormatoNasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtFormatoNasc.setEnabled(false);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel7.setText("Rua:");

        jLabel8.setText("Complemento:");

        txtRua.setEnabled(false);

        txtComplemento.setEnabled(false);

        jLabel9.setText("CEP:");

        try {
            txtFormatoCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtFormatoCEP.setEnabled(false);

        comboBoxBairro.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboBoxBairro.setEnabled(false);
        comboBoxBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxBairroActionPerformed(evt);
            }
        });

        jLabel10.setText("Bairro:");

        jLabel12.setText("Nº");

        txtNum.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtRua, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12)
                        .addGap(7, 7, 7)
                        .addComponent(txtNum, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtFormatoCEP))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 24, Short.MAX_VALUE)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(comboBoxBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)
                        .addComponent(jLabel12)
                        .addComponent(jLabel9)
                        .addComponent(txtNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtFormatoCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(comboBoxBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel6.setText("Endereço:");

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabela);

        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        jLabel11.setText("Pesquisar:");

        txtPesquisar.setEnabled(false);

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.setEnabled(false);

        btnSalvar.setText("Salvar");
        btnSalvar.setEnabled(false);
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.setEnabled(false);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.setEnabled(false);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnDeletar.setText("Deletar");
        btnDeletar.setEnabled(false);
        btnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarActionPerformed(evt);
            }
        });

        try {
            txtRg.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("############")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtRg.setEnabled(false);
        txtRg.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRgKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnPesquisar))
                                    .addComponent(jLabel6)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtRg, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtFormatoTel, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtFormatoNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 29, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(txtFormatoNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(txtFormatoTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Cadastro Pacientes");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        setSize(new java.awt.Dimension(690, 548));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        estadoCampos(true);
        btnNovo.setEnabled(false);
        btnSalvar.setEnabled(true);
        btnCancelar.setEnabled(true);
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        boolean b = true;
        int tam = 0;
        String bairro = null;
        if(verificaVazio()){
            p.setNome(txtNome.getText());
            
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            sdf.setLenient(false);
                try {
                    Date dataNasc = sdf.parse(txtFormatoNasc.getText());
                    Date data = new Date();
                    if(dataNasc.before(data)){
                        p.setDataNasc(dataNasc);
                    }
                    else{
                        b = false;
                        JOptionPane.showMessageDialog(null, "Digite uma data valida", "Aviso", JOptionPane.WARNING_MESSAGE);
                    } 
                } catch (ParseException ex) {
                    System.out.println(ex.getMessage());
                    b = false;
                    JOptionPane.showMessageDialog(null, "Digite uma data valida!");
                }
            tam = txtRg.getText().length();
            if(tam >= 5 && tam <= 12){
                p.setRg(txtRg.getText());
            } else{
                JOptionPane.showMessageDialog(null, "RG invalido");
                b=false;
            }
            String[] tel = txtFormatoTel.getText().split("[(|)]| |-");
            String tel1 = "1"; 
            if (tel.length > 1) tel1 = tel[1] + tel[3] + tel[4];
            if(tel1.length() == 10 && !tel1.equals("          ")){
                p.setTel(tel1);
            }else{
                JOptionPane.showMessageDialog(null, "Digite um tel valido.");
                b = false;
            }
            p.setRua(txtRua.getText());
            
            tam = txtNum.getText().length();
            if(tam <= 5) {
                p.setNum(txtNum.getText());
            }
            else {
                JOptionPane.showMessageDialog(null, "Digite um numero valido.");
                b = false;
            } 
            if(comboBoxBairro.getSelectedIndex() <= 0){
                b = false;
                JOptionPane.showMessageDialog(null, "Selecione um bairro");
            }else{
                bairro = (String) comboBoxBairro.getSelectedItem();
            }
            
            String[] cep = txtFormatoCEP.getText().split("[.|-]");
            String cep1 = cep[0] + cep[1] + cep[2];
            if(cep1.length() == 8 && !cep1.equals("        ")){
                p.setCep(cep1);
            }else{
                JOptionPane.showMessageDialog(null, "Insira um CEP valido.");
                b = false;
            }
            
            p.setComplemento(txtComplemento.getText());
        } else{
            b = false;
        }
        
            if(b == true){
                pDao.inserir(p, bairro);
                estadoCampos(false);
                btnNovo.setEnabled(true);
                btnSalvar.setEnabled(false);
                btnCancelar.setEnabled(false);
                limpaCampos();
                populaTabela();
            }
        
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        estadoCampos(false);
        btnNovo.setEnabled(true);
        btnSalvar.setEnabled(false);
        btnCancelar.setEnabled(false);
        btnEditar.setEnabled(false);
        btnDeletar.setEnabled(false);
        limpaCampos();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        Bairro bairro = null;
        boolean b = true;
        if(verificaVazio()){
            p.setNome(txtNome.getText());
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            sdf.setLenient(false);
            try {
                Date dataNasc = sdf.parse(txtFormatoNasc.getText());
                Date data = new Date();
                if(dataNasc.before(data)){
                    p.setDataNasc(dataNasc);
                }
                else{
                    b = false;
                    JOptionPane.showMessageDialog(null, "Digite uma data valida", "Aviso", JOptionPane.WARNING_MESSAGE);
                } 
            } catch (ParseException ex) {
                System.out.println("Não foi possivel converter " + ex.getMessage());
                b = false;
                JOptionPane.showMessageDialog(null, "Digite uma data validade", "Aviso", JOptionPane.WARNING_MESSAGE);
            }
            if(txtRg.getText().length() == 12){
                p.setRg(txtRg.getText());
            } else {
                JOptionPane.showMessageDialog(null, "Digite RG valido", "Aviso", JOptionPane.WARNING_MESSAGE);
                b = false;
            }
            String[] tel = txtFormatoTel.getText().split("[(|)]| |-");
            String tel1 = " ";
            if(tel.length > 1) tel1 = tel[1] + tel[3] + tel[4];
            if(tel1.length() == 10 && !tel1.equals("          ")){
                p.setTel(txtFormatoTel.getText());
            } else{
                JOptionPane.showMessageDialog(null, "Digite um TEL valido", "Aviso", JOptionPane.WARNING_MESSAGE);
                b = false;
            }
            p.setRua(txtRua.getText());
            
            p.setNum(txtNum.getText());
            
            if(comboBoxBairro.getSelectedIndex() == 0){
                b = false;
                JOptionPane.showMessageDialog(null, "Selecione um bairro", "Aviso", JOptionPane.WARNING_MESSAGE);
            } else{
                bairro = pDao.pesquisaBairro((String) comboBoxBairro.getSelectedItem());
                p.setBairro(bairro);
            }
            
            String[] cep = txtFormatoCEP.getText().split("[.|-]");
            String cep1 = " ";
            if(cep.length > 1) cep1 = cep[0] + cep[1] + cep[2];
            if(cep1.length() == 8 && !txtFormatoCEP.equals("        ")){
                p.setCep(txtFormatoCEP.getText());
            }else{
                b = false;
                JOptionPane.showMessageDialog(null, "Digite um CEP valido", "Aviso", JOptionPane.WARNING_MESSAGE);
            }
            p.setComplemento(txtComplemento.getText());
        } else{
            b = false;
        }
        
        if(b == true){
            pDao.atualizar(p);
            estadoCampos(false);
            btnNovo.setEnabled(true);
            btnCancelar.setEnabled(false);
            btnEditar.setEnabled(false);
            btnDeletar.setEnabled(false);
            populaTabela();
            limpaCampos();
        }
        
        
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
        if(verificaVazio()){
            boolean b = true;
                p.setNome(txtNome.getText());
            if(txtRg.getText().length() == 12){
                p.setRg(txtRg.getText());
            } else {
                JOptionPane.showMessageDialog(null, "Digite um RG valido.", "Aviso", JOptionPane.WARNING_MESSAGE);
                b = false;
            }
            //p.setTel(txtFormatoTel.getText());
            //p.setRua(txtRua.getText());
            //p.setNum(txtNum.getText());
            //String bairro = (String) comboBoxBairro.getSelectedItem();
            //p.setCep(txtFormatoCEP.getText());
            //p.setComplemento(txtComplemento.getText());
            
            int resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente exluir?", "Aviso", JOptionPane.WARNING_MESSAGE);
            if(resposta == JOptionPane.YES_OPTION && b == true){
                pDao.deletar(p);
            
                estadoCampos(false);
                btnNovo.setEnabled(true);
                btnCancelar.setEnabled(false);
                btnEditar.setEnabled(false);
                btnDeletar.setEnabled(false);
                populaTabela();
                limpaCampos();
            }
        }
    }//GEN-LAST:event_btnDeletarActionPerformed

    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked
        if (evt.getClickCount() == 2) {
            int linha = tabela.getSelectedRow();
            if (linha >= 0) {
                txtNome.setText((String) tabela.getValueAt(linha, 0));
                txtFormatoNasc.setText((String) tabela.getValueAt(linha, 2));
                txtRg.setText((String) tabela.getValueAt(linha, 1));
                txtFormatoTel.setText((String) tabela.getValueAt(linha, 3));
                txtRua.setText((String) tabela.getValueAt(linha, 4));
                txtNum.setText((String) tabela.getValueAt(linha, 5));
                comboBoxBairro.setSelectedItem(tabela.getValueAt(linha, 6));
                txtFormatoCEP.setText((String) tabela.getValueAt(linha, 7));
                txtComplemento.setText((String) tabela.getValueAt(linha, 8));
                
                p = pDao.pesquisarPaciente(txtNome.getText(), txtRg.getText());
                
                estadoCampos(true);
                btnNovo.setEnabled(false);
                btnSalvar.setEnabled(false);
                btnCancelar.setEnabled(true);
                btnEditar.setEnabled(true);
                btnDeletar.setEnabled(true);
            }
        }
    }//GEN-LAST:event_tabelaMouseClicked

    private void comboBoxBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxBairroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxBairroActionPerformed

    private void txtRgKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRgKeyTyped

    }//GEN-LAST:event_txtRgKeyTyped

    private void preecherBairros() {
        lista = pDao.listarBairros();

        comboBoxBairro.removeAllItems();
        comboBoxBairro.addItem("Selecione");
        for (Bairro b : lista) {
            comboBoxBairro.addItem(b.getNome());
        }
    }

    private void montarTabela() {
        dt = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int rowIndex, int mColIndex) {
                return false;
            }
        };

        tabela.setModel(dt);
        dt.addColumn("Nome");
        dt.addColumn("Rg");
        dt.addColumn("Nasc.:");
        dt.addColumn("Tel.:");
        dt.addColumn("Rua");
        dt.addColumn("Nº");
        dt.addColumn("Bairro");
        dt.addColumn("CEP");
        dt.addColumn("Complemento");
        tabela.getColumnModel().getColumn(0).setPreferredWidth(50);
        tabela.getColumnModel().getColumn(0).setResizable(true);
        tabela.getColumnModel().getColumn(1).setPreferredWidth(30);
        tabela.getColumnModel().getColumn(1).setResizable(true);
        tabela.getColumnModel().getColumn(2).setPreferredWidth(20);
        tabela.getColumnModel().getColumn(2).setResizable(true);
        tabela.getColumnModel().getColumn(3).setPreferredWidth(20);
        tabela.getColumnModel().getColumn(3).setResizable(true);
        tabela.getColumnModel().getColumn(4).setPreferredWidth(50);
        tabela.getColumnModel().getColumn(4).setResizable(true);
        tabela.getColumnModel().getColumn(5).setPreferredWidth(10);
        tabela.getColumnModel().getColumn(5).setResizable(true);
        tabela.getColumnModel().getColumn(6).setPreferredWidth(50);
        tabela.getColumnModel().getColumn(6).setResizable(true);
        tabela.getColumnModel().getColumn(7).setPreferredWidth(20);
        tabela.getColumnModel().getColumn(7).setResizable(true);
        tabela.getColumnModel().getColumn(8).setPreferredWidth(100);
        tabela.getColumnModel().getColumn(8).setResizable(true);
        tabela.getTableHeader().setReorderingAllowed(false);
        populaTabela();
    }

    public void populaTabela() {
        dt.setNumRows(0);

        listaPacientes = pDao.listar();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        for (Pacientes p : listaPacientes) {
            dt.addRow(new Object[]{p.getNome(), p.getRg(), sdf.format(p.getDataNasc()), 
                p.getTel(), p.getRua(), p.getNum(), p.getBairro().getNome(), p.getCep(), p.getComplemento()});
        }
    }

    private void estadoCampos(boolean b) {
        txtNome.setEnabled(b);
        txtRg.setEnabled(b);
        txtNum.setEnabled(b);
        txtFormatoNasc.setEnabled(b);
        txtFormatoTel.setEnabled(b);
        txtRua.setEnabled(b);
        txtFormatoCEP.setEnabled(b);
        txtComplemento.setEnabled(b);
        comboBoxBairro.setEnabled(b);
    }

    private boolean verificaVazio() {
        boolean teste = true;
        if (txtNome.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Campo nome é obrigatorio");
            teste = false;
        }
        if (txtRg.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Campo RG é obrigatorio");
            teste = false;
        }
        if (txtNum.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Campo Nº é obrigatorio");
            teste = false;
        }
        //if(txtFormatoNasc.getText().split("/"))
        if(txtFormatoTel.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Campo telefone é obrigatorio");
            teste = false;
        }
        if (txtRua.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Campo rua é obrigatorio");
            teste = false;
        }
        //if(txtFormatoCEP.getText().isEmpty())
        if (txtComplemento.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Campo complemento é obrigatorio");
            teste = false;
        }
        if (comboBoxBairro.getSelectedIndex() <= 0) {
            JOptionPane.showMessageDialog(null, "Campo bairro é obrigatorio");
            teste = false;
        }
        
        return teste;
    }
    
    private void campos() {
        txtNome.setDocument(new camposControle("[^A-Za-z\\ç ]", 50));
        txtRua.setDocument(new camposControle("[^A-Za-z\\ç ]", 50));
        txtComplemento.setDocument(new camposControle("[^A-Za-z\\ç ]", 50));
    }
    
    private void limpaCampos(){
        txtNome.setText("");
        txtFormatoNasc.setText("");
        txtRg.setText("");
        txtFormatoTel.setText("");
        txtRua.setText("");
        txtNum.setText("");
        txtComplemento.setText("");
        txtFormatoCEP.setText(null);
        comboBoxBairro.setSelectedIndex(0);
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
            java.util.logging.Logger.getLogger(FormPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPaciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox comboBoxBairro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabela;
    private javax.swing.JTextField txtComplemento;
    private javax.swing.JFormattedTextField txtFormatoCEP;
    private javax.swing.JFormattedTextField txtFormatoNasc;
    private javax.swing.JFormattedTextField txtFormatoTel;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNum;
    private javax.swing.JTextField txtPesquisar;
    private javax.swing.JFormattedTextField txtRg;
    private javax.swing.JTextField txtRua;
    // End of variables declaration//GEN-END:variables

}
