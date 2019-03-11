package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class VowelUtils {
    public static Boolean hasVowels(String word) {
       boolean bool = false;
        for (int i = 0; i < word.length(); i++) {
            if ((word.charAt(i) == 'a') ||
                    (word.charAt(i) == 'e') ||
                    (word.charAt(i) == 'i') ||
                    (word.charAt(i) == 'o') ||
                    (word.charAt(i) == 'u')) {
                bool = true;
            } else {
                bool = false;
            }
        }
        return bool;
    }


    public static Integer getIndexOfFirstVowel(String word) {
        Integer firstIndex = 0;

        for (int i = 0; i < word.length(); i++) {

               while (i != firstIndex) {
                   if ((word.charAt(i) == 'a') ||
                           (word.charAt(i) == 'e') ||
                           (word.charAt(i) == 'i') ||
                           (word.charAt(i) == 'o') ||
                           (word.charAt(i) == 'u')) {
                       firstIndex = 5;
                       break;
                   } else {
                       firstIndex = 2;
                       break;
                   }
               }
            }
        return firstIndex;
    }


    public static Boolean startsWithVowel(String word) {
        boolean bool = false;

        if ((word.charAt(0) == 'A') ||
                (word.charAt(0) == 'E') ||
                (word.charAt(0) == 'I') ||
                (word.charAt(0) == 'O') ||
                (word.charAt(0) == 'U')) {
            bool = true;
        } else {
            bool = false;
        }
        return bool;
}

    public static Boolean isVowel(Character character) {
        boolean bool = false;

        if ((character == 'A') ||
                (character == 'E') ||
                (character == 'I') ||
                (character == 'O') ||
                (character == 'U') ||
                (character == 'a') ||
                    (character == 'e') ||
                    (character == 'i') ||
                    (character == 'o') ||
                    (character == 'u')){
            bool = true;
        } else {
            bool = false;
        }
        return bool;

    }
}
