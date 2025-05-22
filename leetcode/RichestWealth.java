public class RichestWealth {
    public static void main(String[] args) {
        int[][] accounts = {
            {2,8,7}, //2+8+7=17
            {7,1,3}, //7+1+3=11
            {1,9,5}  //1+9+5=15
        };
        int result = maximumWealth(accounts);
        System.out.println(result);
    }

    static int maximumWealth(int[][] accounts) {
        int max = 0;
        for(int i=0; i<accounts.length; i++){
            int sum = 0;
            for(int j=0; j<accounts[i].length; j++){
                sum = accounts[i][j] + sum;
            }
                if(sum > max){
                    max = sum;
                }
        }
        return max;
    }
}
