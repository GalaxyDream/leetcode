public class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        else{
            String str=Integer.toString(x);
            int left, right;
            if(str.length()%2==0){
                left=str.length()/2-1;
                right=left+1;
            }
            else{
                left=str.length()/2;
                right=left;
            }
            
            if(str.length()==expand(str,left,right)) return true;
            else return false;
            
        }
    }
    private int expand(String str, int left, int right){
        while(left>=0&&right<=str.length()){
            if(str.charAt(left)==str.charAt(right)){
                left--;
                right++;
                continue;
            }
            else break;
        }
        return right-left-1;
    }
}
