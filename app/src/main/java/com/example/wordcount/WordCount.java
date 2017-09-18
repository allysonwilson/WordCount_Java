package com.example.wordcount;

import static java.lang.System.in;

/**
 * Created by allysonwilson on 9/18/17.
 */

public class WordCount {
    int WordCount ;
    String string;

    public static int WordCount(String string)
         int wordCount = new WordCount


    {
        int count = 1;
        for (int i = 0, i <=string.length() -1; i++)
        {
            if (string.charAt(i) == ' ' && string.charAt(i + 1) != ' ')
            {
                count++;
            }
        }
        return count;
    }

    {   String wordCount = in.nextLine();
    }
}

