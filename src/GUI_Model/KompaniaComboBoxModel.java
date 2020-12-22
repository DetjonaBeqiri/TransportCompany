/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI_Model;

import BLL.Kompaniatbl;
import java.util.List;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;

/**
 *
 * @author detjona
 */
public class KompaniaComboBoxModel extends AbstractListModel<Kompaniatbl> implements ComboBoxModel<Kompaniatbl>{
    private List<Kompaniatbl> LUT;
    private Kompaniatbl selectedItem;
    
    public KompaniaComboBoxModel (){}
    
    public KompaniaComboBoxModel (List<Kompaniatbl> LUT) {
        this.LUT = LUT;
    }
    
    public void add (List<Kompaniatbl> LUT){
        this.LUT = LUT;
    }
    
    @Override
    public int getSize() {
        return LUT.size();
    }

    @Override
    public Kompaniatbl getElementAt(int index) {
        return LUT.get(index);
    }

    @Override
    public void setSelectedItem(Object anItem) {
        selectedItem = (Kompaniatbl)anItem;
    }

    @Override
    public Object getSelectedItem() {
        return selectedItem; 
    }
    
    
}
