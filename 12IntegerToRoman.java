public class Solution {
    public String intToRoman(int num) {
        String str1=new String();
        String str2=new String();
        String str3=new String();
        String str4=new String();
        if(num%10==0) str1="";
        else if(num%10==1) str1="I";
        else if(num%10==2) str1="II";
        else if(num%10==3) str1="III";
        else if(num%10==4) str1="IV";
        else if(num%10==5) str1="V";
        else if(num%10==6) str1="VI";
        else if(num%10==7) str1="VII";
        else if(num%10==8) str1="VIII";
        else str1="IX";
        
        num-=num%10;
        
        if(num%100==0) str2="";
        else if(num%100==10) str2="X";
        else if(num%100==20) str2="XX";
        else if(num%100==30) str2="XXX";
        else if(num%100==40) str2="XL";
        else if(num%100==50) str2="L";
        else if(num%100==60) str2="LX";
        else if(num%100==70) str2="LXX";
        else if(num%100==80) str2="LXXX";
        else str2="XC";
        
        num-=num%100;
        
        if(num%1000==0) str3="";
        else if(num%1000==100) str3="C";
        else if(num%1000==200) str3="CC";
        else if(num%1000==300) str3="CCC";
        else if(num%1000==400) str3="CD";
        else if(num%1000==500) str3="D";
        else if(num%1000==600) str3="DC";
        else if(num%1000==700) str3="DCC";
        else if(num%1000==800) str3="DCCC";
        else str3="CM";
        
        num-=num%1000;
        if(num%10000==0) str4="";
        else if(num%10000==1000) str4="M";
        else if(num%10000==2000) str4="MM";
        else str4="MMM";
        
        return str4.concat(str3).concat(str2).concat(str1);

                
        
                
        
        
    }
}
