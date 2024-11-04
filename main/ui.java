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
import object.obj_key;

public class ui {
    gamepanel gp;
    Graphics2D g2;
    Font maru_monica;
    BufferedImage keyImage;
    public boolean messageOn = false;
    public String message = "";
    public boolean gameFinished = false;

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

        if (gp.gameState == gp.playState) {
            // อัปเดตเวลาเฉพาะใน playState
            playTime += (double) 1 / 60;
        } else if (gp.gameState == gp.pauseState) {
            drawPauseScreen();
        }

        if (gameFinished) {
            String text;
            int textLength;
            int x;
            int y;

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

            gp.gameThread = null;

        } else {
            g2.drawImage(keyImage, gp.tileSize / 2, gp.tileSize / 2, gp.tileSize, gp.tileSize, null);
            g2.drawString("x = " + gp.Player.hasKey + "/6", 80, 55);

            // TIME
            g2.drawString("Time: " + dFormat.format(playTime), gp.tileSize * 13, 65);

            // MANUAL
            g2.drawString("PAUSE: P", gp.tileSize * 13, gp.tileSize * 11);

            // MESSAGE
            if (messageOn) {
                g2.setFont(maru_monica.deriveFont(20f));
                g2.drawString(message, gp.tileSize / 2, gp.tileSize * 5);
            }
        }
    }

    public void drawPauseScreen() {
        String text = "PAUSED";
        int x = getXforCenteredText(text);
        int y = gp.screenHeight / 2;
        g2.drawString(text, x, y);
    }

    public int getXforCenteredText(String text) {
        int length = (int) g2.getFontMetrics().getStringBounds(text, g2).getWidth();
        int x = gp.screenWidth / 2 - length / 2;
        return x;
    }
}
