class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        s=s.replace(" ", "");
        int start = 0;
        int end=s.length()-1;
        
        while(start < end){
            if(!(s.charAt(start) >= 'a' && s.charAt(start) <= 'z') && !(s.charAt(start) >= '0' && s.charAt(start) <= '9')){
                start++;
                continue;
            }
            if(!(s.charAt(end) >= 'a' && s.charAt(end) <= 'z') && !(s.charAt(end) >= '0' && s.charAt(end) <= '9')){
                end--;
                continue;
            }
            if(s.charAt(start) != s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
        
    }
}
