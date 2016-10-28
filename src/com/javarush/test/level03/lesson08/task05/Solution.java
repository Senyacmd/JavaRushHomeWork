package com.javarush.test.level03.lesson08.task05;

/* Чистая любовь
Ввести с клавиатуры три имени, вывести на экран надпись:
name1 + name2 + name3 = Чистая любовь, да-да!
Пример: Вася + Ева + Анжелика = Чистая любовь, да-да!
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        InputStream inputStream = System.in;//напишите тут ваш код
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String name1 = bufferedReader.readLine(); //читаем строку с клавиатуры
        String name2 = bufferedReader.readLine(); //читаем строку с клавиатуры
        String name3 = bufferedReader.readLine(); //читаем строку с клавиатуры

        System.out.println(name1 + " + " + name2 + " + " + name3  + " = Чистая любовь, да-да!");

    }
}