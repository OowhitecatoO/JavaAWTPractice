package ch27_6;

import utils.WindowsCloser;

import java.awt.*;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class Main {

    private static Label output = new Label();
    private static TextArea input = new TextArea();

    public static void main(String[] args) {
        Frame frame = new Frame();
        frame.addWindowListener(new WindowsCloser());

        frame.setLayout(null);
        frame.setSize(360, 190);

        output.setBounds(30, 50, 200, 20);
        input.setBounds(30, 80, 240, 60);

        frame.add(output);
        frame.add(input);

        addButton(frame, 30, 150, 60, 20, "開始統計", e -> count());

        count();
        frame.setVisible(true);
    }

    private static void count() {
        output.setText("字數 : " + Arrays.stream(input.getText().split("\\s")).filter(s -> !s.isEmpty()).count()
                + " 字元數 : " + input.getText().length());
    }

    private static void addButton(Frame frame, int x, int y, int width, int height, String label, ActionListener listener) {
        Button btn = new Button(label);
        if (listener != null)
            btn.addActionListener(listener);
        btn.setBounds(x, y, width, height);
        frame.add(btn);
    }
}
