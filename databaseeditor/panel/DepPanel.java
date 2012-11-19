/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package databaseeditor.panel;

import databaseeditor.CheckListItem;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.HashMap;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListSelectionModel;

/**
 *
 * @author Kieran
 */
public class DepPanel extends JPanel{
    
    private String[] classNames;
    private int maxClasses;
    private JList list2;
    
    HashMap<Integer, Boolean> weapons;
    HashMap<Integer, Boolean> armors;
    
    public DepPanel(){
        /*JList list = new JList(initialClasses);
        
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        JScrollPane listScroller = new JScrollPane(list);
        listScroller.setPreferredSize(new Dimension(250, 80));
        this.setLayout(new GridLayout(1, 0));
        add(listScroller);
        
        //weaponScroller.*/
        maxClasses = 5;
        classNames = new String[]{"Mage", "Idiot"};
        weapons = new HashMap();
        armors = new HashMap();
        Object[] items = new Object[20];

        for(int i = 0; i < 20; i++){
        //add(new JCheckBox("Stock"));
        items[i] = (new CheckListItem("Stock"));
        weapons.put(i, false);
        armors.put(i, false);
        }
        list2 = new JList(items);
        list2.addMouseListener(new MouseAdapter()
      {
          @Override
         public void mouseClicked(MouseEvent event)
         {
            JList list = (JList) event.getSource();

            // Get index of item clicked

            int index = list.locationToIndex(event.getPoint());
            CheckListItem item = (CheckListItem)
               list.getModel().getElementAt(index);

            // Toggle selected state

            item.setSelected(! item.isSelected());

            // Repaint cell

            list.repaint(list.getCellBounds(index, index));
         }
      });   
        list2.setCellRenderer(new CheckListRenderer());
        list2.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        /*
        JScrollPane weaponScroller = new JScrollPane(list2);
        weaponScroller.createVerticalScrollBar();
        
        add(weaponScroller);???*/
        initComponents();
        
    }
    
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList3 = new javax.swing.JList();
        jTextField1 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jScrollPane4 = new javax.swing.JScrollPane();
        jList4 = new javax.swing.JList();

        jList1.setModel(new javax.swing.AbstractListModel() {
            public int getSize() { return classNames.length; }
            public Object getElementAt(int i) { return classNames[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        jList3 = list2;
        jScrollPane3.setViewportView(jList3);

        jTextField1.setText("Class Name");
        jTextField1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jList4.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(jList4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(150, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
                    .addComponent(jScrollPane4)))
        );
    }// </editor-fold>
    // Variables declaration - do not modify
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JList jList1;
    private javax.swing.JList jList3;
    private javax.swing.JList jList4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField jTextField1;
    
}

/*class CheckListItem
{
   private String  label;
   private boolean isSelected = false;

   public CheckListItem(String label)
   {
      this.label = label;
   }

   public boolean isSelected()
   {
      return isSelected;
   }

   public void setSelected(boolean isSelected)
   {
      this.isSelected = isSelected;
   }

   public String toString()
   {
      return label;
   }
}

class CheckListRenderer extends JCheckBox implements ListCellRenderer {
    
    public Component getListCellRendererComponent(JList list, Object value, int index,boolean isSelected, boolean hasFocus) {
        setEnabled(list.isEnabled());
        setSelected(((CheckListItem)value).isSelected());
        setFont(list.getFont());
        setBackground(list.getBackground());
        setForeground(list.getForeground());
        setText(value.toString());
        return this;
        }
}*/