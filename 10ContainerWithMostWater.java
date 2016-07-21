public class Solution {
    public int maxArea(int[] height) {
        int max=0;
        int start=0;
        int end=height.length-1;
        int size=0;
//        int flag=-1;
        while(start!=end){
//            if(height.length>10&&((flag==1&&height[start]<=height[start-1]) || (flag==0&&height[end]<=height[end+1]))) continue;
            if(height[start]<height[end]){
                size=height[start]*(end-start);
//               flag=1;
                start++;
            } 
            else{
                size=height[end]*(end-start);
//                flag=0;
                end--;
            }
            if(max<size) max=size;
        }
        return max;
    }
}
