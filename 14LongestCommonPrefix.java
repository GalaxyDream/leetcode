public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==1) return strs[0];
        int flag=1;
        String LCP="";
        try{
            for(int i=0;i<100000;i++){
                for(int j=0;j<strs.length-1;j++){
                    if(flag==1 && strs[j].charAt(i)==strs[j+1].charAt(i)){
                        flag=1;
                    }
                    else flag=0;
                }
                if(flag==1) LCP=LCP+strs[0].charAt(i);
                else return LCP;
            }
        }
        catch(Exception e){
            return LCP;
        }
        return LCP;
    }
}
