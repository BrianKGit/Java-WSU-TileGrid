import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Color;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;


public class GUI extends JFrame {
    
    //variable and instances of GUI
    int padding = 5;
    static int xSize = 25;
    static int ySize = 25;
    static JButton[][] buttonArray = new JButton[xSize][ySize];
    static Tile[][] tileArray = new Tile[xSize][ySize];
    //I have these static because they can be used by buttonClicked
    //easier to have buttonClicked in its own class for editing and reading
    
    Tile tileInstance = new Tile();
    JPanel gridPanel = new JPanel();
    JPanel topArea = new JPanel();
    Icon icon1 = new ImageIcon(getClass().getResource("images/B50.png"));   //some are saved as png, jpg
    Icon icon2 = new ImageIcon(getClass().getResource("images/BG50.png"));
    
    
    
    public GUI() {
        
        //this all builds the gui
        add(topArea, BorderLayout.NORTH);
        JButton topButton = new JButton("Reset");   //this button is just for show
        topArea.add(topButton);
        topButton.setSize(150, 100);
        //topArea.setBackground(Color.WHITE);
        
        //this is the board area
        Color background = new Color(24, 0, 10);
        add(gridPanel, BorderLayout.CENTER);
        gridPanel.setLayout(new GridLayout(xSize, ySize, padding, padding));
        gridPanel.setBackground(background);
        ButtonClicked listener = new ButtonClicked();
        
        
        //this sets up all the buttons, puts them in array and makes an array of tiles
        for (int i=0; i<xSize; i++ ) {
            for (int j=0; j< ySize; j++) {
                int rand = tileInstance.randomUnderTile();
                buttonArray[i][j] = new JButton(icon1);
                tileArray[i][j] = new Tile(rand, 0);
                buttonArray[i][j].setRolloverIcon(icon2);
                buttonArray[i][j].addActionListener(listener);
                gridPanel.add(buttonArray[i][j]);
            }
        }//end for loops
        
        
    }//end public GUI()
    
    
    
    
    
}//end class
