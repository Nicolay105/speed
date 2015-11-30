package speedcars;

import java.awt.EventQueue;

public class SpeedCars {
    public static void main( String[  ] args ) {
        EventQueue.invokeLater( new Runnable(  ) {
            @Override
            public void run(  ) {
                GameWindow gameWindow = new GameWindow(  );
                gameWindow.setVisible( true );
                gameWindow.startGame(  );
            }
        } );
    }
    
}
