package entity_package;

import main.gamepanel;
import main.keyhandler;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class player extends entity{
    gamepanel gp;
    keyhandler keyH;

    public player(gamepanel gp,keyhandler keyH){
        this.gp = gp;
        this.keyH = keyH;

        setDefaultValues();
        getPlayerImage();
    }
    public void setDefaultValues(){
        x = 100;
        y = 100;
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
                y -= speed;
            }else if(keyH.downPressed == true){
                direction = "down";
                y += speed;
            }else if(keyH.leftPressed == true){
                direction = "left";
                x -= speed;
            }else if(keyH.rightPressed == true){
                direction = "right";
                x += speed;
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
        g2.drawImage(image, x, y, gp.tileSize, gp.tileSize, null);
    }
}
