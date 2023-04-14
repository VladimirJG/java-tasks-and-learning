package cs50;

import java.util.Scanner;

//Шифр Цезаря
//Получить ключ
//Получить текст
//Зашифровать
//Вывести на экран зашифрованное сообщение
public class Task5Encryption {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        int key = scanner.nextInt();


    }
    public static String newEncryption(String text, int key){
        char[] lowArray = lowArrayCreate();
        char[] uppArray = uppArrayCreate();
        String newCryptString = "";
        for (int i = 0; i < text.length(); i++) {
            char symbol = text.charAt(i);
            if (String.valueOf(symbol).equals(String.valueOf(symbol).toUpperCase())){
                for (int i1 = 0; i1 < uppArray.length; i1++) {
                    char uppSymbol = uppArray[i1];
                    char encryptedSymbol = uppArray[i1+key];
                    if (symbol == uppSymbol){
                        newCryptString+=String.valueOf(encryptedSymbol);
                    }
                }
            } else if () {
                
            }
        }
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
}
