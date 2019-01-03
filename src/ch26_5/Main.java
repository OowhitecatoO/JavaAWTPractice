package ch26_5;

import utils.WindowsCloser;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
        Frame frame = new Frame();
        frame.addWindowListener(new WindowsCloser());
        frame.setLayout(null);
        frame.setSize(300, 200);

        Label label = new Label("自己的名字", Label.CENTER);
        label.setLocation(50, 80);
        label.setSize(150, 50);
        label.setFont(new Font("Serief", Font.BOLD | Font.ITALIC, 18));
        frame.add(label);

        final Button yesBtn = new Button("確認");
        yesBtn.setBounds(10, 150, 60, 40);
        frame.add(yesBtn);

        final Button noBtn = new Button("取消");
        noBtn.setBounds(100, 150, 60, 40);
        frame.add(noBtn);

        frame.setVisible(true);
    }
}
