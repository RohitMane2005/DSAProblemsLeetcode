import java.util.*;

class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> ans = new ArrayList<>();
        int p = num.length - 1;
        int carry = 0;

        while (p >= 0 || k > 0 || carry > 0) {
            int numVal = (p >= 0) ? num[p] : 0;
            int digit = k % 10;

            int sum = numVal + digit + carry;
            ans.add(sum % 10);

            carry = sum / 10;
            p--;
            k /= 10;
        }

        Collections.reverse(ans);
        return ans;
    }
}
