/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package design.popup;
import com.toedter.calendar.JDateChooser;
import controller.MyComboBox;
import dao.BangDiemDAO;
import dao.HocPhanDAO;
import dao.SinhVienDAO;
import design.BangdiemJPanel;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import model.BangDiem;
import model.SinhVien;
import model.HocPhan;

/**
 *
 * @author nguye
 */
public class BangdiemJFrame extends javax.swing.JFrame {

    /**
     * Creates new form SinhvienJFrame
     */
    private BangdiemJPanel bangdiemJPanel;
    private BangDiem bangdiem;
    private Boolean isUpdate ;
    public BangdiemJFrame(BangdiemJPanel bangdiemJPanel, BangDiem bangdiem, Boolean isUpdate) {
        initComponents();
        this.bangdiemJPanel = bangdiemJPanel;
        this.bangdiem = bangdiem;
        this.isUpdate = isUpdate;
        loadCombobox();
        if (isUpdate ) {
            loadDataUpdate();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtDcc = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        dpNgayThi = new com.toedter.calendar.JDateChooser();
        cbSV = new javax.swing.JComboBox<>();
        cbHp = new javax.swing.JComboBox<>();
        txtDthi = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(51, 255, 51));

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(255, 102, 0), new java.awt.Color(204, 153, 0)));
        jPanel1.setPreferredSize(new java.awt.Dimension(700, 400));

        jButton1.setBackground(new java.awt.Color(112, 112, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Lưu");
        jButton1.setPreferredSize(new java.awt.Dimension(125, 42));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Điểm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 0, 18), new java.awt.Color(255, 0, 0))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Tên Học Phần");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Điểm Chuyên Cần");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Điểm Thi");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Tên SV");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Ngày Thi");

        cbSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSVActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel2)
                        .addGap(18, 18, Short.MAX_VALUE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbSV, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtDcc)
                    .addComponent(txtDthi, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dpNgayThi, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbHp, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel7)
                    .addComponent(jLabel1)
                    .addComponent(cbSV, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbHp, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(dpNgayThi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txtDcc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDthi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addContainerGap(120, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 706, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (this.isUpdate ) {
            updateData();
        }else {
           insertData();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cbSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbSVActionPerformed

    private void insertData() {
        try {
            MyComboBox item1 =(MyComboBox)cbSV.getSelectedItem();
            bangdiem.setId_sinhvien(item1.MaInt());
            
            MyComboBox item2 =(MyComboBox)cbHp.getSelectedItem();
            bangdiem.setId_hocphan(item2.MaInt());
            
            bangdiem.setNgay_thi(ConvertDate(dpNgayThi));
            bangdiem.setDiem_chuyen_can(new BigDecimal(txtDcc.getText()));
            bangdiem.setDiem_thi(new BigDecimal(txtDthi.getText()));

            int a = BangDiemDAO.create(bangdiem);
            if (a>0) {
                System.out.println("Cập nhật thông tin Sinh vien thành công!");
                bangdiemJPanel.loaddata(0,0);
                this.dispose();
            }
        }catch (Exception e) {
            System.out.println("Error" + e);
        }

    }

    private void updateData()  {
       try {
            //BigDecimal bigDecimal = new BigDecimal(txtGPA.getText());
            
            MyComboBox item1 =(MyComboBox)cbSV.getSelectedItem();
            bangdiem.setId_sinhvien(item1.MaInt());
            
            MyComboBox item2 =(MyComboBox)cbHp.getSelectedItem();
            bangdiem.setId_sinhvien(item2.MaInt());
            
            bangdiem.setNgay_thi(ConvertDate(dpNgayThi));
            bangdiem.setDiem_chuyen_can(new BigDecimal(txtDcc.getText()));
            bangdiem.setDiem_thi(new BigDecimal(txtDthi.getText()));
            
            int a = BangDiemDAO.update(bangdiem);
            if (a>0) {
                System.out.println("Cập nhật thông tin Sinh vien thành công!");
                bangdiemJPanel.loaddata(0,0);
                this.dispose();
            }
        }catch (Exception e) {
            System.out.println("Error" + e);
        }
    }
    
    private void loadDataUpdate() {
        cbSV.setSelectedIndex(bangdiem.getId_sinhvien() -1);
        cbHp.setSelectedIndex(bangdiem.getId_hocphan() -1);
        dpNgayThi.setDate(bangdiem.getNgay_thi());
        txtDcc.setText(String.valueOf(bangdiem.getDiem_chuyen_can()));
        txtDthi.setText(String.valueOf(bangdiem.getDiem_thi()));
    }
   
    private void loadCombobox() {
        try {
            
            ArrayList<SinhVien> list1 = SinhVienDAO.list();
            DefaultComboBoxModel cbSvModel = (DefaultComboBoxModel) cbSV.getModel();
            
            for (SinhVien item : list1) {
                MyComboBox object = new MyComboBox(item.getId(), item.getTen());
                cbSvModel.addElement(object);
            }
            
            ArrayList<HocPhan> list2 = HocPhanDAO.list();
            DefaultComboBoxModel cbHpModel = (DefaultComboBoxModel) cbHp.getModel();
            
            for (HocPhan item : list2) {
                MyComboBox object = new MyComboBox(item.getId(), item.getTen_hocphan());
                cbHpModel.addElement(object);
            }
        } catch(Exception e) {
            
        }
    }
    
    public Date ConvertDate(JDateChooser JDate) {
        java.util.Date utilDate = JDate.getDate();
        long milliseconds = utilDate.getTime();  // Get milliseconds since the epoch
        java.sql.Date sqlDate = new java.sql.Date(milliseconds);
        return  sqlDate;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Object> cbHp;
    private javax.swing.JComboBox<Object> cbSV;
    private com.toedter.calendar.JDateChooser dpNgayThi;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtDcc;
    private javax.swing.JTextField txtDthi;
    // End of variables declaration//GEN-END:variables

    
}
