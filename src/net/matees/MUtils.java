package net.matees;
//class
public class MUtils {

    /**
     * Wrap a string with a statement, or a char, with ease.
     * @param wrap Both wraps
     * @param str  String to wrap
     * @return     All combined
     */
    public static String wrapStr(String wrap,
                                 String str) {
        return wrap + str + wrap;
    }

    /**
     * Wrap a string with two statements, or a char, with ease.
     * @param wrap1 First wrap
     * @param wrap2 Second wrap
     * @param str   String to wrap
     * @return All combined
     */
    public static String warpStrSep(String wrap1,
                                    String wrap2,
                                    String str) {
        return wrap1 + str + wrap2;
    }
}
