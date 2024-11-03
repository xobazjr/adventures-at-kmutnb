package object;

import javax.imageio.ImageIO;

public class obj_paper_a extends superobject{
    public obj_paper_a(){
        name = "Paper grade A";
        try {
            image = ImageIO.read(getClass().getResourceAsStream("/assets/objects/paper-a.png"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
