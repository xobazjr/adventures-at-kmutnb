package main;

import object.obj_boots;
import object.obj_key;
import object.obj_sathit;

public class assetsetter {
    gamepanel gp;

    public assetsetter(gamepanel gp) {
        this.gp = gp;
    }

    public void setObject() {
        gp.obj[0] = new obj_key();
        gp.obj[0].worldX = 41 * gp.tileSize;
        gp.obj[0].worldY = 46 * gp.tileSize;

        gp.obj[1] = new obj_key();
        gp.obj[1].worldX = 35 * gp.tileSize;
        gp.obj[1].worldY = 10 * gp.tileSize;

        gp.obj[2] = new obj_key();
        gp.obj[2].worldX = 5 * gp.tileSize;
        gp.obj[2].worldY = 43 * gp.tileSize;

        gp.obj[3] = new obj_key();
        gp.obj[3].worldX = 13 * gp.tileSize;
        gp.obj[3].worldY = 34 * gp.tileSize;

        gp.obj[4] = new obj_key();
        gp.obj[4].worldX = 4 * gp.tileSize;
        gp.obj[4].worldY = 2 * gp.tileSize;

        gp.obj[5] = new obj_key();
        gp.obj[5].worldX = 44 * gp.tileSize;
        gp.obj[5].worldY = 1 * gp.tileSize;

        gp.obj[6] = new obj_sathit();
        gp.obj[6].worldX = 33 * gp.tileSize;
        gp.obj[6].worldY = 44 * gp.tileSize;

        gp.obj[7] = new obj_boots();
        gp.obj[7].worldX = 39 * gp.tileSize;
        gp.obj[7].worldY = 33 * gp.tileSize;

        gp.obj[8] = new obj_boots();
        gp.obj[8].worldX = 5 * gp.tileSize;
        gp.obj[8].worldY = 11 * gp.tileSize;

        gp.obj[9] = new obj_boots();
        gp.obj[9].worldX = 7 * gp.tileSize;
        gp.obj[9].worldY = 43 * gp.tileSize;
    }
}