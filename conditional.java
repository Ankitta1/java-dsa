import java.util.*;
public class conditional{
    public static void main(String args[]){
        System.out.println(" Enter your age please : " ); 
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        if (age>=18){
            System.out.println(" adult");
        }
         else if(age>12 && age<18){
            System.out.println("You're an teenager");
        }
        else {
            System.out.println("Not an adult");
        }
    }
}

// without user input

// public class conditional{
//     public static void main(String args[]){
//         int age=34;
//         if(age>=18){
//             System.out.println("Your are an adult");
//         }
//         else{
//             System.out.println("You're not an adult");
//         }
//     }
// }