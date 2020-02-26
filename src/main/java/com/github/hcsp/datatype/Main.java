package com.github.hcsp.datatype;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        // 这里应该输出两个true，实际输出的却是两个false
        // 请查找、思考并修复numberEquals方法中的问题
        System.out.println(numberEquals("1234", "+1234"));
        System.out.println(numberEquals("1234", "1234"));
    }

    // 判断两个字符串是否包含相等的数字
    // 例如a为"+1234"，b为"1234"，返回true

    //方法一：利用ascii码选取数字，拼成新的字符串数组进行比较
    public static boolean numberEquals(String a, String b) {
        return chooseNumber(a) == chooseNumber(b);
    }

    public static int chooseNumber(String a) {
        a = a.trim();
        String str = "";
        if (a != null) {
            for (int i = 0; i < a.length(); i++) {
                if (a.charAt(i) >= 48 && a.charAt(i) <= 57) {
                    str += a.charAt(i);
                }
            }
        }
        return Integer.valueOf(str.toString());
    }

    //方法二：利用正则表达式匹配数字
    public static int chooseNumber2(String a) {
        String str="";
        String regEx="[^0-9]";
        Pattern p = Pattern.compile(regEx);
        Matcher m = p.matcher(a);
        str=m.replaceAll("").trim();
        return Integer.valueOf(str);
    }
}