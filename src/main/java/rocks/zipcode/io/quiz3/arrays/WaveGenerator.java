package rocks.zipcode.io.quiz3.arrays;

/**
 * @author leon on 09/12/2018.
 */
public class WaveGenerator {
    public static String[] wave(String str) {
        str.toLowerCase();
        String[] soPitted = str.split("");

        for(int i = 0; i < soPitted.length; i++) {
            soPitted[i].toUpperCase();
        }


        return soPitted;
    }
}
