import java.util.*;
public class body{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("please Enter your temperature");
        double temp=sc.nextInt();
        if(temp>100){
            System.out.println("you have fever");
        }
        else{
            System.out.println("your completely fine");
        }
    }
}