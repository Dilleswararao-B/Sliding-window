class Solution {
    public int characterReplacement(String s, int k) {
        int count[] = new int[26];
        int l=0,maxcount=0,maxlen=0,n=s.length();
        for(int r=0;r<n;r++)
        {
            count[s.charAt(r)-'A']++;
            maxcount=Math.max(maxcount,count[s.charAt(r)-'A']);

            if((r-l+1)-maxcount>k)
            {
                 count[s.charAt(l) - 'A']--;
                l++;
            }
            maxlen=Math.max(maxlen,r-l+1);
        }return maxlen;
    }
}