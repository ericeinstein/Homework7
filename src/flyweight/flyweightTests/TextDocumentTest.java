package flyweight.flyweightTests;

import static org.junit.Assert.*;
import org.junit.Test;

import flyweight.TextDocument;

import java.io.File;

public class TextDocumentTest {
    @Test
    public void testSaveAndLoad() {
        String content = "HelloWorldCS5800";
        String filename = "testDocument.txt";

        // Create and save document
        TextDocument document = new TextDocument(content);
        document.save(filename);

        // Load document and check content
        TextDocument loadedDocument = TextDocument.load(filename);
        assertEquals(content, loadedDocument.getContent());

        // Delete the test file
        File file = new File(filename);
        assertTrue(file.delete());
    }
}
