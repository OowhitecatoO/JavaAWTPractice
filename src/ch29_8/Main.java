package ch29_8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        frame.setSize(260, 220);

        Container container = frame.getContentPane();
        container.setLayout(null);

        JTextField msg = new JTextField();
        msg.setBounds(50, 30, 120, 20);

        JLabel out = new JLabel();
        out.setBounds(50, 80, 120, 20);

        JButton changed = new JButton("Changed");
        changed.setBounds(50, 140, 100, 30);
        changed.addActionListener(e -> out.setText(msg.getText()));

        container.add(msg);
        container.add(out);
        container.add(changed);

        frame.setVisible(true);
    }
}