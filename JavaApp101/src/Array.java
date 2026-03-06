import java.util.Arrays;
import java.util.Scanner;

public class Array {
     
    public static void main(String[] args) {
         
        Scanner myObj = new Scanner(System.in);  
        int[] numbers = new int[5];
        for(int i= 0; i< numbers.length; i++){
            System.out.print("Please Enter Number: ");
            numbers[i] = myObj.nextInt();
        }
        System.out.println(Arrays.toString(numbers));       
        for(int a:numbers){
            System.out.println(a);
        }
     }
     
     
}
