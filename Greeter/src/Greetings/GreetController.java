package Greetings;

import java.io.IOException;

public class GreetController {
    private NameDAL model;
    private ConsoleView view;

    public GreetController(NameDAL model, ConsoleView view) {
        this.model = model;
        this.view = view;
    }


    public void doGreet() {
        try {
            if (model.hasName()) {
                view.showGreeting();
            } else {
                this.enterName();
                view.showGreeting();
            }
        } catch (IOException e) {
            view.showFileError();
        }
    }

    private void enterName() throws IOException {
        view.showEnterGreetingMessage();
        String newName = view.getName();
        try {
            model.setName(newName);
            view.showSuccess();
        } catch (IllegalArgumentException e) {
            view.showError();
            this.enterName(); //recurse
        }
    }
}
