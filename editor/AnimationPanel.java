/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package editor;

import engine.EffectAnimation;
import engine.Weapon;
import java.util.ArrayList;

/**
 *
 * @author Kieran
 */
public class AnimationPanel extends javax.swing.JPanel {

    /**
     * Creates new form ItemPanel
     */
    public static ArrayList<EffectAnimation> animations = new ArrayList<>();
    
    public AnimationPanel() {
        initComponents();
        ((AnimationViewComponent)jPanel1).setSheet("Sword1.png");
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ItemPanel = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        NewItem = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        ItemList = new javax.swing.JList();
        jLabel12 = new javax.swing.JLabel();
        ItemNameField = new javax.swing.JTextField();
        jPanel1 = new AnimationViewComponent();

        jButton7.setText("Cancel");

        jButton8.setText("Apply");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Weapons");

        NewItem.setText("Add New");
        NewItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewItemActionPerformed(evt);
            }
        });

        ItemList.setModel(new javax.swing.AbstractListModel() {
            public int getSize() { return animations.size(); }
            public Object getElementAt(int i) { return i+": "+animations.get(i).name; }
        });
        ItemList.setSelectedIndex(0);
        ItemList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                ItemListValueChanged(evt);
            }
        });
        jScrollPane4.setViewportView(ItemList);

        jLabel12.setText("Name:");

        ItemNameField.setText(animations.get(ItemList.getSelectedIndex()).name);
        ItemNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemNameFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 330, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout ItemPanelLayout = new javax.swing.GroupLayout(ItemPanel);
        ItemPanel.setLayout(ItemPanelLayout);
        ItemPanelLayout.setHorizontalGroup(
            ItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ItemPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(NewItem, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGroup(ItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ItemPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(ItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ItemPanelLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton8)
                                .addGap(18, 18, 18)
                                .addComponent(jButton7)
                                .addGap(10, 10, 10))
                            .addGroup(ItemPanelLayout.createSequentialGroup()
                                .addGroup(ItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(ItemNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(582, Short.MAX_VALUE))))
                    .addGroup(ItemPanelLayout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        ItemPanelLayout.setVerticalGroup(
            ItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ItemPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 556, Short.MAX_VALUE)
                    .addGroup(ItemPanelLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(ItemNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(207, 207, 207)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(ItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7)
                    .addComponent(jButton8)
                    .addComponent(NewItem))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 895, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(ItemPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 658, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(ItemPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void NewItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewItemActionPerformed
        // TODO add your handling code here:
        EffectAnimation e = new EffectAnimation();
        animations.add(e);
        ItemList.updateUI();
        ItemList.repaint();
    }//GEN-LAST:event_NewItemActionPerformed

    private void ItemListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_ItemListValueChanged
        // TODO add your handling code here:
        ItemNameField.setText(animations.get(ItemList.getSelectedIndex()).name);
    }//GEN-LAST:event_ItemListValueChanged

    private void ItemNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemNameFieldActionPerformed
        // TODO add your handling code here:
        String name = ItemNameField.getText();
        animations.get(ItemList.getSelectedIndex()).name = name;
        ItemList.repaint();
    }//GEN-LAST:event_ItemNameFieldActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList ItemList;
    private javax.swing.JTextField ItemNameField;
    private javax.swing.JPanel ItemPanel;
    private javax.swing.JButton NewItem;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration//GEN-END:variables
}
