package _CodingBatExcercises;

public class Strings1 {
    /**
     * Given a string of even length, return a string made of the middle two chars,
     * so the string "string" yields "ri". The string length will be at least 2.
     *
     *
     * middleTwo("string") → "ri"
     * middleTwo("code") → "od"
     * middleTwo("Practice") → "ct"
     */
    public static String middleTwo(String str) {
        int length = str.length();
        return str.substring(length/2-1, length/2+1);
    }

    /**
     * Given a string, return a version without the first 2 chars.
     * Except keep the first char if it is 'a' and keep the second char if it is 'b'.
     * The string may be any length. Harder than it looks.
     *
     * deFront("Hello") → "llo"
     * deFront("java") → "va"
     * deFront("away") → "aay"
     */

    public static String deFront(String str) {
        String finalString = "";
        if (str.length() == 0)
            return finalString;
        if (str.length() == 1) {
            if (str.equals("a"))
                return str;
            else
                return finalString;
        }
        if (str.length() > 2) {
            finalString = str.substring(2);
        }

            if (str.charAt(1) == 'b')
                finalString = "b" + finalString;
            if (str.charAt(0) == 'a')
                finalString = "a" + finalString;
        return finalString;
    }

    public static boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        boolean answer = false;
        if (!isAsleep) {
            if (isMorning) {
                if (isMom)
                    answer = true;
            } else answer = true;
        }
        return answer;
    }


        public static void main(String[] args) {
        System.out.println(answerCell(false, false, true));
        System.out.println(answerCell(true, false, false));
        System.out.println(answerCell(true, true, true));
        System.out.println(deFront("ob"));
        System.out.println(deFront("a"));
        System.out.println(deFront(""));

    }
}
