import java.util.*;

class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> ans = new ArrayList<>();
        int p = num.length - 1;
        int carry = 0;

        while (p >= 0 || k > 0 || carry > 0) {
            int numVal = (p >= 0) ? num[p] : 0;
            int digit = k % 10;
