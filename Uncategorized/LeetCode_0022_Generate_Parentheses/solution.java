class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        backTrack(ans,"",0,0,n);
        return ans;
    }
    public static void backTrack(List<String> ans,String str,int open,int close,int n){