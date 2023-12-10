import org.junit.Assert;
import org.junit.Test;

public class Solution18Test {
    @Test
    public void testProductExceptSelf() {
        Solution solution = new Solution();

        // 测试用例1: 包含正整数的输入数组
        int[] nums2 = {1, 2, 3, 4};
        int[] expected2 = {24, 12, 8, 6};
        int[] result2 = solution.productExceptSelf(nums2);
        Assert.assertArrayEquals(expected2, result2);

        // 测试用例2: 包含负整数的输入数组
        int[] nums3 = {1, -2, 3, -4};
        int[] expected3 = {24, -12, 8, -6};
        int[] result3 = solution.productExceptSelf(nums3);
        Assert.assertArrayEquals(expected3, result3);

        // 测试用例3: 包含零的输入数组
        int[] nums4 = {1, 0, 3, 4};
        int[] expected4 = {0, 12, 0, 0};
        int[] result4 = solution.productExceptSelf(nums4);
        Assert.assertArrayEquals(expected4, result4);

        // 测试用例4: 输入数组长度为1
        int[] nums5 = {2};
        int[] expected5 = {1};
        int[] result5 = solution.productExceptSelf(nums5);
        Assert.assertArrayEquals(expected5, result5);

        // 测试用例5: 输入数组长度为2
        int[] nums6 = {2, 3};
        int[] expected6 = {3, 2};
        int[] result6 = solution.productExceptSelf(nums6);
        Assert.assertArrayEquals(expected6, result6);

        // 测试用例6: 输入数组长度为3及以上的一般情况
        int[] nums7 = {1, 2, 3, 4, 5};
        int[] expected7 = {120, 60, 40, 30, 24};
        int[] result7 = solution.productExceptSelf(nums7);
        Assert.assertArrayEquals(expected7, result7);
    }
}
