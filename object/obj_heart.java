package object;

import javax.imageio.ImageIO;

import main.gamepanel;

public class obj_heart extends superobject{
    gamepanel gp;
    
    public obj_heart(gamepanel gp) {
        this.gp = gp;
        name = "Heart";
        try {
            image = ImageIO.read(getClass().getResourceAsStream("/assets/objects/heart-full.png"));
            image2 = ImageIO.read(getClass().getResourceAsStream("/assets/objects/heart-half.png"));
            image3 = ImageIO.read(getClass().getResourceAsStream("/assets/objects/heart-empty.png"));
            image = uTool.scaleImage(image, gp.tileSize, gp.tileSize);
            image2 = uTool.scaleImage(image2, gp.tileSize, gp.tileSize);
            image3 = uTool.scaleImage(image3, gp.tileSize, gp.tileSize);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
