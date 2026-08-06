class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int i = 0 ;
        int j = arr.length -1;
        while(j - i >= k){
            if(Math.abs(x- arr[i]) > Math.abs(arr[j] - x)){
                i++;
            }else{
                j--;
            }
        }

      // Arrays.toList(Arrays.copyOfRange(arr, i , j));
        int l = i;
        List<Integer> res = new ArrayList();
        while(l <= j){
            res.add(arr[l]);
            l++;
        }
        return res;
    }
}