package databaseeditor;


public abstract class Item {
	
    public static enum Targets {SINGLE_PLAYER, WHOLE_PARTY, SINGLE_ENEMY, WHOLE_ENEMY_PARTY}
    
    private boolean useable;
    private String name;
    private int price;
    private int gid;

    
    

    public Item(String name, boolean use) {
      this.name = name;
      this.useable = use;
      this.price = 0;
        
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        
        return name;
    }
    
    public boolean isUseable(){
     
        return useable;
    }
    
    public void setGID(int n){
        
        gid = n;
    }
    
    public int getGID(){
        return gid;
    }
    
    @Override
    public String toString(){
        return name;
    }

}
  