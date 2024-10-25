package ru.vsu.cs.zhernovaia;

import javax.swing.*;

class Window extends JFrame {
    Panel p;

    public Window() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        p = new Panel();
        setBounds(300, 60, 616, 638);
        setTitle("The arc of the circle");
        setContentPane(p);
        setVisible(true);
    }
}
