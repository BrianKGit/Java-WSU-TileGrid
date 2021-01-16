import javax.swing.JFrame;


public class MainRunClass {
    
    public static void main(String[] args) {
        //have these declared here so if we need to use them elsewhere in program we can
        //for example in GUI xSize and ySize can = screenWidth/number
        int screenWidth = 1100;
        int screenHeight = 650;
        
        
        GUI go = new GUI();
      //LoginGUI loginScreen = new LoginGUI();
      //loginScreen.setSize(sreenWidth, screenHeight);
        go.setSize(screenWidth, screenHeight);
        go.setTitle("Title goes here");
        go.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);     
        go.setVisible(true);
        //go.setResizable(false); probably want this set true but fun to use for now
        
    }
    
    
    
}
