import java.util.Scanner;
public class q3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter Your String: ");
        String name = scan.nextLine();
        
        System.out.print("Enter Your Suffix String: ");
        String Suffixstr = scan.nextLine();
        
        boolean x;
        x = name.contains(Suffixstr);
        
        System.out.println(x);
        
        
    }
}
