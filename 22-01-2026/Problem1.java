import java.util.*;

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a no: ");
        int n=sc.nextInt();
        
        if(n>0){
            System.out.println("positive");
        }
        else if(n<0){
            System.out.println("negative");
        }
        else{
            System.out.println("zero");
        }

        if(n%2==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }

    }

}