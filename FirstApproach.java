package com.interviewprep.leetcode.easy.numbersdisappearedinarray;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FirstApproach {

	public static void main(String[] args) {
		
		int[] nums = {4,3,2,7,8,2,3,1};
		
		FirstApproach fa = new FirstApproach();
		List<Integer> intList = fa.findDisappearedNumbers(nums);
		

	}

	
	public List<Integer> findDisappearedNumbers(int[] nums) {

		List<Integer> intList = new ArrayList<Integer>();

		Set<Integer> numSet = new HashSet<Integer>();

		
		// add numbers in a Hashset
		for(int i=0; i<nums.length; i++) {

			numSet.add(nums[i]);

		}
		
		// now find the missing numbers
		for(int i=1; i<=nums.length; i++) {

			if(!numSet.contains(i)) {

				System.out.println(i);
				intList.add(i);
			}
		}



		return intList;
	}
	
}
