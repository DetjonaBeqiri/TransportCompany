/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI_Model;

import BLL.StafiAdministratestbl;
import java.util.List;

/**
 *
 * @author detjona
 */
public class StafiAdministratestblTabelModel {
          
   List<StafiAdministratestbl> list;
   String [] cols = {"IdPunonjesit", "Emri", "Mbiemri", "DataLindjes", "DataLindjes", "DataFillimit", "PagesaMujore", "Pozita"};
   
   public StafiAdministratestblTabelModel(List<StafiAdministratestbl> list){
        this.list = list;
    }
   
   public void addList(List<StafiAdministratestbl> list){
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
    
    public StafiAdministratestbl getStafiAdministratestbl(int index){
        return list.get(index);
    }

    
    public int getColumnCount() {
        return cols.length;
    }

    
    public Object getValueAt(int rowIndex, int columnIndex) {
    
        StafiAdministratestbl sa= list.get(rowIndex);
        switch(columnIndex){
            case 0:
                return sa.getIDPunonjesit();
            case 1:
                return sa.getEmri();
            case 2:
                return sa.getMbiemri();
            case 3:
                return sa.getDataLindjes();
            case 4:
                return sa.getDataFillimit();
            case 5:
                return sa.getPagesaMujore();
            case 6:
                return sa.getPozita();
            default:
                return null;
        }
    }
    
   
}
