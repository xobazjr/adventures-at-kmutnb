package object;

import javax.imageio.ImageIO;

public class obj_boots extends superobject{
    public obj_boots(){
        name = "Boots";
        try {
            image = ImageIO.read(getClass().getResourceAsStream("/assets/objects/energy-drink.png"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
