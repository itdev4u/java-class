package ch05;

public class ArrayEx03 {
    public static void main(String[] args) {
        int[] arr = new int[5];

        for(int i = 0; i < arr.length; i++){
            arr[i] = i + 1;
        }

        System.out.println("[변경전]");
        System.out.println("arr.length : " + arr.length);
        for(int i = 0; i < arr.length; i++){
            System.out.println("arr[" + i + "] : " + arr[i]);
        }

        int[] tmp = new int[arr.length * 2];
        for(int i = 0; i < arr.length; i++){
            tmp[i] = arr[i];
        }

        // tmp의 주소를 arr에 넣는다.(배열은 참조형)
        arr = tmp;

        System.out.println("[변경후]");
        System.out.println("arr.length : " + arr.length);
        for(int i = 0; i < arr.length; i++){
            System.out.println("arr[" + i + "] : " + arr[i]);
        }
        System.out.println("[tmp arr 비교]");
        tmp[0] = 10;
        System.out.println(arr[0]);

        System.out.println("tmp : " + tmp);
        System.out.println("arr : " + arr);
    }
}
