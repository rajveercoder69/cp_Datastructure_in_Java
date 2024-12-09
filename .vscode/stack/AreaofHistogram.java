import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class AreaofHistogram {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the value  in Array");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int max = 0;
        AreaofHistogram obj = new AreaofHistogram();
        ArrayList<Integer> list = obj.reve(nums, n);
        for (int i = 0; i < n; i++) {
            max = Math.max(max, (nums[i] * list.get(i)));
        }
        System.out.println("Maximum Area of Histogram:" + max);
    }

    public ArrayList<Integer> reve(int nums[], int n) {
        ArrayList<Integer> left = nearestsmallerelement(nums, n);
        ArrayList<Integer> right = nearestsmallerRight(nums, n);
        ArrayList<Integer> height = new ArrayList<Integer>();
        for (int j = 0; j < n; j++) {
            height.add((right.get(j) - left.get(j) - 1));
        }
        return height;
    }

    public ArrayList<Integer> nearestsmallerelement(int[] num, int n) {
        Stack<Integer> stack = new Stack<Integer>();
        ArrayList<Integer> res = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            if (stack.empty()) {
                res.add(-1);
            } else if (stack.size() > 0 && num[stack.peek()] < num[i]) {
                res.add(stack.peek());
            } else if (stack.size() > 0 && num[stack.peek()] >= num[i]) {
                while (stack.size() > 0 && num[stack.peek()] >= num[i]) {
                    stack.pop();
                }
                if (stack.size() <= 0) {
                    res.add(-1);
                } else {
                    res.add(stack.peek());
                }
            }
            stack.push(i);
        }
        System.out.println(res);
        return res;
    }

    public ArrayList<Integer> nearestsmallerRight(int[] num, int n) {
        Stack<Integer> stack = new Stack<Integer>();
        ArrayList<Integer> res = new ArrayList<Integer>();
        for (int i = n - 1; i >= 0; i--) {
            if (stack.empty()) {
                res.add(-7);
            } else if (stack.size() > 0 && num[stack.peek()] < num[i]) {
                res.add(stack.peek());
            } else if (stack.size() > 0 && num[stack.peek()] >= num[i]) {
                while (stack.size() > 0 && num[stack.peek()] >= num[i]) {
                    stack.pop();
                }
                if (stack.size() <= 0) {
                    res.add(-1);
                } else {
                    res.add(stack.peek());
                }
            }
            stack.push(i);
        }
        stack = new Stack<Integer>();
        ArrayList<Integer> reverse = new ArrayList<Integer>();
        for (int KK : res) {
            stack.push(KK);
        }
        while (!stack.empty()) {
            reverse.add(stack.peek());
            stack.pop();
        }
        System.out.println(reverse);
        return reverse;
    }
}