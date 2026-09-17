class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();

        for (int x : nums1){
            set.add(x);
        }
        
        
        
        HashSet<Integer> result = new HashSet<>();
        for (int x : nums2){
            if (set.contains(x)){
                result.add(x);
            }
        }

        int [] answer = new int [result.size()];
        int i = 0;
        for (int x : result){
            answer[i] = x;
            i ++;

        }
        return answer;
    }
}