/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI_Model;

import BLL.Perdoruesi;
import java.util.List;

/**
 *
 * @author detjona
 */
public class PerdoruesiTabelModel {
            
   List<Perdoruesi> list;
   String [] cols = {"ID", "Username", "Password", "RoliID"};
   
   public PerdoruesiTabelModel(List<Perdoruesi> list){
        this.list = list;
    }
   
   public void addList(List<Perdoruesi> list){
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
    
    public Perdoruesi getPerdoruesi(int index){
        return list.get(index);
    }

    
    public int getColumnCount() {
        return cols.length;
    }

    
    public Object getValueAt(int rowIndex, int columnIndex) {
    
        Perdoruesi p= list.get(rowIndex);
        switch(columnIndex){
            case 0:
                return p.getId();
            case 1:
                return p.getUsername();
            case 2:
                return p.getPassword();
            case 3:
                return p.getRoliID();
            default:
                return null;
        }
    }
    
}
