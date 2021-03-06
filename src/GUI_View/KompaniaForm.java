/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI_View;

import BLL.Kompaniatbl;
import BLL.PuntoriKompanistbl;
import BLL.Singleton;
import DAL.KompaniaException;
import DAL.KompaniaRepository;
import GUI_Model.KompaniatblTabelModel;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.text.SimpleDateFormat;  
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author detjona
 */
public class KompaniaForm extends javax.swing.JFrame {

    /**
     * Creates new form KompaniaForm
     */
        KompaniaRepository kR = new KompaniaRepository();
    KompaniatblTabelModel ktbm  = new KompaniatblTabelModel();
    List<Kompaniatbl> list ;
    SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");  
    Date date = new Date();  
    double tax = Singleton.getTax();
    
    public KompaniaForm() throws KompaniaException {
        
        initComponents();
        loadKompaniaTable();
        tabelaSelectedIndexChangeKompania();
        idField.setText(String.valueOf(Singleton.idPuntorit));
        idKompaniseField.disable();
        idField.disable();
        taxField.setText(String.valueOf(tax));
        taxField.disable();
        
    }
  public void loadKompaniaTable() throws KompaniaException{
        try{
            List<Kompaniatbl> kompanite = kR.findAll();
            ktbm.addList(kompanite);
            kompanitEUdhetimitTable.setModel(ktbm);
            repaint();
            revalidate();
        }catch(KompaniaException cE){
            Logger.getLogger(KompaniaException.class.getName()).log(Level.SEVERE,null,cE);
        }
    }
    private void tabelaSelectedIndexChangeKompania(){
        final ListSelectionModel rowSM = kompanitEUdhetimitTable.getSelectionModel();
        rowSM.addListSelectionListener(new ListSelectionListener(){

            
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if(e.getValueIsAdjusting()){
                    return;
                }
                
                ListSelectionModel rowSM = (ListSelectionModel) e.getSource();
                int selectedIndex = rowSM.getAnchorSelectionIndex();
                if(selectedIndex > -1){
                    Kompaniatbl c = ktbm.getKompaniatbl(selectedIndex);
                    idKompaniseField.setText(c.getIDKompanise().toString());
                    emriKompaniseField.setText(c.getEmriKompanise());
                    numriLicensesField.setText(c.getNumriLicenses());
                    idField.setText(c.getIDPuntori().getIDPuntori().toString());
                    dataRegjistrimitField.setDate(date);
                    emriPronaritField.setText(c.getEmriPronarit());
                    mbiemriPronaritField.setText(c.getMbiemriPronarit());
                    dataLindjesField.setDate(c.getDataLindjes());
                    numriPersonalField.setText(c.getNumriPersonal());
                    numriTelefonitField.setText(c.getNumriTelefonit());
                    vendbanimiField.setText(c.getVendbanimi());
                    pagesaField.setText(c.getPagesa());
                    
                   
                    
                    
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        kompanitEUdhetimitTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        idKompaniseField = new javax.swing.JTextField();
        emriKompaniseField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        numriLicensesField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        emriPronaritField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        mbiemriPronaritField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        vendbanimiField = new javax.swing.JTextField();
        numriPersonalField = new javax.swing.JTextField();
        numriTelefonitField = new javax.swing.JTextField();
        pagesaField = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        idField = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        totaliPagesesField = new javax.swing.JTextField();
        taxField = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Regjistrimi i kompanise");

        kompanitEUdhetimitTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Emri i Kompanise", "Nr_Licenses", "Qyteti", "Emri Pronarit", "Mbiemri Pronarit", "Datelindja", "Nr Personal", "Nr Tel"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Long.class, java.lang.Long.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(kompanitEUdhetimitTable);

        jButton1.setText("Kthehu");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("ID e kompanise:");

        jLabel3.setText("Emri kompanise:");

        jLabel4.setText("Numri licenses:");

        jLabel5.setText("Emri pronarit:");

        jLabel6.setText("Mbiemri pronarit:");

        jLabel7.setText("Data lindjes:");

        jLabel8.setText("Vendbanimi:");

        jLabel9.setText("Nr. personal:");

        jLabel10.setText("Nr. telefonit:");

        numriTelefonitField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numriTelefonitFieldActionPerformed(evt);
            }
        });

        jLabel11.setText("Pagesa:");

        jLabel13.setText("ID e puntorit:");

        jLabel14.setText("Tax:");

        jButton2.setText("Pastro");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Ruaj");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Perditeso");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Fshij");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Totali:");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel12.setText("Data regjistrimit:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(idKompaniseField, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                            .addComponent(emriKompaniseField, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                            .addComponent(numriLicensesField, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                            .addComponent(idField, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                            .addComponent(jDateChooser2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel7)
                            .addComponent(jLabel9))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(emriPronaritField, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                            .addComponent(mbiemriPronaritField, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                            .addComponent(numriPersonalField, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                            .addComponent(numriTelefonitField)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel11))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel14))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(vendbanimiField, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pagesaField, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(taxField, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(totaliPagesesField, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(95, 95, 95)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1078, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel1))
                    .addComponent(jButton1))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(idKompaniseField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(7, 7, 7)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(emriKompaniseField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(numriLicensesField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel4))
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel5)
                                .addGap(15, 15, 15)
                                .addComponent(jLabel6))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(emriPronaritField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(9, 9, 9)
                                .addComponent(mbiemriPronaritField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(numriPersonalField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel8)
                                .addGap(16, 16, 16)
                                .addComponent(jLabel11)
                                .addGap(15, 15, 15)
                                .addComponent(jLabel14))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton3)
                                .addGap(5, 5, 5)
                                .addComponent(jButton4)
                                .addGap(5, 5, 5)
                                .addComponent(jButton5)
                                .addGap(5, 5, 5)
                                .addComponent(jButton2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(numriTelefonitField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel10))
                            .addComponent(jLabel12)
                            .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(vendbanimiField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(pagesaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(taxField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(totaliPagesesField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton6))))
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
      
        this.setVisible(false);
   
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        idKompaniseField.setText("");
         emriKompaniseField.setText("");
          numriLicensesField.setText("");
           idField.setText("");
            emriPronaritField.setText("");
             mbiemriPronaritField.setText("");
              dataLindjesField.setDateFormatString("");
               vendbanimiField.setText("");
                numriPersonalField.setText("");
                 numriTelefonitField.setText("");
                  pagesaField.setText("");
