import java.util.Scanner;

public class FindPrimeNumberWithRecursiveMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Plese Enter Number...:");
        int primeNumber = scanner.nextInt();

        if (isNumberPrime(primeNumber, primeNumber - 1, true)) {
            System.out.println(primeNumber + " is Prime Number..");
        } else {
            System.out.println(primeNumber + " is not  Prime Number..");
        }
    }

    static boolean isNumberPrime(int primeNumber, int tempNumber, boolean checkPrimeNumber) {
        if (tempNumber != 1 && tempNumber != primeNumber) {
            if (primeNumber % tempNumber == 0) {
                checkPrimeNumber = false;
                return checkPrimeNumber;
            }
            return isNumberPrime(primeNumber, tempNumber - 1, checkPrimeNumber);
        } else {
            return checkPrimeNumber;
        }
    }
}
