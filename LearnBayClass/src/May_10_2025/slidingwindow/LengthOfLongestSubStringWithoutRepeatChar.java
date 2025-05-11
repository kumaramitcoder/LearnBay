package May_10_2025.slidingwindow;

import java.util.HashSet;
import java.util.Set;

public class LengthOfLongestSubStringWithoutRepeatChar {
    public static void main(String[] args) {
        String string = "abcdbedfg";
        System.out.println(withoutRepeat(string));

    }

    public static int withoutRepeat(String s){
        int n = s.length();
        int ans =0;
        int st = 0; int end =0;
        Set<Character> set = new HashSet<>();

        while(end<n){
            char curchar = s.charAt(end);
            if (set.contains(curchar)){
                while (set.contains(curchar)) {
                    set.remove(s.charAt(st));
                    st++;
                }
            } else {

                int len = end-st+1;

                ans = Math.max(ans, len);
            }
            set.add(curchar);
            end++;
        }
        return ans;
    }
}
