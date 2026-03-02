/**
 * @author Rakesh
 * @version 8.0
 * Use Case 8: Display "OOPS" banner using HashMap for efficient character pattern lookup
 */
import java.util.HashMap;
import java.util.Map;

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
    
    // Static method to create and return the character pattern map
    private static Map<Character, CharacterPattern> createCharacterPatternMap() {
        Map<Character, CharacterPattern> patternMap = new HashMap<>();
        
        // Add pattern for 'O'
        patternMap.put('O', new CharacterPattern('O', new String[]{
            " ****",
            "*    *",
            "*    *",
            "*    *",
            "*    *",
            "*    *",
            " ****"
        }));
        
        // Add pattern for 'P'
        patternMap.put('P', new CharacterPattern('P', new String[]{
            " ****",
            "*    *",
            "*    *",
            " ****",
            "*    ",
            "*    ",
            "*    "
        }));
        
        // Add pattern for 'S'
        patternMap.put('S', new CharacterPattern('S', new String[]{
            " ****",
            "*    ",
            "*    ",
            " ****",
            "    *",
            "    *",
            " ****"
        }));
        
        return patternMap;
    }
    
    public static void main(String[] args) {
        // Get the character pattern map
        Map<Character, CharacterPattern> patternMap = createCharacterPatternMap();
        
        // Define the word to display
        String word = "OOPS";
        
        // Display the 7-line banner
        for (int line = 0; line < 7; line++) {
            StringBuilder bannerLine = new StringBuilder();
            for (int i = 0; i < word.length(); i++) {
                char currentChar = word.charAt(i);
                CharacterPattern charPattern = patternMap.get(currentChar);
                
                if (charPattern != null) {
                    bannerLine.append(charPattern.getPatternLine(line));
                    if (i < word.length() - 1) {
                        bannerLine.append(" ");
                    }
                }
            }
            System.out.println(bannerLine.toString());
        }
    }
}
