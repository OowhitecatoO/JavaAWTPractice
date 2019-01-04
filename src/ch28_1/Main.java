package ch28_1;

import utils.WindowsCloser;

import java.awt.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Frame frame = new Frame();
        frame.addWindowListener(new WindowsCloser());

        frame.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));
        frame.setSize(300, 160);

        List fontList = new List();
        Arrays.stream(GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames()).forEach(fontList::add);
        fontList.addItemListener(e -> fontList.setFont(new Font(fontList.getSelectedItem(), Font.PLAIN, fontList.getFont().getSize())));
        fontList.select(0);

        frame.add(fontList);

        frame.setVisible(true);
    }
}
