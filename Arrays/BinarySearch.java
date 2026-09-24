public class BinarySearch {
    public static void main(String[] args){
        int[] arr = {10, 20, 30, 40, 50, 60,70, 80, 90, 100};
        int elementToSearch = 30; // Element to search for
        int li=0; // Lower index
        int hi=arr.length-1; // Higher index
        boolean found = false; // Flag to indicate if the element is found
        
        while(li<=hi){
        int mid = (li+hi)/2; // Calculate the middle index
        if(arr[mid] == elementToSearch){
            System.out.println("Element found at mid index: " + mid);
            found = true;
            break; 
        }

        else if (elementToSearch > arr[mid]) {
            li = mid + 1; // change lower index to the index after mid to search in the right half
        }
        else {
            hi = mid - 1; // change higher index to the index before mid to search in the left half
        }
    }
    if(found == false){
        System.out.println("Element not found in the array.");
    }
}
}