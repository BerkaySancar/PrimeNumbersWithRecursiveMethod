import java.util.Scanner;

public class PrimeNumbersWithRecursiveMethod {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = scan.nextInt();

        prime(num, 2);
    }

    public static void prime(int x, int i) {

        if (x == i) {
            System.out.println("Prime");
            return;
        }
        if (x % i == 0) {
            System.out.print("Not Prime");
            return;
        }
        prime(x, i + 1);
    }
}