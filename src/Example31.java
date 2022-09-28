import java.util.Scanner;
public class Example31 {
    public static void main(String[] argv) {
        int n;
        System.out.println("Enter a number:");
        Scanner input = new Scanner(System.in);
        n = input.nextInt();

        for (int line = 1; line <= n; line++) {
            for (int i = 1; i <= n - line; i++) {
                System.out.print("/ ");
            }
            for (int i = line; i >= 1; i--) {
                System.out.print(i + " ");
            }
            for (int i = 2; i <= line; i++) {
                System.out.print(i +" ");

            }
            for (int i = 1; i <= n - line; i++) {
                System.out.print("/ ");
            }
            System.out.println();
        }
    }
}


