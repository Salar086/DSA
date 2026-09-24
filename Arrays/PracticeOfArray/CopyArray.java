package PracticeOfArray;

public class CopyArray {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50,60,70,80,90,100};
       System.out.println("original Array : ");
        for(int nu: arr){
            System.out.println(nu);
        }

        System.out.println("copied to another Array : ");
        int[] copiedArray = new int [arr.length];
        for(int i=0;i<arr.length;i++){
            copiedArray[i]=arr[i];
        }
        for(int num: copiedArray){
            System.out.println(num);
        }

    }
}
