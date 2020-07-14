/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Entidades.Eleitor;
import ConexaoBD.EleitorDAO;
import java.util.ArrayList;
import java.util.function.Consumer;
import javax.swing.table.DefaultTableModel;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;

/**
 *
 * @author julio
 */
public class TelaGerarPDF extends javax.swing.JInternalFrame {
    ArrayList<Eleitor> eleitores;
    
    public TelaGerarPDF() {
        initComponents();
        
        DefaultTableModel dtmEleitores = (DefaultTableModel) jCadastro.getModel();
        
        EleitorDAO eleitorDAO = new EleitorDAO();
        
        eleitores = eleitorDAO.getEleitores();
        
        Consumer<Eleitor> consumer = s -> { 
            Object[] dados = {
                              s.getId(), s.getNome(), s.getNascimento(), s.getFuncionario(),
                              s.getEmail(),s.getTelefone1(),s.getTelefone2(),
                              s.getVoto(),s.getPleito(),s.getColaborador(),
                              s.getEndereco(),s.getBairro(),s.getZona(),s.getRegiao(), s.getObservacao()};
            dtmEleitores.addRow(dados);
        }; 
        eleitores.stream().forEach(consumer);
        
        jCadastro.setModel(dtmEleitores);
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jCadastro = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        colaborador1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        zona1 = new javax.swing.JComboBox<>();
        bairro1 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        colaborador2 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        colaborador3 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        bairro2 = new javax.swing.JComboBox<>();
        jButton10 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        bairro3 = new javax.swing.JComboBox<>();
        zona2 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        zona3 = new javax.swing.JComboBox<>();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        alcance = new javax.swing.JComboBox<>();
        jButton12 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();

        setClosable(true);
        setTitle("Gerar PDF");

        jCadastro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Data de Nascimento", "Funcionário", "E-mail", "Telefone - 1", "Telefone - 2", "Voto", "Pleito", "Colaborador", "Endereço", "Bairro", "Observação", "Zona", "Região"
            }
        ));
        jScrollPane1.setViewportView(jCadastro);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Filtros", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jLabel1.setText("Filtrar bairro");

        jLabel2.setText("Filtrar colaborador 1");

        colaborador1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colaborador1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Filtrar zona 1");

        zona1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "11", "101", "118", "147" }));
        zona1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zona1ActionPerformed(evt);
            }
        });

        bairro1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "BARRA DE JANGADA", "ALTO DA UNIÃO", "ALTO DO CEMITERIO", "ARITANA", "BORBOREMA", "BULHÕES", "CAJÁ", "CAJUEIRO SECO ", "CANDEIAS ", "CASCATA ", "CAVALEIRO", "CENTRO ", "COLÔNIA DOS PADRES ", "COMPORTA", "CORREGO DA BATALHA", "CORREGO DA ROSA", "CURADO", "CURADO I", "CURADO II", "CURADO III", "CURADO IV", "CURCURANA", "DISTRITO INDUSTRIAL", "DOIS CARNEIROS", "DUAS UNAS", "ENGENHO CORVETA", "ENGENHO MACUJÉ", "ENGENHO MEGALP", "ENGENHO PALMEIRA", "ENGENHO SACUPEMA", "ENGENHO VELHO", "ENTRE RIOS", "FLORIANO", "GAMELEIRA", "GENERAL DERBY", "GOIABEIRA", "GUARARAPES", "JABOATÃO CENTRO", "JARDIM JORDÃO", "JARDIM PIEDADE", "JARDIM SANTO ANDRÉ", "LORETO ", "LOTE 19 ", "LOTE 31 ", "LOTE 56 ", "LOTE 92 ", "LOTEAMENTO BOLA DE OURO ", "LOTEAMENTO COVA DA ONÇA ", "LOTEAMENTO EDMAR DE OLIVEIRA ", "LOTEAMENTO GRANDE RECIFE ", "LOTEAMENTO SANTA HELENA ", "LOTEAMENTO SANTA INÊS ", "LOTEAMENTO SANTA JOANA ", "LOTEAMENTO SÃO CRISTOVÃO ", "LOTEAMENTO SÃO FRANCISCO ", "LOTEAMENTO SONHO VERDE ", "LOTEAMENTO VILA RICA ", "MANASSU ", "MARCOS FREIRE ", "MASSANGANA ", "MASSARANDUBA ", "MOEDA DE BRONZE ", "MURIBECA ", "MURIBEQUINHA ", "PARQUE SANTANA ", "PIEDADE ", "PORTA LARGA ", "PRAIAS ", "PRAZERES ", "RIO DAS VELHAS ", "SANTANA ", "SANTO ALEIXO ", "SANTO ANDRÉ ", "SÃO JOSÉ ", "SOCORRO ", "SOTAVE ", "SUCUPIRA ", "TERRA MAR ", "TRÊS CARNEIROS ", "UR-10", "UR-11 ", "UR-6 ", "VARGEM FRIA ", "VILA MARIO GOUVEIA ", "VILA NESTLÉ ", "VILA RICA ", "VISTA ALEGRE ", "ZUMBI DO PACHECO", " " }));

        jButton2.setText("Filtrar");

        jButton3.setText("Filtrar");

        jButton4.setText("Filtrar");

        jLabel4.setText("Filtro colaborador 2");

        jButton5.setText("Filtrar");

        jLabel5.setText("Filtro colaborador 3");

        colaborador3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colaborador3ActionPerformed(evt);
            }
        });

        jButton6.setText("Filtrar");

        bairro2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "BARRA DE JANGADA", "ALTO DA UNIÃO", "ALTO DO CEMITERIO", "ARITANA", "BORBOREMA", "BULHÕES", "CAJÁ", "CAJUEIRO SECO ", "CANDEIAS ", "CASCATA ", "CAVALEIRO", "CENTRO ", "COLÔNIA DOS PADRES ", "COMPORTA", "CORREGO DA BATALHA", "CORREGO DA ROSA", "CURADO", "CURADO I", "CURADO II", "CURADO III", "CURADO IV", "CURCURANA", "DISTRITO INDUSTRIAL", "DOIS CARNEIROS", "DUAS UNAS", "ENGENHO CORVETA", "ENGENHO MACUJÉ", "ENGENHO MEGALP", "ENGENHO PALMEIRA", "ENGENHO SACUPEMA", "ENGENHO VELHO", "ENTRE RIOS", "FLORIANO", "GAMELEIRA", "GENERAL DERBY", "GOIABEIRA", "GUARARAPES", "JABOATÃO CENTRO", "JARDIM JORDÃO", "JARDIM PIEDADE", "JARDIM SANTO ANDRÉ", "LORETO ", "LOTE 19 ", "LOTE 31 ", "LOTE 56 ", "LOTE 92 ", "LOTEAMENTO BOLA DE OURO ", "LOTEAMENTO COVA DA ONÇA ", "LOTEAMENTO EDMAR DE OLIVEIRA ", "LOTEAMENTO GRANDE RECIFE ", "LOTEAMENTO SANTA HELENA ", "LOTEAMENTO SANTA INÊS ", "LOTEAMENTO SANTA JOANA ", "LOTEAMENTO SÃO CRISTOVÃO ", "LOTEAMENTO SÃO FRANCISCO ", "LOTEAMENTO SONHO VERDE ", "LOTEAMENTO VILA RICA ", "MANASSU ", "MARCOS FREIRE ", "MASSANGANA ", "MASSARANDUBA ", "MOEDA DE BRONZE ", "MURIBECA ", "MURIBEQUINHA ", "PARQUE SANTANA ", "PIEDADE ", "PORTA LARGA ", "PRAIAS ", "PRAZERES ", "RIO DAS VELHAS ", "SANTANA ", "SANTO ALEIXO ", "SANTO ANDRÉ ", "SÃO JOSÉ ", "SOCORRO ", "SOTAVE ", "SUCUPIRA ", "TERRA MAR ", "TRÊS CARNEIROS ", "UR-10", "UR-11 ", "UR-6 ", "VARGEM FRIA ", "VILA MARIO GOUVEIA ", "VILA NESTLÉ ", "VILA RICA ", "VISTA ALEGRE ", "ZUMBI DO PACHECO", " " }));

        jButton10.setText("Filtrar");

        jLabel6.setText("Filtrar bairro");

        jLabel7.setText("Filtrar bairro");

        bairro3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "BARRA DE JANGADA", "ALTO DA UNIÃO", "ALTO DO CEMITERIO", "ARITANA", "BORBOREMA", "BULHÕES", "CAJÁ", "CAJUEIRO SECO ", "CANDEIAS ", "CASCATA ", "CAVALEIRO", "CENTRO ", "COLÔNIA DOS PADRES ", "COMPORTA", "CORREGO DA BATALHA", "CORREGO DA ROSA", "CURADO", "CURADO I", "CURADO II", "CURADO III", "CURADO IV", "CURCURANA", "DISTRITO INDUSTRIAL", "DOIS CARNEIROS", "DUAS UNAS", "ENGENHO CORVETA", "ENGENHO MACUJÉ", "ENGENHO MEGALP", "ENGENHO PALMEIRA", "ENGENHO SACUPEMA", "ENGENHO VELHO", "ENTRE RIOS", "FLORIANO", "GAMELEIRA", "GENERAL DERBY", "GOIABEIRA", "GUARARAPES", "JABOATÃO CENTRO", "JARDIM JORDÃO", "JARDIM PIEDADE", "JARDIM SANTO ANDRÉ", "LORETO ", "LOTE 19 ", "LOTE 31 ", "LOTE 56 ", "LOTE 92 ", "LOTEAMENTO BOLA DE OURO ", "LOTEAMENTO COVA DA ONÇA ", "LOTEAMENTO EDMAR DE OLIVEIRA ", "LOTEAMENTO GRANDE RECIFE ", "LOTEAMENTO SANTA HELENA ", "LOTEAMENTO SANTA INÊS ", "LOTEAMENTO SANTA JOANA ", "LOTEAMENTO SÃO CRISTOVÃO ", "LOTEAMENTO SÃO FRANCISCO ", "LOTEAMENTO SONHO VERDE ", "LOTEAMENTO VILA RICA ", "MANASSU ", "MARCOS FREIRE ", "MASSANGANA ", "MASSARANDUBA ", "MOEDA DE BRONZE ", "MURIBECA ", "MURIBEQUINHA ", "PARQUE SANTANA ", "PIEDADE ", "PORTA LARGA ", "PRAIAS ", "PRAZERES ", "RIO DAS VELHAS ", "SANTANA ", "SANTO ALEIXO ", "SANTO ANDRÉ ", "SÃO JOSÉ ", "SOCORRO ", "SOTAVE ", "SUCUPIRA ", "TERRA MAR ", "TRÊS CARNEIROS ", "UR-10", "UR-11 ", "UR-6 ", "VARGEM FRIA ", "VILA MARIO GOUVEIA ", "VILA NESTLÉ ", "VILA RICA ", "VISTA ALEGRE ", "ZUMBI DO PACHECO", " " }));

        zona2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "11", "101", "118", "147" }));
        zona2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zona2ActionPerformed(evt);
            }
        });

        jLabel9.setText("Filtrar zona 3");

        zona3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "11", "101", "118", "147" }));
        zona3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zona3ActionPerformed(evt);
            }
        });

        jButton7.setText("Filtrar");

        jButton8.setText("Filtrar");

        jButton9.setText("Filtrar");

        jLabel8.setText("Filtrar zona 2");

        jLabel16.setText("Alcance");

        alcance.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15" }));

        jButton12.setText("Filtrar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(alcance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton12)))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(colaborador1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(colaborador3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(colaborador2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton5)
                            .addComponent(jButton6)))
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(bairro3, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bairro2, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bairro1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2)
                            .addComponent(jButton7)
                            .addComponent(jButton8))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel8)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(zona1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4))
                    .addComponent(jLabel9)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(zona2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton9))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(zona3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton10)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(alcance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton12)))
                    .addComponent(jLabel16)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(bairro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton2))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(bairro2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton7))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(bairro3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton8)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(colaborador1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton3))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(colaborador2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton5))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(colaborador3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton6)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(zona1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton4))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(zona2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton9))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(zona3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton10)))))
                .addGap(0, 51, Short.MAX_VALUE))
        );

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pdf.png"))); // NOI18N
        jButton1.setText(" Gerar PDF");
        jButton1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel10.setText("Nome");

        jButton11.setText("Filtrar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(446, 446, 446))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton11))
                    .addComponent(jLabel10))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed


        String path="";
        JFileChooser j= new JFileChooser();
        j.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int x=j.showSaveDialog(this);
        
