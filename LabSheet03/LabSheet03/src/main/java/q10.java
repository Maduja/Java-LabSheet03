import java.util.Scanner;
public class q10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 

        System.out.print("Enter your String in numeric: ");
        String name1 = scan.nextLine();
        
        System.out.print("Enter another String in numeric: ");
        String name2 = scan.nextLine();
        
        System.out.println(name1.concat(name2));
        
        int x = Integer.parseInt(name1);
        int y = Integer.parseInt(name2);
        
        int total = x+y;
        System.out.println("The total is: "+total);
        
        
    }
}
