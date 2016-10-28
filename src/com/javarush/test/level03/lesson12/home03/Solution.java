package com.javarush.test.level03.lesson12.home03;

/* Я буду зарабатывать $50 в час
Ввести с клавиатуры число n.
Вывести на экран надпись «Я буду зарабатывать $n в час».
Пример:
Я буду зарабатывать $50 в час
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String sN = bufferedReader.readLine();//читаем число1 с клавиатуры. //напишите тут ваш код
        int nN = Integer.parseInt(sN); //преобразовываем строку в число.

        System.out.println("Я буду зарабатывать $" + nN + " в час");
    }
}