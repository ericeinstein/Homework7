package flyweight;

public class Character {
    private char character;
    private CharacterProperties properties;

    public Character(char character, CharacterProperties properties) {
        this.character = character;
        this.properties = properties;
    }

    public void display() {
        System.out.println("Character: " + character +
                ", Font: " + properties.getFont() +
                ", Color: " + properties.getColor() +
                ", Size: " + properties.getSize());
    }
}
