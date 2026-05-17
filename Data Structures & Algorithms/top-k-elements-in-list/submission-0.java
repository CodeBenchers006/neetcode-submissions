class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap();
        
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        PriorityQueue<Integer> minHeap = new PriorityQueue<>((a,b)-> map.get(b) - map.get(a));
        minHeap.addAll(map.keySet());

        int arr[]= new int[k];
        for(int i=0;i<k;i++){
            arr[i]=minHeap.poll();
        }

        return arr;
    }
}
