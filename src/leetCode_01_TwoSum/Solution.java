package leetCode_01_TwoSum;

/***
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * Example:
 * Given nums = [2, 7, 11, 15], target = 9,
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 * 
 * @author qianchen
 * last update: 20190917Tue
 *
 */

public class Solution 
{
	public int[] twoSum(int[] nums, int target)
	{
		int[] nRet = new int[2]; 
		boolean bFlag = false; 
		int i = 0; 
		
		while (!bFlag && i <= nums.length - 2)
		{
			int j = i +1; 
			int nTemp = target - nums[i]; 
			while (!bFlag && j <= nums.length - 1)
			{
				if (nums[j] == nTemp)
				{
					bFlag = true; 
					nRet[0] = i; 
					nRet[1] = j;
				}
				j++; 
			}
			i++; 
		}
		return nRet; 
	}
}















