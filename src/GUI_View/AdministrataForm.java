/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI_View;

import BLL.Autobusettbl;
import BLL.Kompaniatbl;
import BLL.LinjatEUdhetimittbl;
import BLL.Singleton;
import DAL.AdministrataFormException;
import DAL.AutobusettblRepository;
import DAL.AutobusiException;
import DAL.KompaniaException;
import DAL.KompaniaRepository;
import DAL.LinjatEUdhetimitException;
import DAL.LinjatEUdhetimittblRepository;
import DAL.PuntoriException;
import GUI_Model.AutobusettblTabelModel;
import GUI_Model.KompaniatblTabelModel;
import GUI_Model.LinjatEUdhtimittblTabelModel;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.geometry.Side;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import sun.net.idn.Punycode;

/**
 *
 * @author detjona
 */

public class AdministrataForm extends javax.swing.JFrame {

    /**
     * Creates new form AdministrataForm
     */
    
        
    KompaniaRepository kR = new KompaniaRepository();
    KompaniatblTabelModel ktbm  = new KompaniatblTabelModel();
    List<Kompaniatbl> list ;
    
    LinjatEUdhetimittblRepository luR  = new LinjatEUdhetimittblRepository();
    LinjatEUdhtimittblTabelModel lutbm = new LinjatEUdhtimittblTabelModel();
    List<LinjatEUdhetimittbl> listaLinjave ;
    
    AutobusettblRepository aR  = new AutobusettblRepository();
    AutobusettblTabelModel abm = new AutobusettblTabelModel();
    
   
    List<Autobusettbl> autobuset ;
    
    boolean eshteZgjedhurKompania = false;
    boolean klikoAutobuset = false;
    
    static int idKompanise = 0;
     void setIDKompanise(int i){
        idKompanise = i;
    }
    public AdministrataForm() throws KompaniaException, LinjatEUdhetimitException, AutobusiException {
        initComponents();
        loadKompaniaTable();
        tabelaSelectedIndexChangeKompania();
        loadLinjatTable();
        tabelaSelectedIndexChangeLinjat();
        loadAutobusetTable();
        tabelaSelectedIndexChangeAutobuset();
        
    }
    
