
import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number: ");
        int n = sc.nextInt();

        System.out.println("\nNumbers from 1 to " + n + " are:");
        for(int i=1;i<=n;i++){
            System.out.print(" "+i);
        }

        System.out.println("\nEven Numbers" + n + " are:");
        int i=1;
        while(i<=n){
            if(i%2==0){
                System.out.print(" "+i);
            }
            i++;
        }
        int sum=( n*(n+1))/2;
        System.out.println("\nSum of first" + n + " natural nos are: " + sum);

        
    }
}
