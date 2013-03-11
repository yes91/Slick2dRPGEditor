/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package editor;

import engine.Consumable;
import engine.Effect;
import java.util.ArrayList;

/**
 *
 * @author Kieran
 */
public class ItemPanel extends javax.swing.JPanel {

    /**
     * Creates new form ItemPanel
     */
    private ArrayList<Consumable> consumables;
    
    public ItemPanel(ArrayList<Consumable> list) {
        consumables = list;
        initComponents();
    }
    
    
    public String getPlace(){
        switch (consumables.get(ItemList.getSelectedIndex()).getPlace()) {
            case NEVER: return "Never";
            case BATTLE_ONLY: return "Only from Battle";
            case MENU_ONLY: return "Only from the Menu";
            case ALWAYS: return "Always";
        }
        return "";
    }
    
    public String getScope(){
        switch (consumables.get(ItemList.getSelectedIndex()).getScope()) {
            case NONE:
                return "None";
            case SINGLE_ENEMY:
                return "One Enemy";
            case ALL_ENEMY:
                return "All Enemies";
            /*case "One Enemy Dual":
                consumables.get(ItemList.getSelectedIndex()).setScope(Effect.Scope.NONE);
                break;*/
            case RANDOM_ENEMY:
                return "One Random Enemy";
            case RANDOM_ENEMY_2:
                return "2 Random Enemies";
            case RANDOM_ENEMY_3:
                return "3 Random Enemies";
            case SINGLE_ALLY:
                return "One Ally";
            case ALL_ALLY:
                return "All Allies";
            case DEAD_ALLY:
                return "One Ally (Dead)";
            case ALL_DEAD:
                return "All Allies (Dead)";
            case USER:
                return "The User";
        }
        return "";
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
        jLabel13 = new javax.swing.JLabel();
        ItemIconButton = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        ItemDescField = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        ItemScope = new javax.swing.JComboBox();
        ItemPlace = new javax.swing.JComboBox();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        ItemPrice = new javax.swing.JSpinner();
        jComboBox1 = new javax.swing.JComboBox();
        ItemSpeed = new javax.swing.JSpinner();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel21 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel24 = new javax.swing.JLabel();
        jSpinner2 = new javax.swing.JSpinner();
        jLabel25 = new javax.swing.JLabel();
        jSpinner3 = new javax.swing.JSpinner();
        jSpinner4 = new javax.swing.JSpinner();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jSpinner5 = new javax.swing.JSpinner();
        jLabel31 = new javax.swing.JLabel();
        jSpinner6 = new javax.swing.JSpinner();
        jLabel32 = new javax.swing.JLabel();
        jSpinner7 = new javax.swing.JSpinner();
        jLabel33 = new javax.swing.JLabel();
        jSpinner8 = new javax.swing.JSpinner();
        jLabel34 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();

        jButton7.setText("Cancel");

        jButton8.setText("Apply");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Items");

        NewItem.setText("Add New");
        NewItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewItemActionPerformed(evt);
            }
        });

        ItemList.setModel(new javax.swing.AbstractListModel() {
            public int getSize() { return consumables.size(); }
            public Object getElementAt(int i) { return i+": "+consumables.get(i).getName(); }
        });
        ItemList.setSelectedIndex(0);
        ItemList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                ItemListValueChanged(evt);
            }
        });
        jScrollPane4.setViewportView(ItemList);

        jLabel12.setText("Name:");

        ItemNameField.setText(consumables.get(ItemList.getSelectedIndex()).getName());
        ItemNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemNameFieldActionPerformed(evt);
            }
        });

        jLabel13.setText("Icon:");

        ItemIconButton.setIcon(EditorGUI.subImage(EditorGUI.iconSet, consumables.get(ItemList.getSelectedIndex()).getIndex()));
        ItemIconButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemIconButtonActionPerformed(evt);
            }
        });

        jLabel14.setText("Description:");

        ItemDescField.setText(consumables.get(ItemList.getSelectedIndex()).getDesc());
        ItemDescField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        ItemDescField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemDescFieldActionPerformed(evt);
            }
        });

        jLabel15.setText("Scope:");

        ItemScope.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "None", "One Enemy", "All Enemies", "One Enemy Dual", "One Random Enemy", "2 Random Enemies", "3 Random Enemies", "One Ally", "All Allies", "One Ally (Dead)", "All Allies (Dead)", "The User" }));
        ItemScope.setSelectedItem(getScope());
        ItemScope.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemScopeActionPerformed(evt);
            }
        });

        ItemPlace.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Always", "Only from Battle", "Only from the Menu", "Never" }));
        ItemPlace.setSelectedItem(getPlace());
        ItemPlace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemPlaceActionPerformed(evt);
            }
        });

        jLabel16.setText("Occasion:");

        jLabel17.setText("Price:");

        ItemPrice.setModel(new javax.swing.SpinnerNumberModel(0, 0, 9999, 1));
        ItemPrice.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                ItemPriceStateChanged(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Yes", "No" }));

        ItemSpeed.setModel(new javax.swing.SpinnerNumberModel(0, 0, 9999, 1));
        ItemSpeed.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                ItemSpeedStateChanged(evt);
            }
        });

        jLabel18.setText("Speed:");

        jLabel19.setText("Consume:");

        jLabel20.setText("Animation:");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel21.setText("Common Event:");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel22.setText("Recovery Effect");

        jLabel23.setText("HP Rate:");

        jLabel24.setText("%+");

        jLabel25.setText("HP Value:");

        jLabel26.setText("MP Rate:");

        jLabel27.setText("%+");

        jLabel28.setText("MP Value:");

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel29.setText("Damage Effect");

        jLabel30.setText("Base Dmg:");

        jLabel31.setText("Variance:");

        jLabel32.setText("Attack F:");

        jLabel33.setText("Magic F:");

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel34.setText("Options");

        jCheckBox1.setText("Physical Attack");

        jCheckBox2.setText("MP Damage");

        jCheckBox3.setText("Absorb Damage");

        jCheckBox4.setText("Ignore Defense");

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
                            .addGroup(ItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(ItemPanelLayout.createSequentialGroup()
                                    .addGroup(ItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel12)
                                        .addComponent(ItemNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel14))
                                    .addGap(52, 52, 52)
                                    .addGroup(ItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(ItemPanelLayout.createSequentialGroup()
                                            .addGap(10, 10, 10)
                                            .addComponent(ItemIconButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel13)))
                                .addComponent(ItemDescField, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(ItemPanelLayout.createSequentialGroup()
                                    .addGroup(ItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(ItemScope, 0, 140, Short.MAX_VALUE)
                                        .addComponent(jLabel15)
                                        .addGroup(ItemPanelLayout.createSequentialGroup()
                                            .addGroup(ItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(ItemPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel17)
                                                .addComponent(jLabel20))
                                            .addGap(26, 26, 26)
                                            .addGroup(ItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel19)
                                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGap(18, 18, 18)
                                    .addGroup(ItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(ItemPlace, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(ItemPanelLayout.createSequentialGroup()
                                            .addGroup(ItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel16)
                                                .addComponent(ItemSpeed, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel18)
                                                .addComponent(jLabel21))
                                            .addGap(0, 0, Short.MAX_VALUE))
                                        .addComponent(jComboBox3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addComponent(jLabel22))
                            .addGroup(ItemPanelLayout.createSequentialGroup()
                                .addGroup(ItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel29)
                                    .addGroup(ItemPanelLayout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(ItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(ItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(ItemPanelLayout.createSequentialGroup()
                                                    .addGroup(ItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel23)
                                                        .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jLabel24))
                                                .addGroup(ItemPanelLayout.createSequentialGroup()
                                                    .addGroup(ItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(ItemPanelLayout.createSequentialGroup()
                                                            .addComponent(jLabel26)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                        .addGroup(ItemPanelLayout.createSequentialGroup()
                                                            .addComponent(jSpinner4)
                                                            .addGap(4, 4, 4)))
                                                    .addComponent(jLabel27)))
                                            .addComponent(jLabel30)
                                            .addComponent(jLabel32)
                                            .addGroup(ItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(jSpinner5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                                                .addComponent(jSpinner7, javax.swing.GroupLayout.Alignment.LEADING)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(ItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(ItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jLabel33)
                                                .addComponent(jLabel31)
                                                .addComponent(jLabel28)
                                                .addComponent(jLabel25)
                                                .addComponent(jSpinner2, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                                                .addComponent(jSpinner3))
                                            .addComponent(jSpinner6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jSpinner8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(29, 29, 29)
                                .addGroup(ItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel34)
                                    .addGroup(ItemPanelLayout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(ItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jCheckBox2)
                                            .addComponent(jCheckBox1)
                                            .addComponent(jCheckBox3)
                                            .addComponent(jCheckBox4))))))
                        .addContainerGap(372, Short.MAX_VALUE))))
        );
        ItemPanelLayout.setVerticalGroup(
            ItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ItemPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(jLabel13)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4)
                    .addGroup(ItemPanelLayout.createSequentialGroup()
                        .addGroup(ItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ItemPanelLayout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(ItemNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel14))
                            .addComponent(ItemIconButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ItemDescField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(ItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ItemScope, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ItemPlace, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ItemPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ItemSpeed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(jLabel21))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23)
                            .addComponent(jLabel25))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24)
                            .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26)
                            .addComponent(jLabel28))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jSpinner4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27)
                            .addComponent(jSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(ItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel29)
                            .addComponent(jLabel34))
                        .addGroup(ItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ItemPanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(ItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel30)
                                    .addComponent(jLabel31))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(ItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jSpinner5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSpinner6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(ItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel32)
                                    .addComponent(jLabel33))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(ItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jSpinner7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSpinner8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(ItemPanelLayout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jCheckBox1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox4)))
                        .addGap(0, 65, Short.MAX_VALUE)))
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
            .addGap(0, 651, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(ItemPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void NewItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewItemActionPerformed
        // TODO add your handling code here:
        Consumable c = new Consumable();
        c.setDesc("Default");
        c.setIndex(0);
        c.setScope(Effect.Scope.NONE);
        c.setPlace(Effect.Place.NEVER);
        consumables.add(c);
        ItemList.updateUI();
        ItemList.repaint();
    }//GEN-LAST:event_NewItemActionPerformed

    private void ItemListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_ItemListValueChanged
        // TODO add your handling code here:
        ItemNameField.setText(consumables.get(ItemList.getSelectedIndex()).getName());
        ItemDescField.setText(consumables.get(ItemList.getSelectedIndex()).getDesc());
        ItemScope.setSelectedItem(getScope());
        ItemPlace.setSelectedItem(getPlace());
        ItemPrice.setValue(consumables.get(ItemList.getSelectedIndex()).getPrice());
        ItemSpeed.setValue(consumables.get(ItemList.getSelectedIndex()).getSpeed());
        ItemIconButton.setIcon(EditorGUI.subImage(EditorGUI.iconSet, consumables.get(ItemList.getSelectedIndex()).getIndex()));
    }//GEN-LAST:event_ItemListValueChanged

    private void ItemNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemNameFieldActionPerformed
        // TODO add your handling code here:
        String name = ItemNameField.getText();
        consumables.get(ItemList.getSelectedIndex()).setName(name);
        ItemList.repaint();
    }//GEN-LAST:event_ItemNameFieldActionPerformed

    private void ItemIconButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemIconButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ItemIconButtonActionPerformed

    private void ItemDescFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemDescFieldActionPerformed
        // TODO add your handling code here:
        String desc = ItemDescField.getText();
        consumables.get(ItemList.getSelectedIndex()).setDesc(desc);
    }//GEN-LAST:event_ItemDescFieldActionPerformed

    private void ItemScopeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemScopeActionPerformed
        // TODO add your handling code here:
        String value = (String) ItemScope.getSelectedItem();
        switch (value) {
            case "None":
            consumables.get(ItemList.getSelectedIndex()).setScope(Effect.Scope.NONE);
            break;
            case "One Enemy":
            consumables.get(ItemList.getSelectedIndex()).setScope(Effect.Scope.SINGLE_ENEMY);
            break;
            case "All Enemies":
            consumables.get(ItemList.getSelectedIndex()).setScope(Effect.Scope.ALL_ENEMY);
            break;
            case "One Enemy Dual":
            consumables.get(ItemList.getSelectedIndex()).setScope(Effect.Scope.NONE);
            break;
            case "One Random Enemy":
            consumables.get(ItemList.getSelectedIndex()).setScope(Effect.Scope.RANDOM_ENEMY);
            break;
            case "2 Random Enemies":
            consumables.get(ItemList.getSelectedIndex()).setScope(Effect.Scope.RANDOM_ENEMY_2);
            break;
            case "3 Random Enemies":
            consumables.get(ItemList.getSelectedIndex()).setScope(Effect.Scope.RANDOM_ENEMY_3);
            break;
            case "One Ally":
            consumables.get(ItemList.getSelectedIndex()).setScope(Effect.Scope.SINGLE_ALLY);
            break;
            case "All Allies":
            consumables.get(ItemList.getSelectedIndex()).setScope(Effect.Scope.ALL_ALLY);
            break;
            case "One Ally (Dead)":
            consumables.get(ItemList.getSelectedIndex()).setScope(Effect.Scope.DEAD_ALLY);
            break;
            case "All Allies (Dead)":
            consumables.get(ItemList.getSelectedIndex()).setScope(Effect.Scope.ALL_DEAD);
            break;
            case "The User":
            consumables.get(ItemList.getSelectedIndex()).setScope(Effect.Scope.USER);
            break;
        }
    }//GEN-LAST:event_ItemScopeActionPerformed

    private void ItemPlaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemPlaceActionPerformed
        // TODO add your handling code here:
        String value = (String) ItemPlace.getSelectedItem();
        switch(value){
            case "Always":
            consumables.get(ItemList.getSelectedIndex()).setPlace(Effect.Place.ALWAYS);
            break;
            case "Only from Battle":
            consumables.get(ItemList.getSelectedIndex()).setPlace(Effect.Place.BATTLE_ONLY);
            break;
            case "Only from the Menu":
            consumables.get(ItemList.getSelectedIndex()).setPlace(Effect.Place.MENU_ONLY);
            break;
            case "Never":
            consumables.get(ItemList.getSelectedIndex()).setPlace(Effect.Place.NEVER);
            break;
        }
    }//GEN-LAST:event_ItemPlaceActionPerformed

    private void ItemPriceStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_ItemPriceStateChanged
        // TODO add your handling code here:
        consumables.get(ItemList.getSelectedIndex()).setPrice((int)ItemPrice.getValue());
    }//GEN-LAST:event_ItemPriceStateChanged

    private void ItemSpeedStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_ItemSpeedStateChanged
        // TODO add your handling code here:
        consumables.get(ItemList.getSelectedIndex()).setSpeed((int)ItemSpeed.getValue());
    }//GEN-LAST:event_ItemSpeedStateChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ItemDescField;
    private javax.swing.JButton ItemIconButton;
    private javax.swing.JList ItemList;
    private javax.swing.JTextField ItemNameField;
    private javax.swing.JPanel ItemPanel;
    private javax.swing.JComboBox ItemPlace;
    private javax.swing.JSpinner ItemPrice;
    private javax.swing.JComboBox ItemScope;
    private javax.swing.JSpinner ItemSpeed;
    private javax.swing.JButton NewItem;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JSpinner jSpinner3;
    private javax.swing.JSpinner jSpinner4;
    private javax.swing.JSpinner jSpinner5;
    private javax.swing.JSpinner jSpinner6;
    private javax.swing.JSpinner jSpinner7;
    private javax.swing.JSpinner jSpinner8;
    // End of variables declaration//GEN-END:variables
}