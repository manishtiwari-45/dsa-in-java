class Solution {
    public String smallestPalindrome(String s) {

        int n = s.length();
        int half = n/2;

        char[] ans = s.toCharArray();
        Arrays.sort(ans, 0, half);

        for(int i=0; i<half; i++){
            ans[n-i-1] = ans[i];
        }
        return new String(ans);

    }
}