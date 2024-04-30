package flyweight;

public class Driver {
    public static void main(String[] args) {
        // Create different character properties
        CharacterProperties arial12Red = CharacterFactory.getCharacterProperties("Arial", "Red", 12);
        CharacterProperties calibri14Blue = CharacterFactory.getCharacterProperties("Calibri", "Blue", 14);
        CharacterProperties verdana16Black = CharacterFactory.getCharacterProperties("Verdana", "Black", 16);
        CharacterProperties arial12Blue = CharacterFactory.getCharacterProperties("Arial", "Blue", 12);

        // Create characters with different properties
        Character[] characters = {
                new Character('H', arial12Red),
                new Character('e', arial12Red),
                new Character('l', calibri14Blue),
                new Character('l', verdana16Black),
                new Character('o', arial12Blue),
                new Character('W', arial12Red),
                new Character('o', calibri14Blue),
                new Character('r', verdana16Black),
                new Character('l', arial12Blue),
                new Character('d', arial12Red),
                new Character('C', arial12Red),
                new Character('S', calibri14Blue),
                new Character('5', verdana16Black),
                new Character('8', arial12Blue),
                new Character('0', arial12Red),
        };

        System.out.println("");
        for (Character character : characters) {
            character.display();
        }

        // Create and save a document
        TextDocument document = new TextDocument("HelloWorldCS5800");
        document.save("document.txt");

        // Load and display the document
        TextDocument loadedDocument = TextDocument.load("document.txt");
        loadedDocument.display();
    }
}
