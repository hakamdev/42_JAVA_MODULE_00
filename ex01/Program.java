import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        final int number = scanner.nextInt();
        scanner.close();

        if (number <= 1) {
            System.err.println("IllegalArgument");
            System.exit(-1);
        }

        if (number % 2 == 0) {
            System.out.println("false 1");
            return;
        }

        int steps = 1;
        for (int i = 3; i < number; i += 2) {
            if (number % i == 0) {
                System.out.println("false " + steps);
                return;
            }
            if (i*i >= number) {
                break;
            }
            steps++;
        }
        System.out.println("true " + steps);
    }
}
