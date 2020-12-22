/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI_Model;

import BLL.Autobusettbl;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author detjona
 */
public class AutobusettblTabelModel  extends AbstractTableModel{
    List<Autobusettbl> list;
    String [] cols = {"IdAutobusi", "EmriAutobusit", "Shoferi", "Kondukteri", "ID_Kompanise"};
    
    
    public AutobusettblTabelModel(){
        
    }
    public AutobusettblTabelModel(List<Autobusettbl> list){
        this.list = list;
    }
   
   public void addList(List<Autobusettbl> list){
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
    
    public Autobusettbl getAutobusettbl(int index){
        return list.get(index);
    }

    
    public int getColumnCount() {
        return cols.length;
    }

    
    public Object getValueAt(int rowIndex, int columnIndex) {
    
        Autobusettbl ab= list.get(rowIndex);
        switch(columnIndex){
            case 0:
                return ab.getIDAutobusi();
            case 1:
                return ab.getEmriAutobusit();
            case 2:
                return ab.getShoferi();
            case 3:
                return ab.getKondukteri();
            case 4: 
                return ab.getIDKompanise().getIDKompanise();
            default:
                return null;
        }
    }
}
