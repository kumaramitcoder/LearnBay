package string;

import java.util.HashMap;
import java.util.Map;

public class CountStringRevComputeMethod {
    public static void main(String[] args) {
        String[] strings = {"amit", "kumar","sah", "amit"};

        Map<String, Integer> map = new HashMap<>();
        for (String s : strings){
            map.compute(s, (key, value)->value==null?1:value+1);
        }
        System.out.println(map);
    }
}
