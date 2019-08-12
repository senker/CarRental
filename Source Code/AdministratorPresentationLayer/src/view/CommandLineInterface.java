package view;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CommandLineInterface {
    private Context context;
    private BufferedReader reader;

    public CommandLineInterface() {
        this.context = new Context();
        this.reader = new BufferedReader(new InputStreamReader(System.in));
    }

    public void start() throws IOException {
        String input = "";

        while (!input.equals("exit")){
            String initText = this.context.init();
            System.out.println(initText);

            input = reader.readLine();

            String output = this.context.handle(input);
            System.out.println(output);
        }
    }
}
