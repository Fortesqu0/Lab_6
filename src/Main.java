public class Main {
    public static void main(String[] args) {
        Point obj = new Point(1,2);
        System.out.println("Punkt początkowy");
        System.out.println(obj.toString());

        System.out.println("Symetria względem osi X");
        System.out.println(obj.symmetryOx());
        System.out.println("Symetria względem osi Y");
        System.out.println(obj.symmetryOy());

        System.out.println("Obiekt przesunięty o podane wektory x i y:");
        System.out.println(obj.move(2.0,4.0));

        System.out.println(obj.rotate(90));






    }
}