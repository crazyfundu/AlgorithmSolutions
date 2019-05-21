import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:

Given nums = [2, 7, 11, 15], target = 9,



Because nums[0] + nums[1] = 2 + 7 = 9,

return [0, 1].
 */
public class TwoSumSolutions {

    public static void main(String[] args) {
        TwoSumSolutions s = new TwoSumSolutions();
        int[] nums = {2, 7, 11, 15};

        int[] res1 = s.twoSumBruteForce(nums, 9);
        System.out.println(res1[0]+", "+res1[1]);

        int[] res2 = s.twoSumComparable(nums, 9);
        System.out.println(res2[0]+", "+res2[1]);

        int[] res3 = s.twoSumUsingMap(nums, 9);
        System.out.println(res3[0]+", "+res3[1]);
    }

    /*
    Time Complexity = O(n^2)
    Space Complexity = O(1)
    */
    public int[] twoSumBruteForce(int[] nums, int target){
        if(nums == null || nums.length == 0) return null;
        int[] result = null;
        for(int i = 0; i < nums.length-1; i++){
            for (int j = i+1; j < nums.length; j++) {
                if(target == nums[i] + nums[j]){
                    result = new int[]{i, j};
                    break;
                }
            }
        }
        return result;
    }

    /*
    Time Complexity = O(n)
    Space Complexity = O(n)
    */
    public int[] twoSumUsingMap(int[] nums, int target){
        if(nums == null || nums.length == 0) return null;
        int[] result = null;
        Map<Integer, Integer> memo = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int otherNumber = target - nums[i];
            if(memo.containsKey(otherNumber)){ //
                result = new int[] {memo.get(otherNumber), i};
                break;
            }else{
                memo.put(nums[i],i);
            }
        }
        return result;
    }

    private class MyItem implements Comparable<MyItem>{
        private int value;
        private int index;

        MyItem(int value, int index){
            this.value = value;
            this.index = index;
        }


        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public int getIndex() {
            return index;
        }

        public void setIndex(int index) {
            this.index = index;
        }

        @Override
        public int compareTo(MyItem item) {
            if(this.value == item.value)
                return 0;
            return this.value > item.value ? 1 : -1;
        }
    }

    /*
    Time Complexity = O(n.logn)
    Space Complexity = O(n)
    */
    public int[] twoSumComparable(int[] nums, int target){
        if(nums == null || nums.length == 0) return null;
        MyItem[] myItems = new MyItem[nums.length];
        int[] result = null;
        for(int i = 0; i < nums.length; i++){
            MyItem item = new MyItem(nums[i], i);
            myItems[i] = item;
        }

        Arrays.sort(myItems);

        int start = 0, end = myItems.length-1;

        while(start < end){
            int tempSum = myItems[start].getValue() + myItems[end].getValue();

            if(tempSum > target){
                end--;
            }else if(tempSum > target){
                start++;
            }else{
                result = new int[]{myItems[start].getIndex(), myItems[end].getIndex()};
                break;
            }
        }
        return result;
    }

}