//                   dataRegjistrimitField.setDateFormatString("");
                   taxField.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
     if(emriKompaniseField.getText().isEmpty() || numriLicensesField.getText().isEmpty() || emriPronaritField.getText().isEmpty() || mbiemriPronaritField.getText().isEmpty() || 
             dataLindjesField.getDateFormatString().isEmpty() || vendbanimiField.getText().isEmpty() || numriPersonalField.getText().isEmpty() || numriTelefonitField.getText().isEmpty() ||
             totaliPagesesField.getText().isEmpty()){
          JOptionPane.showMessageDialog(null, "Ju lutem shenoni te dhenat e kompanise!");
         
     }
     else{
         
          System.out.println(Singleton.idPuntorit);
        PuntoriKompanistbl p = new PuntoriKompanistbl();
                
                p.setIDPuntori(Singleton.idPuntorit);
               Kompaniatbl c =new Kompaniatbl();
                
               c.setEmriKompanise(emriKompaniseField.getText());
               c.setNumriLicenses(numriLicensesField.getText());
               c.setEmriPronarit(emriPronaritField.getText());
               c.setMbiemriPronarit(mbiemriPronaritField.getText());
               c.setDataLindjes(dataLindjesField.getDate());
               c.setVendbanimi(vendbanimiField.getText());
               c.setNumriPersonal(numriPersonalField.getText());
               c.setNumriTelefonit(numriTelefonitField.getText());
               c.setPagesa(totaliPagesesField.getText());
               c.setIDDataRegjistrimit(date);
               c.setIDPuntori(p);
               
            try {
                kR.creat(c);
                  loadKompaniaTable();
                  repaint();
                  revalidate();
                   JOptionPane.showMessageDialog(null, "Kompania u shtua me sukses.");
            } catch (KompaniaException ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        
     }
        
       
               
              
               
       
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
         try {
            int row = kompanitEUdhetimitTable.getSelectedRow();
            if(row != -1){
               Kompaniatbl c =new Kompaniatbl();
                PuntoriKompanistbl p = new PuntoriKompanistbl();
                
                p.setIDPuntori(Singleton.idPuntorit);
//               c.setCostumerID(Integer.parseInt(idField.getText()));
               c.setEmriKompanise(emriKompaniseField.getText());
               c.setNumriLicenses(numriLicensesField.getText());
               c.setEmriPronarit(emriPronaritField.getText());
               c.setMbiemriPronarit(mbiemriPronaritField.getText());
               c.setDataLindjes(dataLindjesField.getDate());
               c.setVendbanimi(vendbanimiField.getText());
               c.setNumriPersonal(numriPersonalField.getText());
               c.setNumriTelefonit(numriTelefonitField.getText());
               c.setPagesa(pagesaField.getText());
               c.setIDDataRegjistrimit(date);
               c.setIDPuntori(p);
               
                kR.creat(c);
                JOptionPane.showMessageDialog(null, "Te dhenat u perditesuan me sukses.");
                loadKompaniaTable();
               
            }
            else{
                 JOptionPane.showMessageDialog(null, "Ju lutem zgjedheni kompanine per editim");
            }
           
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "This data exists!"+e);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        int row = kompanitEUdhetimitTable.getSelectedRow();
       if(row == -1){
           JOptionPane.showMessageDialog(null, "Please choose a costumer to delete!");
       }
       else{
          
           try {
               Kompaniatbl c = ktbm.getKompaniatbl(row);
               kR.delete(c);
               loadKompaniaTable();
               JOptionPane.showMessageDialog(null, "Kompania eshte fshire me sukses.");
           } catch (KompaniaException ex) {
               Logger.getLogger(KompaniaException.class.getName()).log(Level.SEVERE, null, ex);
               JOptionPane.showMessageDialog(null, ex);
           }
       }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void numriTelefonitFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numriTelefonitFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numriTelefonitFieldActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        double pagesa = Double.parseDouble(pagesaField.getText());
        double taksa = Double.parseDouble(taxField.getText());
        double all = pagesa+taksa;
        totaliPagesesField.setText(String.valueOf(all));
    }//GEN-LAST:event_jButton6ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField emriKompaniseField;
    private javax.swing.JTextField emriPronaritField;
    private javax.swing.JTextField idField;
    private javax.swing.JTextField idKompaniseField;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable kompanitEUdhetimitTable;
    private javax.swing.JTextField mbiemriPronaritField;
    private javax.swing.JTextField numriLicensesField;
    private javax.swing.JTextField numriPersonalField;
    private javax.swing.JTextField numriTelefonitField;
    private javax.swing.JTextField pagesaField;
    private javax.swing.JTextField taxField;
    private javax.swing.JTextField totaliPagesesField;
    private javax.swing.JTextField vendbanimiField;
    // End of variables declaration//GEN-END:variables

  
}
