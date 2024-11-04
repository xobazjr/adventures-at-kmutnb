package object;

import javax.imageio.ImageIO;

public class obj_paper_not_find extends superobject {
    public obj_paper_not_find() {
        name = "Paper not find";
        try {
            image = ImageIO.read(getClass().getResourceAsStream("/assets/objects/paper-f-not-find.png"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        collision = true;
    }
}