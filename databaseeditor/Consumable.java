/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package databaseeditor;

/**
 *
 * @author Kieran
 */
public class Consumable extends Item {
    
    private String effect;
    private String type;
    
    public Consumable(String name,String type) {
        super(name, true);
        this.type = type;
    }
    
    public void setEffect(String s){
        
        effect = s;
    }
    
    
}
