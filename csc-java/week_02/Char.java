// 2.2 Реализуйте метод, который возвращает букву, стоящую в таблице UNICODE
//     после символа "\" (обратный слэш) на расстоянии a.

public class Char {
    public static char charExpression(int a) {
        return (char) ('\\' + a);
    }

    public static void main(String[] args) {
        System.out.println(charExpression(32));
        System.out.println(charExpression(29));
    }
}