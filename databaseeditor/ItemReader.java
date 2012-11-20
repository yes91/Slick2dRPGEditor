/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package databaseeditor;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

/**
 *
 * @author redblast71
 */
public class ItemReader {
    
    public static ArrayList<Item> items = new ArrayList<>();
    
    public static void binWrite(){
        ObjectOutputStream item = null;
            try {
                item = new ObjectOutputStream(new FileOutputStream(new File("items.jrdata")));
            } catch (IOException ex) {
                Logger.getLogger(ItemReader.class.getName()).log(Level.SEVERE, null, ex);
            }
        try {
            item.writeUTF("ITM"); //String ITM
            item.writeInt(items.size());//int itemsLength
            for(Item i: items){
                item.writeUTF("Item");//String Item
                item.writeUTF(i.getName());//String name
                item.writeInt(i.getPrice());//int price
                item.writeInt(i.getGID());//int gid
                if(i instanceof Consumable){
                    item.writeInt(0);//int type
                    item.writeUTF(((Consumable)i).getEffect());//String effect
                }
                if(i instanceof Weapon){
                    item.writeInt(1);//int type
                    item.writeInt(((Weapon)i).getDmg());//int dmg
                    item.writeFloat(((Weapon)i).getHitPercent());//float hitPercent
                    item.writeObject(((Weapon)i).getElements());
                }
            }
            item.flush();
            item.close();
        } catch (IOException ex) {
            Logger.getLogger(ItemReader.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }
    
    public static void binRead(){
        ObjectInputStream item = null;
        try {
            item = new ObjectInputStream(new FileInputStream(new File("items.jrdata")));
        } catch (IOException ex) {
            Logger.getLogger(ItemReader.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            if("ITM".equals(item.readUTF())){
                final int itemsLength = item.readInt();
                for(int i = 0; i <= itemsLength-1; i++){
                    if("Item".equals(item.readUTF())){
                        String name = item.readUTF();
                        int price = item.readInt();
                        int gid = item.readInt();
                        int type = item.readInt();
                        if(type == 0){
                            Consumable b = new Consumable(name, "");
                            b.setPrice(price);
                            b.setGID(gid);
                            b.setEffect(item.readUTF());
                            items.add(b);
                        }
                        else if(type == 1){
                            int dmg = item.readInt();
                            float hit = item.readFloat();
                            Weapon w = new Weapon(name);
                            w.setPrice(price);
                            w.setHitPercent(hit);
                            for(databaseeditor.Element e: (databaseeditor.Element[])item.readObject()){
                            w.addElement(e);
                            }
                            w.setGID(gid);
                            w.setDmg(dmg);
                            items.add(w);
                        }
                    }
                }
                item.close();
            }
            else{
                try {
                    throw new Exception("Invalid item file.");
                } catch (Exception ex) {
                    Logger.getLogger(ItemReader.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ItemReader.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ItemReader.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public static void populateItems() {
          SAXBuilder builder = new SAXBuilder();
 
	  try {
              InputStream is = ItemReader.class.getClassLoader().getResourceAsStream("res/ItemFile.xml");
 
		Document document = (Document) builder.build(is);
		Element rootNode = document.getRootElement();
		List<Element> list = rootNode.getChildren("item");
 
		for (int i = 0; i < list.size(); i++) {
 
		   Element node = (Element) list.get(i);
                   
                   if(node.getChildText("type").equals("weapon")){
                       
                       Item item = new Weapon(node.getChildText("name"));
                       ((Weapon)item).setDmg(Integer.parseInt(node.getChildText("dmg")));
                       item.setGID(Integer.parseInt(node.getChildText("gid")));
                       items.add(item);
                       
                   }
                   if(node.getChildText("type").equals("consumable")){
                       
                       Item item = new Consumable(node.getChildText("name"),node.getChildText("subtype"));
                       ((Consumable)item).setEffect(node.getChildText("effect"));
                       item.setGID(Integer.parseInt(node.getChildText("gid")));
                       items.add(item);
                       
                   }
 
		}
 
	  } catch (IOException io) {
		System.out.println(io.getMessage());
	  } catch (JDOMException jdomex) {
		System.out.println(jdomex.getMessage());
	  }
}
    public static ArrayList<Item> getItems(){
        
        return items;
    }
    
}
