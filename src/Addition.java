public class Addition extends Operation {
    public Addition(double a, double b) {
        super(a, b);
    }

    @Override
    public void execute() {
        System.out.println("Ответ : " + (a + b));
    }
}
