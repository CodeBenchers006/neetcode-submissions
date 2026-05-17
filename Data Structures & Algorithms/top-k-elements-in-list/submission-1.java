class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap();
        
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        PriorityQueue<Integer> heap = new PriorityQueue<>((a,b)-> map.get(b) - map.get(a));
        heap.addAll(map.keySet());

        int arr[]= new int[k];
        for(int i=0;i<k;i++){
            arr[i]=heap.poll();
        }

        return arr;
    }
}
