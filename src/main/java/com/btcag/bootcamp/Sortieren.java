import java.util.Scanner;

public class Sortieren {
    public static void main(String[] args) {
        Scanner readIn = new Scanner(System.in);
        System.out.println("Bitte gebe an, wie viele Zahlen du sortieren möchtest.");
        int n = readIn.nextInt();
        int[] zahlen = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Bitte gebe die verschiedenen Zahlen an.");
            zahlen[i] = readIn.nextInt();
        }

        sortierung(zahlen);

    }

    public static void sortierung(int[] zahlen) {
        for (int i = 0; i < zahlen.length - 1; i++) {
            for (int j = 0; j < zahlen.length - 1 - i; j++) {
                if (zahlen[j] > zahlen[j + 1]) {
                    int temp = zahlen[j];
                    zahlen[j] = zahlen[j + 1];
                    zahlen[j + 1] = temp;
                }
            }
        }
        System.out.println("sortiert: ");
        for (int num : zahlen) {
            System.out.println(num + " ");
        }
    }

}
