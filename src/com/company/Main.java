package com.company;

import static com.company.FirstNonConsecutive.find;

public class Main {

    public static void main(String[] args) {
        int a[]= new int[5];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        a[3] = 5;
        a[4] = 3;
        FirstNonConsecutive firstNonConsecutive = new FirstNonConsecutive();
        find(a);
    }
}
