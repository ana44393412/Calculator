public class Multiplication extends Operation {
    public Multiplication(double a, double b) {
        super(a, b);
    }

    @Override
    public void execute() {
        System.out.println("Ответ : " + (a * b));
    }
}
