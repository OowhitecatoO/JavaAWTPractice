package ch26_6a;

import utils.WindowsCloser;

import java.awt.*;

public class Main {

    private static int next = 10;

    public static void main(String[] args) {
        Frame frame = new Frame();
        frame.addWindowListener(new WindowsCloser());
        frame.setLayout(null);

        Label label = new Label("歡迎進入DeepStone系統");
        label.setLocation(10, next(30));
        label.setSize(300, 50);
        label.setFont(new Font("Serief", Font.BOLD | Font.ITALIC, 18));
        frame.add(label);

        final TextField userName = new TextField();
        final Label accLabel = new Label("帳號 : ");
        accLabel.setBounds(10, next(), 40, 30);
        frame.add(accLabel);
        userName.setBounds(50, next(0), 100, 30);
        frame.add(userName);

        final TextField passwd = new TextField();
        final Label passwdLabel = new Label("密碼 : ");
        passwdLabel.setBounds(10, next(), 40, 40);
        frame.add(passwdLabel);
        passwd.setBounds(50, next(0), 100, 30);
        passwd.setEchoChar('*');
        frame.add(passwd);

        final Button yesBtn = new Button("確認");
        yesBtn.setBounds(10, next(), 70, 40);
        frame.add(yesBtn);

        final Button noBtn = new Button("取消");
        noBtn.setBounds(90, next(0), 70, 40);
        frame.add(noBtn);

        frame.setSize(300, next(10));
        frame.setVisible(true);
    }

    private static int next() {
        return next(50);
    }

    private static int next(int h) {
        next += h;
        return next;
    }
}
