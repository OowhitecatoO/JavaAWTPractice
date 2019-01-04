package ch27_5;

import utils.WindowsCloser;

import java.awt.*;
import java.util.function.BiFunction;

public class Main {

    private static TextField inputA = new TextField();
    private static TextField inputB = new TextField();
    private static TextField output = new TextField();

    public static void main(String[] args) {
        Frame frame = new Frame();
        frame.addWindowListener(new WindowsCloser());

        frame.setLayout(null);
        frame.setSize(360, 280);

        inputA.setBounds(100, 50, 150, 20);
        inputB.setBounds(100, 100, 150, 20);
        output.setBounds(100, 150, 150, 20);
        output.setBackground(Color.yellow);
        output.setEditable(false);
        frame.add(inputA);
        frame.add(inputB);
        frame.add(output);

        addButton(frame, 10, 200, 60, 60, "+", (a, b) -> a + b);
        addButton(frame, 80, 200, 60, 60, "-", (a, b) -> a - b);
        addButton(frame, 150, 200, 60, 60, "x", (a, b) -> a * b);
        addButton(frame, 220, 200, 60, 60, "/", (a, b) -> b != 0 ? a / b : 0);
        addButton(frame, 290, 200, 60, 60, "%", (a, b) -> a % b);

        frame.setVisible(true);
    }

    private static Button addButton(Frame frame, int x, int y, int width, int height, String label, BiFunction<Integer, Integer, Integer> func) {
        Button btn = new Button(label);
        btn.addActionListener(e -> {
            try {
                int a = Integer.parseInt(inputA.getText());
                int b = Integer.parseInt(inputB.getText());
                output.setText(func.apply(a, b).toString());
            } catch (NumberFormatException e1) {
                output.setText(e1.getMessage());
            }
        });
        btn.setBounds(x, y, width, height);
        frame.add(btn);
        return btn;
    }
}
