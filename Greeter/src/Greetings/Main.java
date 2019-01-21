package Greetings;

public class Main {

    public static void main(String[] args) {

        NameDAL model = new NameDAL();
        ConsoleView view = new ConsoleView(model);
        GreetController controller = new GreetController(model, view);

        controller.doGreet();

    }
}
