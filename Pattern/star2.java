import java.util.Scanner;

public class star2 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("enter no. of rows and columns :");
    int n = sc.nextInt();
    int m = sc.nextInt();
    for(int i = 1; i <= n; i++){
        for(int j  = 1; j <= m; j++){
            System.out.print("* ");
        }
        System.out.println();
    }
    }
}
