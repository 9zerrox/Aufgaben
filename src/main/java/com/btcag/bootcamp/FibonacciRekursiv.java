import java.util.Scanner;

public class FibonacciRekursiv {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        algo(n);
    }

    public static void algo(int n) {
        int i = 0;
        int j = 1;

        System.out.println("Das Ergebnis lautet: " + i);

        while (j < n) {
            System.out.println(j);
            int c = j;
            j = i + j;
            i = c;
        }
    }
}
