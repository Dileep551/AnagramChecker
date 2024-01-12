/*

Coding Exercise - Anagram Checker
You are given two strings str1 and str2.
Your task is to determine if str1 and str2 are anagrams of each other.

An anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
typically using all the original letters exactly once. For example, the word "listen"
is an anagram of "silent", "hello" and "olelh" are anagrams.


You need to implement the areAnagrams(String str1, String str2) method of the StringMagic class,
which returns true if str1 and str2 are anagrams of each other, and false otherwise.

Edge conditions:

The comparison should be case insensitive. That is, "Listen" and "Silent"
should be considered anagrams.

If either str1 or str2 is null, the method should return false.

The method should also return false if the lengths of str1 and str2 are not the same.

https://gale.udemy.com/course/java-programming-tutorial-for-beginners/learn/quiz/5948014#overview
*/


import java.util.Arrays;

public class StringMagic {


    public char[] getCharArray(String value) {

        return value.toLowerCase().toCharArray();
    }

    public boolean areAnagrams(String str1, String str2) {

        if (str1 == null || str2 == null) {
            return false;
        } else if (str1.length() != str2.length()) {

            return false;

        } else {


            char[] char1 = getCharArray(str1);
            char[] char2 = getCharArray(str2);

            Arrays.sort(char1);
            Arrays.sort(char2);

            return Arrays.equals(char1, char2);
        }
    }
}