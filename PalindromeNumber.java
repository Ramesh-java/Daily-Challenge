class PalindromeNumber {
    public boolean isPalindrome(int x) {
       if(x>=0){
        int orig=x;
        int rev=0;
        while(x!=0){
            rev=(rev*10)+x%10;
            x=x/10;
        }
        return orig==rev;
    }return false;
}
}