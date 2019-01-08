package ch29_1;

import javax.swing.*;
import java.awt.*;
import java.io.File;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("ch29_2");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        frame.setSize(200, 160);

        Image icon = Toolkit.getDefaultToolkit().getImage("resource" + File.separator + "ch29_1" + File.separator + "CSlogo2.jpg");
        frame.setIconImage(icon);

        frame.setVisible(true);
    }
}
