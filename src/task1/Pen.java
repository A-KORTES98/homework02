package task1;

/**
 * Created by anton on 29.09.17.
 */

public class Pen {

    private Color color;
    private Thickness thickness;
    private int x;
    private int y;

    Pen() {
        this(Color.BLACK, Thickness.MIDDLE);
    }

    Pen(Color color) {
        this(color, Thickness.MIDDLE);
    }

    Pen(Thickness thickness){
        this(Color.BLACK, thickness);
    }

    Pen(Color color, Thickness thickness){
        this.x = 0;
        this.y = 0;
        this.color = color;
        this.thickness = thickness;
    }

    public Color getColor() {return color;}

    public void setColor(Color color) {this.color = color;}

    public Thickness getThickness() {return thickness;}

    public void setThickness(Thickness thickness) {this.thickness = thickness;}

    public int getX() {return x;}

    public void setX(int x) {this.x = x;}

    public int getY() {return y;}

    public void setY(int y) {this.y = y;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Pen pen = (Pen) o;

        if (x != pen.x) return false;

        if (y != pen.y) return false;

        if (color != pen.color) return false;

        return thickness == pen.thickness;
    }

    @Override
    public String toString() {
        return "Pen{" +
                "color=" + color +
                ", thickness=" + thickness +
                ", x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public int hashCode() {
        int result = color.hashCode();
        System.out.println(result);
        result = 31 * result + thickness.hashCode();
        result = 31 * result + x;
        result = 31 * result + y;
        return result;
    }
}
