package ch26_7;

import utils.WindowsCloser;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Frame frame = new Frame();
        frame.addWindowListener(new WindowsCloser());

        final BorderLayout mgr = new BorderLayout();
        frame.setLayout(mgr);

        frame.add(getButton("東", Color.yellow), BorderLayout.EAST);
        frame.add(getButton("西", Color.blue), BorderLayout.WEST);
        frame.add(getButton("南", Color.red), BorderLayout.SOUTH);
        frame.add(getButton("北", Color.green), BorderLayout.NORTH);

        frame.setSize(400, 400);
        frame.setVisible(true);
    }

    private static Button getButton(String label, Color color) {
        Button b = new Button(label);
        b.setBackground(color);
        return b;
    }

}
