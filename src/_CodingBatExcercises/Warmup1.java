package _CodingBatExcercises;

public class Warmup1 {
    /**
     * Given a string, return a new string where "not " has been added to the front. However, if the string already
     * begins with "not", return the string unchanged. Note: use .equals() to compare 2 strings.
     * @param str
     * @return
     */
    public String notString(String str) {
        if (str.length() >=3 && str.substring(0, 3).equals("not"))
            return str;
        else
            return "not " + str;
    }

    public String missingChar(String str, int n) {
        return str.substring(0, n) + str.substring((n + 1));
    }

    /**
     * Given a string, return a new string where the first and last chars have been exchanged.
     * frontBack("code") → "eodc"
     * frontBack("a") → "a"
     * frontBack("ab") → "ba"
     */
    public static String frontBack(String str) {
        if (str.length() == 0) {
            return "";
        }
        else if (str.length() == 1) {
            return str;
        } else if (str.length() == 2) {
            return String.valueOf(str.charAt(1)) + String.valueOf(str.charAt(0));
        } else {
            String first = str.substring(0,1);
            String last = str.substring(str.length()-1);
            String mid = str.substring(1, str.length() - 1);
            return last + mid + first;
        }
        /**
         * and an elegant solution:
         *   if (str.length() <= 1) return str;
         *
         *   String mid = str.substring(1, str.length()-1);
         *
         *   // last + mid + first
         *   return str.charAt(str.length()-1) + mid + str.charAt(0);
         *
         */
    }


    public static String front3(String str) {
        /**
         * Given a string, we'll say that the front is the first 3 chars of the string.
         * If the string length is less than 3, the front is whatever is there.
         * Return a new string which is 3 copies of the front.
         *
         * front3("Java") → "JavJavJav"
         * front3("Chocolate") → "ChoChoCho"
         * front3("abc") → "abcabcabc"
         */
        String front;
        if (str.length() < 4) {
            front = str;
        }
        else{
            front = str.substring(0, 3);
        }
        return(front + front + front);
    }

    public static String backAround(String str) {
        /**
         * Given a string, take the last char and return a new string with the last char
         * added at the front and back, so "cat" yields "tcatt". The original string will be length 1 or more.
         *
         * backAround("cat") → "tcatt"
         * backAround("Hello") → "oHelloo"
         * backAround("a") → "aaa"
         */
        String last = str.substring(str.length() - 1);
            return (last + str + last);
    }

    public static boolean or35(int n) {
        /**
         * Return true if the given non-negative number is a multiple of 3 or a multiple of 5.
         *
         * or35(3) → true
         * or35(10) → true
         * or35(8) → false
         */

        return ((n % 3 == 0) || (n % 5) == 0);
    }

    public static String front22(String str) {
        /**
         * Given a string, take the first 2 chars and return the string with the 2 chars
         * added at both the front and back, so "kitten" yields"kikittenki".
         * If the string length is less than 2, use whatever chars are there.
         *
         * front22("kitten") → "kikittenki"
         * front22("Ha") → "HaHaHa"
         * front22("abc") → "ababcab"
         */

        String front2;
        if (str.length() < 3) {
            front2 = str;
        } else {
            front2 = str.substring(0, 2);
        }
        return front2 + str + front2;
    }

    public static boolean startHi(String str) {
        /**
         * Given a string, return true if the string starts with "hi" and false otherwise.
         *
         * startHi("hi there") → true
         * startHi("hi") → true
         * startHi("hello hi") → false
         */
        if (str.length() < 2) {
            return false;
        } else {
            if (str.substring(0, 2).equals("hi")) {
                return true;
            } else {
                return false;
            }
        }
    }

    public static boolean icyHot(int temp1, int temp2) {
        /**
         * Given two temperatures, return true if one is less than 0 and the other is greater than 100.
         *
         * icyHot(120, -1) → true
         * icyHot(-1, 120) → true
         * icyHot(2, 120) → false
         */

        return ((temp1 < 0 && temp2 > 100) || (temp1 > 100 && temp2 < 0));
    }

    public static boolean in1020(int a, int b) {
        /**
         * Given 2 int values, return true if either of them is in the range 10..20 inclusive.
         *
         * in1020(12, 99) → true
         * in1020(21, 12) → true
         * in1020(8, 99) → false
         */
        return ((a > 9 && a < 21) || (b > 9 && b < 21));
    }

//    private static boolean isTeen(int d) {
//        return (d > 12 && d < 20);
//

    public static boolean hasTeen(int a, int b, int c) {
        /**
         * We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 3 int values, return true if 1 or more of them are teen.
         *
         * hasTeen(13, 20, 10) → true
         * hasTeen(20, 19, 10) → true
         * hasTeen(20, 10, 13) → true
         */

        return ((a > 12 && a < 20) || (b > 12 && b < 20) || (c > 12 && c < 20));
    }

    public static boolean loneTeen(int a, int b) {
        /**
         *
         * We'll say that a number is "teen" if it is in the range 13..19 inclusive.
         * Given 2 int values, return true if one or the other is teen, but not both.
         *
         * loneTeen(13, 99) → true
         * loneTeen(21, 19) → true
         * loneTeen(13, 13) → false
         */
        return ((a > 12 && a < 20) && (b < 13 || b > 19) || (b > 12 && b < 20) && (a < 13 || a > 19));
    }

    public static String delDel(String str) {
        /**
         * Given a string, if the string "del" appears starting at index 1,
         * return a string where that "del" has been deleted.
         * Otherwise, return the string unchanged.
         *
         * delDel("adelbc") → "abc"
         * delDel("adelHello") → "aHello"
         * delDel("adedbc") → "adedbc"
         */

        /* хуёвое решение
        boolean delAt1;

        if (str.length() < 4)
            return str;
        else
            if (str.substring(1, 4).equals("del"))
                delAt1 = true;
            else
                delAt1 = false;

            if (str.length() == 4) {
                if (delAt1)
                    return String.valueOf(str.charAt(0));
                else
                    return str;
            }
            else {
                if (!delAt1)
                    return str;
                else
                    return (str.substring(0, 1) + str.substring(4));
            }
         */
        // хорошее решение:
        if (str.length()>=4 && str.substring(1, 4).equals("del")) {
            // First char + rest of string starting at 4
            return str.substring(0, 1) + str.substring(4);
        }
        // Otherwise return the original string.
        return str;

    }

    public static boolean mixStart(String str) {
        /**
         *
         * Return true if the given string begins with "mix", except the 'm' can be anything, so "pix", "9ix" .. all count.
         * mixStart("mix snacks") → true
         * mixStart("pix snacks") → true
         * mixStart("piz snacks") → false
         */
        System.out.println(str.substring(1,3));
        return (str.length() > 3 && str.substring(1, 3).equals("ix"));
    }

    public static String startOz(String str) {
        /**
         * Given a string, return a string made of the first 2 chars (if present),
         * however include first char only if it is 'o' and include the second only
         * if it is 'z', so "ozymandias" yields "oz".
         *
         * startOz("ozymandias") → "oz"
         * startOz("bzoo") → "z"
         * startOz("oxx") → "o"
         */
        String ret = "";
        if (str.length() > 1) {
            ret = str.substring(0, 2);
        }
        if (str.charAt(0) == 'o')
            ret = ret + "o";
        if (str.charAt(1) == 'z')
            ret = ret + "z";
        return ret;
    }

    /**
     * playground to check solutions
     */
    public static void main(String[] args) {
        System.out.println(startOz("ozymandias"));
        System.out.println(startOz("bzoo"));
        System.out.println(startOz("oxx"));
        System.out.println(startOz("abc"));

    }
}
