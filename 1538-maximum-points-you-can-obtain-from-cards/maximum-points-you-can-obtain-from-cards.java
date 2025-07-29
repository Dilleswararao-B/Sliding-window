class Solution {
    public int maxScore(int[] cardPoints, int k) {
       int n = cardPoints.length;
    int lsum = 0, rsum = 0, maxsum = 0;

    for (int i = 0; i < k; i++) {
        lsum += cardPoints[i];
    }

    maxsum = lsum;

    for (int i = 0; i < k; i++) {
        lsum -= cardPoints[k - 1 - i];
        rsum += cardPoints[n - 1 - i];
        maxsum = Math.max(maxsum, lsum + rsum);
    }

    return maxsum;
    }
}