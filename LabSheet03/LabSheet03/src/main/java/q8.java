import java.util.Scanner;
public class q8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 

        System.out.print("Enter your String: ");
        String name = scan.nextLine();
        
        int len=name.length();
        int yes;
        int i=0;
        
        while(i<len){
            if(name.charAt(i)== name.charAt((len-1)-i)){
                yes=1;
            }
            else{
                yes=0;
            }
            i=i+1;
            
            if(yes==1){
                System.out.println("this is a palindrom");
            }
            else{
                System.out.println("this is not a palindrom");
            }
        }
            
            

    }
}
