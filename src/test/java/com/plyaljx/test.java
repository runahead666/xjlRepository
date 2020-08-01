package com.plyaljx;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test {
    public static void main(String[] args) {
//        String str = "你好，hello world,我好，大家good";
////        String regex = "[\u4e00-\u9fa5]";
////        Pattern pattern = Pattern.compile(regex);
////        Matcher matcher = pattern.matcher(str);
////        while (matcher.find()) {
////            System.out.print(matcher.group(0) + "");
////        }

//            String string = "adf你.？的说法sdf";
//            String reg = "[\u4e00-\u9fa5]";
//            int index = -1;
//            if (string.matches (".*" + reg + ".*"))
//            {
//                index = string.split (reg)[0].length ();
//            }
//            System.out.println (index);
//            String regex = "[。，！？（）《》……du、：——【】；’”‘“]";
//            int ind = -1;
//            if (string.matches (".*" + regex + ".*"))
//            {
//                ind = string.split (regex)[0].length ();
//            }
//            System.out.println (ind);


//            String str = "小山中";
//        try {
//            byte[] arrays = str.getBytes("GBK");
//
////            String str1 = new String(arrays,0,1,"GBK");
//            String str2 = new String(arrays,0,6,"GBK");
////            String str3 = new String(arrays,7,1,"GBK");
//            System.out.println(str2);
//            String str4 = "小山中";
//            boolean isGBK = str4.equals(str2);
//            boolean isUTF8 = str2.equals(new String(str2.getBytes("UTF-8"), "UTF-8"));
//            boolean isGBK2 = str2.equals(new String(str2.getBytes("GBK"), "GBK"));
//            String str5 = new String(str4.getBytes("GBK"), "GBK");
//            String iso = new String(str2.getBytes("UTF-8"),"ISO-8859-1");
//            String utf8 = new String(iso.getBytes("ISO-8859-1"),"UTF-8");
//
//            int i=3;
//
//        } catch (UnsupportedEncodingException e) {
//            e.printStackTrace();
//        }
//        String strs[] = str.split("[\u4e00-\u9fa5]");
//            for(int i=0;i<strs.length;i++){
//            System.out.println(strs[i]);}
//            StringBuilder sb = new StringBuilder();
//            char[] chaArray = str.toCharArray();
//            for(int i=0;i<chaArray.length;i++)
//            {
//
//                if(((chaArray[i]>=0x4e00) && (chaArray[i]<=0x9fbb))){
//                    if(i==0){
//                        sb.append(' ');
//                        sb.append((chaArray[i]));
//                    }
//                    else if(i==chaArray.length-1){
//                        sb.append((chaArray[i]));
//                        sb.append(' ');
//                    }
//                   else{
//                       if(!((chaArray[i-1]>=0x4e00) && (chaArray[i-1]<=0x9fbb))){
//                           sb.append(' ');
//
//                       }
//                        sb.append((chaArray[i]));
//                       if(!((chaArray[i+1]>=0x4e00) && (chaArray[i+1]<=0x9fbb))){
//                           sb.append(' ');
//                       }
//
//                       }
//                }
//                else {
//                    sb.append((chaArray[i]));
//                }
//            }
//
//            String str2 = sb.toString();
//
//        System.out.println(str2);

//        StringBuilder sb = new StringBuilder();
//        String str1 = "123";
//        String str2 = "";
//        String str3 = null;
//        String str4 = "56";
//        sb.append(str1);
//        sb.append(str2);
//        sb.append(str3);
//        sb.append(str4);
//        System.out.println(sb.toString());
//
//        String s1 = "123 ";
//        String s11 = s1.trim();
//        String s2 = "    ";
//        String s22 = s2.trim();
//        String s3 = " ";
//        String s33 = s3.trim();


        Map<String,String> mp1 = new HashMap<>();
        Map<String,String> mp2 = mp1;
        mp1.put("s1","1");
        mp2.put("s1","2");

        int i = 1;


    }
}
