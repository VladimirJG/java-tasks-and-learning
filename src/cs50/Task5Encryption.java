package cs50;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Шифр Цезаря
//Получить ключ
//Получить текст
//Зашифровать
//Вывести на экран зашифрованное сообщение
public class Task5Encryption {
    public static void main(String[] args) {
       // Scanner scanner = new Scanner("Abcd 3");
        String text = "A bC,d";
        int key = 3;
        newEncryption(text, key);


    }

    public static String newEncryption(String text, int key) {
        char[] lowArray = lowArrayCreate();
        char[] uppArray = uppArrayCreate();
        List<Character> anotherSymbol = anotherSymbolArrayCreate();
        String newCryptString = "";
        for (int i = 0; i < text.length(); i++) {
            char symbol = text.charAt(i);
            if (String.valueOf(symbol).equals(" ")){
                newCryptString+=" ";
            }
            if (String.valueOf(symbol).equals(String.valueOf(symbol).toUpperCase())) {
                for (int i1 = 0; i1 < uppArray.length; i1++) {
                    char uppSymbol = uppArray[i1];
                    if (symbol == uppSymbol) {
                        if (i1 + key >= uppArray.length) {
                            newCryptString += String.valueOf(uppArray[i1 + key - uppArray.length]);
                        } else {
                            newCryptString += String.valueOf(uppArray[i1 + key]);
                        }
                    }
                }
            } else if (String.valueOf(symbol).equals(String.valueOf(symbol).toLowerCase())) {
                for (int i1 = 0; i1 < lowArray.length; i1++) {
                    char lowSymbol = lowArray[i1];
                    if (symbol == lowSymbol) {
                        if (i1 + key >= lowArray.length) {
                            newCryptString += String.valueOf(lowArray[i1 + key - lowArray.length]);
                        } else {
                            newCryptString += String.valueOf(lowArray[i1 + key]);
                        }
                    }
                }

            } else {
              //  newCryptString+=String.valueOf(symbol);
                for (int i1 = 0; i1 < anotherSymbol.size(); i1++) {
                    char anotherSym = anotherSymbol.get(i1);
                    if (symbol == anotherSym) {
                        if (i1 + key >= anotherSymbol.size()) {
                            newCryptString += String.valueOf(anotherSymbol.get(i1 + key - anotherSymbol.size()));
                        } else {
                            newCryptString += String.valueOf(anotherSymbol.get(i1 + key));
                        }
                    }
                }
            }
        }
        System.out.println(newCryptString);
        return newCryptString;
    }

    public static char[] lowArrayCreate() {
        char[] array = new char[26];
        for (int i1 = 0; i1 < array.length; i1++) {
            int newChar = i1 + 97;
            array[i1] = (char) newChar;
        }
        return array;
    }

    public static char[] uppArrayCreate() {
        char[] array = new char[26];
        for (int i1 = 0; i1 < array.length; i1++) {
            int newChar = i1 + 65;
            array[i1] = (char) newChar;
        }
        return array;
    }

    public static List<Character> anotherSymbolArrayCreate() {
        char[] lowArray = lowArrayCreate();
        char[] uppArray = uppArrayCreate();
        List<Character> listOfChars = new ArrayList<>();
        for (int i = 0; i < 128; i++) {
            listOfChars.add((char) i);
        }
        /*for (int i = 0; i < listOfChars.size(); i++) {
            char listSymbol = listOfChars.get(i);
            for (int i1 = 0; i1 < lowArray.length; i1++) {
                char lowSymbol = lowArray[i1];
                if (listSymbol == lowSymbol) {
                    listOfChars.remove(listOfChars.get(i));
                }
            }
            for (int i1 = 0; i1 < uppArray.length; i1++) {
                char uppSymbol = uppArray[i1];
                if (listSymbol == uppSymbol) {
                    listOfChars.remove(listOfChars.get(i));
                }
            }
        }*/
        return listOfChars;
    }
}
