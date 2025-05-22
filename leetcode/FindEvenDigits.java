public class FindEvenDigits {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        int result = findNumbers(nums);
        System.out.println(result);
    }

    static int findNumbers(int[] nums) {
        int ans = 0;
        for(int i=0; i<nums.length; i++){
            if(digits(nums[i]) % 2 == 0){
                ans++;
            }
        }
        return ans;
    }

    static int digits(int number){
        int count = 0;
        while(number > 0){
            count++;
            number = number/10;
        }
        return count;
    }
}
