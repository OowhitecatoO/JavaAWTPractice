package ch28_3;

import utils.WindowsCloser;

import java.awt.*;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Frame frame = new Frame();
        frame.addWindowListener(new WindowsCloser());

        frame.setLayout(new FlowLayout(FlowLayout.CENTER, 60, 20));
        frame.setSize(200, 160);

        HashMap<String, Color> colorMap = new HashMap<>();
        colorMap.put("Yellow", Color.yellow);
        colorMap.put("Gray", Color.gray);
        colorMap.put("Black", Color.black);
        colorMap.put("Blue", Color.blue);
        colorMap.put("Green", Color.green);

        Choice colorList = new Choice();
        TextArea colorBlock = new TextArea(2, 10);

        colorMap.keySet().forEach(colorList::add);
        colorList.addItemListener(e -> colorBlock.setBackground(colorMap.get(colorList.getSelectedItem())));
        colorList.select(0);

        frame.add(colorList);
        frame.add(colorBlock);

        frame.setVisible(true);
    }
}
