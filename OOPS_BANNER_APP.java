/**
 * @author Rakesh
 * @version 6.0
 * Use Case 6: Display "OOPS" banner using static helper methods for modularity
 */
public class OOPS_BANNER_APP {
    
    // Static helper method to generate the pattern for letter 'O'
    private static String getLetterO_Line(int lineNumber) {
        switch(lineNumber) {
            case 0: return " ****";
            case 1: return "*    *";
            case 2: return "*    *";
            case 3: return "*    *";
            case 4: return "*    *";
            case 5: return "*    *";
            case 6: return " ****";
            default: return "";
        }
    }
    
    // Static helper method to generate the pattern for letter 'P'
    private static String getLetterP_Line(int lineNumber) {
        switch(lineNumber) {
            case 0: return " ****";
            case 1: return "*    *";
            case 2: return "*    *";
            case 3: return " ****";
            case 4: return "*    ";
            case 5: return "*    ";
            case 6: return "*    ";
            default: return "";
        }
    }
    
    // Static helper method to generate the pattern for letter 'S'
    private static String getLetterS_Line(int lineNumber) {
        switch(lineNumber) {
            case 0: return " ****";
            case 1: return "*    ";
            case 2: return "*    ";
            case 3: return " ****";
            case 4: return "    *";
            case 5: return "    *";
            case 6: return " ****";
            default: return "";
        }
    }
    
    public static void main(String[] args) {
        // Display the 7-line banner
        for (int line = 0; line < 7; line++) {
            System.out.println(getLetterO_Line(line) + " " + 
                             getLetterO_Line(line) + " " + 
                             getLetterP_Line(line) + " " + 
                             getLetterS_Line(line));
        }
    }
}
