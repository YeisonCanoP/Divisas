package Ventanas;

import java.awt.Component;
import java.util.Hashtable;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

/**
 *
 * @author yeiso
 */
public class jComboBoxCambio extends JLabel implements ListCellRenderer {

    Hashtable<Object, ImageIcon> nElementos;
    ImageIcon nImg = new ImageIcon(this.getClass().getResource("/Banderas/Colombia.png"));

    public jComboBoxCambio(Hashtable<Object, ImageIcon> mElementos) {
        this.nElementos = mElementos;
    }
    
    
    @Override
    public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
            if (nElementos.get(value) == null) {
                setIcon(nImg);
            } else {
                setIcon(nElementos.get(value));
            }
            setText(value.toString());
            return this;
        }
}

 
