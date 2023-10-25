import java.text.SimpleDateFormat;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */

/**
 *
 * @author juwit
 */
 
public class frame1 extends javax.swing.JInternalFrame {

    private DefaultListModel<String> listModel; 
    private DefaultListModel<String> detailModel;
    private int nomor = 1;
    /**
     * Creates new form frame1
     */
    
    public frame1() {
        initComponents();
        listModel = new DefaultListModel<>();
        detailModel = new DefaultListModel<>();
        list.setModel(listModel);
        list.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
        public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
            listValueChanged(evt);
        }    
        });      
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        eNama = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        eDetail = new javax.swing.JTextArea();
        bClear = new javax.swing.JButton();
        eSimpan = new javax.swing.JButton();
        eDate = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        list = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        tDetail = new javax.swing.JTextArea();
        bBersih = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel2.setText("TAMBAH TUGAS BARU");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setText("Deadline Tugas");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 90, 20));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4.setText(":");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 30, 30));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel5.setText("Nama Mata Kuliah");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel6.setText("Detail Tugas");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 70, 20));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel8.setText(":");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 30, 20));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel7.setText(":");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 30, 20));
        jPanel2.add(eNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 240, -1));

        eDetail.setColumns(20);
        eDetail.setRows(5);
        jScrollPane1.setViewportView(eDetail);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 370, 60));

        bClear.setText("Clear");
        bClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bClearActionPerformed(evt);
            }
        });
        jPanel2.add(bClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, -1, -1));

        eSimpan.setText("Simpan");
        eSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eSimpanActionPerformed(evt);
            }
        });
        jPanel2.add(eSimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 240, -1, -1));
        jPanel2.add(eDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 240, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/bgd.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 300));

        jTabbedPane1.addTab("Tambah Tugas", jPanel2);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel11.setText("Detail Tugas  :");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, -1, -1));

        jLabel10.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel10.setText("DAFTAR TUGAS");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, -1, -1));

        list.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                listAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        list.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listMouseClicked(evt);
            }
        });
        list.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(list);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 200, 150));

        tDetail.setColumns(20);
        tDetail.setRows(5);
        tDetail.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tDetailAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane3.setViewportView(tDetail);

        jPanel3.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, 200, 130));

        bBersih.setText("Bersihkan");
        bBersih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBersihActionPerformed(evt);
            }
        });
        jPanel3.add(bBersih, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/bgd.jpg"))); // NOI18N
        jLabel9.setText("jLabel9");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 300));

        jTabbedPane1.addTab("Daftar Tugas", jPanel3);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
  
 
    private void bClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bClearActionPerformed
        eNama.setText("");
        eDate.setDate(null);
        eDetail.setText("");
    }//GEN-LAST:event_bClearActionPerformed

    private void eSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eSimpanActionPerformed
        String matkul = eNama.getText();
        java.util.Date deadlineDate = eDate.getDate();
        String detail = eDetail.getText();

        if (matkul.isEmpty() || deadlineDate == null || detail.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Lengkapi data terlebih dahulu!!", "Peringatan", JOptionPane.WARNING_MESSAGE);
        } else {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String deadline = dateFormat.format(deadlineDate);

            String namaDanTugas = nomor + ". " + matkul + " (dl: " + deadline + ")";
            listModel.addElement(namaDanTugas);
            detailModel.addElement(detail);
            nomor++;
        }
    }//GEN-LAST:event_eSimpanActionPerformed

    private void listAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_listAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_listAncestorAdded

    private void bBersihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBersihActionPerformed
        int[] selectedIndices = list.getSelectedIndices();
    
        if (selectedIndices.length > 0) {
            for (int i = selectedIndices.length - 1; i >= 0; i--) {
                listModel.removeElementAt(selectedIndices[i]);
                detailModel.removeElementAt(selectedIndices[i]);
            }
            for (int i = 0; i < listModel.getSize(); i++) {
                String existingItem = listModel.getElementAt(i);
                String[] parts = existingItem.split("\\. ");
                int existingNomor = i + 1;
                String newItem = existingNomor + ". " + parts[1];
                listModel.setElementAt(newItem, i);
            }
            tDetail.setText("");
            nomor = 1;
        }else if (listModel.isEmpty() ||  detailModel.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Data kosong!!", "Peringatan", JOptionPane.WARNING_MESSAGE);
        } else {
            listModel.removeAllElements();
            detailModel.removeAllElements();
            tDetail.setText("");
            nomor = 1;
        }
    }//GEN-LAST:event_bBersihActionPerformed

    private void listMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listMouseClicked

    }//GEN-LAST:event_listMouseClicked

    private void listValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listValueChanged
       if (!evt.getValueIsAdjusting()) {
            int selectedIndex = list.getSelectedIndex();
            if (selectedIndex != -1) {
                String detail = detailModel.getElementAt(selectedIndex); 
                tDetail.setText(detail);
            }
        
        }
    }//GEN-LAST:event_listValueChanged

    private void tDetailAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tDetailAncestorAdded

    }//GEN-LAST:event_tDetailAncestorAdded


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bBersih;
    private javax.swing.JButton bClear;
    private com.toedter.calendar.JDateChooser eDate;
    private javax.swing.JTextArea eDetail;
    private javax.swing.JTextField eNama;
    private javax.swing.JButton eSimpan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JList<String> list;
    private javax.swing.JTextArea tDetail;
    // End of variables declaration//GEN-END:variables

    
   
}
