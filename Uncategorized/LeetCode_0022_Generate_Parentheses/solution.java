class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        backTrack(ans,"",0,0,n);
        return ans;
    }
    public static void backTrack(List<String> ans,String str,int open,int close,int n){
        if(str.length()== 2*n){
            ans.add(str);
            return;
        }
        if(open < n) backTrack(ans,str+"(",open+1,close,n);
        if(close < open) backTrack(ans,str+")",open,close+1,n);
    }
}