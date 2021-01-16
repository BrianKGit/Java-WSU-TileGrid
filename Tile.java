import java.util.Random;


public class Tile {
    
    private int size = 2; 
    private int underTile;
    private int bombCount;
    
    public Tile() {
    }
    
    public Tile(int underTile, int bombCount) {
        this.underTile = underTile;
        this.bombCount = bombCount;
    }
    
    //GETTERS AND SETTERS
    public int getUnderTile() {
        return this.underTile;
    }
    public void setUnderTile(int underTile) {
        this.underTile = underTile;
    }
    public int getBombCount() {
        return this.bombCount;
    }
    public void setBombCount(int bombCount) {
        this.bombCount = bombCount;
    }
    
    //END GETTERS AND SETTERS
    
    
    
    //randomly seeds the array with bombs, extralives, and regular
    //can edit the percentages for easy, medium, hard
    public int randomUnderTile() {
        int picked = 0;
        Random rand = new Random();
        
        int randomPick = rand.nextInt(25);
        if (randomPick < 5) {
            picked = 0;
        }
        if (randomPick > 5 && randomPick < 22) {
            picked = 1;
        }
        if (randomPick > 22) {
            picked = 2;
        }
        return picked;
    }
    
    
    
    public String toString() {
        return "";
    }
    
}//end Tile class
