public class CeilingProblem {
    public static void main(String[] args) {
        int[] arr = {1, 2, 8, 10, 10, 12, 19};
        int target = 13;
        int result = findCeiling(arr, target);
        System.out.println("The ceiling of " + target + " is: " + result);
    }

    static int findCeiling(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(target == arr[mid]){
                return mid;
            }else if(target < arr[mid]){
                end = mid - 1;
            }else {
                start = mid + 1;
            }
        }
        return start; // The ceiling is at index 'start'
    }
}