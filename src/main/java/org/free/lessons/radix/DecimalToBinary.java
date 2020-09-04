package org.free.lessons.radix;

import java.util.Collections;
import java.util.List;

/**
 * Convert integers greater than zero to binary
 */
public class DecimalToBinary {
    static String toBinary(int n) {
        List<Integer> binary=getBinaryList(n);
        StringBuilder binaryString = new StringBuilder();
        for(int i=binary.size()-1;i>=0;i--) {
            binaryString.append(binary.get(i));
        }
        return binaryString.toString();
    }
    private static List<Integer> getBinaryList(int n) {
        if (n==0) {
            return Collections.singletonList(0);
        }else {
            List<Integer> list = new java.util.ArrayList<>(Collections.singletonList(n % 2));
            int remainder = n/2;
            if (remainder>=1)
                list.addAll(getBinaryList(remainder));
            return list;
        }
    }
}
