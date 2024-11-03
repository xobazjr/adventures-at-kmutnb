package main;

import javax.swing.JFrame;

public class Main {
    public static void main(String[] args){
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setTitle("Adventures at KMUTNB");

        gamepanel Gamepanel = new gamepanel();
        window.add(Gamepanel);

        window.pack();

        window.setLocationRelativeTo(null);
        window.setVisible(true);

        Gamepanel.setupGame();
        Gamepanel.startGameThread();
    }
}
