class Solution {

    public int reversePairs(int[] nums) {
        return mergeSort(nums, 0, nums.length - 1);
    }

    public int mergeSort(int[] arr, int left, int right) {

        if (left >= right) return 0;

        int mid = left + (right - left) / 2;

        int count = 0;

        count += mergeSort(arr, left, mid);
        count += mergeSort(arr, mid + 1, right);

        count += countPairs(arr, left, mid, right);

        merge(arr, left, mid, right);

        return count;
    }

    public int countPairs(int[] arr, int left, int mid, int right) {

        int count = 0;
        int j = mid + 1;

        for (int i = left; i <= mid; i++) {

            while (j <= right && arr[i] > 2L * arr[j]) {
                j++;
            }

            count += (j - (mid + 1));
        }

        return count;
    }

    public void merge(int[] arr, int left, int mid, int right) {

        int temp[] = new int[right - left + 1];

        int i = left;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= right) {

            if (arr[i] <= arr[j])
                temp[k++] = arr[i++];
            else
                temp[k++] = arr[j++];
        }

        while (i <= mid)
            temp[k++] = arr[i++];

        while (j <= right)
            temp[k++] = arr[j++];

        for (int x = 0; x < temp.length; x++)
            arr[left + x] = temp[x];
    }
}