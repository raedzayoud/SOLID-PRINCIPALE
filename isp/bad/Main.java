import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Worker> workers = List.of(new Human(), new Robot());

        for (Worker w : workers) {
            w.work();
            w.eat();
            w.sleep();
        }
    }
}
