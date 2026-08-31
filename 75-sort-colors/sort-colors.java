class Solution {
    public void sortColors(int[] A) {
        int n = A.length;

        int low = 0;
        int mid = 0;
        int high = n - 1;

        while (mid <= high) {

            if (A[mid] == 0) {
                swap(A, low, mid);
                low++;
                mid++;
            }
            else if (A[mid] == 1) {
                mid++;
            }
            else {
                swap(A, mid, high);
                high--;
            }
        }
    }

    public void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
}