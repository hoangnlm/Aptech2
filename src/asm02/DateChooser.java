/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asm02;

import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Hashtable;
import javax.swing.JLabel;
import javax.swing.event.ChangeEvent;

/**
 *
 * @author Hoang
 */
public class DateChooser extends javax.swing.JFrame {

    private Calendar calendar;
    private SimpleDateFormat dateFormat;

    /**
     * Creates new form DateChooser
     */
    public DateChooser() {
        initComponents();
        calendar = Calendar.getInstance();
        dateFormat = new SimpleDateFormat("EEE, MMM d, yyyy");
        lblMain.setText(dateFormat.format(calendar.getTime()));
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
        pnlYear = new javax.swing.JPanel();
        lblMain = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        sldYear = new javax.swing.JSlider();
        pnlMonth = new javax.swing.JPanel();
        sldMonth = new javax.swing.JSlider();
        pnlDay = new javax.swing.JPanel();
        sldDay = new javax.swing.JSlider();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlYear.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Selected Date"));

        lblMain.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblMain.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMain.setText("Date output");

        javax.swing.GroupLayout pnlYearLayout = new javax.swing.GroupLayout(pnlYear);
        pnlYear.setLayout(pnlYearLayout);
        pnlYearLayout.setHorizontalGroup(
            pnlYearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlYearLayout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(lblMain, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(154, Short.MAX_VALUE))
        );
        pnlYearLayout.setVerticalGroup(
            pnlYearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlYearLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblMain, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Year"));

        sldYear.setMajorTickSpacing(5);
        sldYear.setMaximum(2020);
        sldYear.setMinimum(2000);
        sldYear.setMinorTickSpacing(1);
        sldYear.setPaintLabels(true);
        sldYear.setPaintTicks(true);
        sldYear.setSnapToTicks(true);
        sldYear.setToolTipText("Select a year");
        sldYear.setValue(2010);
        sldYear.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sldYearStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sldYear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sldYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnlMonth.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Month"));

        String[] months = (new DateFormatSymbols()).getShortMonths();
        Hashtable hashTable = new Hashtable(12);
        for (int i = 0; i < 12; i++) {
            hashTable.put(new Integer(i+1), new JLabel(months[i],JLabel.CENTER));
        }
        sldMonth.setLabelTable(hashTable);
        sldMonth.setMajorTickSpacing(1);
        sldMonth.setMaximum(12);
        sldMonth.setMinimum(1);
        sldMonth.setMinorTickSpacing(1);
        sldMonth.setPaintLabels(true);
        sldMonth.setPaintTicks(true);
        sldMonth.setSnapToTicks(true);
        sldMonth.setToolTipText("Select a month");
        sldMonth.setValue(6);
        sldMonth.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sldMonthStateChanged(evt);
            }
        });

        javax.swing.GroupLayout pnlMonthLayout = new javax.swing.GroupLayout(pnlMonth);
        pnlMonth.setLayout(pnlMonthLayout);
        pnlMonthLayout.setHorizontalGroup(
            pnlMonthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMonthLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sldMonth, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlMonthLayout.setVerticalGroup(
            pnlMonthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMonthLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sldMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnlDay.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Day"));

        sldDay.setMajorTickSpacing(6);
        sldDay.setMaximum(31);
        sldDay.setMinorTickSpacing(1);
        sldDay.setPaintLabels(true);
        sldDay.setPaintTicks(true);
        sldDay.setSnapToTicks(true);
        sldDay.setToolTipText("Select a day");
        sldDay.setValue(15);
        sldDay.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sldDayStateChanged(evt);
            }
        });

        javax.swing.GroupLayout pnlDayLayout = new javax.swing.GroupLayout(pnlDay);
        pnlDay.setLayout(pnlDayLayout);
        pnlDayLayout.setHorizontalGroup(
            pnlDayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDayLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sldDay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlDayLayout.setVerticalGroup(
            pnlDayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDayLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sldDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlYear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlMonth, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlDay, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(pnlYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
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

    private void sldYearStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sldYearStateChanged
        // TODO add your handling code here:
        sldStateChanged();
    }//GEN-LAST:event_sldYearStateChanged

    private void sldMonthStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sldMonthStateChanged
        // TODO add your handling code here:
        sldStateChanged();

    }//GEN-LAST:event_sldMonthStateChanged

    private void sldDayStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sldDayStateChanged
        // TODO add your handling code here:
        sldStateChanged();
    }//GEN-LAST:event_sldDayStateChanged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(DateChooser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(DateChooser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(DateChooser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(DateChooser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DateChooser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblMain;
    private javax.swing.JPanel pnlDay;
    private javax.swing.JPanel pnlMonth;
    private javax.swing.JPanel pnlYear;
    private javax.swing.JSlider sldDay;
    private javax.swing.JSlider sldMonth;
    private javax.swing.JSlider sldYear;
    // End of variables declaration//GEN-END:variables

    private void sldStateChanged() {
        calendar.set(sldYear.getValue(), sldMonth.getValue() - 1, sldDay.getValue());
        lblMain.setText(dateFormat.format(calendar.getTime()));
    }
}
