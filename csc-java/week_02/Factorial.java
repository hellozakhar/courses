/*
    Реализуйте метод, вычисляющий факториал заданного натурального числа.
    Факториал N вычисляется как 1 * 2 * ... * N.
    Поскольку это очень быстро растущая функция, то даже для небольших N вместимости типов int и long
    очень скоро не хватит. Поэтому будем использовать BigInteger.
 */
import java.math.BigInteger;

public class Factorial {
    /**
     * Calculates factorial of given <code>value</code>.
     *
     * @param value positive number
     * @return factorial of <code>value</code>
     */
    public static BigInteger factorial(int value) {
        if ((BigInteger.valueOf(value) == BigInteger.ZERO) || (BigInteger.valueOf(value) == BigInteger.ONE)) {
            return BigInteger.ONE;
        }
        BigInteger result = BigInteger.ONE;

        for (int i = 0; i < value; i++) {
            result = result.multiply(BigInteger.valueOf(i+1));
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(factorial(3));  // => 6
        System.out.println(factorial(12)); // => 479001600
        System.out.println(factorial(30)); // => 265252859812191058636308480000000
    }
}