package com.example.project;

/*
1.Manually test first in the Runner class.
2.Run ./gradlew test to run automated tests.
3.Once you have completed the challenges, push to your repository.
4.Submit at turninterminal.netlify.app
*/

public class NestedLoops {
               /*
return the string below for given height=5
*
**
***
****
*****  
           */
public static String starStaircase(int height) {
    String result = "";

    for (int i = 1; i <= height; i++) {
        for (int j = 1; j <= i; j++) {
            result += "*";
        }
       if (i < height) result += "\n";
    }

    return result;
}

          /*
return the string below for given height=5
*****
****
***
**
*
           */

public static String starStaircaseReverse(int height){
    String result = "";
for (int i = height; i > 0; i--) {
    for (int j = i; j >= 1; j--) {
        result += "*";
    }
   if (i > 1) result += "\n";
}
return result;
}
            /*

width=5 height=5
*****
*   *
*   *
*   *
*****
          */
public static String emptyBox(int width, int height) {
    String result = "";
    if (width <= 1 || height <= 1) {
        return result;
    }
    for (int i = 1; i <= height; i++) {
        for(int j = 1; j <= width; j++) {
            if (i == 1 || i == height || j == 1 || j == width) {
                result += "*";
            } else {
                result += " ";
            }
        }
       if (i < height) result += "\n";
    }
    return result;
}
                    /*
return the string below for word="HELLO" rows=5                    
HELLO
ELLOH
LLOHE
LOHEL
OHELL

  i will provide a hint for this one if you get stuck.. use modulo
                */
    public static String repeatRectangle(String word, int rows){
        String result = "";
        int len = word.length();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < len; j++) {
                result += word.charAt((i + j) % len);
            }
          if (i < rows - 1)  result += "\n";
        }
        return result;
    }
}