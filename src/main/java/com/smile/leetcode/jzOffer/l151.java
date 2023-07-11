package com.smile.leetcode.jzOffer;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class l151 {
    class Solution {
        public String reverseWords(String s) {
            s=s.trim();
            List<String> list= Arrays.asList(s.split("\\s+"));
            Collections.reverse(list);
            return String.join(" ",list);
        }
    }
}