    public void loadLinjatTable() throws LinjatEUdhetimitException{
          try{
            List<LinjatEUdhetimittbl> linjat = luR.findAll();
            lutbm.addList(linjat);
            LinjatEUdhetimitTable.setModel(lutbm);
        }catch(LinjatEUdhetimitException cE){
            Logger.getLogger(LinjatEUdhetimitException.class.getName()).log(Level.SEVERE,null,cE);
        }
    }
      private void tabelaSelectedIndexChangeLinjat(){
        final ListSelectionModel rowSM = LinjatEUdhetimitTable.getSelectionModel();
        rowSM.addListSelectionListener(new ListSelectionListener(){
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if(e.getValueIsAdjusting()){
                    return;
                }
                ListSelectionModel rowSM = (ListSelectionModel) e.getSource();
                int selectedIndex = rowSM.getAnchorSelectionIndex();
                if(selectedIndex > -1){
                    LinjatEUdhetimittbl c = lutbm.getLinjatEUdhetimittbl(selectedIndex);
                   
                } //To change body of generated methods, choose Tools | Templates.
            }
        });
    }
  public void loadKompaniaTable() throws KompaniaException{
        try{
            List<Kompaniatbl> kompanite = kR.findAll();
            ktbm.addList(kompanite);
            kompanitEUdheimitTable.setModel(ktbm);
        }catch(KompaniaException cE){
            Logger.getLogger(KompaniaException.class.getName()).log(Level.SEVERE,null,cE);
        }
    }
    private void tabelaSelectedIndexChangeKompania(){
        final ListSelectionModel rowSM = kompanitEUdheimitTable.getSelectionModel();
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
                     LinjatForm.idKompanise = c.getIDKompanise();
                     eshteZgjedhurKompania = true;
                    
                } //To change body of generated methods, choose Tools | Templates.
            }
        });
    }
     public void loadAutobusetTable() throws AutobusiException{
          try{
            List<Autobusettbl> linjat = aR.findAll();
            abm.addList(linjat);
            AutobusetTable.setModel(abm);
        }catch(AutobusiException cE){
            Logger.getLogger(Autobusettbl.class.getName()).log(Level.SEVERE,null,cE);
        }
    }
      private void tabelaSelectedIndexChangeAutobuset(){
        final ListSelectionModel rowSM = AutobusetTable.getSelectionModel();
        rowSM.addListSelectionListener(new ListSelectionListener(){
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if(e.getValueIsAdjusting()){
                    return;
                }
                ListSelectionModel rowSM = (ListSelectionModel) e.getSource();
                int selectedIndex = rowSM.getAnchorSelectionIndex();
                if(selectedIndex > -1){
                    Autobusettbl c = abm.getAutobusettbl(selectedIndex);
                    
                
                    setIDKompanise(c.getIDKompanise().getIDKompanise());
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jScrollPane2 = new javax.swing.JScrollPane();
        LinjatEUdhetimitTable = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        kompanitEUdheimitTable = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        AutobusetTable = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        kerkoField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        LinjatEUdhetimitTable.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        LinjatEUdhetimitTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", "", "", null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Koha e Nisjes", "Vendi i Nisjes", "Destinacioni", "Kohezgjatja"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(LinjatEUdhetimitTable);

        jButton3.setText("Shto kompanine");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Autobuset");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Colonna MT", 1, 48)); // NOI18N
        jLabel1.setText("Transport Company Application");

        kompanitEUdheimitTable.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        kompanitEUdheimitTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", "", "", null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Koha e Nisjes", "Vendi i Nisjes", "Destinacioni", "Kohezgjatja"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(kompanitEUdheimitTable);

        jButton2.setText("Shto linjat");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Te dhenat e kompanise");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Te dhenat e linjave");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Te dhenat e Autobuseve");

        AutobusetTable.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        AutobusetTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", "", "", null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Koha e Nisjes", "Vendi i Nisjes", "Destinacioni", "Kohezgjatja"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane4.setViewportView(AutobusetTable);

        jLabel5.setText("Kerko sipas kompanise:");

        jButton1.setText("Kerko");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton5.setText("Shto puntorin");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(265, 265, 265)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 869, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 177, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 588, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(kerkoField, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1)
                                .addGap(15, 15, 15))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 646, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(22, 22, 22)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 1263, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(26, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5)
                                .addComponent(kerkoField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addGap(29, 29, 29)
                .addComponent(jLabel2)
                .addGap(272, 272, 272)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(233, 233, 233)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(327, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        KompaniaForm kompania;
        try {
            kompania = new KompaniaForm();
            kompania.setVisible(true);
        } catch (KompaniaException ex) {
            Logger.getLogger(AdministrataForm.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
       
            AutobusetForm autobuset;
        try {
            autobuset = new AutobusetForm();
            autobuset.setVisible(true); 
            
        } catch (KompaniaException ex) {
            Logger.getLogger(AdministrataForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       
       
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
        
        if(eshteZgjedhurKompania == true){
        LinjatForm lF;
        try {
            lF = new LinjatForm();
               lF.setVisible(true);
        } catch (LinjatEUdhetimitException ex) {
            Logger.getLogger(AdministrataForm.class.getName()).log(Level.SEVERE, null, ex);
        }   catch (AutobusiException ex) {
                Logger.getLogger(AdministrataForm.class.getName()).log(Level.SEVERE, null, ex);
            }
      }
        else{
            JOptionPane.showMessageDialog(null, "Ju lutem zgjedheni autobusin per linja");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        DefaultTableModel modelTable = new DefaultTableModel();
        if(kerkoField.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "Nuk keni shtypur asgje. \nJu lutem shtypeni emrin e kompanise qe deshironi te kerkoni!");
       }else{
           try {
               AutobusetTable.setModel(modelTable);
               AutobusetTable.validate();
               List<Kompaniatbl> lista = new ArrayList<>();
               Kompaniatbl kompania = kR.findByID(kerkoField.getText());
               lista.add(kompania);
                ktbm.addList(lista);
                
            AutobusetTable.setModel(abm);
               JOptionPane.showMessageDialog(null, kompania.getEmriKompanise());
           } catch (KompaniaException ex) {
               Logger.getLogger(AdministrataForm.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       ShtoPuntorinForm p;
        try {
            p = new ShtoPuntorinForm();
             p.setVisible(true);
        } catch (PuntoriException ex) {
            Logger.getLogger(AdministrataForm.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_jButton5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable AutobusetTable;
    private javax.swing.JTable LinjatEUdhetimitTable;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField kerkoField;
    private javax.swing.JTable kompanitEUdheimitTable;
    // End of variables declaration//GEN-END:variables
}
