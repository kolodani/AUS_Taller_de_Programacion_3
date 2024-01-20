package Formas;

public abstract class FiguraGeometrica implements FIguraI{

    private int colorRGB;

    public FiguraGeometrica() {
    this.colorRGB = 0;
    }

    public int getColorRGB() {
        return colorRGB;
    }
}
