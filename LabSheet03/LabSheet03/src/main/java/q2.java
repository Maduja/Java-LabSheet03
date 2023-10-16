import java.util.Scanner;
public class q2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter your string: ");
        String name = scan.nextLine();
        
        System.out.println("The entered string is: "+name.toUpperCase());
    }
}

