/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI_Model;

import BLL.PuntoriKompanistbl;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author detjona
 */
public class PuntoriKompanistblTabelModel extends AbstractTableModel {
            
   List<PuntoriKompanistbl> list;
   String [] cols = {"IdPuntori", "Emri", "Mbiemri", "NumriTelefonit", "DataLindjes", "Pagesa"};
   
   public PuntoriKompanistblTabelModel(){
       
   }
   public PuntoriKompanistblTabelModel(List<PuntoriKompanistbl> list){
        this.list = list;
    }
   
   public void addList(List<PuntoriKompanistbl> list){
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
    
    public PuntoriKompanistbl getPuntoriKompanistbl(int index){
        return list.get(index);
    }

    
    public int getColumnCount() {
        return cols.length;
    }

    
    public Object getValueAt(int rowIndex, int columnIndex) {
    
        PuntoriKompanistbl pk= list.get(rowIndex);
        switch(columnIndex){
            case 0:
                return pk.getIDPuntori();
            case 1:
                return pk.getEmri();
            case 2:
                return pk.getMbiemri();
            case 3: 
                return pk.getNumriTelefonit();
            case 4:
                return pk.getDataLindjes();
            case 5:
                return pk.getPagesa();
            default:
                return null;
        }
    }
    

}
