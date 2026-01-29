public class Problem3 {
    void factorial(int n) {
        int factorial = 1;
        for(int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println("Factorial" + n + " is: " + factorial);
    }
    long add(int addend1, int addend2) {
        return (long)addend1 + (long)addend2;
    }
    boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static void main(String[] args) {
        Problem3 obj = new Problem3();
        obj.factorial(5);
        System.out.println("Sum of 10 and 20 is: " + obj.add(10, 20));
        System.out.println("Is 7 even? " + obj.isEven(7));
    }

}
