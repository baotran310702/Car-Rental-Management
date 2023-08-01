/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package view;

import java.util.List;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author phamq
 */
public class formBlacklist extends javax.swing.JInternalFrame {

    /**
     * Creates new form formFindVehicleStatus
     */
    public formBlacklist() {
        initComponents();
        initComponents();
        BasicInternalFrameUI bi = (BasicInternalFrameUI) this.getUI();
        bi.setNorthPane(null);
        loadData();
    }

    public void loadData() {
        DefaultTableModel model = new DefaultTableModel();

        model.addColumn("Mã Khách Hàng");
        model.addColumn("Mã Đơn");
        model.addColumn("Số Lần Đánh Dấu");
        model.addColumn("Tình Trạng Đơn");
        model.addColumn("Ngày Lập Hợp Đồng");
        model.addColumn("Ngày Nhận Xe");

        List<Objects.DonDatXe> listDonDat = processes.getData.getListBlackList();
        for (Objects.DonDatXe d : listDonDat) {
            System.out.println(d.getMaND());
        }
        if (listDonDat != null) {

            for (Objects.DonDatXe d : listDonDat) {
                model.addRow(new Object[]{
                    d.getMaND(), d.getMaDX(), processes.getData.getBlacklistById(d.getMaND()), d.getTinhTrang(), d.getNgayDatDon(), d.getNgayNhanXe()
                });
            }
        } else {
            System.out.print("List is null");
        }

        listDonDat_table.setModel(model);

        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        listDonDat_table.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        listDonDat_table.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
        listDonDat_table.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);
        listDonDat_table.getColumnModel().getColumn(3).setCellRenderer(centerRenderer);
        listDonDat_table.getColumnModel().getColumn(4).setCellRenderer(centerRenderer);
        listDonDat_table.getColumnModel().getColumn(5).setCellRenderer(centerRenderer);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        listDonDat_table = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setBackground(new java.awt.Color(17, 43, 60));
        setForeground(java.awt.Color.pink);
        setOpaque(true);
        setPreferredSize(new java.awt.Dimension(1109, 680));
        setVisible(true);

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));

        listDonDat_table.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        listDonDat_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(listDonDat_table);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("BLACKLIST");

        jButton3.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Yellow"));
        jButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/maintenance_45px.png"))); // NOI18N
        jButton3.setText("Sửa");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1077, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(36, 36, 36))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jButton3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 526, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int index = listDonDat_table.getSelectedRow();
        String MaKH = listDonDat_table.getValueAt(index, 0).toString();
        System.out.println("MaKH is choosen: " + MaKH);
        processes.updateData.UpdateBlackList(MaKH);
        String MaDX = listDonDat_table.getValueAt(index, 1).toString();
        System.out.println("MaDX is choosen: " + MaDX);
        processes.updateData.UpdateStatusOrder(MaDX, "TU CHOI");
        JOptionPane.showMessageDialog(null, "Cập nhật thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        loadData();
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable listDonDat_table;
    // End of variables declaration//GEN-END:variables
}