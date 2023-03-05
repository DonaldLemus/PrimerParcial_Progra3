package com.progra2.tarea2.primer_parcial_progra_iii;

/**
 *
 * @author ASUS
 */
//Pregunta 3
public class BusquedaBinaria {

    // Returns index of x if it is present in arr[l..
    // r], else return -1
    int binarySearch(int arr[], int l, int n, int x) {
        if (n >= l) {
            int mid = l + (n - l) / 2;

            // If the element is present at the
            // middle itself
            if (arr[mid] == x) {
                return mid;
            }

            // If element is smaller than mid, then
            // it can only be present in left subarray
            if (arr[mid] > x) {
                return binarySearch(arr, l, mid - 1, x);
            }

            // Else the element can only be present
            // in right subarray
            return binarySearch(arr, mid + 1, n, x);
        }

        // We reach here when element is not present
        // in array
        return -1;
    }

    // Driver method to test above
    public static void main(String args[]) {
        BusquedaBinaria ob = new BusquedaBinaria();
        int arr[] = {2, 3, 4, 10, 40, 56,75};
        int n = arr.length;
        int x = 56;
        int result = ob.binarySearch(arr, 0, n - 1, x);
        if (result == -1) {
            System.out.println("Element not present");
        } else {
            System.out.println("Element found at index "
                    + result);
        }
    }
}
/* This code is contributed by Rajat Mishra */
