package main;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.util.Timer;
import java.util.TimerTask;
import java.text.DecimalFormat;
import object.obj_heart;
import object.obj_key;
import object.superobject;

public class ui {
    gamepanel gp;
    Graphics2D g2;
    Font maru_monica;
    BufferedImage heart_full, heart_half, heart_blank;
    BufferedImage keyImage;
    public boolean messageOn = false;
    public String message = "";
    public boolean gameFinished = false;
    public int commandNum = 0;

    double playTime;
    DecimalFormat dFormat = new DecimalFormat("#0.00");

    public ui(gamepanel gp) {
        this.gp = gp;

        try {
            InputStream is = getClass().getResourceAsStream("/assets/font/maru-monica.ttf");
            maru_monica = Font.createFont(Font.TRUETYPE_FONT, is).deriveFont(30f);
        } catch (FontFormatException | IOException e) {
            e.printStackTrace();
            maru_monica = new Font("Arial", Font.PLAIN, 30);
        }

        obj_key key = new obj_key();
        keyImage = key.image;

        // CREATE HUD OBJECT
        superobject heart = new obj_heart(gp);
        heart_full = heart.image;
        heart_half = heart.image2;
        heart_blank = heart.image3;
    }

    public void showMessage(String text) {
        message = text;
        messageOn = true;

        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                hideMessage();
                timer.cancel();
            }
        }, 3000);
    }

    public void hideMessage() {
        message = "";
        messageOn = false;
    }

    public void draw(Graphics2D g2) {
        this.g2 = g2;

        g2.setFont(maru_monica);
        g2.setColor(Color.white);
        // TITLE STATE
        if (gp.gameState == gp.titileState) {
            drawTitleScreen();
        } else if (gp.Player.start) {

            // PLAY STATE
            if (gp.gameState == gp.playState && !gameFinished) {
                drawPlayerLife();
                playTime += (double) 1 / 60;
            }

            // FINISH STATE
            if (gameFinished) {
                drawGameFinishScreen();
                gp.gameThread = null;
            } else if (gp.gameState != gp.titileState) {
                g2.drawImage(keyImage, gp.tileSize / 2, (gp.tileSize / 4) * 41, gp.tileSize, gp.tileSize, null);
                g2.drawString("x = " + gp.Player.hasKey + "/6", 82, gp.tileSize * 11);

                // TIME
                g2.drawString("Time: " + dFormat.format(playTime), gp.tileSize * 13, 65);

                // PAUSE STATE
                if (gp.gameState == gp.pauseState && !gameFinished) {
                    drawPauseScreen();
                }

                // MANUAL
                g2.drawString("MUTE: M", gp.tileSize * 13, gp.tileSize * 10);
                g2.drawString("PAUSE: P", gp.tileSize * 13, gp.tileSize * 11);

                // MESSAGE
                if (messageOn) {
                    g2.setFont(maru_monica.deriveFont(20f));
                    g2.drawString(message, gp.tileSize / 2, gp.tileSize * 5);
                }
            }
        } else {
            // PAUSE STATE
            if (gp.gameState == gp.pauseState && !gameFinished) {
                drawPauseScreen();
            }

            // MANUAL
            g2.drawString("MUTE: M", gp.tileSize * 13, gp.tileSize * 10);
            g2.drawString("PAUSE: P", gp.tileSize * 13, gp.tileSize * 11);

            //SHOW MESSAGE EVENT
            g2.drawString("Looking for a teacher", (gp.tileSize / 2) * 11, gp.tileSize);
        }

    }

    public void drawPlayerLife() {
        int x = gp.tileSize / 2;
        int y = gp.tileSize / 2;
        int spacing = 10;
        int heartWidth = gp.tileSize - 10;
        int heartHeight = gp.tileSize - 10;
        int i = 0;

        // DRAW MAX HEART
        while (i < gp.Player.maxLife / 2) {
            g2.drawImage(heart_blank, x, y, heartWidth, heartHeight, null);
            i++;
            x += heartWidth + spacing;
        }

        // RESET POSITION
        x = gp.tileSize / 2;
        y = gp.tileSize / 2;
        i = 0;

        // DRAW CURRENT LIFE
        while (i < gp.Player.life) {
            g2.drawImage(heart_half, x, y, heartWidth, heartHeight, null);
            i++;
            if (i < gp.Player.life) {
                g2.drawImage(heart_full, x, y, heartWidth, heartHeight, null);
            }
            i++;
            // Add spacing here
            x += heartWidth + spacing;
        }
    }

    public void drawTitleScreen() {
        g2.setColor(new Color(0, 0, 0));
        g2.fillRect(0, 0, gp.screenWidth, gp.screenHeight);

        // TITLE NAME
        g2.setFont(g2.getFont().deriveFont(Font.BOLD, 80F));
        String text = "Adventures at KMUTNB";
        int x = getXforCenteredText(text);
        int y = gp.tileSize * 3;

        // SHADOW
        g2.setColor(Color.gray);
        g2.drawString(text, x + 5, y + 5);

        // MAIN COLOR
        g2.setColor(Color.white);
        g2.drawString(text, x, y);

        // MAIN CHARACTER
        x = gp.screenWidth / 2 - (gp.tileSize * 2) / 2;
        y += gp.tileSize * 2;
        g2.drawImage(gp.Player.down1, x, y, gp.tileSize * 2, gp.tileSize * 2, null);

        // MENU
        g2.setFont(g2.getFont().deriveFont(Font.BOLD, 40F));

        text = "NEW GAME";
        x = getXforCenteredText(text);
        y += gp.tileSize * 4;
        g2.drawString(text, x, y);
        if (commandNum == 0) {
            g2.drawString(">", x - gp.tileSize, y);
        }

        text = "EXIT";
        x = getXforCenteredText(text);
        y += gp.tileSize;
        g2.drawString(text, x, y);
        if (commandNum == 1) {
            g2.drawString(">", x - gp.tileSize, y);
        }
    }

    public void drawPauseScreen() {
        String text = "PAUSED";
        int x = getXforCenteredText(text);
        int y = gp.screenHeight / 2;
        g2.drawString(text, x, y);
        if (gp.Player.start) {
            drawPlayerLife();
        }
    }

    public void drawGameFinishScreen() {
        String text;
        int textLength;
        int x;
        int y;

        if (gp.Player.life <= 0) {
            gp.stopMusic();
            gp.playSE(4);
            text = "You dead!";
            textLength = (int) g2.getFontMetrics().getStringBounds(text, g2).getWidth();
            x = gp.screenWidth / 2 - textLength / 2;
            y = (gp.screenHeight / 2 - gp.tileSize / 2) - 20;
            g2.drawString(text, x, y);
        } else {
            text = "You don't get an F anymore!";
            textLength = (int) g2.getFontMetrics().getStringBounds(text, g2).getWidth();
            x = gp.screenWidth / 2 - textLength / 2;
            y = gp.screenHeight / 2 - gp.tileSize;
            g2.drawString(text, x, y);

            text = "Your Time is " + dFormat.format(playTime) + "!";
            textLength = (int) g2.getFontMetrics().getStringBounds(text, g2).getWidth();
            x = gp.screenWidth / 2 - textLength / 2;
            y = gp.screenHeight / 2 + gp.tileSize * 3;
            g2.drawString(text, x, y);

            text = "Congratulations!";
            textLength = (int) g2.getFontMetrics().getStringBounds(text, g2).getWidth();
            x = gp.screenWidth / 2 - textLength / 2;
            y = gp.screenHeight / 2 + gp.tileSize;
            g2.drawString(text, x, y);
        }

    }

    public int getXforCenteredText(String text) {
        int length = (int) g2.getFontMetrics().getStringBounds(text, g2).getWidth();
        return gp.screenWidth / 2 - length / 2;
    }
}