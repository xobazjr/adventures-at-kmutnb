package object;

import javax.imageio.ImageIO;

public class obj_key extends superobject{
    public obj_key(){
        name = "Paper grade F";
        try {
            image = ImageIO.read(getClass().getResourceAsStream("/assets/objects/paper-f.png"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
