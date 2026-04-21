import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp8 {

    // Create character pattern map
    public static Map<Character, String[]> createCharacterPatternMap() {

        Map<Character, String[]> map = new HashMap<>();

        map.put('O', new String[]{
                "  *****   ",
                " **   **  ",
                " **   **  ",
                " **   **  ",
                " **   **  ",
                " **   **  ",
                "  *****   "
        });

        map.put('P', new String[]{
                "  ******  ",
                " **    ** ",
                " **    ** ",
                " ******   ",
                " **       ",
                " **       ",
                " **       "
        });

        map.put('S', new String[]{
                "  ******  ",
                " **       ",
                " **       ",
                "  ******  ",
                "       ** ",
                " **    ** ",
                "  ******  "
        });

        return map;
    }

    // Render banner function
    public static void renderBanner(String message, Map<Character, String[]> map) {

        int height = map.get('O').length; // pattern height

        for (int row = 0; row < height; row++) {
            for (int i = 0; i < message.length(); i++) {

                char ch = message.charAt(i);
                String[] pattern = map.get(ch);

                if (pattern != null) {
                    System.out.print(pattern[row] + "   ");
                }
            }
            System.out.println();
        }
    }

    // Main method
    public static void main(String[] args) {

        Map<Character, String[]> map = createCharacterPatternMap();
        String message = "OOPS";

        renderBanner(message, map);
    }
}