import java.util.List;

// Bad example: this class has 3 responsibilities and will be fixed using the SOLID principles
public class Invoice {
    private List<Double> items;

    public Invoice(List<Double> items) {
        this.items = items;
    }

    public double calculateTotal() {          // job 1: business logic
        return items.stream().mapToDouble(Double::doubleValue).sum();
    }

    public void saveToDatabase() {            // job 2: storage
        System.out.println("Saving to database...");
    }

    public void printInvoice() {              // job 3: display
        System.out.println("Total: " + calculateTotal());
    }
}
