import java.util.Scanner;
public class q1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter your string: ");
        String name = scan.nextLine();
        
        System.out.println("The length of entered string is: "+name.length());
    }
}
