package ch26_6b;

import utils.WindowsCloser;

import java.awt.*;

public class Main {

    private static int next = 10;

    public static void main(String[] args) {
        Frame frame = new Frame();
        frame.addWindowListener(new WindowsCloser());
        frame.setLayout(null);

        Label label = new Label("歡迎進入DeepStone軟體實力調查系統");
        label.setLocation(10, next(30));
        label.setSize(400, 50);
        label.setFont(new Font("Serief", Font.BOLD | Font.ITALIC, 18));
        frame.add(label);

        showText(frame, "請留個人資料", 100, 30);
        final TextField name = new TextField();
        showText(frame, "姓名 : ", 40, 30);
        name.setBounds(50, next(0), 100, 30);
        frame.add(name);

        showText(frame, "性別 : ", 40, 40);
        final CheckboxGroup p1 = new CheckboxGroup();
        final Checkbox man = new Checkbox("男性");
        man.setCheckboxGroup(p1);
        man.setBounds(55, next(), 100, 30);
        frame.add(man);
        final Checkbox woman = new Checkbox("女性");
        woman.setCheckboxGroup(p1);
        woman.setBounds(55, next(), 100, 30);
        frame.add(woman);

        showText(frame, "軟體能力分析資料:", 100, 30);
        for (String itemName : new String[]{"HTML", "CSS", "JS", "JQuery"}) {
            final Checkbox cb = new Checkbox(itemName);
            cb.setBounds(55, next(), 100, 30);
            frame.add(cb);
        }

        frame.setSize(400, next(10));
        frame.setVisible(true);
    }

    private static void showText(Frame frame, String message, int width, int hieght) {
        final Label lb1 = new Label(message);
        lb1.setBounds(10, next(), width, hieght);
        frame.add(lb1);
    }

    private static int next() {
        return next(40);
    }

    private static int next(int h) {
        next += h;
        return next;
    }
}
