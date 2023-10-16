import java.util.Scanner;
public class q9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 

        System.out.print("Enter your String: ");
        String name1 = scan.nextLine();
        
        System.out.println("The count of string is:"+name1.length());
        System.out.println("The count of string is:"+name1.toUpperCase());
        System.out.println("The count of string is:"+name1.toLowerCase());
        
        System.out.print("Enter your String: ");
        String name2 = scan.nextLine();
        
        System.out.println(name1.concat(name2));
        
    }
}
