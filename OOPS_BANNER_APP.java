/**
 * @author Rakesh
 * @version 7.0
 * Use Case 7: Display "OOPS" banner using CharacterPattern static inner class
 */
public class OOPS_BANNER_APP {
    
    // Static inner class to encapsulate character data and patterns
    static class CharacterPattern {
        private char character;
        private String[] pattern;
        
        // Constructor
        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }
        
        // Getter for character
        public char getCharacter() {
            return character;
        }
        
        // Getter for pattern line
        public String getPatternLine(int lineNumber) {
            if (lineNumber >= 0 && lineNumber < pattern.length) {
                return pattern[lineNumber];
            }
            return "";
        }
    }
    
    // Static method to get the pattern for letter 'O'
    private static CharacterPattern getLetterO() {
        return new CharacterPattern('O', new String[]{
            " ****",
            "*    *",
            "*    *",
            "*    *",
            "*    *",
            "*    *",
            " ****"
        });
    }
    
    // Static method to get the pattern for letter 'P'
    private static CharacterPattern getLetterP() {
        return new CharacterPattern('P', new String[]{
            " ****",
            "*    *",
            "*    *",
            " ****",
            "*    ",
            "*    ",
            "*    "
        });
    }
    
    // Static method to get the pattern for letter 'S'
    private static CharacterPattern getLetterS() {
        return new CharacterPattern('S', new String[]{
            " ****",
            "*    ",
            "*    ",
            " ****",
            "    *",
            "    *",
            " ****"
        });
    }
    
    public static void main(String[] args) {
        // Create character patterns
        CharacterPattern[] characters = {
            getLetterO(),
            getLetterO(),
            getLetterP(),
            getLetterS()
        };
        
        // Display the 7-line banner
        for (int line = 0; line < 7; line++) {
            StringBuilder bannerLine = new StringBuilder();
            for (int i = 0; i < characters.length; i++) {
                bannerLine.append(characters[i].getPatternLine(line));
                if (i < characters.length - 1) {
                    bannerLine.append(" ");
                }
            }
            System.out.println(bannerLine.toString());
        }
    }
}
