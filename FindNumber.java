public class FindNumber {
    public static void main(String[] args) {
        int n = 3523;
        int count = 0;
        while (n > 0) {
            int b = n % 10;
            if (b == 3) {
                count++;
            }
            n = n / 10; 
        }
        System.out.print(count);
    }
}
