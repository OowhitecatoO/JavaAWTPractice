package ch26_4;

import utils.WindowsCloser;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
        Frame frame = new Frame("ch26_7");
        frame.addWindowListener(new WindowsCloser());
        frame.setLayout(null);
        frame.setSize(300, 200);
        frame.setBackground(Color.gray);
        Label label = new Label("就讀學校名稱", Label.CENTER);
        label.setForeground(Color.black);
        label.setBackground(Color.yellow);
        label.setLocation(50, 80);
        label.setSize(150, 50);
        label.setFont(new Font("Serief", Font.BOLD | Font.ITALIC, 18));
        frame.add(label);
        frame.setVisible(true);
    }
}
