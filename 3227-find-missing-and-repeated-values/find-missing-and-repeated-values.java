class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {

        HashSet<Integer> set = new HashSet<>();

        int n = grid.length;
        int a = 0; // repeated number
        int actualSum = 0;

        // Find repeated number and calculate actual sum
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                int value = grid[i][j];
                actualSum += value;

                if (set.contains(value)) {
                    a = value;
                }

                set.add(value);
            }
        }

        // Expected sum from 1 to n²
        int total = n * n;
        int expectedSum = total * (total + 1) / 2;

        // missing = expectedSum - actualSum + repeated
        int b = expectedSum - actualSum + a;

        return new int[] {a, b};
    }
}