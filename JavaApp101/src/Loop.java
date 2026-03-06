import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        
        Scanner myObj = new Scanner(System.in);
        
        System.out.print("Please Enter Number: ");
        
        for(int i= myObj.nextInt();i<=10;i++ )
        {
            
            if(i % 2 == 1){
            System.out.println("Hello");
            }else if(i % 2 == 0){
            System.out.println(i+ " Kiattikhun Sinthavanon");
            }
            else{
            System.out.println("Error");
            }
        }
        
    
    }
    
    }

