package algorithms;
import java.util.*;

public class HorizontalScanning {
    public static void main(String[] args) {
       /* String[] strings =  {"hellobabaliza", "babala", "tutubabaha"};
        System.out.println(longestCommonPrefix(strings));*/
        int[] nums =  {-1,0,1,2,-1,-4};
        threeSum(nums);
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++)
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        return prefix;
    }


    public static List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> listThreeSum = new HashSet<>();
        List<Integer> threeSum;
        int sum = -1;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2;  i ++) {
            if( sum > 0) {
                break;
            }
            if(i > 0 && nums[i] == nums[i -1]) {
                continue;
            }
            for (int j = i + 1; j < nums.length - 1; j ++) {
                if( sum > 0) {
                    break;
                }
                for (int k = j + 1; k < nums.length; k ++) {
                    sum = nums[i] + nums[j] + nums[k];
                    if(sum == 0) {
                        threeSum = new ArrayList<>();
                        threeSum.add(nums[i]);
                        threeSum.add(nums[j]);
                        threeSum.add(nums[k]);
                        listThreeSum.add(threeSum);
                        break;
                    }

                }
            }
        }
        return new ArrayList<>(listThreeSum);
    }
}
