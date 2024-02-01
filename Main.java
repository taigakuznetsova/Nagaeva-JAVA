import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("a: ");
        int a = in.nextInt();
        System.out.print("b: ");
        int b = in.nextInt();
        if (a > b) {
            System.out.println("a > b");
        }
            else if (a < b) {
                System.out.println("a < b");
        }
            else if (a == b) {
                System.out.println("a = b");
        }
            int c = a + b;
            int d = a - b;
            int e = b - a;
            int f = a * b;
            int g = a / b;
            int h = b / a;
            System.out.print(c + "\n" + d + "\n" + e + "\n" + f + "\n" + g + "\n" + h + "\n");

        }
}


