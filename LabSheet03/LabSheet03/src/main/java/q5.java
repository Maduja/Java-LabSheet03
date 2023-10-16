import java.util.Scanner;
public class q5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 

        System.out.print("Enter your String: ");
        String name = scan.nextLine();
        
        System.out.print("Enter your old character: ");
        char oldcharac = scan.next().charAt(0);
        
        System.out.print("Enter your new character: ");
        char newcharac = scan.next().charAt(0);
        
        int len=name.length();
                
        String nw = name.replace(oldcharac, newcharac);
        
        System.out.print("new String is: "+nw);
        
    }
}
