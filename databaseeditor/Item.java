package databaseeditor;


public class Item {
	public static enum Targets {SINGLE_PLAYER, WHOLE_PARTY, SINGLE_ENEMY, WHOLE_ENEMY_PARTY}
    
    private boolean useable;
    private String name;
    private String type;
    private int index;

    
    

    public Item(String name, boolean use) {
      this.name = name;
      this.useable = use;
        
    }
    
    public String getName(){
        
        return name;
    }
    
    public void setType(String t){
        
        type = t;
    }
    
    public String getType(){
        
        return type;
    }
    
    public boolean isUseable(){
     
        return useable;
    }
    
    public void setIndex(int n){
        
        index = n;
    }
    
    @Override
    public String toString(){
        return name;
    }

}
  