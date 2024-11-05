package main;

import object.obj_boots;
import object.obj_key;
import object.obj_sathit;
import object.obj_spike;

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
        gp.obj[4].worldX = 2 * gp.tileSize;
        gp.obj[4].worldY = 3 * gp.tileSize;

        gp.obj[5] = new obj_key();
        gp.obj[5].worldX = 44 * gp.tileSize;
        gp.obj[5].worldY = 1 * gp.tileSize;

        gp.obj[6] = new obj_sathit();
        gp.obj[6].worldX = 5 * gp.tileSize;
        gp.obj[6].worldY = 5 * gp.tileSize;

        gp.obj[7] = new obj_boots();
        gp.obj[7].worldX = 39 * gp.tileSize;
        gp.obj[7].worldY = 33 * gp.tileSize;

        gp.obj[8] = new obj_boots();
        gp.obj[8].worldX = 5 * gp.tileSize;
        gp.obj[8].worldY = 11 * gp.tileSize;

        gp.obj[9] = new obj_boots();
        gp.obj[9].worldX = 7 * gp.tileSize;
        gp.obj[9].worldY = 43 * gp.tileSize;

        gp.obj[10] = new obj_spike();
        gp.obj[10].worldX = 29 * gp.tileSize;
        gp.obj[10].worldY = 43 * gp.tileSize;

        gp.obj[11] = new obj_spike();
        gp.obj[11].worldX = 27 * gp.tileSize;
        gp.obj[11].worldY = 42 * gp.tileSize;

        gp.obj[12] = new obj_spike();
        gp.obj[12].worldX = 27 * gp.tileSize;
        gp.obj[12].worldY = 44 * gp.tileSize;

        gp.obj[13] = new obj_spike();
        gp.obj[13].worldX = 25 * gp.tileSize;
        gp.obj[13].worldY = 43 * gp.tileSize;

        gp.obj[14] = new obj_spike();
        gp.obj[14].worldX = 22 * gp.tileSize;
        gp.obj[14].worldY = 43 * gp.tileSize;

        gp.obj[15] = new obj_spike();
        gp.obj[15].worldX = 22 * gp.tileSize;
        gp.obj[15].worldY = 44 * gp.tileSize;

        gp.obj[16] = new obj_spike();
        gp.obj[16].worldX = 20 * gp.tileSize;
        gp.obj[16].worldY = 44 * gp.tileSize;

        gp.obj[17] = new obj_spike();
        gp.obj[17].worldX = 20 * gp.tileSize;
        gp.obj[17].worldY = 42 * gp.tileSize;

        gp.obj[18] = new obj_spike();
        gp.obj[18].worldX = 17 * gp.tileSize;
        gp.obj[18].worldY = 43 * gp.tileSize;
        
        gp.obj[19] = new obj_spike();
        gp.obj[19].worldX = 17 * gp.tileSize;
        gp.obj[19].worldY = 44 * gp.tileSize;

        gp.obj[20] = new obj_spike();
        gp.obj[20].worldX = 15 * gp.tileSize;
        gp.obj[20].worldY = 42 * gp.tileSize;

        gp.obj[21] = new obj_spike();
        gp.obj[21].worldX = 13 * gp.tileSize;
        gp.obj[21].worldY = 43 * gp.tileSize;

        gp.obj[22] = new obj_spike();
        gp.obj[22].worldX = 10 * gp.tileSize;
        gp.obj[22].worldY = 42 * gp.tileSize;

        gp.obj[23] = new obj_spike();
        gp.obj[23].worldX = 10 * gp.tileSize;
        gp.obj[23].worldY = 44 * gp.tileSize;

        gp.obj[24] = new obj_spike();
        gp.obj[24].worldX = 3 * gp.tileSize;
        gp.obj[24].worldY = 3 * gp.tileSize;

        gp.obj[25] = new obj_spike();
        gp.obj[25].worldX = 5 * gp.tileSize;
        gp.obj[25].worldY = 2 * gp.tileSize;

        gp.obj[26] = new obj_spike();
        gp.obj[26].worldX = 41 * gp.tileSize;
        gp.obj[26].worldY = 43 * gp.tileSize;

        gp.obj[27] = new obj_spike();
        gp.obj[27].worldX = 36 * gp.tileSize;
        gp.obj[27].worldY = 15 * gp.tileSize;

        gp.obj[28] = new obj_spike();
        gp.obj[28].worldX = 34 * gp.tileSize;
        gp.obj[28].worldY = 17 * gp.tileSize;

        gp.obj[29] = new obj_spike();
        gp.obj[29].worldX = 35 * gp.tileSize;
        gp.obj[29].worldY = 16 * gp.tileSize;

        gp.obj[30] = new obj_spike();
        gp.obj[30].worldX = 34 * gp.tileSize;
        gp.obj[30].worldY = 15 * gp.tileSize;

        gp.obj[31] = new obj_spike();
        gp.obj[31].worldX = 36 * gp.tileSize;
        gp.obj[31].worldY = 18 * gp.tileSize;

        gp.obj[32] = new obj_spike();
        gp.obj[32].worldX = 32 * gp.tileSize;
        gp.obj[32].worldY = 18 * gp.tileSize;

        gp.obj[33] = new obj_spike();
        gp.obj[33].worldX = 31 * gp.tileSize;
        gp.obj[33].worldY = 17 * gp.tileSize;

        gp.obj[34] = new obj_spike();
        gp.obj[34].worldX = 32 * gp.tileSize;
        gp.obj[34].worldY = 16 * gp.tileSize;

        gp.obj[35] = new obj_spike();
        gp.obj[35].worldX = 33 * gp.tileSize;
        gp.obj[35].worldY = 14 * gp.tileSize;

        gp.obj[36] = new obj_spike();
        gp.obj[36].worldX = 32 * gp.tileSize;
        gp.obj[36].worldY = 13 * gp.tileSize;

        gp.obj[37] = new obj_spike();
        gp.obj[37].worldX = 31 * gp.tileSize;
        gp.obj[37].worldY = 15 * gp.tileSize;

        gp.obj[38] = new obj_spike();
        gp.obj[38].worldX = 19 * gp.tileSize;
        gp.obj[38].worldY = 16 * gp.tileSize;

        gp.obj[39] = new obj_spike();
        gp.obj[39].worldX = 20 * gp.tileSize;
        gp.obj[39].worldY = 18 * gp.tileSize;

        gp.obj[40] = new obj_spike();
        gp.obj[40].worldX = 21 * gp.tileSize;
        gp.obj[40].worldY = 17 * gp.tileSize;

        gp.obj[41] = new obj_spike();
        gp.obj[41].worldX = 22 * gp.tileSize;
        gp.obj[41].worldY = 18 * gp.tileSize;

        gp.obj[42] = new obj_spike();
        gp.obj[42].worldX = 21 * gp.tileSize;
        gp.obj[42].worldY = 15 * gp.tileSize;

        gp.obj[43] = new obj_spike();
        gp.obj[43].worldX = 23 * gp.tileSize;
        gp.obj[43].worldY = 15 * gp.tileSize;

        gp.obj[44] = new obj_spike();
        gp.obj[44].worldX = 23 * gp.tileSize;
        gp.obj[44].worldY = 17 * gp.tileSize;

        gp.obj[45] = new obj_spike();
        gp.obj[45].worldX = 24 * gp.tileSize;
        gp.obj[45].worldY = 13 * gp.tileSize;

        gp.obj[46] = new obj_spike();
        gp.obj[46].worldX = 25 * gp.tileSize;
        gp.obj[46].worldY = 14 * gp.tileSize;

        gp.obj[47] = new obj_spike();
        gp.obj[47].worldX = 25 * gp.tileSize;
        gp.obj[47].worldY = 16 * gp.tileSize;

        gp.obj[48] = new obj_spike();
        gp.obj[48].worldX = 25 * gp.tileSize;
        gp.obj[48].worldY = 18 * gp.tileSize;

        gp.obj[49] = new obj_spike();
        gp.obj[49].worldX = 26 * gp.tileSize;
        gp.obj[49].worldY = 15 * gp.tileSize;

        gp.obj[50] = new obj_spike();
        gp.obj[50].worldX = 27 * gp.tileSize;
        gp.obj[50].worldY = 14 * gp.tileSize;

        gp.obj[51] = new obj_spike();
        gp.obj[51].worldX = 27 * gp.tileSize;
        gp.obj[51].worldY = 17 * gp.tileSize;
        
        gp.obj[52] = new obj_spike();
        gp.obj[52].worldX = 28 * gp.tileSize;
        gp.obj[52].worldY = 15 * gp.tileSize;

        gp.obj[53] = new obj_spike();
        gp.obj[53].worldX = 28 * gp.tileSize;
        gp.obj[53].worldY = 18 * gp.tileSize;

        gp.obj[54] = new obj_spike();
        gp.obj[54].worldX = 29 * gp.tileSize;
        gp.obj[54].worldY = 17 * gp.tileSize;

        gp.obj[55] = new obj_spike();
        gp.obj[55].worldX = 29 * gp.tileSize;
        gp.obj[55].worldY = 14 * gp.tileSize;

        gp.obj[56] = new obj_spike();
        gp.obj[56].worldX = 30 * gp.tileSize;
        gp.obj[56].worldY = 13 * gp.tileSize;

        gp.obj[57] = new obj_spike();
        gp.obj[57].worldX = 30 * gp.tileSize;
        gp.obj[57].worldY = 16 * gp.tileSize;
    }
}