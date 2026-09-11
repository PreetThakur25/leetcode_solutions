class Solution {
    public int minSetSize(int[] arr) {
        Map<Integer, Integer> freq = new HashMap<>();
        for(int num : arr){
            freq.put(num, freq.getOrDefault(num, 0) +1);

        }
        List<Integer> counts = new ArrayList<>(freq.values());
         counts.sort(Collections.reverseOrder());

         int removed = 0;
         int answer = 0;
         int target = arr.length /2;


         for ( int count: counts){
            removed += count;
            answer++;

            if (removed >= target){
                return answer;
            }
         }
         return answer;
    }
}