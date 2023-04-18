import java.util.*;
public class calculator{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
System.out.println("Enter two  numbers");
int a=sc.nextInt();
int b=sc.nextInt();
int sum= a+b;
int sub=a-b;
int product=a*b;
int divide=a/b;
int modulus=a%b;
System.out.println("The sum is  " + sum);
System.out.println("the difference is " + sub);
System.out.println("the product is " + product);
System.out.println("The quotient is " + divide);
System.out.println("The remainder is " + modulus);




}
}
