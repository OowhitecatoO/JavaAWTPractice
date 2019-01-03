package ch27_2;

import utils.WindowsCloser;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    private static Button btnAccept, btnDeny, btnExit;
    private static Label textLabel;

    public static void main(String[] args) {
        Frame frame = new Frame();
        frame.addWindowListener(new WindowsCloser());

        frame.setLayout(new GridLayout(4, 1));

        ButtonHandler listener = new ButtonHandler();
        frame.add(btnAccept = getButtonWithListener("Accept", listener));
        frame.add(btnDeny = getButtonWithListener("Deny", listener));
        frame.add(btnExit = getButtonWithListener("Exit", listener));
        frame.add(textLabel = new Label("Push the button, plz!!"));

        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    private static Button getButtonWithListener(String label, ActionListener listener) {
        Button b = new Button(label);
        b.setBackground(Color.gray);
        if (listener != null)
            b.addActionListener(listener);
        return b;
    }

    private static class ButtonHandler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            Button clicked = (Button) e.getSource();
            if (clicked == btnAccept)
                textLabel.setText("You clicked the accept button, thx!!");
            else if (clicked == btnDeny)
                textLabel.setText("Oh... So Sad.");
            else if (clicked == btnExit) {
                textLabel.setText("Bye!!");
                System.exit(0);
            }
        }
    }

}
