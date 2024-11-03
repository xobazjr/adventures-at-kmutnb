package entity_package;

import main.gamepanel;
import main.keyhandler;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class player extends entity{
    gamepanel gp;
    keyhandler keyH;

    public final int screenX;
    public final int screenY;

    public player(gamepanel gp,keyhandler keyH){
        this.gp = gp;
        this.keyH = keyH;

        screenX = gp.screenWidth/2 - (gp.tileSize/2);
        screenY = gp.screenHeight/2 - (gp.tileSize/2);

        solidArea = new Rectangle();
        solidArea.x = 8;
        solidArea.y = 16;
        solidArea.width = 32;
        solidArea.height = 32;

        setDefaultValues();
        getPlayerImage();
    }
    public void setDefaultValues(){
        worldX = gp.tileSize * 30;
        worldY = gp.tileSize * 43;
        speed = 4;
        direction = "down";
    }
    public void getPlayerImage(){
        try {
            up1 = ImageIO.read(getClass().getResourceAsStream("/assets/main-character/main-character - behind-walk-right.png"));
            up2 = ImageIO.read(getClass().getResourceAsStream("/assets/main-character/main-character - behind-walk-left.png"));
            down1 = ImageIO.read(getClass().getResourceAsStream("/assets/main-character/main-character - walk-right-front.png"));
            down2 = ImageIO.read(getClass().getResourceAsStream("/assets/main-character/main-character - walk-left-front.png"));
            left1 = ImageIO.read(getClass().getResourceAsStream("/assets/main-character/main-character - left-walk-right.png"));
            left2 = ImageIO.read(getClass().getResourceAsStream("/assets/main-character/main-character - left-walk-left.png"));
            right1 = ImageIO.read(getClass().getResourceAsStream("/assets/main-character/main-character - right-walk-right.png"));
            right2 = ImageIO.read(getClass().getResourceAsStream("/assets/main-character/main-character - right-walk-left.png"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void update(){
        if(keyH.upPressed == true || keyH.downPressed == true || 
        keyH.leftPressed == true || keyH.rightPressed == true){
            if(keyH.upPressed == true){
                direction = "up";
                
            }else if(keyH.downPressed == true){
                direction = "down";
                
            }else if(keyH.leftPressed == true){
                direction = "left";
                
            }else if(keyH.rightPressed == true){
                direction = "right";
                
            }

            // CHECK TILE COLLISON
            collisionOn = false;
            gp.cChecker.checktile(this);
            
            // IF COLLISION IS FALSE, PLAYER CAN MOVE
            if(collisionOn == false){
                switch (direction) {
                    case "up": worldY -= speed; break;
                    case "down": worldY += speed; break;
                    case "left": worldX -= speed; break;
                    case "right": worldX += speed; break;
                }
            }

            spriteCounter++;
            if(spriteCounter > 12){
                if(spriteNum == 1){
                    spriteNum = 2;
                }
                else if(spriteNum == 2){
                    spriteNum = 1;
                }
                spriteCounter = 0;
            }            
        }

    }
    public void draw(Graphics2D g2){
//      g2.setColor(Color.red);
//      g2.fillRect(x, y, gp.tileSize, gp.tileSize);

        BufferedImage image = null;

        switch (direction) {
            case "up":
                if(spriteNum == 1){
                    image = up1;
                }
                if(spriteNum == 2){
                    image = up2;
                }
                break;
        
            case "down":
                if(spriteNum == 1){
                    image = down1;
                }
                if(spriteNum == 2){
                    image = down2;
                }
                break;
            case "left":
                if(spriteNum == 1){
                    image = left1;
                }
                if(spriteNum == 2){
                    image = left2;
                }
                break;
            case "right":
                if(spriteNum == 1){
                    image = right1;
                }
                if(spriteNum == 2){
                    image = right2;
                }
                break;
        }
        g2.drawImage(image, screenX, screenY, gp.tileSize, gp.tileSize, null);
    }
}
