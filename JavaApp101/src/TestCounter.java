import java.util.Scanner;

public class TestCounter {
    
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        Counter counter = new Counter();
        System.out.print("Enter Number: ");
        counter.number = input.nextInt();
        counter.up();
        
        System.out.println(counter.getNumber());
    }
    
}
