import java.util.List;

public class Main {
    public static void main(String[] args) {
        Invoice invoice = new Invoice(List.of(10.0, 20.0, 30.0));

        new InvoiceRepository().save(invoice);
        new InvoicePrinter().print(invoice);
    }
}
