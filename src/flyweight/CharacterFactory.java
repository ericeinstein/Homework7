package flyweight;

import java.util.HashMap;
import java.util.Map;

public class CharacterFactory {
    private static final Map<String, CharacterProperties> characterMap = new HashMap<>();

    public static CharacterProperties getCharacterProperties(String font, String color, int size) {
        String key = font + color + size;
        if (!characterMap.containsKey(key)) {
            characterMap.put(key, new CharacterProperties(font, color, size));
        }
        return characterMap.get(key);
    }
}
