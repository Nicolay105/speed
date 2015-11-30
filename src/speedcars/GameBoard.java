package speedcars;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JPanel;

public class GameBoard extends JPanel {
    private final ArrayList< GameBoardObject > gameBoardObjects = new ArrayList<  >(  );
    
    public void start(  ) throws IOException {
        setBackground( Color.WHITE );
        setPreferredSize( new Dimension( GameWindow.WIDTH, GameWindow.HEIGHT ) );
        setDoubleBuffered( true );
        
        GameBoardObject car = new Car(  );
        car.spriteSheet.loadSpriteSheet(  );
        car.spriteSheet.setSpriteSize( 20, 20 );
        
        gameBoardObjects.add( car );
        repaint(  );
    }
    
    @Override
    public void paintComponent( Graphics g ) {
        super.paintComponent( g );
        
        Graphics2D g2d = ( Graphics2D ) g;
        
        RenderingHints renderingHints = new RenderingHints( RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON );
        renderingHints.put( RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY );

        g2d.setRenderingHints( renderingHints );
         
        drawGameObjects( g2d );
    }
    
    private void drawGameObjects( Graphics2D g2d ) {
         Iterator< GameBoardObject > drawableObjectsIterator = gameBoardObjects.iterator(  );
         while( drawableObjectsIterator.hasNext(  ) ) {
             drawableObjectsIterator.next(  ).draw( g2d );
         }
   }
}
