// reverse the given number
import java.util.*;
public class backward{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number you want");
        int number=sc.nextInt();
        while(number>0){

            int lastdigit=number%10;
             System.out.print(lastdigit);
            number=number/10;
       
    }
    System.out.println(" is the reverse of the given number");
    
}}