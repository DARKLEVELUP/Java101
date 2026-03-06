
import java.util.Scanner;

public class String101 {
    public static void main(String[] args) 
    {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter Your Name: ");
        String name = input.nextLine();
        
        String[] nameArray = name.split(" ");
        System.out.println("My name is " + nameArray[0]);
        System.out.println("My Last name is " + nameArray[1]);
            
        
    }
    
}
