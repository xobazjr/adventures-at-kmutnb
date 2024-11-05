package object;

import javax.imageio.ImageIO;

public class obj_faii extends superobject {
    public obj_faii() {
        name = "Faii dek ped";
        try {
            image = ImageIO.read(getClass().getResourceAsStream("/assets/objects/faii-dek-ped.png"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        collision = true;
    }
}
