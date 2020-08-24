package com.practice.controlStatements;

public class IfElseIfExample {
    public static String test(String s) {
        char[] c = s.toCharArray();
        for (int i = 0; i < c.length - 1; i++) {
            if (c.equals('k')) {
                return "contain";
            } else {
                return "not contain";
            }
        }
        return "not contain";

    }
         /*
        if (s.contains("s") ) {
            System.out.println("found");
        }else
            System.out.println("not found");

    }*/
    public static void main(String[] args) {
        test("kallempudi");
    }
}
