import java.io.*;
import java.util.*;
  
class linear {
    public static int search(int arr[], int N, int x)
    {
        for (int i = 0; i < N; i++) {
            if (arr[i] == x)
                return i;
        }
        return -1;
    }
  
    
    public static void main(String args[])
    {
    	int n;
    	Scanner sc =new Scanner(System.in);
    	System.out.print("Enter the size of the array:");
    	n=sc.nextInt();
    	int[] arr=new int[n];
    	System.out.println("Enter the elements:");
    	for(int i=0;i<n;++i) arr[i]=sc.nextInt();
    	System.out.print("Enter the element to be searched:");
    	int x;
    	x=sc.nextInt();   
        int result = search(arr, arr.length, x);
        if (result == -1)
            System.out.print(
                "Element is not present in array");
        else
            System.out.println("Element is present at index :"
                             + result);
    }
}
