/**
 * Реализуйте метод, сливающий два отсортированных по неубыванию массива чисел в один отсортированный
 * в том же порядке массив. Массивы могут быть любой длины, в том числе нулевой.
 * Предполагается, что вы реализуете алгоритм слияния, имеющий линейную сложность:
 * он будет идти по двум исходным массивам и сразу формировать отсортированный результирующий массив.
 * Так, чтобы сортировка полученного массива при помощи Arrays.sort() уже не требовалась.
 */

public class MergeArrays {
    /**
     * Merges two given sorted arrays into one
     *
     * @param a1 first sorted array
     * @param a2 second sorted array
     * @return new array containing all elements from a1 and a2, sorted
     */

    private static void printIntArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("");
    }

    public static int[] mergeArrays(int[] a1, int[] a2) {
        if (a1 == null)
            return a2;
        if (a2 == null)
            return a1;
        
        int[] temparr = new int[a1.length + a2.length];

        for (int i = 0, j = 0, k = 0; i < temparr.length ; i++) {
            if (j < a1.length && k < a2.length)
            {
                if(a1[j]<a2[k]) {
                    temparr[i] = a1[j];
                    j++;
                } else {
                    temparr[i] = a2[k];
                    k++;
                }
            } else {
                if (j<a1.length) {
                    temparr[i] = a1[j];
                    j++;
                }

                if (k<a2.length) {
                    temparr[i] = a2[k];
                    k++;
                }
            }
        }
        return temparr;
    }

    public static void main(String[] args) {
        int[] a1 = new int[] {21, 23, 24, 40, 75, 76, 78, 77, 900, 2100, 2200, 2300, 2400, 2500};
        int[] a2 = new int[] {22,25};
        int[] a3 = new int[] {};
        printIntArray(mergeArrays(a1,a2)); // => 21 22 23 24 25 40 75 76 78 77 900 2100 2200 2300 2400 2500
        printIntArray(mergeArrays(a2,a3)); // => 22 25
    }
}