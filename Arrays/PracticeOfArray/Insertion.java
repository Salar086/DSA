package PracticeOfArray;

public class Insertion {
    public static void main(String[] args) {
        int[] arr = {12,34,4,21,32,45,67,8,34,2,1};
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i - 1;
            while (j >= 0 && temp < arr[j]) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}