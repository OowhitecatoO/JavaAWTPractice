package ch27_3;

import utils.WindowsCloser;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;

public class Main {


    public static void main(String[] args) {
        Frame frame = new Frame();
        frame.addWindowListener(new WindowsCloser());

        frame.setLayout(new FlowLayout(FlowLayout.LEFT));
        frame.setSize(200, 160);

        frame.add(new Label("請選擇你最愛的程式語言"));

        final String msg = "你最愛的是 : ";
        Label showChose = new Label(msg + "             Java");
        showChose.setBackground(Color.yellow);

        CheckboxGroup cbgroup = new CheckboxGroup();
        for (String pl : new String[]{"Python", "C++", "Java"})
            frame.add(getCheckBox(pl, true, cbgroup, e -> showChose.setText(msg + pl)));

        frame.add(showChose);

        frame.add(getButtonWithListener("Exit", e -> System.exit(0)));

        frame.setVisible(true);
    }

    private static Checkbox getCheckBox(String label, boolean status, CheckboxGroup group, ItemListener listener) {
        Checkbox c = new Checkbox(label, status, group);
        if (listener != null)
            c.addItemListener(listener);
        return c;
    }

    private static Button getButtonWithListener(String label, ActionListener listener) {
        Button b = new Button(label);
        b.setBackground(Color.gray);
        if (listener != null)
            b.addActionListener(listener);
        return b;
    }

}
