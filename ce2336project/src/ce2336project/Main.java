/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Main.java
 *
 * Created on Aug 6, 2013, 1:54:05 PM
 */

package ce2336project;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.BorderFactory;
/**
 *
 * @author aksfjh
 */
public class Main extends javax.swing.JFrame {
    RefrigeratorDatabase db;
    /** Creates new form Main */
    public Main() {
        db = new RefrigeratorDatabase();
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modiIfy this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        try{BufferedImage buttonIcon = ImageIO.read(new File("fridge.jpg"));
            fridgeButton = new javax.swing.JButton(new ImageIcon(buttonIcon));

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

            fridgeButton.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    fridgeButtonActionPerformed(evt);
                }
            });

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(fridgeButton, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(fridgeButton, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
            );

            fridgeButton.setBorder(BorderFactory.createEmptyBorder());
            fridgeButton.setContentAreaFilled(false);
        }catch(IOException e){
            fridgeButton = new javax.swing.JButton();
            fridgeButton.setText("button");
        }

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fridgeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fridgeButtonActionPerformed
        // TODO add your handling code here:
        new TableWindow(db.read(),db).setVisible(true);
    }//GEN-LAST:event_fridgeButtonActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton fridgeButton;
    // End of variables declaration//GEN-END:variables

}
