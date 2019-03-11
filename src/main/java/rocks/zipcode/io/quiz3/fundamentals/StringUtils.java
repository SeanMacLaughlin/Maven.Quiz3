package rocks.zipcode.io.quiz3.fundamentals;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {
        String[] arr = str.toLowerCase().split(" ");
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < arr.length; i++) {
            sb.append(Character.toUpperCase(arr[i].charAt(indexToCapitalize)))
                    .append(arr[i].substring(1)).append(" ");
        }
        return sb.toString().trim();
    }



        //        Character.toUpperCase(str.charAt(indexToCapitalize));
//        return str;


    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {
        if (characterToCheckFor == baseString.charAt(indexOfString)) {
        return true;
    } else {
        return false;
    }
    }

    public static String[] getAllSubStrings(String string) {
        ArrayList<String> tracker = new ArrayList<>();

        for (int i = 0; i < string.length(); i++) {
            for (int j = i + 1; j <= string.length(); j++) {
                tracker.add(string.substring(i, j));
            }
        }
        String[] array = tracker.toArray(new String[tracker.size()]);
        return array;
    }


    public static Integer getNumberOfSubStrings(String input){
        ArrayList<String> tracker = new ArrayList<>();

        for (int i = 0; i < input.length(); i++) {
            for (int j = i + 1; j <= input.length(); j++) {
                tracker.add(input.substring(i, j));
            }
        }
        return tracker.size() - 1;
    }
}

