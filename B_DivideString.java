class Solution {
    public String[] divideString(String s, int k, char fill) {
        int n = s.length();
        int anslength = (int)(Math.ceil(n/(double)k));
        String[] ans = new String[anslength];
        int i=0;//for string
        int idx = 0;// for array
        while(i < s.length()) {
            int end = Math.min(i+k, n);
            ans[idx++] = s.substring(i, end);
            i+=k;
        }
        String last = ans[anslength-1];
        if(last.length() < k) {
            last += String.valueOf(fill).repeat(k-last.length());
            ans[anslength-1] = last;
        }
        return ans;
    }
}
