package ru.vsu.cs.zhernovaia;

public class DrawContext {
    private final int startAngle;
    private final int endAngle;

    private final int scaleFactor;

    public DrawContext(int startAngle, int endAngle, int scaleFactor) {
        this.startAngle = startAngle;
        this.endAngle = endAngle;
        this.scaleFactor = scaleFactor;
    }

    public int getStartAngle() {
        return startAngle;
    }

    public int getEndAngle() {
        return endAngle;
    }

    public int getScaleFactor() {
        return scaleFactor;
    }

}
