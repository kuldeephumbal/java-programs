import java.util.Arrays;
import java.util.Scanner;
public class FindNumbers {
    public static void main(String[] args) {
        int[] num = {12, 34, 56, 78, 90};
        Scanner input = new Scanner(System.in);
        int target = input.nextInt();
        findNum(num, target);
    }

    static void findNum(int[] num, int target) {
        for(int i=0; i<num.length; i++){
            if(num[i] == target){
                System.out.println("Number " + target + " found at index " + i);
                return;
            } 
        }
        System.out.println("Number " + target + " not found in the array.");
    }
}