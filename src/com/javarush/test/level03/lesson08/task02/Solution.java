package com.javarush.test.level03.lesson08.task02;

/* Зарплата через 5 лет
Ввести с клавиатуры отдельно Имя, число1, число2. Вывести надпись:
«Имя» получает «число1» через «число2» лет.
Пример: Коля получает 3000 через 5 лет.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String name = bufferedReader.readLine(); //читаем строку с клавиатуры

        String sAgeOne = bufferedReader.readLine();//читаем число1 с клавиатуры.
        int nAgeOne  = Integer.parseInt(sAgeOne); //преобразовываем строку в число.
        String sAgeTwo = bufferedReader.readLine();//читаем число2 с клавиатуры.
        int nAgeTwo  = Integer.parseInt(sAgeTwo); //преобразовываем строку в число.


        System.out.println(name + " получает " + nAgeOne + " через " + nAgeTwo + " лет."); //напишите тут ваш код

    }
}