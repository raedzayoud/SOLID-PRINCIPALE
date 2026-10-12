public class Main {
    static void resize(Rectangle r) {
        r.setWidth(5);
        r.setHeight(4);
        System.out.println(r.area());   // expected 20
    }

    public static void main(String[] args) {
        resize(new Rectangle());   // prints 20 (correct)
        resize(new Square());      // prints 16 (WRONG!)
    }
}
