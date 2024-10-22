package ru.vsu.cs.zhernovaia;

import javax.swing.*;
import java.awt.*;

class Panel extends JPanel {
    DrawContext context = new DrawContext(0, 10, 5);

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int centerX = getWidth() / 2;
        int centerY = getHeight() / 2;

        int radius = Math.min(getWidth(), getHeight()) / 2 - 20;

        int startAngle = context.getStartAngle();
        int endAngle = context.getEndAngle();
        int scaleFactor = context.getScaleFactor();

        int pointCount = Math.abs(endAngle - startAngle) * scaleFactor;

        for (int i = 0; i <= pointCount; i++) {
            float angle = startAngle + (i / (float) pointCount) * (endAngle - startAngle);

            int x = centerX + (int) (radius * Math.cos(Math.toRadians(angle)));
            int y = centerY - (int) (radius * Math.sin(Math.toRadians(angle)));

            int colorValue = i * 255 / pointCount;
            g.setColor(new Color(colorValue, 0, 0));

            g.fillRect(x, y, 2, 2);
        }
    }
}
