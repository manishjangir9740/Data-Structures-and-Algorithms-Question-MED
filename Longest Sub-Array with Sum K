
class Solution {
    public int lenOfLongestSubarr(int[] arr, int k) {
        // code here
    int n = arr.length; // size of the array
    Map<Integer, Integer> preSumMap = new HashMap<>(); // stores prefix sum and its first occurrence index
    int sum = 0;
    int maxLen = 0;

    for (int i = 0; i < n; i++) {
        // Update the prefix sum till index i:
        sum += arr[i];

        // If the sum equals k, update maxLen:
        if (sum == k) {
            maxLen = i + 1;
        }

        // Check if (sum - k) exists in the map:
        int rem = sum - k;
        if (preSumMap.containsKey(rem)) {
            // Calculate the length of the subarray:
            int len = i - preSumMap.get(rem);
            maxLen = Math.max(maxLen, len);
        }

        // Add the current prefix sum to the map only if it's not already there.
        // This ensures we store the first occurrence of the prefix sum.
        if (!preSumMap.containsKey(sum)) {
            preSumMap.put(sum, i);
        }
    }

    return maxLen;

    }
}
