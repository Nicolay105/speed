package speedcars;

import java.awt.Graphics2D;

public class GameBoardObject implements Drawable, Updateable {
    private int x;
    private int y;
    
    public final SpriteSheet spriteSheet;
    
            
    public GameBoardObject(  ) {
        this.spriteSheet = new SpriteSheet(  );
    }
    
    @Override
    public void update(  ) {
        
    }

    @Override
    public void draw( Graphics2D g2d ) {
        g2d.drawImage( spriteSheet.getActiveSprite(  ), null, x, y );
    }
}
