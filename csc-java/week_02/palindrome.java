/**
 * Реализуйте метод, проверяющий, является ли заданная строка палиндромом.
 * Палиндромом называется строка, которая читается одинаково слева направо и справа налево (в том числе пустая).
 * При определении "палиндромности" строки должны учитываться только буквы и цифры.
 * А пробелы, знаки препинания, а также регистр символов должны игнорироваться.
 * Гарантируется, что в метод попадают только строки, состоящие из символов ASCII
 * (цифры, латинские буквы, знаки препинания).
 * Т.е. русских, китайских и прочих экзотических символов в строке не будет.
 *
 * Checks if given <code>text</code> is a palindrome.
 *
 * @param text any string
 * @return <code>true</code> when <code>text</code> is a palindrome, <code>false</code> otherwise
 */

public class palindrome {
    public static boolean isPalindrome(String text) {
        if (text == "") { return true; } // Пустая строка - палиндром
        else {
            String input = text.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
            String inputreverse = new StringBuffer(input).reverse().toString();
            return input.equals(inputreverse);
        }
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(""));                // => True
        System.out.println(isPalindrome("aBbA"));            // => True
        System.out.println(isPalindrome("5ABba_#@!$%##5@")); // => True
        System.out.println(isPalindrome("Github!"));         // => False
    }
}