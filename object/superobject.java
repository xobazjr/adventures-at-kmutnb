package object;

import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;

import main.gamepanel;
import main.utilitytool;

public class superobject {
    public BufferedImage image, image2, image3;
    public String name;
    public boolean collision = false;
    public int worldX, worldY;
    public Rectangle solidArea = new Rectangle(0, 0, 48, 48);
    public int solidAreaDefaultX = 0;
    public int solidAreaDefaultY = 0;
    utilitytool uTool = new utilitytool();

    public void draw(Graphics2D g2, gamepanel gp) {
        int screenX = worldX - gp.Player.worldX + gp.Player.screenX;
        int screenY = worldY - gp.Player.worldY + gp.Player.screenY;

        if (worldX + gp.tileSize > gp.Player.worldX - gp.Player.screenX &&
                worldX - gp.tileSize < gp.Player.worldX + gp.Player.screenX &&
                worldY + gp.tileSize > gp.Player.worldY - gp.Player.screenY &&
                worldY - gp.tileSize < gp.Player.worldY + gp.Player.screenY) {

            g2.drawImage(image, screenX, screenY, gp.tileSize, gp.tileSize, null);
        }
    }
}