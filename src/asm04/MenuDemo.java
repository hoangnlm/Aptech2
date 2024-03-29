/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asm04;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import javax.swing.JCheckBox;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Hoang
 */
public class MenuDemo extends javax.swing.JFrame {

    private boolean confirmExit, redText, blueText;

    public boolean isConfirmExit() {
        return confirmExit;
    }

    public void setConfirmExit(boolean confirmExit) {
        this.confirmExit = confirmExit;
        chbConfirmExitSetting.setSelected(confirmExit);
        chbConfirmExitToolBar.setSelected(confirmExit);
    }

    public boolean isRedText() {
        return redText;
    }

    public void setRedText(boolean redText) {
        this.redText = redText;
        mniRed.setSelected(redText);
        mniRedPopup.setSelected(redText);
        txaText.setForeground(Color.red);
    }

    public boolean isBlueText() {
        return blueText;
    }

    public void setBlueText(boolean blueText) {
        this.blueText = blueText;
        mniBlue.setSelected(blueText);
        mniBluePopup.setSelected(blueText);
        txaText.setForeground(Color.blue);
    }

    /**
     * Creates new form MenuDemo
     */
    public MenuDemo() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        popup = new javax.swing.JPopupMenu();
        mniRedPopup = new javax.swing.JRadioButtonMenuItem();
        mniBluePopup = new javax.swing.JRadioButtonMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mniExitPopup = new javax.swing.JMenuItem();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jToolBar1 = new javax.swing.JToolBar();
        jButton1 = new javax.swing.JButton();
        chbConfirmExitToolBar = new javax.swing.JCheckBox();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaText = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        chbConfirmExitSetting = new javax.swing.JCheckBoxMenuItem();
        jMenu4 = new javax.swing.JMenu();
        mniRed = new javax.swing.JRadioButtonMenuItem();
        mniBlue = new javax.swing.JRadioButtonMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

        buttonGroup2.add(mniRedPopup);
        mniRedPopup.setText("Red");
        mniRedPopup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniRedPopupActionPerformed(evt);
            }
        });
        popup.add(mniRedPopup);

        buttonGroup2.add(mniBluePopup);
        mniBluePopup.setSelected(true);
        mniBluePopup.setText("Blue");
        mniBluePopup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniBluePopupActionPerformed(evt);
            }
        });
        popup.add(mniBluePopup);
        popup.add(jSeparator1);

        mniExitPopup.setText("Exit");
        mniExitPopup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniExitPopupActionPerformed(evt);
            }
        });
        popup.add(mniExitPopup);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu in Java Swing example");
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                formMouseReleased(evt);
            }
        });

        jToolBar1.setRollover(true);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asm04/exit.png"))); // NOI18N
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton1);

        chbConfirmExitToolBar.setText("Confirm Exit");
        chbConfirmExitToolBar.setFocusable(false);
        chbConfirmExitToolBar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        chbConfirmExitToolBar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        chbConfirmExitToolBar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbConfirmExitToolBarActionPerformed(evt);
            }
        });
        jToolBar1.add(chbConfirmExitToolBar);

        jButton3.setText("jButton3");
        jButton3.setFocusable(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButton3);

        txaText.setColumns(20);
        txaText.setLineWrap(true);
        txaText.setRows(5);
        txaText.setWrapStyleWord(true);
        txaText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txaTextMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(txaText);

        jButton2.setText("Save");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jMenu1.setMnemonic('F');
        jMenu1.setText("File");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Open");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem5.setMnemonic('S');
        jMenuItem5.setText("Save");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem2.setMnemonic('x');
        jMenuItem2.setText("Exit");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setMnemonic('S');
        jMenu2.setText("Setting");

        chbConfirmExitSetting.setSelected(true);
        chbConfirmExitSetting.setText("Confirm Exit");
        chbConfirmExitSetting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbConfirmExitSettingActionPerformed(evt);
            }
        });
        jMenu2.add(chbConfirmExitSetting);

        jMenu4.setText("Color");

        buttonGroup1.add(mniRed);
        mniRed.setSelected(true);
        mniRed.setText("Red");
        mniRed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniRedActionPerformed(evt);
            }
        });
        jMenu4.add(mniRed);

        buttonGroup1.add(mniBlue);
        mniBlue.setText("Blue");
        mniBlue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniBlueActionPerformed(evt);
            }
        });
        jMenu4.add(mniBlue);

        jMenu2.add(jMenu4);

        jMenuBar1.add(jMenu2);

        jMenu3.setMnemonic('H');
        jMenu3.setText("Help");

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setMnemonic('A');
        jMenuItem3.setText("About");
        jMenu3.add(jMenuItem3);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 525, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 293, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        openAction();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        exit();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        saveAction();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void chbConfirmExitToolBarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbConfirmExitToolBarActionPerformed
        setConfirmExit(chbConfirmExitToolBar.isSelected());
    }//GEN-LAST:event_chbConfirmExitToolBarActionPerformed

    private void chbConfirmExitSettingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbConfirmExitSettingActionPerformed
        setConfirmExit(chbConfirmExitSetting.isSelected());
    }//GEN-LAST:event_chbConfirmExitSettingActionPerformed

    private void mniRedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniRedActionPerformed
        setRedText(mniRed.isSelected());
    }//GEN-LAST:event_mniRedActionPerformed

    private void mniBlueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniBlueActionPerformed
        setBlueText(mniBlue.isSelected());
    }//GEN-LAST:event_mniBlueActionPerformed

    private void mniExitPopupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniExitPopupActionPerformed
        exit();
    }//GEN-LAST:event_mniExitPopupActionPerformed

    private void formMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseReleased
