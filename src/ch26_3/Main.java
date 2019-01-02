package ch26_3;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
        Frame frame = new Frame("我的作業");
        frame.setSize(600, 400);
        Font font = new Font("標楷體", Font.PLAIN, 18);
        Label label = new Label("你自己的名字", Label.CENTER);
        label.setFont(font);
        frame.add(label);
        frame.setVisible(true);
    }
}
