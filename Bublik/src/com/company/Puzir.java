package com.company;

public class Puzir {
    int[] intArr = {16, 23, 14, 7, 21, 20, 6, 1, 17, 13, 12, 9, 3, 19,2};

    int[] sort() {
        int k;
        for (int i = 0; i < intArr.length - 1; i++) {
            if (intArr[i] < intArr[i + 1]) {
                continue;
            }
            k = intArr[i];
            intArr[i] = intArr[i + 1];
            intArr[i + 1] = k;
            sort();
        }
        return intArr;
    }
}
