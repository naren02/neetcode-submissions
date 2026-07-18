class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       int last = nums1.length -1;
       while(m > 0){
       if(nums1[m-1] > nums2[n-1]){
        nums1[last--] = nums1[--m];
       }  else{
        nums1[last--] = nums2[--n];
       }
       //while() 
       }
       while(n>0){
        System.out.println("N __"+n+" last. "+last);
        nums1[last--] = nums2[--n];
       }
    }
}