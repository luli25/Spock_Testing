import java.util.Scanner;

public class MaxNumber {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any number ");
        int numA = scan.nextInt();
        System.out.println("Enter another number ");
        int numB = scan.nextInt();
        scan.close();
        System.out.println(Math.max(numA, numB));
    }
}
