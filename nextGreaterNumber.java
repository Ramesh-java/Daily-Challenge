class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int[]out=new int[n];
        Stack<Integer>stack=new Stack<>();
        for(int i=2*n-1;i>=0;i--){
            while(stack.empty()==false&&stack.peek()<=nums[i%n]){
                stack.pop();
            }
            if(i<n){
                if(stack.empty()==false)out[i]=stack.peek();
                else out[i]=-1;
            }stack.push(nums[i%n]);
        }
        return out;
    }
}