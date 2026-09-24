package PracticeOfArray;

public class insertionInMid {
    public static void main(String[] args) {
        int[] arr={12,45,33,2,82,34,567,76,44,32,21,32};
        int indexno=5;
        int value=100;
        int[] arr1=new int[arr.length+1];
        for(int i=0;i<indexno;i++){
            arr1[i]=arr[i];
        }
        arr1[indexno]=value;
        for(int i=indexno;i<arr.length;i++){
            arr1[i+1]=arr[i];
        }
        int count=0;
        for(int num: arr1){
            System.out.println(num);
            count++;
        }
        System.out.println("count: " +  count);
    }
}
