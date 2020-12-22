/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI_Model;

import BLL.LinjatEUdhetimittbl;
import java.util.List;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;

/**
 *
 * @author detjona
 */
public class AdministrataTransportitComboBoxModel extends AbstractListModel<LinjatEUdhetimittbl> implements ComboBoxModel<LinjatEUdhetimittbl> {

    private List<LinjatEUdhetimittbl> LUT;
    private LinjatEUdhetimittbl selectedItem;
    
    public AdministrataTransportitComboBoxModel (){}
    
    public AdministrataTransportitComboBoxModel (List<LinjatEUdhetimittbl> LUT) {
        this.LUT = LUT;
    }
    
    public void add (List<LinjatEUdhetimittbl> LUT){
        this.LUT = LUT;
    }
    
    @Override
    public int getSize() {
        return LUT.size();
    }

    @Override
    public LinjatEUdhetimittbl getElementAt(int index) {
        return LUT.get(index);
    }

    @Override
    public void setSelectedItem(Object anItem) {
        selectedItem = (LinjatEUdhetimittbl)anItem;
    }

    @Override
    public Object getSelectedItem() {
        return selectedItem; 
    }
    
}
