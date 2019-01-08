package ch29_7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        frame.setSize(300, 160);

        Container container = frame.getContentPane();
        container.setLayout(new GridLayout(2, 2));

        JLabel listTitle = new JLabel("大學列表");
        JLabel choseTitle = new JLabel("我的理想大學");

        DefaultListModel<String> listModel = new DefaultListModel<>();
        for (String s : new String[]{"明志科大", "台灣科大", "台北科大", "台灣大學", "清華大學", "長庚大學", "雲林科大"})
            listModel.addElement(s);

        JList<String> list = new JList<>(listModel);

        Vector<String> chose = new Vector<>();
        JList<String> choseList = new JList<>();

        list.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() != 2)
                    return;
                chose.add(list.getSelectedValue());
                choseList.setListData(chose);
            }
        });

        container.add(listTitle);
        container.add(choseTitle);
        container.add(new JScrollPane(list));
        container.add(new JScrollPane(choseList));

        frame.setVisible(true);
    }
}