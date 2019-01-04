package ch28_5;

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

        Menu about = new Menu("About");

        Dialog about_us = new Dialog(frame, "about us");
        about_us.setLayout(null);
        about_us.setSize(200, 150);
        Label self_message = new Label("簡介 : 自己");
        self_message.setBounds(35, 50, 150, 20);
        about_us.add(self_message);
        about_us.add(getButtonWithListener(70, 80, 30, 20, "Eixt", e -> about_us.setVisible(false)));

        about.add(getMenuItem("about us", e -> about_us.setVisible(true)));
        bar.add(about);

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

    private static Button getButtonWithListener(int x, int y, int width, int height, String label, ActionListener listener) {
        Button b = new Button(label);
        b.setBounds(x, y, width, height);
        if (listener != null)
            b.addActionListener(listener);
        return b;
    }
}
