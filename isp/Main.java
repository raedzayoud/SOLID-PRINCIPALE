import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Workable> workers = List.of(new Human(), new Robot());

        for (Workable w : workers) {
            w.work();
        }
    }
}
