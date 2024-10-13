class Solution {
    public int removeElement(int[] arr, int val) {
        int sp=0;
        for(int i=0;i<arr.length;i++){
           if(arr[i]!=val){
            arr[sp]=arr[i];
            sp++;
           }
        }return sp;
    }
}