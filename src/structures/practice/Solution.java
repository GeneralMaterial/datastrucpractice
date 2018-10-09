package structures.practice;

import java.util.Scanner;
import java.util.Stack;

public class Solution {

  int max = 0;

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int num = input.nextInt();
    int op = 0;
    if (input.hasNext()) {
      op = input.nextInt();
    }
    input.close();

    //    if (input.hasNext()) {
    //      op = Integer.valueOf(input.nextInt());
    //    }

    Solution sol = new Solution();
    sol.stacked(num, op);
  }

  private void stacked(Integer num, int queryType) {
    Stack<Integer> intStack = new Stack<>();
    switch (queryType) {
      case 1:
        this.max = num > this.max ? num : this.max;
        intStack.push(num);
        break;
      case 2:
        intStack.pop();
        break;
      case 3:
        System.out.println(this.max);
        break;
      default:
        System.out.println(num);
    }
  }
}
