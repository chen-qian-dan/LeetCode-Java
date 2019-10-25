

package leetCode_01_TwoSum;

public class Solution_02 
{
	public int[] twoSum(int[] nums, int target)
	{
		for (int i = 0; i < nums.length; i++)
		{
			for (int j = 0; j < nums.length; j++)
			{
				if (target == nums[i] + nums[j])
				{
					return new int[] {i, j};
				}
			}
		}
		throw new IllegalArgumentException("No two sum solution. "); 
	}

}
