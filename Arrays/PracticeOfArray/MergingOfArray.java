package PracticeOfArray;

public class MergingOfArray {
    public static void main(String[] args) {
    int[] arr1={10,20,30,40,50};
    int[] arr2={60,70,80,90,100};

    int[] mergedArray = new int[arr1.length+arr2.length];
    for(int i=0;i<arr1.length;i++){
        mergedArray[i]= arr1[i];
    }
    for(int j=0;j<arr2.length;j++){
        mergedArray[arr1.length+j]=arr2[j];
    }

    System.out.println(" Merged Array : ");
    for(int num:mergedArray){
        System.out.println(num);
    }
}
}
