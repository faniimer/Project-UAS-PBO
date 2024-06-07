/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main;

import javax.swing.JFrame;

/**
 *
 * @author Dwi Alfani Merlia (222212575)
 */
public class Dashboard extends javax.swing.JFrame {

    /**
     * Creates new form Dashboard
     */
    public Dashboard() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelnavbar = new javax.swing.JPanel();
        panelsidebar = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        menu = new javax.swing.JPanel();
        panelcontent = new javax.swing.JPanel();
        panelutama = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelnavbar.setBackground(new java.awt.Color(153, 204, 255));
        panelnavbar.setPreferredSize(new java.awt.Dimension(872, 70));

        javax.swing.GroupLayout panelnavbarLayout = new javax.swing.GroupLayout(panelnavbar);
        panelnavbar.setLayout(panelnavbarLayout);
        panelnavbarLayout.setHorizontalGroup(
            panelnavbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 782, Short.MAX_VALUE)
        );
        panelnavbarLayout.setVerticalGroup(
            panelnavbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        getContentPane().add(panelnavbar, java.awt.BorderLayout.PAGE_START);

        panelsidebar.setBackground(new java.awt.Color(255, 255, 255));
        panelsidebar.setPreferredSize(new java.awt.Dimension(250, 495));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(null);

        menu.setBackground(new java.awt.Color(255, 255, 255));
        menu.setLayout(new javax.swing.BoxLayout(menu, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane1.setViewportView(menu);

        javax.swing.GroupLayout panelsidebarLayout = new javax.swing.GroupLayout(panelsidebar);
        panelsidebar.setLayout(panelsidebarLayout);
        panelsidebarLayout.setHorizontalGroup(
            panelsidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        panelsidebarLayout.setVerticalGroup(
            panelsidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );

        getContentPane().add(panelsidebar, java.awt.BorderLayout.LINE_START);

        panelcontent.setBackground(new java.awt.Color(255, 255, 255));

        panelutama.setBackground(new java.awt.Color(255, 255, 255));
        panelutama.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout panelcontentLayout = new javax.swing.GroupLayout(panelcontent);
        panelcontent.setLayout(panelcontentLayout);
        panelcontentLayout.setHorizontalGroup(
            panelcontentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelutama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelcontentLayout.setVerticalGroup(
            panelcontentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelutama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(panelcontent, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel menu;
    private javax.swing.JPanel panelcontent;
    private javax.swing.JPanel panelnavbar;
    private javax.swing.JPanel panelsidebar;
    private javax.swing.JPanel panelutama;
    // End of variables declaration//GEN-END:variables
}
