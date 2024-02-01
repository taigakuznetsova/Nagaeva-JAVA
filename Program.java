import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("a: ");
        String str1 = in.nextLine();
        System.out.print("b: ");
        String str2 = in.nextLine();

        if (str1.equals(str2)) {
            System.out.println("Строки идентичны");

        }else {
            System.out.println("Строки неидентичны");
        }
    }
}
