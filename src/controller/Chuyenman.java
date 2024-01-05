/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import design.BangdiemJPanel;
import design.ChitietlophocphanJPanel;
import design.GiangvienJPanel;
import design.HocphanJPanel;
import design.LopbiencheJPanel;
import design.LophocphanJPanel;
import design.SinhvienJPanel;
import design.TrangchuJPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JPanel;
import share.DanhMuc;

/**
 *
 * @author nguye
 */
public class Chuyenman {
    private JPanel root;
    private String kindSelected = "";

    private  List<DanhMuc> listItem = null ;
    
    public Chuyenman(JPanel pnRoot) {
        this.root = pnRoot;
    }
    
    public void setView(JPanel jpnItem, JLabel jpnLabel){
        kindSelected = "TrangChu";
        
        jpnItem.setBackground(new Color(204,204,255));
        jpnLabel.setBackground(new Color(255,255,255));

        root.removeAll();
        root.setLayout(new BorderLayout());
        root.add(new TrangchuJPanel());
        root.validate();
        root.repaint();
        
    }
    
    
    public void setEvent(List<DanhMuc> listItem) {
        this.listItem = listItem;
        for(DanhMuc item : listItem) {
            item.getJlb().addMouseListener(new LabelEvent(item.getKind(), item.getJpn(), item.getJlb()));
        }
    }
    

    public void setChangeBackGround(String kind){
        for(DanhMuc item: listItem){
            if(item.getKind().equalsIgnoreCase(kind)){
                item.getJpn().setBackground(new Color(204,180,255));
                item.getJlb().setForeground(new Color(10,10,180));
            } else {
                item.getJpn().setBackground(new Color(204,204,255));
                item.getJlb().setForeground(new Color(255,255,255));

            }
        }
    }
    
    class LabelEvent implements MouseListener {
        
        private JPanel node;
        
        private String kind;
        private JPanel jpnItem;
        private JLabel jlblItem;

        public LabelEvent(String kind, JPanel jpnItem, JLabel jlblItem) {
            this.kind = kind;
            this.jpnItem = jpnItem;
            this.jlblItem = jlblItem;
        }

        @Override
        public void mouseClicked(MouseEvent e) {
            switch (kind) {
                case "TrangChu": 
                    node = new TrangchuJPanel();
                    break;
                case "Giangvien": 
                    node = new GiangvienJPanel();
                    break;
                case "Sinhvien": 
                    node = new SinhvienJPanel();
                    break;
                case "Hocphan": 
                    node = new HocphanJPanel();
                    break;
                case "Lopbienche": 
                    node = new LopbiencheJPanel();
                    break;
                case "Lophocphan": 
                    node = new LophocphanJPanel();
                    break;
                case "Bangdiem": 
                    node = new BangdiemJPanel();
                    break;
                case "Chitietlophocphan": 
                    node = new ChitietlophocphanJPanel();
                    break;
                default:
                    node = new TrangchuJPanel();
                    break;
            }
            root.removeAll();
            root.setLayout(new BorderLayout());
            root.add(node);
            root.validate();
            root.repaint();
            
            setChangeBackGround(kind);
        }

        @Override
        public void mousePressed(MouseEvent e) {
//            kindSelected = kind;
//            jpnItem.setBackground(new Color(204,170,255));
//            jlblItem.setBackground(new Color(255,255,255));
        }

        @Override
        public void mouseReleased(MouseEvent e) {
        }

        @Override
        public void mouseEntered(MouseEvent e) {
//            jpnItem.setBackground(new Color(204,170,255));
//            jlblItem.setBackground(new Color(255,255,255));
        }

        @Override
        public void mouseExited(MouseEvent e) {
//            if(kindSelected.equals(kind)) {
//                jpnItem.setBackground(new Color(204,204,255));
//                jlblItem.setBackground(new Color(255,255,255));
//            }
        }
        
    }
    

}
