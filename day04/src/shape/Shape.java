package shape;

public abstract class Shape {
    protected int x;
    protected int y;

    public Shape() {
    }

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public abstract double getArea();

    public abstract double getCircum();

    public void moveLeft(int dx) {
        this.x += dx;
    }



    @Override
    public String toString() {
        return "Shape{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
