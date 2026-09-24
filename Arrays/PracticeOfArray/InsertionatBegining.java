package PracticeOfArray;

public class InsertionatBegining {
    public static void main(String[] args) {
        
    
    int[] arr = {10,23,21,3,4,55,667,43,22,11}; // Declare an array of size 10

    int[] arr1 = new int[arr.length+1];
    int indexno=0;
    int value=100;
    arr1[indexno]=value;
    for(int i=0;i<arr.length;i++){
        arr1[i+1]=arr[i];
    }
    for(int num:arr1){
        System.out.println(num);
    }

    }
}
