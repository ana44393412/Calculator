public class Division extends Operation {
    public Division(double a, double b) {
        super(a, b);
    }

    @Override
    public void execute() {
        if (b==0){
            System.out.println("На ноль делить нельзя");
        } else {
            System.out.println("Ответ : " + (a / b));
        }
    }
}
