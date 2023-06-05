/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package gui;

import javax.swing.*;
import bll.SuCo_bll;
import pojo.SuCo;
import dao.ExcuteData;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;

/**
 *
 * @author HieuThao
 */
public class dsSuCo extends javax.swing.JPanel {

    /**
     * Creates new form SuCo
     */
    public dsSuCo() {
        initComponents();
        customizeTable();
    }
    boolean flag = true;
    JComponent com;
    ExcuteData ex;
    SuCo_bll xl ;
    SuCo t = new SuCo();
    public dsSuCo(JComponent com, ExcuteData ex) {
        initComponents();
        this.com = com;
        this.ex = ex;
        loadHeading(model);
        inittable_SuCo();
        customizeTable();
    }
    DefaultTableModel model = new DefaultTableModel();;
    Vector<String> heading = new Vector<String>();
    ArrayList<SuCo> content = new ArrayList<>();
    
    private void loadHeading(DefaultTableModel model)
    {
        model.addColumn("Mã");
        model.addColumn("Tên");
        model.addColumn("Hình thức");
        model.addColumn("Chi phí");
        model.addColumn("Thời gian xảy ra");
        model.addColumn("Thời gian kết thúc");
        model.addColumn("Người lập");
        model.addColumn("Tên loại");
    }
    private void inittable_SuCo()
    {
        xl = new SuCo_bll(ex);
        content = xl.laydanhsachSC();
        DecimalFormat decimalFormat = new DecimalFormat("#,###đ");
        for (SuCo s : content) {
            model.addRow(new Object[]{s.getMasc(), s.getTensc(),s.getHinhThuc(), decimalFormat.format(s.getChiPhi()), s.getTGXayRa(), s.getTGKetThuc(),s.getNguoiLap().getHoTen(), s.getMaLoai().getTenLoai()});
        }
        tbl_SuCo.setModel(model);
     }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_SuCo = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        btn_TaoMoi = new javax.swing.JButton();
        btn_CapNhat = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(780, 600));
        setPreferredSize(new java.awt.Dimension(780, 600));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setViewportBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane1.setAlignmentX(0.0F);
        jScrollPane1.setAlignmentY(0.0F);
        jScrollPane1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jScrollPane1.setOpaque(false);
        jScrollPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jScrollPane1MouseClicked(evt);
            }
        });

        tbl_SuCo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbl_SuCo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_SuCoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_SuCo);

        jPanel1.setAlignmentX(0.0F);
        jPanel1.setAlignmentY(0.0F);
        jPanel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

        btn_TaoMoi.setBackground(new java.awt.Color(255, 102, 255));
        btn_TaoMoi.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn_TaoMoi.setText("Tạo mới");
        btn_TaoMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_TaoMoiActionPerformed(evt);
            }
        });
        jPanel1.add(btn_TaoMoi);

        btn_CapNhat.setBackground(new java.awt.Color(102, 255, 102));
        btn_CapNhat.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn_CapNhat.setText("Cập nhật");
        btn_CapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CapNhatActionPerformed(evt);
            }
        });
        jPanel1.add(btn_CapNhat);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 738, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(13, 13, 13))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_CapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CapNhatActionPerformed
        // TODO add your handling code here:
         int row = tbl_SuCo.getSelectedRow();
        if(row<0)
        {
            JOptionPane.showMessageDialog(this, "Bạn chưa chọn dòng");
            return;
        }
        flag = false;
        PhieuSuCo psc = new PhieuSuCo(com, ex, flag,t);
        psc.setVisible(true);
        com.removeAll();
        // Thêm form PhieuSuCo vào JComponent
        com.add(psc);
        // Cập nhật giao diện
        com.revalidate();
        com.repaint();
        // Hiển thị lại JComponent
        com.setVisible(true);
    }//GEN-LAST:event_btn_CapNhatActionPerformed

    private void btn_TaoMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_TaoMoiActionPerformed
        // TODO add your handling code here:
       
        flag = true;
        PhieuSuCo psc = new PhieuSuCo(com, ex, flag);
        psc.setVisible(true);
        com.removeAll();
        // Thêm form PhieuSuCo vào JComponent
        com.add(psc);
        // Cập nhật giao diện
        com.revalidate();
        com.repaint();
        // Hiển thị lại JComponent
        com.setVisible(true);
        
    }//GEN-LAST:event_btn_TaoMoiActionPerformed

    private void jScrollPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jScrollPane1MouseClicked

    private void tbl_SuCoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_SuCoMouseClicked
        // TODO add your handling code here:
        int row = tbl_SuCo.getSelectedRow();
        if(row<0)
        {
            JOptionPane.showMessageDialog(tbl_SuCo, "Bạn chưa chọn dòng");
        }
        else
        {
            for(SuCo i : content)
            {
                if(i.getMasc() == tbl_SuCo.getValueAt(row, 0).toString() )
                {
                    t = i;
                }
            }
        }
    }//GEN-LAST:event_tbl_SuCoMouseClicked
    private void customizeTable() {
        // Đổi màu nền cho table header
        JTableHeader tableHeader = tbl_SuCo.getTableHeader();
        tableHeader.setBackground(Color.BLACK);
        tableHeader.setForeground(Color.WHITE);
        Font tableFont = tbl_SuCo.getFont();
        tbl_SuCo.setFont(new Font(tableFont.getName(), tableFont.getStyle(), tableFont.getSize() + 5));
        // Đổi màu chữ cho các ô trong table
        DefaultTableCellRenderer cellRenderer = new DefaultTableCellRenderer();
        cellRenderer.setForeground(Color.BLACK);
        tbl_SuCo.setDefaultRenderer(Object.class, cellRenderer);

        // Đổi màu nền cho các dòng chẵn và lẻ
        tbl_SuCo.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable  table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                Component component = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

                // Đổi màu nền cho các dòng chẵn và lẻ
                if (row % 2 == 0) {
                    component.setBackground(Color.LIGHT_GRAY);
                } else {
                    component.setBackground(Color.WHITE);
                }

                return component;
            }
        });

        // Đặt khoảng cách giữa các ô
        //tbl_SuCo.setIntercellSpacing(new Dimension(10, 5));
        // Đặt độ rộng ở cột 1 là 150 pixels
//        TableColumn column0 = tbl_SuCo.getColumnModel().getColumn(0);
//        column0.setPreferredWidth(20);
//        TableColumn column1 = tbl_SuCo.getColumnModel().getColumn(2);
//        column1.setPreferredWidth(200);
//        TableColumn column2 = tbl_SuCo.getColumnModel().getColumn(7);
//        column2.setPreferredWidth(150);
        // Đặt độ rộng cột tự động co dựa trên nội dung
        
        
        DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
        renderer.setFont(new Font("Arial", Font.BOLD, 18));

        // Áp dụng renderer cho tất cả các cột
        for (int columnIndex = 0; columnIndex < tbl_SuCo.getColumnCount(); columnIndex++) {
            TableColumn column = tbl_SuCo.getColumnModel().getColumn(columnIndex);
            column.setCellRenderer(renderer);
        }
        tbl_SuCo.setAutoResizeMode(JTable.AUTO_RESIZE_SUBSEQUENT_COLUMNS);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_CapNhat;
    private javax.swing.JButton btn_TaoMoi;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_SuCo;
    // End of variables declaration//GEN-END:variables
}
