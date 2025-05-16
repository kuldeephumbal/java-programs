import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = input.nextInt();
        int a = 0, b = 1;
        for(int i=2; i<=n; i++){
            int c = a + b;
            a = b;
            b = c;
        }
        System.out.print(b);
    }
}