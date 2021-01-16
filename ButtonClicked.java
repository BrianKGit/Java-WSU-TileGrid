import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ButtonClicked implements ActionListener {
        
    //sets up the icons for what the button looks like
    Icon boom = new ImageIcon(getClass().getResource("images/Boom2.jpg"));
    Icon mercy = new ImageIcon(getClass().getResource("images/Mercy.jpg"));
        
        
    //when any button is clicked the action performed is triggered
    @Override
    public void actionPerformed(ActionEvent event) {
        //when you find the button you want to keep the i and j for coordinates for later
        //if button not found it stays -5
        int arrayI = -5;
        int arrayJ = -5;
        //this loops through and finds out which button you pressed
        //otherwise all buttons would do the same thing
        for (int i=0; i<GUI.xSize; i++ ) {
            for (int j=0; j< GUI.ySize; j++) {
                if (event.getSource() == GUI.buttonArray[i][j] ) {
                    arrayI = i;
                    arrayJ = j;


                }
            }
        }        
        //when tile is found in array(show message for coordinates.....for now
        //set button disabled, find out what is under tile)
        //later need to find out how to open patches of empty buttons and put extra lives in there
        JOptionPane.showMessageDialog(null, "( " + arrayI + ", " + arrayJ + ")");

        GUI.buttonArray[arrayI][arrayJ].setEnabled(false);
        int underInt = GUI.tileArray[arrayI][arrayJ].getUnderTile();

        //if bomb
        if (underInt == 0 ) {
            GUI.buttonArray[arrayI][arrayJ].setDisabledIcon(boom);
        }
        //if number
        if (underInt == 1 ) {
            //if its just a number, you need to see what number it is
            //countBombs(Tile tile);
            //if count is 0 then open spaces
            GUI.buttonArray[arrayI][arrayJ].setDisabledIcon(mercy);
        }
        //empty spot
        if (underInt == 2 ) {
            GUI.buttonArray[arrayI][arrayJ].setDisabledIcon(mercy);
        }

        //for tile not found
        if (arrayI == -5 || arrayJ == -5 ) {
            JOptionPane.showMessageDialog(null, "Tile not found :(");
        }
        
    }//end actionPerformed
        
    
    
    //this will take a tile, then check surrounding tiles for how many bombs there are
    //then it will do Tile.setBombCount(number)
    public int countBombs(Tile tile) {
        //check up-left
        //check up
        //check up-right
        //check left
        //check right
        //check lower left
        //check down
        //check lower right
        
        //for each one that is a hit, Tile.setBombCount( Tile.getBombCount() + 1 );
        
        return 0;
        
    }//end countBombs
        
}//end class


