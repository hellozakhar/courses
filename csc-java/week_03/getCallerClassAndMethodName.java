/*
Реализуйте метод, позволяющий другим методам узнать, откуда их вызвали.

Метод getCallerClassAndMethodName() должен возвращать имя класса и метода, 
откуда вызван метод, вызвавший данный утилитный метод. 
Или null (нулевую ссылку, а не строку "null"), если метод, вызвавший 
getCallerClassAndMethodName() является точкой входа в программу, т.е. его никто не вызывал.

Это актуально, например, в библиотеках логирования, где для каждого сообщения 
в логе надо выводить класс и метод, откуда сообщение было залогировано.
*/

public static String getCallerClassAndMethodName()
{
    StackTraceElement[] elements = Thread.currentThread().getStackTrace();
    return elements.length < 4 ? null : elements[3].getClassName() + "#" + elements[3].getMethodName();
}