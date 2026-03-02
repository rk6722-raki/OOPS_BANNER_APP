/**
 * @author Developer
 * @version 5.0
 * Use Case 5: Display "OOPS" banner using inline array initialization with String.join()
 */
public class OOPS_BANNER_APP {
    public static void main(String[] args) {
        // Declare and initialize array in a single statement with String.join() calls
        String[] bannerLines = {
            String.join("", " ", "****", " ", "****", " ", "**  ", " ", "**", " ", "****"),
            String.join("", "*", "    ", "*", " ", "*", "    ", "*", " ", "* * ", "* ", "*"),
            String.join("", "*", "    ", "*", " ", "*", "    ", "*", " ", "* * ", "* ", "*"),
            String.join("", "*", "    ", "*", " ", "*", "    ", "*", " ", "*****", " ", "****"),
            String.join("", "*", "    ", "*", " ", "*", "    ", "*", " ", "*   ", "* ", "*"),
            String.join("", "*", "    ", "*", " ", "*", "    ", "*", " ", "*   ", "* ", "*"),
            String.join("", " ", "****", " ", " ", "*", "****", " ", "*   ", "* ", "****")
        };
        
        // Display banner using enhanced for-loop
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}
