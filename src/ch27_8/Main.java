package ch27_8;

import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Main {
    public static void main(String[] args) {
        Frame frame = new Frame();

        frame.setLayout(null);
        frame.setSize(300, 160);

        Label msg = new Label();
        msg.setBounds(30, 50, 200, 20);

        frame.add(msg);

        frame.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {
                msg.setText("windowOpened");
            }

            @Override
            public void windowClosing(WindowEvent e) {
                msg.setText("windowClosing");
                frame.dispose();
            }

            @Override
            public void windowClosed(WindowEvent e) {
                System.out.println("windowClosed");
            }

            @Override
            public void windowIconified(WindowEvent e) {
                msg.setText("windowIconified");
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
                msg.setText("windowDeiconified");
            }

            @Override
            public void windowActivated(WindowEvent e) {
                msg.setText("windowActivated");
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
                msg.setText("windowDeactivated");
            }
        });

        frame.setVisible(true);
    }
}
