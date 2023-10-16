import java.util.Scanner;
public class q6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 

        System.out.print("Enter your String: ");
        String name = scan.nextLine();
        
        String[] myarray = name.split(",");
        
        for(int i=0; i< myarray.length; i++) {
            System.out.println(myarray[i]);
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
