package ch29_6;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        frame.setSize(200, 150);

        Container container = frame.getContentPane();
        container.setLayout(new FlowLayout());

        JLabel msg = new JLabel();
        ButtonGroup group = new ButtonGroup();
        for (String s : new String[]{"小學", "初中", "高中", "大學", "碩士", "博士"}) {
            JRadioButton b = new JRadioButton(s);
            group.add(b);
            b.addItemListener(e -> {
                msg.setVisible(false);
                msg.setText(s);
            });
            container.add(b);
        }

        JButton show = new JButton("OK");
        show.addActionListener(e -> msg.setVisible(true));

        container.add(msg);
        container.add(show);

        frame.setVisible(true);
    }
}