/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package databaseeditor;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Kieran
 */
public class PlayerClass {
    
    public static enum Position{
    FRONT(0),
    MIDDLE(1),
    BACK(2);
    
    private final int index;
    Position(int index) {
        this.index = index;
        }
        @Override
    public String toString(){
            switch (this.name()) {
                case "FRONT":
                    return "Front";
                case "MIDDLE":
                    return "Middle";
                case "BACK":
                    return "Back";
            }
            return "";
    }
    }
    
    public Position pos;
    public String className;
    public HashMap<Integer, Boolean> weapons;
    public HashMap<Integer, Boolean> armors;
    public HashMap<Element, Float> eEfficiency;
    public ArrayList<CheckListItem> weaponsclist;
    
    public PlayerClass(){
        
        pos = Position.FRONT;
        className = "";
        weapons = new HashMap();
        armors = new HashMap();
        eEfficiency = new HashMap();
        weaponsclist = new ArrayList<>();
        
    }
    
}
