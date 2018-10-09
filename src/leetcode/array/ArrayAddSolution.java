package leetcode.array;

public class ArrayAddSolution {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    int[] nums = {1, 2, 1, 7, 11, 15};
    int target = 9;

    int[] idxs = twoSum(nums, target);

    System.out.println("idxs " + idxs[0] + " idxII " + idxs[1]);
  }

  public static int[] twoSum(int[] nums, int target) {
    System.out.println("data" + nums.length);
    int[] idxs = new int[2];
    for (int i = 0; i < nums.length; i++) {

      for (int j = i + 1; j < nums.length; j++) {

        System.out.println("sum = " + i + j);
        if (nums[i] + nums[j] == target) {
          idxs[0] = i;
          idxs[1] = j;
          return idxs;
        }
      }
    }
    throw new IllegalArgumentException("No two sum solution");
  }
}