//        if(x==JFileChooser.APPROVE_OPTION){
//            
            path=j.getSelectedFile().getPath();
            System.out.println(path);
//        }

        Document doc = new Document ();
        
        try {
            PdfWriter.getInstance(doc, new FileOutputStream(path+"\\relatorio.pdf"));
            
            doc.open();
            
            Consumer<Eleitor> consumer = s -> { 
                
                
                try {   
                    doc.add(new Paragraph("Nome: "+s.getNome()));
                    doc.add(new Paragraph("Data de Nascimento: " + s.getNascimento() + "         Funcionario: " + s.getFuncionario()));
                    doc.add(new Paragraph("E-mail: " + s.getEmail()+ "  Telefone 1: " + s.getTelefone1() + "  Telefone 2: " +  s.getTelefone2()));
                    doc.add(new Paragraph("Voto: " + s.getVoto() + "      Pleito: " + s.getPleito()+ "      Colaborador: " + s.getColaborador()));
                    doc.add(new Paragraph("Endereço: " + s.getEndereco()));
                    doc.add(new Paragraph("Bairro: " + s.getBairro() + "   Zona: " + s.getZona() + "   Regional: " + s.getRegiao()));
                    doc.add(new Paragraph("Observação: " + s.getObservacao()));
                    doc.add(new Paragraph("_____________________________________________________________________________"));

                } catch (DocumentException ex) {
                    Logger.getLogger(TelaGerarPDF.class.getName()).log(Level.SEVERE, null, ex);
                }
            
                
//            Object[] dados = {
//                              s.getId(), s.getNome(), s.getNascimento(), s.getFuncionario(),
//                              s.getEmail(),s.getTelefone1(),s.getTelefone2(),
//                              s.getVoto(),s.getPleito(),s.getColaborador(),
//                              s.getEndereco(),s.getBairro(),s.getZona(),s.getRegiao(), s.getObservacao()};
//            }; 
            };
            eleitores.stream().forEach(consumer);
            
            
        } catch (FileNotFoundException | DocumentException ex) {
            Logger.getLogger(TelaGerarPDF.class.getName()).log(Level.SEVERE, null, ex);
        }

        doc.close();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void zona1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zona1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_zona1ActionPerformed

    private void colaborador1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colaborador1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_colaborador1ActionPerformed

    private void colaborador3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colaborador3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_colaborador3ActionPerformed

    private void zona2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zona2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_zona2ActionPerformed

    private void zona3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zona3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_zona3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> alcance;
    private javax.swing.JComboBox<String> bairro1;
    private javax.swing.JComboBox<String> bairro2;
    private javax.swing.JComboBox<String> bairro3;
    private javax.swing.JTextField colaborador1;
    private javax.swing.JTextField colaborador2;
    private javax.swing.JTextField colaborador3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JTable jCadastro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JComboBox<String> zona1;
    private javax.swing.JComboBox<String> zona2;
    private javax.swing.JComboBox<String> zona3;
    // End of variables declaration//GEN-END:variables
}
