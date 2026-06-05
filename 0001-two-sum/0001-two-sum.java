import java.util.*;
class Solution {
    public int[] twoSum(int[] arr, int x) {
        Map<Integer,Integer> map = new LinkedHashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            int diff = x-arr[i];
            if(map.containsKey(diff))
            {
               return new int[]{map.get(diff), i};
            }
           map.put(arr[i],i);
        
        }
        return new int[]{-1,-1};
       
}
}