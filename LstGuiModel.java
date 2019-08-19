/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guimodels;

import hotelprototype.Tables0;
import java.awt.Component;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

/**
 *
 * @author Aviator
 */
public class LstGuiModel implements ListCellRenderer {

    ListGuiModel listGuiModel;

    @Override
    public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
        listGuiModel = new ListGuiModel();
        listGuiModel.jLabel1.setText(String.valueOf(value));
        if (isSelected) {
            listGuiModel.setBackground(new java.awt.Color(0, 153, 102));
        }
        return listGuiModel;
    }

}
