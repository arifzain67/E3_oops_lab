import java.io.*;
import java.util.*;
 
class BinarySearch {
   
    int binarySearch(int arr[], int x)
    {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (arr[m] == x)
                return m;
            if (arr[m] < x)
                l = m + 1;
            else
                r = m - 1;
       }
        return -1;
    }
 
    public static void main(String args[])
    { 	
    	int n;
    	System.out.println("Enter the size of the array:");
 	Scanner sc =new Scanner(System.in);
 	n=sc.nextInt();
 	int[] arr = new int[n];
 	System.out.println("Enter the array elements:"); 
 	for(int i=0;i<n;++i) 
 		arr[i]=sc.nextInt();
        BinarySearch ob = new BinarySearch();
        int x;
        System.out.println("Enter the element to be searched");
        x=sc.nextInt();
        int result = ob.binarySearch(arr, x);
        if (result == -1)
            System.out.println(
                "Element is not present in array");
        else
            System.out.println("Element is present at "
                               + "index " + result);
    }


	//iam adding a line here

    // added one more comment
}
