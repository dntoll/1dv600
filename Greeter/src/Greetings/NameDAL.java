package Greetings;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class NameDAL {

    public boolean hasName() {
        try {
            getName();
            return true;
        } catch (IOException e) {
            return false;
        }
    }

    public String getName() throws IOException {
        return new String(Files.readAllBytes(Paths.get("./data")));
    }

    public void setName(String newName) throws IOException {
        if (newName.length() == 0)
            throw new IllegalArgumentException("String may not be empty");

        Files.write(Paths.get("./data"), newName.getBytes());
    }

    public void reset() throws IOException {

       Files.delete(Paths.get("./data"));
    }
}
