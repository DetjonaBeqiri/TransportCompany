/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI_Model;

import BLL.Klientitbl;
import java.util.List;

/**
 *
 * @author detjona
 */
public class KlientitblTabelModel {
    List<Klientitbl> list;
   String [] cols = {"IdKlientit", "EmriKlientit", "MbiemriKlientit", "Nr_Telefonit", "Email", "IdRezervimit"};
   
   public KlientitblTabelModel(List<Klientitbl> list){
        this.list = list;
    }
   
   public void addList(List<Klientitbl> list){
        this.list = list;
    }
   
   
    public String getColumnName(int col){
        return cols[col];
    }
    
    
    
    public int getRowCount() {
           return list.size();
    }
    
    public void remove(int row){
        list.remove(row);
    }
    
    public Klientitbl getAdministrataTransportit(int index){
        return list.get(index);
    }

    
    public int getColumnCount() {
        return cols.length;
    }

    
    public Object getValueAt(int rowIndex, int columnIndex) {
    
        Klientitbl k = list.get(rowIndex);
        switch(columnIndex){
            case 0:
                return k.getIDKlientit();
            case 1:
                return k.getEmriKlientit();
            case 2:
                return k.getMbiemriKlientit();
            case 3:
                return k.getNrTelefonit();
            case 4:
                return k.getEmail();
            case 5: 
                return k.getIDRezervimit(); 
            default:
                return null;
        }
    }
   
}
