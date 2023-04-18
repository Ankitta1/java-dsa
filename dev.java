// print numbers from 1 to n//
import java.util.*;
public class dev{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int start=sc.nextInt();
        int i=1;

        while(i <= start){
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
    }
}