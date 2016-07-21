public class Solution {
    public int myAtoi(String str) {

        if(str.equals("")) return 0;
        int start=str.length();
        int end=0;
        int flag=0;
        int INT_MAX=2147483647;
        int INT_MIN=-2147483648;
        if(str.length()==1&&str.charAt(0)>'0'&&str.charAt(0)<'9') return Integer.parseInt(str.substring(0,1));
        else{
            for(int i=0;i<str.length();i++){
                if(flag==0&&(str.charAt(i)<'0'||str.charAt(i)>'9')&&str.charAt(i)!='-'&&str.charAt(i)!='+'&&str.charAt(i)!=' ') flag=3;
                else if(flag==0&&((str.charAt(i)>='0'&&str.charAt(i)<='9')||str.charAt(i)=='-'||str.charAt(i)=='+')){
                    start=i;
                    flag=1;
                    continue;
                }
                else if(flag==1&&((str.charAt(i)<'0'||str.charAt(i)>'9'))){
                    end=i-1;
                    flag=2;
                    continue;
                }
                else if(flag==1&&(i==str.length()-1)){
                    end=i;
                    flag=2;
                    continue;
                }
                else continue;
            }
    
            
            if((flag==1||flag==2)&&(str.substring(start,end+1).equals("+")||str.substring(start,end+1).equals("-"))) return 0;
            else{
                if(flag!=2) return 0;
                double num=Double.parseDouble(str.substring(start,end+1));
                if(flag==2&&num>=INT_MAX) return INT_MAX;
                else if(flag==2&&num<=INT_MIN) return INT_MIN;
                else if(flag==2&&num>INT_MIN&&num<INT_MAX) return Integer.parseInt(str.substring(start,end+1));
                else return 0;
            }
        }
    
    }


}
