package ch05;

import java.util.Arrays;

public class ArrayEx02 {
    public static void main(String[] args) {
        int[] iArr1 = new int[10];
        int[] iArr2 = new int[10];
        int[] iArr3 = { 100, 95, 80, 70, 60};
        char[] chArr = { 'a', 'b', 'c', 'd'};

        for(int i = 0; i < iArr1.length; i++){
            iArr1[i] = i + 1;
        }

        for(int i = 0; i < iArr2.length; i++){
            iArr2[i] = (int) (Math.random() * 10) + 1;
        }

        for(int i = 0; i < iArr1.length; i++){
            System.out.printf(iArr1[i] + ", ");
        }

        System.out.println();
        System.out.println(Arrays.toString(iArr1));
        System.out.println(Arrays.toString(iArr2));
        System.out.println(iArr3);
        System.out.println(chArr);
    }
}
