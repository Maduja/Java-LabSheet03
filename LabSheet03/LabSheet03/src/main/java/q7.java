import java.util.Scanner;
public class q7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 

        System.out.print("Enter your String: ");
        String name = scan.nextLine();
        
        int len=name.length();
        char[] myarray = new char[len];
        
        for(int i=(len-1);i>=0;i--){
            myarray[i]=name.charAt(i);
            System.out.print(myarray[i]);
        }
        
        
    }
}
