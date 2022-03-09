package com.sparta.wl;

public class PalindromeChecker {
    public static void main(String[] args) {
        String sentence = "The most familiar palindromes in English are character-unit palindromes. The characters read the same backward as forward. Some examples of palindromic words are redivider, deified, civic, radar, level, rotor, kayak, reviver, racecar, madam, and refer.";
        //String sentence = "The most familiar palindromes in English are character-unit palindromes. The characters read the same backward as forward. Some examples of palindromic words are deified, civic, radar, level, rotor, kayak, reviver, racecar, madam, and refer.";
        sentence = sentence.replaceAll("[-+.^:,]","");
        String[] words = sentence.split(" ");

        //Method 1: find the number of palindrome words first and set the length of the array, then put the palindrome to the array
        int numOfPalindrome = 0;
        for (int i = 0; i < words.length; i ++) {
            if (isPalindrome(words[i]))
                numOfPalindrome ++;
        }
        String[] palindromeWords = new String[numOfPalindrome];

        int n = 0;

        for (int i = 0; i < words.length; i ++) {
            if (isPalindrome(words[i])) {
                palindromeWords[n] = words[i];
                n ++;
            }
        }

        int index = 0;
        int elementLength = palindromeWords[0].length();
        for (int i = 1; i < palindromeWords.length; i++) {
            if(palindromeWords[i].length() > elementLength) {
                index = i;
                elementLength = palindromeWords[i].length();
            }
        }

        int maxLength = palindromeWords[index].length();

        for (int i = 0; i < palindromeWords.length; i++) {
            if(palindromeWords[i].length() == maxLength) {
                System.out.println(palindromeWords[i]);
            }
        }

        //Method 2: Set the array length = total number of words in sentence, then put the palindrome to the array
        /*String[] palindromeWords = new String[words.length];

        int n = 0;

        for (int i = 0; i < words.length; i ++) {
            if (isPalindrome(words[i])) {
                palindromeWords[n] = words[i];
                n ++;
            }
        }

        int index = 0;
        int elementLength = palindromeWords[0].length();
        for (int i = 1; i < palindromeWords.length; i++) {
            if (palindromeWords[i] != null) {
                if(palindromeWords[i].length() > elementLength) {
                    index = i;
                    elementLength = palindromeWords[i].length();
                }
            }
        }

        int maxLength = palindromeWords[index].length();


        for (int i = 0; i < palindromeWords.length; i++) {
            if (palindromeWords[i] != null) {
                if(palindromeWords[i].length() == maxLength) {
                    System.out.println(palindromeWords[i]);
                }
            }
        }*/

    }

    public static boolean isPalindrome(String word) {
        boolean b = false;
        char[] ch = new char[word.length()];

        for (int i = 0; i < word.length(); i ++) {
            ch[i] = word.charAt(word.length() - 1 - i);
        }

        String changedWord = String.valueOf(ch);

        if (word.equals(changedWord))
            b = true;
        else
            b= false;

        return b;
    }
}
