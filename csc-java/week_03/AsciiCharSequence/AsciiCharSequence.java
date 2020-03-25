/* 
Напишите класс AsciiCharSequence, реализующий компактное хранение последовательности 
ASCII-символов (их коды влезают в один байт) в массиве байт. 
По сравнению с классом String, хранящим каждый символ как char, 
AsciiCharSequence будет занимать в два раза меньше памяти.

Класс AsciiCharSequence должен:

реализовывать интерфейс java.lang.CharSequence;
иметь конструктор, принимающий массив байт;
определять методы length(), charAt(), subSequence() и toString()
Сигнатуры методов и ожидания по их поведению смотрите в описании интерфейса java.lang.CharSequence (JavaDoc или исходники).

В данном задании методам charAt() и subSequence() всегда будут подаваться 
корректные входные параметры, поэтому их проверкой и обработкой ошибок 
заниматься не нужно. Тем более мы еще не проходили исключения.
*/

package asciicharsequence;
import java.lang.CharSequence;

/**
 *
 * @author hellozakhar
 */
public class AsciiCharSequence implements CharSequence {
    private byte[] str;
    
    AsciiCharSequence(byte[] a) {
        str = a;
    }
    
    @Override
    public int length() {
        return str.length;
    }
    
    @Override
    public char charAt(int index) {
        return (char) str[index];
    }
    
    @Override
    public CharSequence subSequence(int start, int end) {
        byte[] substr = new byte[end - start];
        
        for (int i = start, j = 0; i < end; i++, j++) {
            substr[j] = str[i];
        }
        
        return new AsciiCharSequence(substr);
    }
    
    @Override
    public String toString() {
        return new String(str);
    }
    
    public static void main(String[] args) {
        byte[] example = {72, 101, 108, 108, 111, 33};
        AsciiCharSequence answer = new AsciiCharSequence(example);
        System.out.println("Последовательность - " + answer.toString());//Hello!
        System.out.println("Размер её - " + answer.length());//6
        System.out.println("Символ под № 1 - " + answer.charAt(1));//e
        System.out.println("Подпоследовательность - " + answer.subSequence(1, 5));//ello
                                        //проверка на нарушение инкапсуляции private поля
        System.out.println(answer.toString());//Hello!
        example[0] = 74;
        System.out.println(answer.toString());//Hello!
    }
    
}
