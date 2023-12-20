public class Main {
    public static void main(String[] args) {
//        Point obj = new Point(1,2);
        Point point = Point.of(2.0,4.0);

        System.out.println("Punkt początkowy");
        System.out.println(point.toString());

        System.out.println("Symetria względem osi X");
        System.out.println(point.symmetryOx());
        System.out.println("Symetria względem osi Y");
        System.out.println(point.symmetryOy());

        System.out.println("Obiekt przesunięty o podane wektory x i y:");
        System.out.println(point.move(2.0,4.0));

        System.out.println(point.rotate(90));






    }
}