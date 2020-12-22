/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI_View;

import BLL.Autobusettbl;
import BLL.Kompaniatbl;
import BLL.LinjatEUdhetimittbl;
import DAL.AutobusettblRepository;
import DAL.AutobusiException;
import DAL.KompaniaException;
import DAL.LinjatEUdhetimitException;
import DAL.LinjatEUdhetimittblRepository;
import GUI_Model.LinjatEUdhtimittblTabelModel;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author detjona
 */
public class LinjatForm extends javax.swing.JFrame {

    /**
     * Creates new form LinjatForm
     */
    
    
    
    LinjatEUdhetimittblRepository luR = new LinjatEUdhetimittblRepository();
    LinjatEUdhtimittblTabelModel lutm = new LinjatEUdhtimittblTabelModel();
    
    AutobusettblRepository aR = new AutobusettblRepository();
    
    static int idKompanise = 0;
    
    public LinjatForm() throws LinjatEUdhetimitException, AutobusiException {
        initComponents();
        loadLinjatTable();
        tabelaSelectedIndexChangeLinjat();
        loadAutobuseComboBox();
    }
    
    public void loadAutobuseComboBox() throws AutobusiException{
        List<Autobusettbl> autobuset = luR.findAllAutobuset();
        
        for (int i = 0; i < autobuset.size(); i++) {
            if(autobuset.get(i).getIDKompanise().getIDKompanise() == idKompanise){
                autobusiComboBox.addItem(autobuset.get(i).getIDAutobusi()+" "+autobuset.get(i).getEmriAutobusit());
            }
        }
        
        
    }
    
    
    public void loadLinjatTable() throws LinjatEUdhetimitException{
          try{
            List<LinjatEUdhetimittbl> linjat = luR.findAll();
            lutm.addList(linjat);
            LinjatTable.setModel(lutm);
        }catch(LinjatEUdhetimitException cE){
            Logger.getLogger(LinjatEUdhetimitException.class.getName()).log(Level.SEVERE,null,cE);
        }
    }
      private void tabelaSelectedIndexChangeLinjat(){
        final ListSelectionModel rowSM = LinjatTable.getSelectionModel();
        rowSM.addListSelectionListener(new ListSelectionListener(){

            
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if(e.getValueIsAdjusting()){
                    return;
                }
                
                ListSelectionModel rowSM = (ListSelectionModel) e.getSource();
                int selectedIndex = rowSM.getAnchorSelectionIndex();
                if(selectedIndex > -1){
                    LinjatEUdhetimittbl c = lutm.getLinjatEUdhetimittbl(selectedIndex);
                    idLinjesField.setText(c.getIDLinjave().toString());
                    autobusiComboBox.setSelectedItem(c.getIDAutobusi().getIDAutobusi()+" "+ c.getIDAutobusi().getEmriAutobusit());
                    kohaField.setText(c.getKoha());
                    ditaComboBox.setSelectedItem(c.getDita());
                    vendiNisjesField.setText(c.getVendiNisjes());
                    destinacioniField.setText(c.getDestinacioni());
                    
                    
                    
                   ;
                } //To change body of generated methods, choose Tools | Templates.
            }
        });
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
        LinjatTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        idLinjesField = new javax.swing.JTextField();
        kohaField = new javax.swing.JTextField();
        vendiNisjesField = new javax.swing.JTextField();
        destinacioniField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        ditaComboBox = new javax.swing.JComboBox<>();
        autobusiComboBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        LinjatTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(LinjatTable);

        jLabel1.setText("ID Linjes:");

        jLabel2.setText("Dita:");

        jLabel3.setText("Koha:");

        jLabel4.setText("Vendi nisjes:");

        jLabel5.setText("Destinacioni:");

