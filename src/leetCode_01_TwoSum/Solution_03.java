package leetCode_01_TwoSum;

import java.util.*;

public class Solution_03 
{
	public int[] twoSum(int[] nums, int target)
	{
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for (int i = 0; i < nums.length; i++)
		{
			map.put(nums[i], i); // key is unique; 
		}
		
		for (int i = 0; i < nums.length; i++)
		{
			int nTem = target - nums[i]; 
			if (map.containsKey(nTem) && map.get(nTem) != i)
			{
				return new int[] {i, map.get(nTem)}; 
			}
		}
		
		throw new IllegalArgumentException("No two sum solution. ");
		
	}

}
