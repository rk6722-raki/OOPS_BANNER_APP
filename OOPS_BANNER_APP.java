/**
 * @author Developer
 * @version 3.0
 * Use Case 3: Display "OOPS" banner using String.join() for memory efficiency
 */
public class OOPS_BANNER_APP {
    public static void main(String[] args) {
        // Line 1 - Using String.join() for efficient string concatenation
        System.out.println(String.join("", " ", "****", " ", "****", " ", "**  ", " ", "**", " ", "****"));
        // Line 2
        System.out.println(String.join("", "*", "    ", "*", " ", "*", "    ", "*", " ", "* * ", "* ", "*"));
        // Line 3
        System.out.println(String.join("", "*", "    ", "*", " ", "*", "    ", "*", " ", "* * ", "* ", "*"));
        // Line 4
        System.out.println(String.join("", "*", "    ", "*", " ", "*", "    ", "*", " ", "*****", " ", "****"));
        // Line 5
        System.out.println(String.join("", "*", "    ", "*", " ", "*", "    ", "*", " ", "*   ", "* ", "*"));
        // Line 6
        System.out.println(String.join("", "*", "    ", "*", " ", "*", "    ", "*", " ", "*   ", "* ", "*"));
        // Line 7
        System.out.println(String.join("", " ", "****", " ", " ", "*", "****", " ", "*   ", "* ", "****"));
    }
}
