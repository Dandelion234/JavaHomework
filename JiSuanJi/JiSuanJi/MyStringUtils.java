package JiSuanJi;

import java.util.ArrayList;
import java.util.List;
import java.lang.String;
public class MyStringUtils {
    public String getUpperCaseStr(String str){

        String newA=str.toUpperCase();              //题一：str全转成大写
        System.out.println(newA);
        return newA;
    }
    public String getUpperCaseStr(int end,String str){      //题二：0到end转成大写
        String a=str.substring(0,end).toUpperCase();        //end后几位不变
        String b=str.substring(end);
        String c=a.concat(b);                   //连接a，b
        System.out.println(c);
        return c;
    }
    public String getUpperCaseStr(int begin,int end,String str){  //题三：begin到end位转大写
        String a=str.substring(0,begin-1);
        String b=str.substring(begin-1,end).toUpperCase();  //截取begin到end位字母，end为开区间，下标从0开始
        String c=str.substring(end);                    //其他字母不变
        String d=a.concat(b).concat(c);                   //链接a,b,c
        System.out.println(d);
        return d;
    }
    public List<String> getUpperCaseStr(List<String> strs) {
        List<String> result = new ArrayList<String>();            //新建名为result的list集合，用于返回list
        for (String str : strs) {                 //遍历
            result.add(str.toUpperCase());              //将输入的list数据转换成大写add到result上
        }
        return result;                      //返回result
    }
    public String[] getUpperCaseStr (String[] str){//题五
        for (int i = 0; i < str.length; i++) {          //分别变大写
            str[i]=str[i].toUpperCase();
        }
        for(int j=0;j<str.length;j++){
            System.out.println(str[j]);
        }
        return str;
    }
    public String[] getUpperCaseStr (int end,String[] str){
        for (int i = 0; i < str.length; i++) {
            String a=str[i].substring(0,end).toUpperCase();
            String b=str[i].substring(end);
            str[i]=a.concat(b);
        }
        for(int j=0;j<end;j++){
            System.out.println(str[j]);
        }
        return str;
    }
}
