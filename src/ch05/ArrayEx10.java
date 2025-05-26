package ch05;

public class ArrayEx10 {
    public static void main(String[] args) {
        int[] numArray = new int[10];

        for(int i = 0; i < numArray.length; i++) {
            System.out.print(numArray[i] = (int)(Math.random() * 10));
        }
        System.out.println();
        for(int i = 0; i < numArray.length-1; i++) {
            boolean changed = false;
            for(int j = 0; j < numArray.length-1-i; j++) {
                if(numArray[j] > numArray[j+1]) {
                    int temp = numArray[j];
                    numArray[j] = numArray[j+1];
                    numArray[j+1] = temp;
                    changed = true;
                }
            }
            if(!changed) break;
            System.out.print(i + ":");
            for(int k = 0; k < numArray.length; k++) {
                System.out.print(numArray[k]);
            }
            System.out.println();
        }
    }
}
