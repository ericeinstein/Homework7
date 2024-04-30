package flyweight;

import java.io.*;

public class TextDocument {
    private String content;

    public TextDocument(String content) {
        this.content = content;
    }

    public void save(String filename) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
            writer.println(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static TextDocument load(String filename) {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new TextDocument(content.toString());
    }

    public String getContent() {
        return content;
    }

    public void display() {
        System.out.println("Document Content:\n" + content);
    }
}
