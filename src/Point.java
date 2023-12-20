public class Point {
    private final double point_X;
    private final double point_Y;

    public static Point zero_zero = new Point(0.0, 0.0);
    public static Point one_zero = new Point(1.0, 0.0);


    public Point(double point_X, double point_Y) {
        this.point_X = point_X;
        this.point_Y = point_Y;

    }

    public double getPoint_X() {
        return point_X;
    }

    public double getPoint_Y() {
        return point_Y;
    }

    public void move(double vx, double vy) {


    }


    @Override
    public String toString() {
        return "(" + point_X + "," + point_Y + ")";


    }
}
