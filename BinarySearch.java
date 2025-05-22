public class BinarySearch {
    public static void main(String[] args) {
        // int[] num = {7,12,18,25,29,31,56,78,90};
        int[] num = {90,78,56,31,29,25,18,12,7};
        int target = 56;
        int result = binarySearch(num, target);
    }

    static int binarySearch(int[] num, int target) {
        int start = 0;
        int end = num.length - 1;

        if(num[0] > num[num.length - 1]){
            while (start <= end) {
                int mid = start + (end - start) / 2;

                if (num[mid] == target) {
                    System.out.println("Number " + target + " found at index " + mid);
                    return mid;
                }
                if (num[mid] < target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        } else {
            while (start <= end) {
                int mid = start + (end - start) / 2;

                if (num[mid] == target) {
                    System.out.println("Number " + target + " found at index " + mid);
                    return mid;
                }
                if (num[mid] < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        System.out.println("Number " + target + " not found in the array.");
        return -1;
    }
}