public class Main {
    public static void main(String[] args) {
//        Point obj = new Point(1,2);
        Point point = Point.of(2.0,4.0);

        //testowanie toString
        System.out.println("Punkt początkowy");
        System.out.println(point.toString());


        System.out.println("Symetria względem osi X");
        //testowanie metody SymmetryOx
        System.out.println(point.symmetryOx());
        //tesotwanie metody SymmetryOy
        System.out.println("Symetria względem osi Y");
        System.out.println(point.symmetryOy());

        //tesotwanie metody move
        System.out.println("Obiekt przesunięty o podane wektory x i y:");
        System.out.println(point.move(2.0,4.0));

        //testowanie metody rotate
        System.out.println(point.rotate(90));

        //testowanie getterów
        System.out.println(point.getPoint_X());
        System.out.println(point.getPoint_Y());

        //tesotwanie statycznych zmiennych
        System.out.println(Point.one_zero);
        System.out.println(Point.zero_zero);






    }
}