package ch27_4;

import utils.WindowsCloser;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
        Frame frame = new Frame();
        frame.addWindowListener(new WindowsCloser());

        frame.setLayout(new GridLayout(1, 2));
        frame.setSize(200, 140);

        TextArea output = new TextArea("", 10, 40);
        output.setEditable(false);
        output.setBackground(Color.yellow);

        TextArea input = new TextArea("", 10, 40);
        input.addTextListener(e -> output.setText(input.getText()));

        frame.add(input);
        frame.add(output);

        frame.setVisible(true);
    }
}
