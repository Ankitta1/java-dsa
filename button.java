import java.util.*;
public class button{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter numbers bewteen 1-5");
        int num=sc.nextInt();
        switch(num){
        case 1:System.out.println(" you deserve momos");
        break;
        case 2:System.out.println("you deserve a burger");
        break;
        case 3:System.out.println("you deserve a party");
        break;
        default:System.out.println("sorry cant provide what youre asking for");

    }
}}