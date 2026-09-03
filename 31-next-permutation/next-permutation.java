class Solution {
    public void nextPermutation(int[] a) {
        int n = a.length;
        int piv = -1;

        // Step 1: Find pivot
        for (int i = n - 2; i >= 0; i--) {
            if (a[i] < a[i + 1]) {
                piv = i;
                break;
            }
        }

        // Step 2: If no pivot, reverse whole array
        if (piv == -1) {
            reverse(a, 0, n - 1);
            return;
        }

        // Step 3: Find next greater element and swap
        for (int i = n - 1; i > piv; i--) {
            if (a[i] > a[piv]) {
                swap(a, i, piv);
                break;
            }
        }

        // Step 4: Reverse the right half
        reverse(a, piv + 1, n - 1);
    }

    private void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    private void reverse(int[] a, int start, int end) {
        while (start < end) {
            swap(a, start, end);
            start++;
            end--;
        }
    }
}