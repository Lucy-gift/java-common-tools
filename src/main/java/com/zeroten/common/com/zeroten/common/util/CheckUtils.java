package com.zeroten.common.com.zeroten.common.util;

public class CheckUtils {


    //    1.public static boolean isAnyEmpty(String... strings)
//    String... strings 为可变参数，你可以认为它是 String[] strings。
//    如果 strings 中有任 意⼀个字符串为空，则返回 false，否则返回 true。
        public static boolean isAnyEmpty(String str1) {
            StringBuilder temp = new StringBuilder();
            char[] chars1 = str1.toCharArray();
            for (int i = 0; i < chars1.length; i++) {
                if (chars1[i] == ' ') {
                    return false;
                }
            }
            return true;
        }
//   2. public static boolean isEmpty(Object[] arr) 判断引⽤类型数组是否为空，
//    为空或 null 则返回 true，否则返回 false。
        public static boolean isEmpty(Object[] arr) {
//            for (int i = 0; i < arr.length(); i++){
//                if ((arr[i] == null) || (arr[i] == "")){
//                    return true;
//                }
            for (Object num : arr){
                if ((num == null)||(num == " ")){
                    return true;
                }
            }
        return false;
        }


    //    3.public static boolean equals(String str1, String str2) 判断 str1 字符串是否相等，
//    相等则返回 true，否则返回 false。当其中⼀个是 null 时返回 false。
    public static boolean equals(String str1, String str2){
            if ((str1.equals(str2))&&((str1 != null)||(str2 != null))){
                return true;
            }
            return false;
    }

//   4. public static boolean equals(Integer n1, Integer n2) 判断 n1 和 n2 的值是否相等，
//    相等则返回 true，否则返回 false。当其中⼀个是 null 时返回 false。
    public static boolean intEquals(Integer n1, Integer n2){
            if ((n1 == n2)&&((n1 != null)||(n2 != null))){
                return true;
            }
            return false;
    }
}
