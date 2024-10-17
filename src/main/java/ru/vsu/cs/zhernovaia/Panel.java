package ru.vsu.cs.zhernovaia;

import javax.swing.*;
import java.awt.*;

class Panel extends JPanel {

    @Override
//    protected void paintComponent(Graphics g) {
//        super.paintComponent(g);
//        int y1 = 18;
//        int y0 = 50;
//        int x1 = 100;
//        int x0 = 30;
//        float k = (float) (y1 - y0) / (x1 - x0);
//        for (int x = 0; x <= x1 - x0; ++x) {
//            g.setColor(new Color(x * 255 / (x1 - x0), 0, 0));
//            g.fillRect(x + x0, Math.round(k * x + y0), 1, 1);
//        }
//    }
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int centerX = getWidth() / 2;
        int centerY = getHeight() / 2;

        int radius = Math.min(getWidth(), getHeight()) / 2 - 20;

        int startAngle = 0;
        int endAngle = 90;

        int pointCount = Math.abs(endAngle - startAngle) * 5;

        for (int i = 0; i <= pointCount; i++) {
            float angle = startAngle - (i / (float)pointCount) * (endAngle - startAngle);

            int x = centerX + (int)(radius * Math.cos(Math.toRadians(angle)));
            int y = centerY + (int)(radius * Math.sin(Math.toRadians(angle)));

            int colorValue = i * 255 / pointCount;
            g.setColor(new Color(colorValue, 0, 0));

            g.fillRect(x, y, 2, 2);
        }
    }
}
