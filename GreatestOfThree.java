import java.util.Scanner;
public class GreatestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        System.out.print("Enter first number :");
        int a = sc.nextInt(); 
        System.out.print("Enter second  number :");
        int b = sc.nextInt(); 
        System.out.print("Enter third number :");
        int c = sc.nextInt(); 
        if (a > b && a > c) {
            System.out.print("a is greatest among all "+a);
        }
       else if(b > a && b >c) {
            System.out.print("b is greatest among all "+b);
        }
        else{
            System.out.print("c is greatest among all "+c);
        }
    }
   
}
