package main;

import object.obj_key;
import object.obj_paper_a;
import object.obj_paper_not_find;

public class assetsetter {
    gamepanel gp;

    public assetsetter(gamepanel gp){
        this.gp = gp;
    }

    public void setObject(){
        gp.obj[0] = new obj_key();
        gp.obj[0].worldX = 41 * gp.tileSize;
        gp.obj[0].worldY = 46 * gp.tileSize;

        gp.obj[1] = new obj_key();
        gp.obj[1].worldX = 35 * gp.tileSize;
        gp.obj[1].worldY = 10 * gp.tileSize;

        gp.obj[2] = new obj_key();
        gp.obj[2].worldX = 4 * gp.tileSize;
        gp.obj[2].worldY = 2 * gp.tileSize;

        gp.obj[3] = new obj_paper_not_find();
        gp.obj[3].worldX = 32 * gp.tileSize;
        gp.obj[3].worldY = 43  * gp.tileSize;

        gp.obj[4] = new obj_paper_not_find();
        gp.obj[4].worldX = 24 * gp.tileSize;
        gp.obj[4].worldY = 43 * gp.tileSize;

        gp.obj[5] = new obj_paper_not_find();
        gp.obj[5].worldX = 10 * gp.tileSize;
        gp.obj[5].worldY = 43 * gp.tileSize;

        gp.obj[6] = new obj_paper_a();
        gp.obj[6].worldX = 5 * gp.tileSize;
        gp.obj[6].worldY = 43 * gp.tileSize;
    }
}
