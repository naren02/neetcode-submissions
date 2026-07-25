class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freqMap = new HashMap();
        List<Integer>[] buckets = new List[nums.length+1];
        for(int i = 0; i < nums.length; i++){
            freqMap.put(nums[i], freqMap.getOrDefault(nums[i],0) + 1);
        }
        for(Map.Entry<Integer, Integer> entry : freqMap.entrySet()){
            int freq = entry.getValue();
            if(buckets[freq] == null){
                buckets[freq] = new ArrayList();
            }
            buckets[freq].add(entry.getKey());

        }
        int count = k;
        int r = 0;
        List<Integer> resultList = new ArrayList();
        for(int j = buckets.length-1; j > 0 && count > 0; j--){
            if(buckets[j] != null){
                resultList.addAll(buckets[j]);
                count--;
            }
        }
        //System.out.println(resultList);
        int[] res = new int[k];
        while(r < k){
            res[r] = resultList.get(r);
            r++;
        }
        return res;
    }
}
