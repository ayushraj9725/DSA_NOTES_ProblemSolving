public class TwoSum2 {
    public int[] twoSum(int[] numbers, int target) {

        int i = 0, j = numbers.length - 1;
        // Arrays.sort(numbers); // sort array not need bcz it already given
        while (i < j) {
            int sum = numbers[i] + numbers[j];
            if (sum == target) {
                return new int[] { i + 1, j + 1 };
            } else if (sum > target)
                j--;
            else
                i++;
        }
        // return {-1} ;
        return new int[] { -1, -1 };

        // time complexity : O(N) use two pointer approach
        // space is not used to stored anything so O(1) ;
    }
}