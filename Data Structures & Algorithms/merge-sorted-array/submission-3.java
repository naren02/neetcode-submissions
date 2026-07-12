class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       int last = nums1.length -1;
       int i = m-1;
       int j = n-1;
       while(i >= 0 && j >=0){
        System.out.println("i __"+i+" j "+j+" last "+last);
       if(nums1[i] > nums2[j]){
        nums1[last] = nums1[i];
        i--;
       }  else{
        nums1[last] = nums2[j];
        j--;
       }
       last--;
       //while() 
       }
       while(j>=0){
        System.out.println("N __"+j+" last "+last);
        nums1[last--] = nums2[j--];
       }
    }
}