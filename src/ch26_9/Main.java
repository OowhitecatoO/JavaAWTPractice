package ch26_9;

import utils.WindowsCloser;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Frame frame = new Frame();
        frame.addWindowListener(new WindowsCloser());

        frame.setLayout(new GridLayout(5, 6));

        for (int i = 1; i < 31; i++)
            frame.add(new Button("" + i));

        frame.pack();
        frame.setVisible(true);
    }
}
