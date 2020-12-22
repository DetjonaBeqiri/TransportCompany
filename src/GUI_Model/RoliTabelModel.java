/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI_Model;

import BLL.Roli;
import java.util.List;

/**
 *
 * @author detjona
 */
public class RoliTabelModel {
            
   List<Roli> list;
   String [] cols = {"ID", "Emertimi"};
   
   public RoliTabelModel(List<Roli> list){
        this.list = list;
    }
   
   public void addList(List<Roli> list){
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
    
    public Roli getRoli(int index){
        return list.get(index);
    }

    
    public int getColumnCount() {
        return cols.length;
    }

    
    public Object getValueAt(int rowIndex, int columnIndex) {
    
        Roli ri= list.get(rowIndex);
        switch(columnIndex){
            case 0:
                return ri.getId();
            case 1:
                return ri.getEmertimi();
            default:
                return null;
        }
    }
    

}
