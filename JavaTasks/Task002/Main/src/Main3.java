import java.util.Arrays;

public class Main3 {
    public static void main(String[] args) {
        int[] nums = {3, 2, 5, 3};
        int val = 3;

        System.out.println(Arrays.toString(SortNums1(nums, val)));
        System.out.println(Arrays.toString(SortNums2(nums, val)));
    }

    static int[] SortNums1(int[] nums, int val){
        int count = 0, countRev = 1;
        int[] arr = new int[nums.length];

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == val){
                arr[nums.length - countRev] = val;
                countRev++;
            } else {
                arr[count] = nums[i];
                count++;
            }

        }
        return  arr;
    }
    static int[] SortNums2(int[] nums, int val){
        int[] arr = new int[nums.length];
        Arrays.fill(arr, val);

        for(int i = 0, j = 0; i < arr.length; i++) {
            if(nums[i] != val){
                arr[j] = nums[i];
                j++;
            }

        }
        return  arr;
    }

}
