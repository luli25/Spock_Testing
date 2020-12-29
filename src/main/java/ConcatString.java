import java.util.Scanner;

public class ConcatString {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name ");
        String name = scan.next();
        System.out.println("Enter your surname ");
        String surname = scan.next();
        scan.close();
        String fullName = name + " " + surname;
        System.out.println("Your full name is " + fullName);
    }


}
