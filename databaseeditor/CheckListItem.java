/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package databaseeditor;

/**
 *
 * @author Kieran
 */
public class CheckListItem
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
