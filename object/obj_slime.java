package object;

import javax.imageio.ImageIO;

public class obj_slime extends superobject{
    public obj_slime() {
        name = "Slime";
        try {
            image = ImageIO.read(getClass().getResourceAsStream("/assets/objects/slime.png"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
