package com.lx;

import java.security.MessageDigest;

public class Main {
    public static void main(String[] args) throws Exception {

        // 定义盐
        String slat = "java265.com";

        // 设置待加密字符串
        String str = "java";

        try {
            str = str + slat;
            MessageDigest m = MessageDigest.getInstance("MD5");
            m.update(str.getBytes("UTF8"));
            byte s[] = m.digest();
            String result = "";
            for (int i = 0; i < s.length; i++) {
                result += Integer.toHexString((0x000000FF & s[i]) | 0xFFFFFF00).substring(6);
            }

            System.out.println("加密后的字符串");
            System.out.println(result);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}