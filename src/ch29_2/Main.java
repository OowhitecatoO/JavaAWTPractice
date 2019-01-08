package ch29_2;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        frame.setSize(200, 160);

        Container container = frame.getContentPane();
        container.setLayout(new FlowLayout());

        addButton(container, "Yellow", Color.yellow);
        addButton(container, "Gray", Color.gray);
        addButton(container, "Black", Color.black);
        addButton(container, "Blue", Color.blue);
        addButton(container, "Green", Color.green);

        frame.setVisible(true);
    }

    private static void addButton(Container container, String label, Color color) {
        JButton b = new JButton(label);
        b.addActionListener(e -> container.setBackground(color));
        container.add(b);
    }
}
