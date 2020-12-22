/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI_Model;

import BLL.Rezervimettbl;
import java.util.List;

/**
 *
 * @author detjona
 */
public class RezervimettblTabelModel {
        
   List<Rezervimettbl> list;
   String [] cols = {"IdRezervimet", "IdKlientit", "DataRezervimit", "IdLinjat", "Pagesa"};
   
   public RezervimettblTabelModel(List<Rezervimettbl> list){
        this.list = list;
    }
   
   public void addList(List<Rezervimettbl> list){
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
    
    public Rezervimettbl getRezervimettbl(int index){
        return list.get(index);
    }

    
    public int getColumnCount() {
        return cols.length;
    }

    
    public Object getValueAt(int rowIndex, int columnIndex) {
    
        Rezervimettbl rt= list.get(rowIndex);
        switch(columnIndex){
            case 0:
                return rt.getIDRezervimet();
            case 1:
                return rt.getIDKlientit();
            case 2:
                return rt.getDataRezervimit();
            case 3:
                return rt.getIDLinjat();
            case 4:
                return rt.getPagesa();
            default:
                return null;
        }
    }
    

}
