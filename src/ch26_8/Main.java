package ch26_8;

import utils.WindowsCloser;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Frame frame = new Frame();
        frame.addWindowListener(new WindowsCloser());

        final FlowLayout flowL = new FlowLayout();
        frame.setLayout(flowL);

        frame.add(new Label("明天會更好"));
        frame.add(getYellowButton("確定"));
        frame.add(getYellowButton("取消"));

        frame.pack();
        frame.setVisible(true);
    }

    private static Button getYellowButton(String label) {
        Button b = new Button(label);
        b.setBackground(Color.yellow);
        return b;
    }

}
