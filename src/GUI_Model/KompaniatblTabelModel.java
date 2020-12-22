/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI_Model;

import BLL.Kompaniatbl;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author detjona
 */
public class KompaniatblTabelModel extends AbstractTableModel{
            
   List<Kompaniatbl> list;
   String [] cols =  {"IdKompanise", "EmriKompanise", "NumriLicenses", "EmriPronarit", "MbiemriPronarit", "DataLindjes", "Vendbanimi", "NumriPersonal", "NumriTelefonit", "Pagesa", "DataRegjistrimit", "IdPuntori"};
   
   public KompaniatblTabelModel(){
       
   }
   public KompaniatblTabelModel(List<Kompaniatbl> list){
        this.list = list;
    }
   
   public void addList(List<Kompaniatbl> list){
        this.list = list;
    }
   
   
   @Override
    public String getColumnName(int col){
        return cols[col];
    }
    
    
    
   @Override
    public int getRowCount() {
           return list.size();
    }
    
    public void remove(int row){
        list.remove(row);
    }
    
    public Kompaniatbl getKompaniatbl(int index){
        return list.get(index);
    }

    
   @Override
    public int getColumnCount() {
        return cols.length;
    }

    
   @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
    
        Kompaniatbl kt= list.get(rowIndex);
        switch(columnIndex){
            case 0:
                return kt.getIDKompanise();
            case 1:
                return kt.getEmriKompanise();
            case 2:
                return kt.getNumriLicenses();
            case 3:
                return kt.getEmriPronarit();
            case 4: 
                return kt.getMbiemriPronarit();
            case 5:
                return getDateToString(kt.getDataLindjes());
            case 6:
                return kt.getVendbanimi();
            case 7:
                return kt.getNumriPersonal();
            case 8:
                return kt.getNumriTelefonit();
            case 9:
                return kt.getPagesa();
            case 10:
                return getDateToString(kt.getIDDataRegjistrimit());
            case 11:
                return kt.getIDPuntori().getIDPuntori();
       
            default:
                return null;
        }
    }
    
    public String getDateToString(Date d){
        DateFormat da = new SimpleDateFormat("yyyy/MM/dd");
        return da.format(d);
    }
    
}
