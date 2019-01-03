package ch27_1;

import utils.WindowsCloser;

import java.awt.*;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        Frame frame = new Frame();
        frame.addWindowListener(new WindowsCloser());

        frame.setLayout(new FlowLayout());

        ActionListener listener = e -> {
            if (e.getActionCommand().equalsIgnoreCase("White"))
                frame.setBackground(Color.white);
            else if (e.getActionCommand().equalsIgnoreCase("Black"))
                frame.setBackground(Color.black);
        };
        frame.add(getButtonWithListener("White", listener));
        frame.add(getButtonWithListener("Black", listener));
        frame.add(getButtonWithListener("Exit", e -> System.exit(0)));

        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    private static Button getButtonWithListener(String label, ActionListener listener) {
        Button b = new Button(label);
        b.setBackground(Color.gray);
        b.addActionListener(listener);
        return b;
    }

}
