package ch29_3;

import javax.swing.*;
import java.awt.*;
import java.io.File;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        frame.setLayout(new FlowLayout());
        frame.setSize(800, 500);

        JButton btn = new JButton("OK");
        btn.setIcon(new ImageIcon("resource" + File.separator + "ch29_3" + File.separator + "1.jpg"));
        btn.setRolloverIcon(new ImageIcon("resource" + File.separator + "ch29_3" + File.separator + "2.jpg"));
        btn.setPressedIcon(new ImageIcon("resource" + File.separator + "ch29_3" + File.separator + "3.jpg"));

        frame.add(btn);

        frame.setVisible(true);
    }
}
