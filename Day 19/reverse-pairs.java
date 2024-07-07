// reverse-pairs
// https://leetcode.com/problems/reverse-pairs/description/
class Solution {
    int count = 0;

    public int reversePairs(int[] nums) {
        mergeSort(nums, 0, nums.length - 1);
        return count;
    }

    public void mergeSort(int[] arr, int low, int high) {
        if (low >= high) return;

        int mid = (low + high) / 2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }

    public void merge(int[] arr, int low, int mid, int high) {
        int[] temp = new int[high - low + 1];
        int tempIndex = 0;
        int left = low;
        int right = mid + 1;

        // Count reverse pairs during the merge
        for (int i = low; i <= mid; i++) {
            while (right <= high && arr[i] > 2L * arr[right]) {
                right++;
            }
            count += (right - (mid + 1));
        }

        left = low;
        right = mid + 1;

        // Merge the two sorted halves into the temp array
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp[tempIndex++] = arr[left++];
            } else {
                temp[tempIndex++] = arr[right++];
            }
        }

        // Add remaining elements from left half, if any
        while (left <= mid) {
            temp[tempIndex++] = arr[left++];
        }

        // Add remaining elements from right half, if any
        while (right <= high) {
            temp[tempIndex++] = arr[right++];
        }

        // Copy the sorted temp array back to the original array
        for (int i = 0; i < temp.length; i++) {
            arr[low + i] = temp[i];
        }
    }
}