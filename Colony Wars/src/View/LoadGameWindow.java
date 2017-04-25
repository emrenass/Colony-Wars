/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.Container;
import javax.swing.JFrame;

/**
 *
 * @author emre
 */
public class LoadGameWindow extends javax.swing.JPanel {

    /**
     * Creates new form LoadGameWindow
     */
    
    JFrame frame;
    Container panel;
    
    public LoadGameWindow() {
        initComponents();
    }
    
    public void copyFrameMain(JFrame frame){
        this.frame = frame;
    }
    
    public void copyContentPaneMain(Container panel){
        this.panel = panel;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backButton = new javax.swing.JButton();
        mapLocationLabel1 = new Controller.MapLocationLabel();
        mapLocationLabel2 = new Controller.MapLocationLabel();
        mapLocationLabel3 = new Controller.MapLocationLabel();
        mapLocationLabel4 = new Controller.MapLocationLabel();
        mapLocationLabel5 = new Controller.MapLocationLabel();

        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));

        backButton.setText("Back");
        backButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                backButtonMousePressed(evt);
            }
        });

        mapLocationLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mapLocationLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        mapLocationLabel1.setMaximumSize(new java.awt.Dimension(64, 84));
        mapLocationLabel1.setMinimumSize(new java.awt.Dimension(64, 84));
        mapLocationLabel1.setPreferredSize(new java.awt.Dimension(64, 84));

        mapLocationLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mapLocationLabel2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        mapLocationLabel2.setMaximumSize(new java.awt.Dimension(64, 84));
        mapLocationLabel2.setMinimumSize(new java.awt.Dimension(64, 84));
        mapLocationLabel2.setPreferredSize(new java.awt.Dimension(64, 84));

        mapLocationLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mapLocationLabel3.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        mapLocationLabel3.setMaximumSize(new java.awt.Dimension(64, 84));
        mapLocationLabel3.setMinimumSize(new java.awt.Dimension(64, 84));
        mapLocationLabel3.setPreferredSize(new java.awt.Dimension(64, 84));

        mapLocationLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mapLocationLabel4.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        mapLocationLabel4.setMaximumSize(new java.awt.Dimension(64, 84));
        mapLocationLabel4.setMinimumSize(new java.awt.Dimension(64, 84));
        mapLocationLabel4.setPreferredSize(new java.awt.Dimension(64, 84));

        mapLocationLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mapLocationLabel5.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        mapLocationLabel5.setMaximumSize(new java.awt.Dimension(64, 84));
        mapLocationLabel5.setMinimumSize(new java.awt.Dimension(64, 84));
        mapLocationLabel5.setPreferredSize(new java.awt.Dimension(64, 84));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(mapLocationLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(mapLocationLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(285, 285, 285))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(mapLocationLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(238, 238, 238))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(269, 269, 269)
                .addComponent(mapLocationLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 275, Short.MAX_VALUE)
                .addComponent(mapLocationLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(128, 128, 128))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backButton)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(mapLocationLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82)
                        .addComponent(mapLocationLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 210, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(mapLocationLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(134, 134, 134))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(mapLocationLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(102, 102, 102)
                                .addComponent(mapLocationLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(76, 76, 76))))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButtonMousePressed
        frame.setContentPane(panel);
        frame.setVisible(true);
    }//GEN-LAST:event_backButtonMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private Controller.MapLocationLabel mapLocationLabel1;
    private Controller.MapLocationLabel mapLocationLabel2;
    private Controller.MapLocationLabel mapLocationLabel3;
    private Controller.MapLocationLabel mapLocationLabel4;
    private Controller.MapLocationLabel mapLocationLabel5;
    // End of variables declaration//GEN-END:variables
}
