/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI_Model;

import BLL.LinjatEUdhetimittbl;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author detjona
 */
public class LinjatEUdhtimittblTabelModel extends AbstractTableModel{
        
   List<LinjatEUdhetimittbl> list;
   String [] cols = {"IdLinjave", "Dita", "Koha", "VendiNisjes", "Destinacioni","ID_Autobusi"};
    private Object at;
   
    public LinjatEUdhtimittblTabelModel(){}
   public LinjatEUdhtimittblTabelModel(List<LinjatEUdhetimittbl> list){
        this.list = list;
    }
   
   public void addList(List<LinjatEUdhetimittbl> list){
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
    
    public LinjatEUdhetimittbl getLinjatEUdhetimittbl(int index){
        return list.get(index);
    }

    
    public int getColumnCount() {
        return cols.length;
    }

    
    public Object getValueAt(int rowIndex, int columnIndex) {
    
        LinjatEUdhetimittbl lu= list.get(rowIndex);
        switch(columnIndex){
            case 0:
                return lu.getIDLinjave();
            case 1:
                return lu.getDita();
            case 2:
                return lu.getKoha();
            case 3:
                return lu.getVendiNisjes();
            case 4:
                return lu.getDestinacioni();
            case 5:
                return lu.getIDAutobusi().getIDAutobusi();
            default:
                return null;
        }
    }
    
}
