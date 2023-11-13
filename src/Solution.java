
class Solution {
    public int lengthOfLastWord(String s) {
        for (int i = 1; i <= s.length(); ++i) {
            System.out.println(s.charAt(i));
        }

        return 0;
    }

    public int[] twoSum(int[] nums, int target){
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j <nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = nums[i];
                    result[1] = nums[j];

                }
            }
        }

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        return result;
    }
}
