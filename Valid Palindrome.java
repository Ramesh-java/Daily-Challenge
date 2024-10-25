class Solution {
    public boolean isPalindrome(String s) {
        String str=s.replaceAll("[^a-zA-Z0-9]","");
        return pali(str.toLowerCase());
    }

    static boolean pali(String str){
        int left=0;
        int right=str.length()-1;

        for(int i=0;i<str.length();i++){
            if(left<right && str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}