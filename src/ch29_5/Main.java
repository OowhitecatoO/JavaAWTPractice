package ch29_5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.util.HashMap;
import java.util.Map;

public class Main {

    private static int total = 0;

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Container container = frame.getContentPane();
        container.setLayout(null);

        JLabel title = new JLabel("餐飲計價系統");
        title.setBounds(50, 50, 150, 20);

        JLabel totalText = new JLabel();

        JButton buy = new JButton("買單");
        buy.addActionListener(e -> showTotal(totalText));
        showTotal(totalText);

        Map<String, Integer> itemMap = new HashMap<>();
        itemMap.put("牛肉麵", 150);
        itemMap.put("肉絲麵", 100);
        itemMap.put("陽春麵", 60);
        itemMap.put("皮蛋豆腐", 30);
        itemMap.put("豆干", 10);

        container.add(title);
        // for each add
        int y = 70;
        for (Map.Entry<String, Integer> pair : itemMap.entrySet()) {
            JCheckBox cb = new JCheckBox(pair.getKey());
            cb.setBounds(100, y += 30, 150, 20);
            cb.addItemListener(e -> total = e.getStateChange() == ItemEvent.SELECTED ? total + pair.getValue() : total - pair.getValue());
            container.add(cb);
        }

        totalText.setBounds(100, y += 40, 150, 20);
        container.add(totalText);
        buy.setBounds(200, y += 50, 80, 20);
        container.add(buy);

        frame.setSize(450, y + 80);

        frame.setVisible(true);
    }

    private static void showTotal(JLabel label) {
        label.setText("總金額 : " + total);
    }
}
