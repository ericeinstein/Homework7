package flyweight.flyweightTests;

import static org.junit.Assert.*;
import org.junit.Test;

import flyweight.Character;
import flyweight.CharacterProperties;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class CharacterTest {
    @Test
    public void testCharacterDisplay() {
        CharacterProperties properties = new CharacterProperties("Arial", "Red", 12);
        Character character = new Character('A', properties);
        String expected = "Character: A, Font: Arial, Color: Red, Size: 12";
        assertEquals(expected, getDisplayOutput(character));
    }

    private String getDisplayOutput(Character character) {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        character.display();
        System.setOut(System.out);
        return outputStream.toString().trim();
    }
}
