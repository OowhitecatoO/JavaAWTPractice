package ch27_7;

import utils.WindowsCloser;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Main {

    public static void main(String[] args) {
        Frame frame = new Frame();
        frame.addWindowListener(new WindowsCloser());

        frame.setLayout(null);
        frame.setSize(300, 160);

        Label msg = new Label();
        msg.setText("");
        msg.setBounds(30, 50, 200, 20);

        TextField text = new TextField();
        text.setEditable(false);
        text.setBounds(30, 80, 200, 20);
        text.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                text.setText("Mouse Clicked");
            }

            @Override
            public void mousePressed(MouseEvent e) {
                text.setText("Mouse Pressed");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                text.setText("Mouse Released");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                text.setText("Mouse Entered");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                text.setText("Mouse Exited");
            }
        });

        Button clickMe = new Button("Click Me");
        clickMe.setBounds(120, 120, 62, 20);
        clickMe.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                msg.setText("Mouse Clicked");
                text.setText("Mouse Clicked");
            }

            @Override
            public void mousePressed(MouseEvent e) {
                msg.setText("Mouse Pressed");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                msg.setText("Mouse Released");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                msg.setText("Mouse Entered");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                msg.setText("Mouse Exited");
            }
        });

        frame.add(msg);
        frame.add(text);
        frame.add(clickMe);

        frame.setVisible(true);
    }
}
