package com.github.hcsp.datatype;

public class Main {
    public static void main(String[] args) {
        // 这里应该输出两个true，实际输出的却是两个false
        // 请查找、思考并修复numberEquals方法中的问题
        System.out.println(numberEquals("1234", "+1234"));
        System.out.println(numberEquals("1234", "1234"));
    }

    // 判断两个字符串是否包含相等的数字
    // 例如a为"+1234"，b为"1234"，返回true
    public static boolean numberEquals(String a, String b) {
        return Integer.parseInt(a) == Integer.parseInt(b);
        /*Integer.vauleOf返回的是Integer x对象，其实指的是一个地址，+1234和1234指向的内存空间的地址是不同的，所以显示false，
        而Integer.parseInt返回的是int的整数类型，其在内存空间的区域绑定，所以可以直接进行比较。
         */
    }
}
