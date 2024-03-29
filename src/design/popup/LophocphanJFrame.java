/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package design.popup;
import com.toedter.calendar.JDateChooser;
import com.toedter.calendar.JTextFieldDateEditor;
import controller.MyComboBox;
import dao.GiangVienDAO;
import dao.HocPhanDAO;
import dao.LopBienCheDAO;
import dao.LopHocPhanDAO;
import dao.SinhVienDAO;
import design.LophocphanJPanel;
import design.SinhvienJPanel;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import model.HocPhan;
import model.GiangVien;
import model.LopHocPhan;
/**
 *
 * @author nguye
 */
public class LophocphanJFrame extends javax.swing.JFrame {

    /**
     * Creates new form SinhvienJFrame
     */
    private LophocphanJPanel lophocphanJPanel;
    private LopHocPhan lopHocPhan;
    private Boolean isUpdate ;
    public LophocphanJFrame(LophocphanJPanel lophocphanJPanel, LopHocPhan lopHocPhan, Boolean isUpdate) {
        initComponents();
        this.lophocphanJPanel = lophocphanJPanel;
        this.lopHocPhan = lopHocPhan;
        this.isUpdate = isUpdate;
        loadCombobox();
        JTextFieldDateEditor editor = (JTextFieldDateEditor) dpStart.getDateEditor();
        editor.setEditable(false);
        JTextFieldDateEditor editor1 = (JTextFieldDateEditor) dpEnd.getDateEditor();
        editor1.setEditable(false);
        JTextFieldDateEditor editor2 = (JTextFieldDateEditor) dpThi.getDateEditor();
        editor2.setEditable(false);
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
        jLabel2 = new javax.swing.JLabel();
        txtTen = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        cbHp = new javax.swing.JComboBox<>();
        dpStart = new com.toedter.calendar.JDateChooser();
        jLabel12 = new javax.swing.JLabel();
        cbGv = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        dpEnd = new com.toedter.calendar.JDateChooser();
        jLabel14 = new javax.swing.JLabel();
        dpThi = new com.toedter.calendar.JDateChooser();
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
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lớp Học Phần", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 0, 18), new java.awt.Color(255, 0, 0))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Tên Lớp");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Ngày Bắt Đầu");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Mã Lớp");

        txtId.setEnabled(false);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("Giáo Viên");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setText("Tên Học Phần");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setText("Ngày Kết thúc");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setText("Ngày Thi");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cbGv, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cbHp, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel2))
                        .addGap(58, 58, 58)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(68, 68, 68)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dpThi, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dpStart, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dpEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel7)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(dpStart, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)))
                    .addComponent(dpEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dpThi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbHp, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12)))
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbGv, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(64, 64, 64))
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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (this.isUpdate ) {
            updateData();
        }else {
           insertData();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void insertData() {
        try {
            if(check() == false) return; 
            lopHocPhan.setTen(txtTen.getText());
            
            MyComboBox item =(MyComboBox)cbHp.getSelectedItem();
            lopHocPhan.setId_hocphan(item.MaInt());
            
            MyComboBox item1 =(MyComboBox)cbGv.getSelectedItem();
            lopHocPhan.setId_giangvien(item1.MaInt());
            
            lopHocPhan.setNgay_bat_dau(ConvertDate(dpStart));
            lopHocPhan.setNgay_ket_thuc(ConvertDate(dpEnd));
            lopHocPhan.setNgay_thi(ConvertDate(dpThi));
            
            int a = LopHocPhanDAO.create(lopHocPhan);
            if (a>0) {
                JOptionPane.showMessageDialog(this, "Thêm thông tin lớp học phần thành công");
                System.out.println("Thêm thông tin lớp học phần thành công!");
                lophocphanJPanel.loaddata();
                this.dispose();
            }
        }catch (Exception e) {
            System.out.println("Error" + e);
        }

    }

    private void updateData()  {
       try {
           if(check() == false) return; 
            //BigDecimal bigDecimal = new BigDecimal(txtGPA.getText());
            lopHocPhan.setTen(txtTen.getText());
            
            MyComboBox item =(MyComboBox)cbHp.getSelectedItem();
            lopHocPhan.setId_hocphan(item.MaInt());
            
            MyComboBox item1 =(MyComboBox)cbGv.getSelectedItem();
            lopHocPhan.setId_giangvien(item1.MaInt());
            
            lopHocPhan.setNgay_bat_dau(ConvertDate(dpStart));
            lopHocPhan.setNgay_ket_thuc(ConvertDate(dpEnd));
            lopHocPhan.setNgay_thi(ConvertDate(dpThi));
            
            int a = LopHocPhanDAO.update(lopHocPhan);

            if (a>0) {
                JOptionPane.showMessageDialog(this, "Cập nhật thông tin lớp học phần thành công");
                System.out.println("Cập nhật thông tin lớp học phần thành công");
                lophocphanJPanel.loaddata();
                this.dispose();
            }
        }catch (Exception e) {
            System.out.println("Error" + e);
        }
    }
    
    private void loadDataUpdate() {
        txtId.setText(String.valueOf(lopHocPhan.getId()));
        txtTen.setText(String.valueOf(lopHocPhan.getTen()));
        dpStart.setDate(lopHocPhan.getNgay_bat_dau());
        dpEnd.setDate(lopHocPhan.getNgay_ket_thuc());
        dpThi.setDate(lopHocPhan.getNgay_thi());

        cbHp.setSelectedIndex(lopHocPhan.getId_hocphan()-1);
        cbGv.setSelectedIndex(lopHocPhan.getId_giangvien()-1);

    }
   
    private void loadCombobox() {
        try {
            ArrayList<HocPhan> list = HocPhanDAO.list();
            DefaultComboBoxModel cbHpModel = (DefaultComboBoxModel) cbHp.getModel();
            
            for (HocPhan item : list) {
                MyComboBox object = new MyComboBox(item.getId(), item.getTen_hocphan());
                cbHpModel.addElement(object);
            }
            
            ArrayList<GiangVien> list1 = GiangVienDAO.list();
            DefaultComboBoxModel cbGvModel = (DefaultComboBoxModel) cbGv.getModel();
            
            for (GiangVien item : list1) {
                MyComboBox object = new MyComboBox(item.getId(), item.getTen());
                cbGvModel.addElement(object);
            }
        } catch(Exception e) {
            
        }
    }
    private boolean check() {
        boolean ischeck = false;
        try {
            if (txtTen.getText().isEmpty() == true) {
                JOptionPane.showMessageDialog(this, "Chưa nhập tên lớp!!!");
                return ischeck;
            }
            
            if (dpStart.getDate() == null) {
                JOptionPane.showMessageDialog(this, "Chưa chọn ngày bắt đầu !!!");
                return ischeck;
            }
            
             if (dpEnd.getDate() == null) {
                JOptionPane.showMessageDialog(this, "Chưa chọn ngày kết thúc !!!");
                return ischeck;
            }
             
              if (dpThi.getDate() == null) {
                JOptionPane.showMessageDialog(this, "Chưa chọn ngày thi !!!");
                return ischeck;
            }
            
            ischeck = true;
        }catch (Exception e) {
            System.out.println("Error" + e);
        }
        return ischeck;
    }
    public Date ConvertDate(JDateChooser JDate) {
        java.util.Date utilDate = JDate.getDate();
        long milliseconds = utilDate.getTime();  // Get milliseconds since the epoch
        java.sql.Date sqlDate = new java.sql.Date(milliseconds);
        return  sqlDate;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Object> cbGv;
    private javax.swing.JComboBox<Object> cbHp;
    private com.toedter.calendar.JDateChooser dpEnd;
    private com.toedter.calendar.JDateChooser dpStart;
    private com.toedter.calendar.JDateChooser dpThi;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtTen;
    // End of variables declaration//GEN-END:variables

    
}