        destinacioniField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                destinacioniFieldActionPerformed(evt);
            }
        });

        jButton1.setText("Ruaj");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Perditeso");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Pastro");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Fshije");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel6.setText("Autobusi:");

        jLabel7.setBackground(new java.awt.Color(102, 102, 102));
        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 153, 153));
        jLabel7.setText("Regjistro linjat e udhetimit");

        ditaComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "E hene", "E marte", "E merkure", "E enjte", "E premte", "E shtune", "E diele" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(210, 210, 210))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(194, 194, 194))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(autobusiComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(16, 16, 16)
                                        .addComponent(idLinjesField, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(kohaField)
                                    .addComponent(ditaComboBox, 0, 149, Short.MAX_VALUE))
                                .addGap(93, 93, 93)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(vendiNisjesField, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(destinacioniField, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(51, 51, 51))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 957, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(idLinjesField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(kohaField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel2)
                            .addComponent(ditaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(autobusiComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(vendiNisjesField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(destinacioniField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void destinacioniFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_destinacioniFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_destinacioniFieldActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     String vargu [] = autobusiComboBox.getSelectedItem().toString().split(" ");
        LinjatEUdhetimittbl lU = new LinjatEUdhetimittbl();
      Autobusettbl a = new Autobusettbl();
      a.setIDAutobusi(Integer.parseInt(vargu[0]));
      lU.setDita(ditaComboBox.getSelectedItem().toString());
      lU.setKoha(kohaField.getText());
      lU.setVendiNisjes(vendiNisjesField.getText());
      lU.setDestinacioni(destinacioniField.getText());
      lU.setIDAutobusi(a);
        try {
            luR.creat(lU);
            JOptionPane.showMessageDialog(null, "Linja u krijua");
            loadLinjatTable();
            tabelaSelectedIndexChangeLinjat();
        } catch (LinjatEUdhetimitException ex) {
            Logger.getLogger(LinjatForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      String vargu [] = autobusiComboBox.getSelectedItem().toString().split(" ");
         try {
            int row = LinjatTable.getSelectedRow();
            if(row != -1){
                LinjatEUdhetimittbl lU = new LinjatEUdhetimittbl();
      Autobusettbl a = new Autobusettbl();
      a.setIDAutobusi(Integer.parseInt(vargu[0]));
      lU.setDita(ditaComboBox.getSelectedItem().toString());
      lU.setKoha(kohaField.getText());
      lU.setVendiNisjes(vendiNisjesField.getText());
      lU.setDestinacioni(destinacioniField.getText());
      lU.setIDAutobusi(a);
        try {
            luR.edit(lU);
            loadLinjatTable();
            JOptionPane.showMessageDialog(null, "Linja u perditesua me sukses.");
        } catch (LinjatEUdhetimitException ex) {
            Logger.getLogger(LinjatForm.class.getName()).log(Level.SEVERE, null, ex);
        }
               
            }
            else{
                 JOptionPane.showMessageDialog(null, "Ju lutem zgjedheni Linjen per editim");
            }
           
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "This data exists!"+e);
        }
     
      
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
         int row = LinjatTable.getSelectedRow();
       if(row == -1){
           JOptionPane.showMessageDialog(null, "Please choose a costumer to delete!");
       }
       else{
          
           try {
               LinjatEUdhetimittbl c = lutm.getLinjatEUdhetimittbl(row);
               luR.delete(c);
               loadLinjatTable();
               
               JOptionPane.showMessageDialog(null, "Linja eshte fshire me sukses.");
           } catch (LinjatEUdhetimitException ex) {
               Logger.getLogger(KompaniaException.class.getName()).log(Level.SEVERE, null, ex);
               JOptionPane.showMessageDialog(null, ex);
           } 
       }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       kohaField.setText("");
       destinacioniField.setText("");
       vendiNisjesField.setText("");
       idLinjesField.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(LinjatForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LinjatForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LinjatForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LinjatForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new LinjatForm().setVisible(true);
                } catch (LinjatEUdhetimitException ex) {
                    Logger.getLogger(LinjatForm.class.getName()).log(Level.SEVERE, null, ex);
                } catch (AutobusiException ex) {
                    Logger.getLogger(LinjatForm.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable LinjatTable;
    private javax.swing.JComboBox<String> autobusiComboBox;
    private javax.swing.JTextField destinacioniField;
    private javax.swing.JComboBox<String> ditaComboBox;
    private javax.swing.JTextField idLinjesField;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField kohaField;
    private javax.swing.JTextField vendiNisjesField;
    // End of variables declaration//GEN-END:variables
}