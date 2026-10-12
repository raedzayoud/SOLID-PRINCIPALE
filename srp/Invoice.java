import java.util.List;

public class Invoice {
    private final List<Double> items;

    public Invoice(List<Double> items) {
        this.items = items;
    }

    public double calculateTotal() {
        return items.stream().mapToDouble(Double::doubleValue).sum();
    }
}
