package flyweight.flyweightTests;

import static org.junit.Assert.*;
import org.junit.Test;

import flyweight.CharacterFactory;
import flyweight.CharacterProperties;

public class CharacterFactoryTest {
    @Test
    public void testGetCharacterProperties() {
        CharacterProperties properties1 = CharacterFactory.getCharacterProperties("Arial", "Red", 12);
        CharacterProperties properties2 = CharacterFactory.getCharacterProperties("Arial", "Red", 12);

        assertEquals(properties1, properties2);
    }
}
