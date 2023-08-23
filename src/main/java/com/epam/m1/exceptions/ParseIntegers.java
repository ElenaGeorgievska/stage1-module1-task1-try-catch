package com.epam.m1.exceptions;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Complete the code, parse integers, calculate the sum of numbers in the WORDS, join strings with
 * space delimiter
 */
public class ParseIntegers {

    private static final List<String> WORDS =
            Arrays.asList(
                    "JDK 17 has released on 14 September 2021 with 10 new features, 2 feature removals and 2 feature deprecations."
                            .split(" "));

    public static void main(String[] args) {
        Iterator<String> words = WORDS.iterator();
        int sum = 0;
        String justWords = "";
        while (words.hasNext()) {
            String next = words.next();

            //join strings with space delimeters
            justWords = justWords.trim() + " " + next;
            justWords = justWords.replaceAll("\\d", "");

            //parse integers and calculate sum of numbers in the WORDS
           try{
                int number = Integer.parseInt(next);
                sum+= number;
           }catch (NumberFormatException nfe){   //for parsing string to integer
                nfe.getStackTrace();
            }catch (ArithmeticException ae){   //for sum operation
                ae.getStackTrace();
            }catch (NullPointerException e) {
               e.getStackTrace();               //it is for words list
           }
        }
        System.out.println("Sum is " + sum);
        System.out.println("Just words: " + justWords);
    }
}

