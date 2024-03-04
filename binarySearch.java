import java.util.*;

public class binarySearch{

    public static int binarySearchEle(int [] arr, int x)
    {
        int left = 0;
        int right = arr.length-1;

        while(left <= right)
        {
            int mid = (left + right)/2;
            if(arr[mid] == x)
            {
                return mid;
            }
            else if (x < arr[mid])
            {
                right = mid-1;
            }
            else
            {
                left = mid+1;
            }
        }
        return -1;
    }
public static void main(String[] args) {
    int [] arr;
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the size of an array: ");
    int n = sc.nextInt();
    arr = new int[n];

    System.out.println("Enter ele in array: ");
    for(int i=0; i<n; i++)
    {
        arr[i] = sc.nextInt();
    }

    System.out.println("Enter ele you want to search: ");
    int x = sc.nextInt();

    int result = binarySearchEle(arr,x);
    if (result != -1) {
        System.out.println("Element found in the array at index."+ binarySearchEle(arr, x) );
    } else {
        System.out.println("Element not found in the array.");
    }
}
}
