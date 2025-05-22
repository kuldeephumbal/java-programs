import java.util.Scanner;
public class Function {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your greetings: ");
        String greets = input.nextLine();
        Greetings(greets);
    }

    static void Greetings(String greets) {
        System.out.println(greets);
    }
}