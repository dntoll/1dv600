package Greetings;

import java.io.IOException;
import java.util.Scanner;

public class ConsoleView {

    private NameDAL model;
    private Scanner scanIn;

    public ConsoleView(NameDAL model) {
        scanIn = new Scanner(System.in);
        this.model = model;
    }

    public void showGreeting() throws IOException {
        System.out.println("Welcome " + model.getName());
    }

    public void showEnterGreetingMessage() {
        System.out.println("Fill in a username:");
    }

    public void showSuccess() throws IOException {
        System.out.println("Name " + model.getName() + " Stored");
    }

    public void showError() {
        System.out.println("A username must have at least one character, try again.");
    }

    public String getName() {
        String inputString = scanIn.nextLine();
        return inputString;
    }


    public void showFileError() {
        System.out.println("Unable to write to file.");
    }
}
