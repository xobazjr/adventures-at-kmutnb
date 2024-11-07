package main;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class keyhandler implements KeyListener {
    gamepanel gp;
    public boolean upPressed, downPressed, leftPressed, rightPressed, pauseMusic = true, pause = false, godmode = false;

    public keyhandler(gamepanel gp) {
        this.gp = gp;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();

        // TITLE STATE
        if (gp.gameState == gp.titileState) {
            if (code == KeyEvent.VK_W) {
                gp.ui.commandNum--;
                if (gp.ui.commandNum < 0) {
                    gp.ui.commandNum = 1;
                }
            }
            if (code == KeyEvent.VK_S) {
                gp.ui.commandNum++;
                if (gp.ui.commandNum > 1) {
                    gp.ui.commandNum = 0;
                }
            }
            if (code == KeyEvent.VK_ENTER) {
                if (gp.ui.commandNum == 0) {
                    gp.gameState = gp.playState;
                    gp.playMusic(0);
                }
                if (gp.ui.commandNum == 1) {
                    System.exit(0);
                }
            }
        }

        if (code == KeyEvent.VK_W) {
            upPressed = true;
        }
        if (code == KeyEvent.VK_S) {
            downPressed = true;
        }
        if (code == KeyEvent.VK_A) {
            leftPressed = true;
        }
        if (code == KeyEvent.VK_D) {
            rightPressed = true;
        }
        if (code == KeyEvent.VK_P) {
            if (gp.gameState == gp.playState) {
                gp.gameState = gp.pauseState;
                pause = true;
                if (pauseMusic) {
                    gp.music.stop();
                }
            } else if (gp.gameState == gp.pauseState) {
                gp.gameState = gp.playState;
                pause = false;
                if (pauseMusic) {
                    gp.music.play();
                    gp.music.loop();
                }
            }
        }
        if (code == KeyEvent.VK_M) {
            if (!pause && !gp.ui.gameFinished) {
                if (pauseMusic) {
                    gp.ui.showMessage("Mute music");
                    gp.stopMusic();
                    pauseMusic = false;
                } else {
                    gp.ui.showMessage("Open music");
                    gp.playMusic(0);
                    pauseMusic = true;
                }
            }

        }
        if (code == KeyEvent.VK_G) {
            if (!pause) {
                if (godmode) {
                    godmode = false;
                    gp.Player.maxLife = 6;
                    gp.Player.life = gp.Player.maxLife;
                    gp.Player.speed -= 5;
                } else {
                    godmode = true;
                    gp.Player.maxLife = 500;
                    gp.Player.life = gp.Player.maxLife;
                    gp.Player.speed += 5;
                }
            }
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {
        int code = e.getKeyCode();

        if (code == KeyEvent.VK_W) {
            upPressed = false;
        }
        if (code == KeyEvent.VK_S) {
            downPressed = false;
        }
        if (code == KeyEvent.VK_A) {
            leftPressed = false;
        }
        if (code == KeyEvent.VK_D) {
            rightPressed = false;
        }
    }
}