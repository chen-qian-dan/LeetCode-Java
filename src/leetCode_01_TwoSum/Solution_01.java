package leetCode_01_TwoSum;

public class Solution_01 
{
	public int[] twoSum(int[] nums, int target)
	{
		int[] nRet = null; 
		
		for (int i = 0; i < nums.length; i++)
		{
			for (int j = i + 1; j < nums.length; j++)
			{
				if (nums[i] + nums[j] == target)
				{
					nRet = new int[] {i, j}; 
				}
			}
		}
		return nRet; 
	}
}
