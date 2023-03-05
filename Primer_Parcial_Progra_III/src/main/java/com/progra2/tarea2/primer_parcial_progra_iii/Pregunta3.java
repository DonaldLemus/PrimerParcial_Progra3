package com.progra2.tarea2.primer_parcial_progra_iii;

import java.util.Arrays;

/**
 *
 * @author ASUS
 */
public class Pregunta3 {

    public static int[] removeDuplicates(int[] numbersWithDuplicates) {
        //No elimina duplicados solo los reemplaza por 0
        // Sorting array to bring duplicates together      
        Arrays.sort(numbersWithDuplicates);

        int[] result = new int[numbersWithDuplicates.length];
        int previous = numbersWithDuplicates[0];
        result[0] = previous;

        for (int i = 1; i < numbersWithDuplicates.length; i++) {
            int ch = numbersWithDuplicates[i];

            if (previous != ch) {
                result[i] = ch;
            }
            previous = ch;
        }
        return result;
    }

    public static int[] RemoveDuplicates(int[] arr) {

        // Sorting array to bring duplicates together      
        Arrays.sort(arr);

        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i == 0 || arr[i] != arr[i - 1]) {
                arr[k++] = arr[i];
            }

        }
        //k es la nueva longitud del arreglo
        return Arrays.copyOf(arr, k);
    }

    public static void main(String args[]) {

        int[][] test = new int[][]{
            {1, 2, 1, 2, 3, 4, 5}}; //1 1 2 2 3 4 5

        for (int[] input : test) {
            System.out.println("Array with Duplicates       : " + Arrays.toString(input));
            System.out.println("After removing duplicates   : " + Arrays.toString(removeDuplicates(input)));
            System.out.println("After removing duplicates   : " + Arrays.toString(RemoveDuplicates(input)));

        }

    }
}
