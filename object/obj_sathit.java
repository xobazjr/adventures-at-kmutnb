package object;

import javax.imageio.ImageIO;

public class obj_sathit extends superobject{
    public obj_sathit(){
        name = "Sathit";
        try {
            image = ImageIO.read(getClass().getResourceAsStream("/assets/objects/sathit.png"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        collision = true;
    }
}
