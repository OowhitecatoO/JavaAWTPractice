package ch26_1;

import utils.WindowsCloser;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Frame frame = new Frame("你的名字");
        frame.addWindowListener(new WindowsCloser());
        frame.setBackground(Color.pink);
        frame.setSize(600, 300);
        frame.setVisible(true);
    }
}
