package com.learn.strings;

import java.util.*;

public class Subsets {

  public static List<List<Integer>> findSubsets(int[] nums) {
    List<List<Integer>> subsets = new ArrayList<>();
    // start by adding the empty subset
    subsets.add(new ArrayList<>());
    for (int currentNumber : nums) {
      // we will take all existing subsets and insert the current number in them to create new subsets
      int n = subsets.size();
      for (int i = 0; i < n; i++) {
        // create a new subset from the existing subset and insert the current element to it
        List<Integer> set = new ArrayList<>(subsets.get(i));
        set.add(currentNumber);
        subsets.add(set);
      }
    }
    return subsets;
  }

  public static void main(String[] args) {
    List<List<Integer>> result = Subsets.findSubsets(new int[] { 1, 3 });
   // System.out.println("Here is the list of subsets: " + result);

   // result = Subsets.findSubsets(new int[] { 1, 5, 3 });
   Map<String,String> hmap = new HashMap<String,String>();
   hmap.put("BespokeContent", "Â£Â£Â£");
   
   System.out.println(hmap.get("BespokeContent"));
   String str = hmap.get("BespokeContent");
  // System.out.println(str.replace("&#163;", "£"));
   System.out.println(str.replaceAll("Â", ""));
   
   // System.out.println("Here is the list of subsets: " + result);
  }
}
