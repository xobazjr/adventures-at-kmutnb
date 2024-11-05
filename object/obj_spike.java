package object;

import javax.imageio.ImageIO;

public class obj_spike extends superobject {
    public obj_spike() {
        name = "Spike";
        try {
            image = ImageIO.read(getClass().getResourceAsStream("/assets/objects/spike.png"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
