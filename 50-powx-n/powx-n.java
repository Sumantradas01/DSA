class Solution {
    public double myPow(double x, int n) {

        long exp = n; // convert to long to handle Integer.MIN_VALUE

        if (exp < 0) {
            x = 1 / x;
            exp = -exp;
        }

        double ans = 1.0;

        while (exp > 0) {

            // If current binary bit is 1
            if ((exp & 1) == 1) {
                ans = ans * x;
            }

            // Square the base
            x = x * x;

            // Move to the next binary bit
            exp = exp >> 1;
        }

        return ans;
    }
}