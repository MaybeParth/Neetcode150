
// Neetcode#1 
// Contains Duplicate
// Problem: https://leetcode.com/problems/contains-duplicate/ 
// Given an integer array nums, return true if any value appears more than once in the array, otherwise return false.

import java.util.HashSet;
import java.util.Set;
public class NeetcodeContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6};
        System.out.println(hasDuplicate(nums));
    }

    public static boolean hasDuplicate(int[] nums) {
        Set<Integer> numbersWithoutDuplicates = new HashSet<>();
        for (int num : nums) {
            if (numbersWithoutDuplicates.contains(num)) {
                return true;
            }
            numbersWithoutDuplicates.add(num);
        }
        return false;
    }
}
