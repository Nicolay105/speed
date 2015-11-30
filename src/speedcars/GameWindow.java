package speedcars;

import java.io.IOException;
import javax.swing.JFrame;

public class GameWindow extends JFrame {
    public static final int WIDTH = 800;
    public static final int HEIGHT = 600;
    
    private final GameBoard gameBoard;
    
    public GameWindow(  ) {
        setSize( 800, 600 );
        setTitle( StaticGameData.gameName );
        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        setLocationRelativeTo( null );
        
        gameBoard = new GameBoard(  );
        setContentPane( gameBoard );
    }
    
    public void startGame(  ) throws IOException {
        gameBoard.start(  );
    }
}
