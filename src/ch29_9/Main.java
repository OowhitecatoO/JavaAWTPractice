package ch29_9;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        frame.setSize(300, 200);

        Container container = frame.getContentPane();
        container.setLayout(null);

        addLabel(container, 20, 30, 80, 20, "User : ");
        JTextField user = new JTextField();
        user.setBounds(100, 30, 100, 20);

        addLabel(container, 20, 60, 80, 20, "Password : ");
        JPasswordField pwd = new JPasswordField();
        pwd.setBounds(100, 60, 100, 20);


        JLabel out = new JLabel();
        out.setBounds(20, 130, 260, 20);

        JButton login = new JButton("Login");
        login.setBounds(50, 90, 100, 30);
        login.addActionListener(e -> out.setText("{user:\"" + user.getText() + "\", password:\"" + String.valueOf(pwd.getPassword()) + "\"}"));

        container.add(user);
        container.add(pwd);
        container.add(login);
        container.add(out);

        frame.setVisible(true);
    }

    private static void addLabel(Container container, int x, int y, int width, int height, String label) {
        JLabel l = new JLabel(label);
        l.setBounds(x, y, width, height);
        container.add(l);
    }
}