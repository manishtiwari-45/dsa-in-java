class Solution {
    public int minimumPushes(String word) {
        int n = word.length();

        int one_push = Math.min(n,8);
        int two_push = 2*Math.min(Math.max(n-8,0),8);
        int three_push = 3*Math.min(Math.max(n-16,0),8);
        int four_push = 4*Math.max(n-24,0);

        return one_push + two_push + three_push + four_push;
    }
}