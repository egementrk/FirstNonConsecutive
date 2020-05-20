package com.company;

public class FirstNonConsecutive {
    static Integer find(final int[] array) {

        for(int i=1;i<array.length;i++) {
            if(array[i] - 1 != array[i-1]) {
                System.out.println(array[i]);
                return array[i];
            }
        }
        System.out.println("null");
        return null;
    }
}
