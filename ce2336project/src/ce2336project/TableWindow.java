/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * TableWindow.java
 *
 * Created on Aug 6, 2013, 2:33:03 PM
 */

package ce2336project;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Daniel Heironimus
 */
public class TableWindow extends javax.swing.JFrame {
    private Refrigerator fridge;
    private RefrigeratorDatabase db;

    /** Fixes an issue with cells being editable by overriding a method
     *  User could double click cells to edit them, but this program doesn't
     *  support that feature.
     */
    DefaultTableModel tableModel = new DefaultTableModel() {
        /** original method always returns true, fix always returns false */
        @Override
        public boolean isCellEditable(int row, int column) {
            //all cells false
            return false;
        }
    };

    /** Creates new form TableWindow */
    public TableWindow(Refrigerator fridge, RefrigeratorDatabase db) {
        this.fridge = fridge;
        this.db = db;
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        addItem = new javax.swing.JButton();
        deleteItem = new javax.swing.JButton();
        refreshList = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        searchBox = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        String[][] tableElements = new String[fridge.getList().size()][3];
        int i=0;
        for(Food f : fridge.getList()){
            tableElements[i][0] = f.getName();
            tableElements[i][1] = f.stringExpiration();
            tableElements[i][2] = f.getDescription();
            i++;
        }

        tableModel.setDataVector(tableElements,new String [] {
            "Food", "Expiration Date", "Description"});
    jTable1.setModel(tableModel);
    jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            if(evt.getClickCount()>1){
                jTable1MouseClicked(evt);
            }
        }
    });
    jScrollPane1.setViewportView(jTable1);

    addItem.setText("Add Item");
    addItem.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            addItemActionPerformed(evt);
        }
    });

    deleteItem.setText("Remove Item");
    deleteItem.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            deleteItemActionPerformed(evt);
        }
    });

    refreshList.setText("Refresh");
    refreshList.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            refreshListActionPerformed(evt);
        }
    });

    editButton.setText("Edit");
    editButton.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            editButtonActionPerformed(evt);
        }
    });

    searchBox.setText("Search Items");
    searchBox.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusGained(java.awt.event.FocusEvent evt) {
            searchBoxFocusGained(evt);
        }
        public void focusLost(java.awt.event.FocusEvent evt) {
            searchBoxFocusLost(evt);
        }
    });
    searchBox.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyReleased(java.awt.event.KeyEvent evt) {
            searchBoxKeyReleased(evt);
        }
        public void keyTyped(java.awt.event.KeyEvent evt) {
            searchBoxKeyTyped(evt);
        }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(addItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(deleteItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 212, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(editButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(refreshList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addContainerGap())
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addContainerGap(248, Short.MAX_VALUE)
            .addComponent(searchBox, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap())
        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(searchBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(addItem)
                .addComponent(editButton))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(deleteItem)
                .addComponent(refreshList))
            .addContainerGap())
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents


    /** Pops out a window to assist in adding a new item to the table */
    private void addItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addItemActionPerformed
        // TODO add your handling code here:
        new InsertItem(fridge,db,refreshList).setVisible(true);
    }//GEN-LAST:event_addItemActionPerformed

    /** Refreshes the list, normally only needed after a new row is added */
    private void refreshListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshListActionPerformed
        //updates the Refridgerator class
        fridge = db.read();
        //resizes the table
        refreshTable(fridge.getList());
    }//GEN-LAST:event_refreshListActionPerformed

    private void refreshTable(java.util.List<Food> food){
        String[][] tableElements = new String[food.size()][3];
        int i=0;
        for(Food f : food){
            tableElements[i][0] = f.getName();
            tableElements[i][1] = f.stringExpiration();
            tableElements[i][2] = f.getDescription();
            i++;
        }
        tableModel.setDataVector(tableElements,new String [] {
                "Food", "Expiration Date", "Description"});
        jTable1.setModel(tableModel);
    }
    /** Opens the insertItem box, with fields pre-filled */
    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        if(!(jTable1.getSelectedRow()<0))
        new InsertItem(fridge,db,
                jTable1.getSelectedRow(),refreshList).setVisible(true);
    }//GEN-LAST:event_editButtonActionPerformed

    /** Deletes the selected item(row), does nothing if no item is selected */
    private void deleteItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteItemActionPerformed
        if(!(jTable1.getSelectedRow()<0)){
            fridge.removeItem(jTable1.getSelectedRow());
            db.write(fridge);
        }
        refreshList.doClick();
    }//GEN-LAST:event_deleteItemActionPerformed

    /** Sets searchBox text to blank if default text is present on focus*/
    private void searchBoxFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchBoxFocusGained
        if(searchBox.getText().equalsIgnoreCase("search items")){
            searchBox.setText("");
        }
    }//GEN-LAST:event_searchBoxFocusGained

    /** Sets searchBox text to default if blank on loss of focus*/
    private void searchBoxFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchBoxFocusLost
        if(searchBox.getText().trim().equalsIgnoreCase("")){
            searchBox.setText("Search Items");
        }
    }//GEN-LAST:event_searchBoxFocusLost

    /** Dynamically removes items from the displayed table if they match
     *  the string in the search box*/
    private void searchBoxKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchBoxKeyTyped
        java.util.List<Food> temp = new java.util.ArrayList<Food>();
        for(Food f : fridge.getList()){
            if(f.getName().contains(searchBox.getText().trim())){
                temp.add(f);
            }
        }
        refreshTable(temp);
    }//GEN-LAST:event_searchBoxKeyTyped

    /**  Extra enforcing mechanism for searchBoxKeyTyped method, fixes bug*/
    private void searchBoxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchBoxKeyReleased
        java.util.List<Food> temp = new java.util.ArrayList<Food>();
        for(Food f : fridge.getList()){
            if(f.getName().contains(searchBox.getText().trim())){
                temp.add(f);
            }
        }
        refreshTable(temp);
    }//GEN-LAST:event_searchBoxKeyReleased

    /** On table double click, opens the edit box for selected row */
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt){
        editButton.doClick();
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addItem;
    private javax.swing.JButton deleteItem;
    private javax.swing.JButton editButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton refreshList;
    private javax.swing.JTextField searchBox;
    // End of variables declaration//GEN-END:variables

}