package _CodingBatExcercises;

public class Sring2 {
    /**
     * Given a string, return a string where for every char in the original, there are two chars.
     * @param str - any non-empty string
     * @return - a string where every letter from the original string repeats twice:
     * doubleChar("The") → "TThhee"
     * doubleChar("AAbb") → "AAAAbbbb"
     * doubleChar("Hi-There") → "HHii--TThheerree"
     */
    public static String doubleChar (String str) {
        String out = "";
        for (int i = 0; i < str.length(); i++) {
            out = out + Character.toString(str.charAt(i)) + Character.toString(str.charAt(i));
        }
        return out;
    }

    /**
     * Given a string and an int n, return a string made of n repetitions of
     * the last n characters of the string. You may assume that n is
     * between 0 and the length of the string, inclusive.
     * @param str any string longer than n characters
     * @param n positive integer
     * @return
     */

    public static String repeatEnd(String str, int n) {
        String out = "";
        if (n > 0) {
            String end = str.substring(str.length() - n);
            for (int i = 0; i < n; i++) {
                out += end;
            }
        }
        return out;
    }

    /**
     * Return the number of times that the string "code" appears anywhere in the given string,
     * except we'll accept any letter for the 'd', so "cope" and "cooe" count.
     *
     * countCode("aaacodebbb") → 1
     * countCode("codexxcode") → 2
     * countCode("cozexxcope") → 2
     * @param str  - any string
     * @return how many times substring 'coXe' appears in str, where 'X' can be any symbol
     */
    public static int countCode(String str) {
        int count = 0;
        if (str.length() > 3) {
            for (int i = 0; i < (str.length() - 3); i++) {
                if (str.charAt(i) == 'c' && str.charAt(i + 1) == 'o' && str.charAt(i + 3) == 'e') {
                    count++;
                }
            }
        }
        return count;
    }

    /**
     * PLAYGROUND
     */

    public static void main(String[] args) {
        System.out.println(countCode("aaacodebbb"));
        System.out.println(countCode("codexxcode"));
        System.out.println(countCode("cozexxcope"));
    }

}
