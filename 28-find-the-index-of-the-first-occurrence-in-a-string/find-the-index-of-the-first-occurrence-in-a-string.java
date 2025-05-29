class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.equals(haystack)){
            return 0;
        }
        for(int i=0;i<=haystack.length()-needle.length();i++){
            if(needle.equals(haystack.substring(i,i+needle.length()))){
                return i;
            }
        }
        return -1;
    }
}