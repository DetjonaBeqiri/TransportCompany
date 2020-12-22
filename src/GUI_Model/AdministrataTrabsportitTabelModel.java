/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI_Model;


import java.util.List;
import BLL.AdministrataTransportit;

/**
 *
 * @author detjona
 */
public class AdministrataTrabsportitTabelModel {
        
   List<AdministrataTransportit> list;
   String [] cols = {"EmriAdministrates", "NrPunonjesve", "IdAdministrates"};
   
   public AdministrataTrabsportitTabelModel(List<AdministrataTransportit> list){
        this.list = list;
    }
   
   public void addList(List<AdministrataTransportit> list){
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
    
    public AdministrataTransportit getAdministrataTransportit(int index){
        return list.get(index);
    }

    
    public int getColumnCount() {
        return cols.length;
    }

    
    public Object getValueAt(int rowIndex, int columnIndex) {
    
        AdministrataTransportit at= list.get(rowIndex);
        switch(columnIndex){
            case 0:
                return at.getEmriadministrates();
            case 1:
                return at.getNrpunonjesve();
            case 2:
                return at.getIDAdministrates();
            default:
                return null;
        }
    }
    
}
