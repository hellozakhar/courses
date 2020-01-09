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
        System.out.print('\n');
    }

    public static int[] mergeArrays(int[] a1, int[] a2) {
        int lenArr1 = a1.length, lenArr2 = a2.length;
        int[] tempArr = new int[lenArr1 + lenArr2];

        int i = 0, j = 0;
        while (i < lenArr1 || j < lenArr2)
            tempArr[i + j] = (i < lenArr1 && (j == lenArr2 || a1[i] < a2[j])) ? a1[i++] : a2[j++];

        return tempArr;
    }

    public static void main(String[] args) {
        int[] a1 = new int[] {21, 23, 24, 40, 75, 76, 78, 77, 900, 2100, 2200, 2300, 2400, 2500};
        int[] a2 = new int[] {22,25};
        int[] a3 = new int[] {};
        printIntArray(mergeArrays(a1,a2)); // => 21 22 23 24 25 40 75 76 78 77 900 2100 2200 2300 2400 2500
        printIntArray(mergeArrays(a2,a3)); // => 22 25
    }
}
