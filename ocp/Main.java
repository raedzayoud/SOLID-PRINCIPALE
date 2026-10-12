import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = List.of(
            new Rectangle(4, 5),
            new Circle(3),
            new Triangle(6, 2)
        );

        AreaCalculator calculator = new AreaCalculator();
        System.out.println("Total area: " + calculator.totalArea(shapes));
    }
}
