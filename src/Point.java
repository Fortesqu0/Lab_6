public class Point {
    private final double point_X;
    private final double point_Y;

    public static Point zero_zero = new Point(0.0, 0.0);
    public static Point one_zero = new Point(1.0, 0.0);


    private Point(double point_X, double point_Y) {
        this.point_X = point_X;
        this.point_Y = point_Y;

    }

    public static Point of(double point_X, double point_Y){
        return new Point(point_X, point_Y);
    }

    public double getPoint_X() {
        return point_X;
    }

    public double getPoint_Y() {
        return point_Y;
    }

    public Point move(double vx, double vy) {
        return new Point(point_X + vx, point_Y + vy);

    }

    public Point symmetryOx() {
        return new Point(point_X, -point_Y);
    }

    public Point symmetryOy() {
        return new Point(-point_X, point_Y);
    }

    public Point rotate(int degree) {
        double rad_degree = degree * (Math.PI / 180);
        double rotated_x = point_X * Math.cos(rad_degree) - point_Y * Math.sin(rad_degree);
        double rotated_y = point_X * Math.sin(rad_degree) + point_Y * Math.cos(rad_degree);
        double rounded_rotated_x = Math.round(rotated_x * 10.0) / 10.0;
        double rounded_rotated_y = Math.round(rotated_y * 10.0) / 10.0;
        return new Point(rounded_rotated_x, rounded_rotated_y);

    }


    @Override
    public String toString() {
        return "(" + point_X + "," + point_Y + ")";


    }
}
