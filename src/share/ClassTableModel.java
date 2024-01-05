/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package share;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.Sinhvien;

/**
 *
 * @author nguye
 */
public class ClassTableModel {
    public DefaultTableModel setTableSinhVien(List<Sinhvien> listItem, String[] listColumn){
        DefaultTableModel dtm = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
            
            
        };
        dtm.setColumnIdentifiers(listColumn);
        int columns = listColumn.length;
        Object[] obj = null;
        int rows = listItem.size();
        
        if(rows > 0) {
            for(int i=0; i< rows; i++){
                Sinhvien sinhVien = listItem.get(i);
                obj = new Object[columns];
                obj[0] = sinhVien.getMasinhvien();
                obj[1] = sinhVien.getTensinhvien();
                dtm.addRow(obj);
            }
        }
        return dtm;
    }
}
