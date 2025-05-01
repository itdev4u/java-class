package ch09;

import java.util.Arrays;

public class CloneEx2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] arrClone = arr.clone();
        arrClone[0] = 6;
        System.out.println("arr : " + Arrays.toString(arr));
        System.out.println("arrClone : " + Arrays.toString(arrClone));
        arr[0] = 0;
        System.out.println("arr : " + Arrays.toString(arr));
        System.out.println("arrClone : " + Arrays.toString(arrClone));
    }
}
