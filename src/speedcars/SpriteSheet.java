package speedcars;

import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class SpriteSheet {
    private Dimension spriteSize; 
    private BufferedImage spriteSheet;
    private BufferedImage activeSprite;
    
    public SpriteSheet(  ) {
        
    }
    
    public void setSpriteSize( int spriteWidth, int spriteHeight ) {
        spriteSize = new Dimension( spriteWidth, spriteHeight );
    }
    
    public void loadSpriteSheet( File spriteSheetImage ) throws IOException {
        spriteSheet = ImageIO.read( spriteSheetImage );
    }
    
    public void setActiveSprite( int spritePosition ) {
        activeSprite = spriteSheet.getSubimage( 
                                        spritePosition * spriteSize.width, 
                                        0, 
                                        spriteSize.width, 
                                        spriteSize.height 
                                    );
    }
    
    public BufferedImage getActiveSprite(  ) {
        return activeSprite;
    }
}
