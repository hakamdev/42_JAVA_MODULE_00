import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        final int number = scanner.nextInt();
        scanner.close();
        int steps = 1;

        if (number <= 1) {
            System.err.println("IllegalArgument");
            System.exit(-1);
        }

        if (number == 2) {
            System.out.println("true " + steps);
            return;
        }

        if (number % 2 == 0) {
            System.out.println("false " + steps);
            return;
        }

        for (int i = 3; i*i < number; i += 2) {
            if (number % i == 0) {
                System.out.println("false " + steps);
                return;
            }
            steps++;
        }

        System.out.println("true " + steps);
    }
}
