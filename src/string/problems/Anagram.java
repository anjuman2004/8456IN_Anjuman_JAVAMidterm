package string.problems;

import java.util.Arrays;

public class Anagram {

    /*
    Write a Java Program to check if two Strings are Anagrams.
        Two String are called Anagrams when both Strings use the same characters but in different order.
        Example: "CAT" and "ACT", "ARMY" and "MARY", "FART" and "RAFT"
    */

    public static void main(String[] args) {
        anagram("Race", "care");
        anagram("CAT", "ACT");
        anagram("ARMY", "MARY");
        anagram("FART", "RAFT");
        anagram("ONE", "TWO");
    }


        public static void anagram(String str1, String str2) {

            str1 = str1.toLowerCase();
            str2 = str2.toLowerCase();

            // check if length is same
            if(str1.length() == str2.length()) {

                // convert strings to char array
                char[] charArray1 = str1.toCharArray();
                char[] charArray2 = str2.toCharArray();

                // sort the char array
                Arrays.sort(charArray1);
                Arrays.sort(charArray2);

                // if sorted char arrays are same
                // then the string is anagram
                boolean result = Arrays.equals(charArray1, charArray2);

                if(result) {
                    System.out.println(str1 + " and " + str2 + " are anagram.");
                }
                else {
                    System.out.println(str1 + " and " + str2 + " are not anagram.");
                }
            }
            else {
                System.out.println(str1 + " and " + str2 + " are not anagram.");
            }
        }






}
