/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * InsertItem.java
 *
 * Created on Aug 6, 2013, 3:33:44 PM
 */

package ce2336project;

import javax.swing.JOptionPane;

/**
 *
 * @author aksfjh
 */
public class InsertItem extends javax.swing.JFrame {
    private Refrigerator fridge;
    private RefrigeratorDatabase db;
    private Food food;
    private int foodIndex;
    private javax.swing.JButton refreshParent;
    /** Creates new form InsertItem */
    public InsertItem(Refrigerator r, RefrigeratorDatabase db,
            javax.swing.JButton refresh) {
        this.fridge = r;
        this.db = db;        
        food = new Food(" ",0," ");
        refreshParent = refresh;
        r.addItem(food);
        foodIndex = r.getList().size()-1;
        initComponents();
    }

    public InsertItem(Refrigerator r, RefrigeratorDatabase db, int index,
            javax.swing.JButton refresh){
        this.fridge = r;
        this.db = db;
        initComponents();
        refreshParent = refresh;
        food = r.getFood(index);
        foodIndex = index;
        newName.setText(food.getName());
        newDescription.setText(food.getDescription());
        java.text.DateFormat formatter =
                new java.text.SimpleDateFormat("MM/dd/yyyy");
        String date = formatter.format(food.getExpiration());
        newMonth.setText(date.split("[/]")[0]);
        newDay.setText(date.split("[/]")[1]);
        newYear.setText(date.split("[/]")[2]);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        confirmAdd = new javax.swing.JButton();
        cancelAdd = new javax.swing.JButton();
        newName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        newDescription = new javax.swing.JTextField();
        newMonth = new javax.swing.JFormattedTextField();
        newDay = new javax.swing.JTextField();
        newYear = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        confirmAdd.setText("Ok");
        confirmAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmAddActionPerformed(evt);
            }
        });

        cancelAdd.setText("Cancel");
        cancelAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelAddActionPerformed(evt);
            }
        });

        newName.setText("");

        jLabel1.setText("Name");

        jLabel2.setText("Expiration Date");

        jLabel3.setText("Description");

        newDescription.setText("");

        newMonth.setText("MM");
        newMonth.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                newMonthFocusGained(evt);
            }
        });

        newDay.setText("DD");
        newDay.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                newDayFocusGained(evt);
            }
        });

        newYear.setText("YYYY");
        newYear.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                newYearFocusGained(evt);
            }
        });

        jLabel4.setText("/");

        jLabel5.setText("/");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(confirmAdd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 197, Short.MAX_VALUE)
                        .addComponent(cancelAdd))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(newDescription, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                            .addComponent(newName, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(newMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(newDay, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(newYear, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(newMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(newDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmAdd)
                    .addComponent(cancelAdd))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void confirmAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmAddActionPerformed
        // TODO add your handling code here:
        java.util.Date newDate = null;
        boolean valid = false;
        if(newName.getText().length()>32){
            JOptionPane.showMessageDialog(null, "Name must be 32 characters"
                    + " or fewer");
        }
        else if(newName.getText().trim().length() == 0)
        {
            JOptionPane.showMessageDialog(null, "Must have a name");
        }
        else if(newDescription.getText().length() > 256)
        {
            JOptionPane.showMessageDialog(null, "Description must be 256 "
                    + "characters or fewer");
        }
        else{
            try{
                java.text.DateFormat formatter =
                        new java.text.SimpleDateFormat("MM/dd/yyyy");
                formatter.setLenient(true);
                newDate = formatter.parse(
                        newMonth.getText()+"/"+newDay.getText()+
                        "/"+newYear.getText());
                valid = true;
            }
            catch(java.text.ParseException e){
                JOptionPane.showMessageDialog(null, "Invalid date");
            }
        }
        if(valid){
            food.setAll(newName.getText().trim(),newDate,
                    newDescription.getText());
            fridge.replaceItem(foodIndex,food);
            //JOptionPane.showMessageDialog(null, f);
            db.write(fridge);
            refreshParent.doClick();
            this.dispose();
        }
    }//GEN-LAST:event_confirmAddActionPerformed

    private void cancelAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelAddActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_cancelAddActionPerformed

    private void newMonthFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_newMonthFocusGained
        if(!(newMonth.getText().matches("[0-1][0-2]|[0-9]|0[1-9]"))){
            newMonth.selectAll();
        }
    }//GEN-LAST:event_newMonthFocusGained

    private void newDayFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_newDayFocusGained
        if(!(newDay.getText().matches("[1-3][0-9]|[0-9]|0[1-9]"))){
            newDay.selectAll();
        }
    }//GEN-LAST:event_newDayFocusGained

    private void newYearFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_newYearFocusGained
        if(!(newYear.getText().matches("[0-9][0-9][0-9][0-9]"))){
            newYear.selectAll();
        }
    }//GEN-LAST:event_newYearFocusGained

    /**
    * @param args the command line arguments
    */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelAdd;
    private javax.swing.JButton confirmAdd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField newDay;
    private javax.swing.JTextField newDescription;
    private javax.swing.JFormattedTextField newMonth;
    private javax.swing.JTextField newName;
    private javax.swing.JTextField newYear;
    // End of variables declaration//GEN-END:variables

}