//               System.out.println(evt.getButton());

        if (evt.getButton() == MouseEvent.BUTTON3) {
            popup.show(this, evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_formMouseReleased

    private void txaTextMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txaTextMouseReleased
//        System.out.println(evt.getButton());
        if (evt.getButton() == MouseEvent.BUTTON3) {
//        if(evt.isPopupTrigger()){
            popup.show(this, evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_txaTextMouseReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        saveAction();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        exit();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void mniRedPopupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniRedPopupActionPerformed
        // TODO add your handling code here:
        setRedText(mniRedPopup.isSelected()?true:false);
    }//GEN-LAST:event_mniRedPopupActionPerformed

    private void mniBluePopupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniBluePopupActionPerformed
        setBlueText(mniBluePopup.isSelected()?true:false);

    }//GEN-LAST:event_mniBluePopupActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                

}
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuDemo.class
.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        

} catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuDemo.class
.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        

} catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuDemo.class
.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        

} catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuDemo.class
.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuDemo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JCheckBoxMenuItem chbConfirmExitSetting;
    private javax.swing.JCheckBox chbConfirmExitToolBar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JRadioButtonMenuItem mniBlue;
    private javax.swing.JRadioButtonMenuItem mniBluePopup;
    private javax.swing.JMenuItem mniExitPopup;
    private javax.swing.JRadioButtonMenuItem mniRed;
    private javax.swing.JRadioButtonMenuItem mniRedPopup;
    private javax.swing.JPopupMenu popup;
    private javax.swing.JTextArea txaText;
    // End of variables declaration//GEN-END:variables

    private void openAction() {
        JFileChooser jfc = new JFileChooser();
        int ret = jfc.showOpenDialog(this);
        File f = null;

        if (ret == JFileChooser.APPROVE_OPTION) {
            f = jfc.getSelectedFile();
        } else {
            return;
        }

        try {

            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            StringBuilder data = new StringBuilder(4096);
            String buffer = "";
            while ((buffer = br.readLine()) != null) {
                    data.append(buffer + "\n");
            }
            data.deleteCharAt(data.lastIndexOf("\n"));
            txaText.setText(data.toString());
            
            fr.close();
            br.close();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.toString());
        }
    }

    private void exit() {
        if (isConfirmExit()) {
            int n = JOptionPane.showConfirmDialog(null, "Are you sure to quit?", "Exit", JOptionPane.YES_NO_OPTION);
            if (n == JOptionPane.YES_OPTION) {
                System.exit(JFrame.EXIT_ON_CLOSE);
            }
        } else {
            System.out.println(isConfirmExit() + "");
            System.exit(JFrame.EXIT_ON_CLOSE);
        }
    }

    private void saveAction() {
        JFileChooser jfc = new JFileChooser();
        int ret = jfc.showSaveDialog(this);
        File f = null;

        if (ret == JFileChooser.APPROVE_OPTION) {
            f = jfc.getSelectedFile();
        } else {
            return;
        }

        try {

            FileWriter fw = new FileWriter(f);
            fw.write(txaText.getText());

            fw.flush();
            fw.close();

            JOptionPane.showMessageDialog(this, "Saved data successfully");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.toString());
        }
    }
}
