/**
 * @author Developer
 * @version 4.0
 * Use Case 4: Display "OOPS" banner using String array and enhanced for-loop
 */
public class OOPS_BANNER_APP {
    public static void main(String[] args) {
        // Store banner lines in a String array
        String[] bannerLines = new String[7];
        
        // Populate array using String.join()
        bannerLines[0] = String.join("", " ", "****", " ", "****", " ", "**  ", " ", "**", " ", "****");
        bannerLines[1] = String.join("", "*", "    ", "*", " ", "*", "    ", "*", " ", "* * ", "* ", "*");
        bannerLines[2] = String.join("", "*", "    ", "*", " ", "*", "    ", "*", " ", "* * ", "* ", "*");
        bannerLines[3] = String.join("", "*", "    ", "*", " ", "*", "    ", "*", " ", "*****", " ", "****");
        bannerLines[4] = String.join("", "*", "    ", "*", " ", "*", "    ", "*", " ", "*   ", "* ", "*");
        bannerLines[5] = String.join("", "*", "    ", "*", " ", "*", "    ", "*", " ", "*   ", "* ", "*");
        bannerLines[6] = String.join("", " ", "****", " ", " ", "*", "****", " ", "*   ", "* ", "****");
        
        // Display banner using enhanced for-loop
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}
