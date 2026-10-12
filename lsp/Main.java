import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = List.of(new Rectangle(5, 4), new Square(4));

        for (Shape s : shapes) {
            System.out.println(s.area());
        }
    }
}
