package ch28_2;

import utils.WindowsCloser;

import java.awt.*;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Frame frame = new Frame();
        frame.addWindowListener(new WindowsCloser());

        frame.setLayout(new FlowLayout(FlowLayout.CENTER));
        frame.setSize(200, 200);

        HashMap<String, String> schoolAddress = new HashMap<>();
        schoolAddress.put("明志科大", "明志科大的地址");
        schoolAddress.put("台灣科大", "台灣科大的地址");
        schoolAddress.put("台灣大學", "台灣大學的地址");
        schoolAddress.put("清華大學", "清華大學的地址");
        schoolAddress.put("長庚大學", "長庚大學的地址");
        schoolAddress.put("自己所讀的學校", "自己所讀的學校的地址");

        List fontList = new List();
        TextField school = new TextField("                ");
        school.setEditable(false);
        TextArea address = new TextArea(2, 20);
        address.setEditable(false);

        schoolAddress.keySet().forEach(fontList::add);
        fontList.addItemListener(e -> {
            school.setText(fontList.getSelectedItem());
            address.setText(schoolAddress.get(fontList.getSelectedItem()));
            if (!frame.isAncestorOf(frame)) {
                frame.add(address);
                frame.setVisible(true);
            }
        });

        frame.add(school);
        frame.add(fontList);

        frame.setVisible(true);
    }
}
