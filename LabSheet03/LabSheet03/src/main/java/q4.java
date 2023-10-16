import java.util.Scanner;
public class q4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 

        System.out.print("Enter your String: ");
        String name = scan.nextLine();
        
        System.out.print("Enter your Character: ");
        char charac = scan.next().charAt(0);
        
        int len=name.length();
        int i,count=0;
        for(i=0;i<len;i++){
            if(name.charAt(i)==charac){
                count= count+1;
            }
        }
        
        System.out.print(" the number of occurrences of a specific character in the string is: "+count);
    }
}
