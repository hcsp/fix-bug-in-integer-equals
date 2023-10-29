package com.github.hcsp.datatype;
import java.util.HashMap;
public class Main {                                     //main类
    public static void main(String[] args) {            //程序入口
        // 这里应该输出两个true，实际输出的却是两个false
        // 请查找、思考并修复numberEquals方法中的问题
        System.out.println(numberEquals("1234", "+1234"));          //方法调用
        System.out.println(numberEquals("1234", "1234"));
    }

    // 判断两个字符串是否包含相等的数字
    // 例如a为"+1234"，b为"1234"，返回true
    public static boolean numberEquals(String a, String b) {//方法声明
        int m = Integer.valueOf(a);
        int n = Integer.valueOf(b);
        return m == n;
    }
}

