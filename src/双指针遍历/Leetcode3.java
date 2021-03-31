package 双指针遍历;

import java.util.HashMap;
import java.util.Map;

public class Leetcode3 {

    public int lengthOfLongestSubstring(String s){
        int ans = 0;
        int left = 0, right = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        while (right < s.length()){
            Integer index = map.get(s.charAt(right));
            map.put(s.charAt(right), right);
            if (index != null && index >= left){
                left = index + 1;
            }
            if (right - left + 1 > ans){
                ans = right - left + 1;
            }
            right++;
        }
        return ans;
    }

    public int lengthOfLongestSubstring2(String s){
        int n = s.length(), ans = 0;
        Map<Character, Integer> hashMap = new HashMap<>();
        for (int start = 0, end = 0; end < n; end++){
            char current = s.charAt(end);
            if (hashMap.containsKey(current)){
                start = Math.max(start, hashMap.get(current));
            }
            ans = Math.max(ans, end - start + 1);
            hashMap.put(current, end + 1);
        }
        return ans;
    }
}
