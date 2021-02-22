import java.util.Scanner;

public class Main {

    public static void main(String[] args) {    // Будем считать, что a и b вводятся корректно
        Scanner scan = new Scanner(System.in);
        while (true) {
            double a, b;
            String operation, aString, bString;
            System.out.print("Введите число a или exit для выхода : ");
            aString = scan.nextLine();

            if (aString.equals("exit")) {
                break;
            }

            System.out.print("Введите операцию +, -, /, * или exit для выхода : ");
            operation = scan.nextLine();

            if (operation.equals("exit")) {
                break;
            }

            System.out.print("Введите число b или exit для выхода : ");
            bString = scan.nextLine();

            if (bString.equals("exit")) {
                break;
            }

            a = Double.parseDouble(aString);
            b = Double.parseDouble(bString);

            Operation answer;

            switch (operation) {
                case "+":
                    answer = new Addition(a, b);
                    answer.execute();
                    break;

                case "-":
                    answer = new Subtraction(a, b);
                    answer.execute();
                    break;

                case "/":
                    answer = new Division(a, b);
                    answer.execute();
                    break;

                case "*":
                    answer = new Multiplication(a, b);
                    answer.execute();
                    break;

                default:
                    System.out.println("Введена некорректная операция");
                    break;
            }
            System.out.println();
        }

    }

}
