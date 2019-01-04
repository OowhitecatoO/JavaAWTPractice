package ch28_4;

import utils.WindowsCloser;

import java.awt.*;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        Frame frame = new Frame();
        frame.addWindowListener(new WindowsCloser());

        Label text = new Label("Java", Label.CENTER);
        MenuBar bar = new MenuBar();
        Menu fonts = new Menu("Font");

        fonts.add(getMenuItem("Bold", e -> text.setFont(new Font("Times New Roman", Font.BOLD, 36))));
        fonts.add(getMenuItem("Italic", e -> text.setFont(new Font("Times New Roman", Font.ITALIC, 36))));
        fonts.add(getMenuItem("PLain", e -> text.setFont(new Font("Times New Roman", Font.PLAIN, 36))));
        fonts.addSeparator();
        fonts.add(getMenuItem("Exit", e -> frame.dispose()));
        bar.add(fonts);

        Menu color = new Menu("Color");
        color.add(getMenuItem("Blue", e -> text.setBackground(Color.blue)));
        color.add(getMenuItem("Green", e -> text.setBackground(Color.GREEN)));
        color.add(getMenuItem("Yellow", e -> text.setBackground(Color.YELLOW)));
        bar.add(color);

        frame.setSize(250, 160);
        frame.setMenuBar(bar);

        frame.add(text);

        frame.setVisible(true);
    }

    private static MenuItem getMenuItem(String label, ActionListener listener) {
        MenuItem item = new MenuItem(label);
        if (listener != null)
            item.addActionListener(listener);
        return item;
    }
}
