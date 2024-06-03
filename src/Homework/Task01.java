package Homework;


import java.util.Scanner;

public class Task01 {
    //Пользователь вводит строку через консоль,разделить строку на слова, а также:
//1. Из каждого слова возьмите первую буквуи составьте из них строку, в которой содержалисьбы все первые буквы слов
//2. Напишите на экран размер получившейся строки,а также первую и последнюю буквы слова
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String input = scanner.nextLine();

        String[] words = input.split(" ");
        StringBuilder firstLetters = new StringBuilder();

        for (String word : words) {
            firstLetters.append(word.charAt(0));
        }

        System.out.println("Resulting line: " + firstLetters.toString());
        System.out.println("Size of the line: " + firstLetters.length());
        System.out.println("First letter: " + firstLetters.charAt(0));
        System.out.println("Last letter: " + firstLetters.charAt(firstLetters.length() - 1));
    }
}