package ex02;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var number = 0;
        var coffeeReqCount = 0;

        while ((number = scanner.nextInt()) != 42) {
            var isPrime = true;

            // calc sum of digits
            var sum = 0;
            var tempNumber = number;
            if (tempNumber < 0) tempNumber = -tempNumber;
            while (tempNumber != 0) {
                sum += tempNumber % 10;
                tempNumber /= 10;
            }

            // check if sum is prime
            if (sum == 2) {
                isPrime = true;
            } else if (sum <= 1 || sum % 2 == 0) {
                isPrime = false;
            } else {
                for (int i = 3; i*i < sum; i += 2) {
                    if (sum % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            if (isPrime) coffeeReqCount++;
        }
        scanner.close();
        System.out.println("Count of coffee-request : " + coffeeReqCount);
    }
}
