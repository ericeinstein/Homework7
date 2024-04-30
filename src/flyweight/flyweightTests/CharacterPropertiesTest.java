package flyweight.flyweightTests;

import static org.junit.Assert.*;
import org.junit.Test;

import flyweight.CharacterProperties;

public class CharacterPropertiesTest {
    @Test
    public void testCharacterProperties() {
        CharacterProperties properties = new CharacterProperties("Arial", "Red", 12);
        assertEquals("Arial", properties.getFont());
        assertEquals("Red", properties.getColor());
        assertEquals(12, properties.getSize());
    }
}
