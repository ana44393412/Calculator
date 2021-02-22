public class Subtraction extends Operation {
    public Subtraction(double a, double b) {
        super(a, b);
    }

    @Override
    public void execute() {
        System.out.println("Ответ : " + (a - b));
    }
}
