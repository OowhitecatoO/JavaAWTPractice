package ch29_4;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Main {

    private static List<String> picNameList = new ArrayList<>();
    private static List<ImageIcon> picList = new ArrayList<>();
    private static int index = 0;

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Container container = frame.getContentPane();
        container.setLayout(new FlowLayout());
        frame.setSize(600, 480);

        JLabel pic = new JLabel();
        pic.setHorizontalTextPosition(SwingConstants.CENTER);
        pic.setVerticalTextPosition(SwingConstants.TOP);


        JButton prev = new JButton("Prev", new ImageIcon("resource" + File.separator + "ch29_4" + File.separator + "icon" + File.separator + "left.png"));
        prev.addActionListener(e -> {
            if (picList.isEmpty())
                return;
            index = (index + picList.size() - 1) % picList.size();
            showPic(pic);
        });

        JButton next = new JButton("Next", new ImageIcon("resource" + File.separator + "ch29_4" + File.separator + "icon" + File.separator + "right.png"));
        next.setHorizontalTextPosition(SwingConstants.LEFT);
        next.addActionListener(e -> {
            if (picList.isEmpty())
                return;
            index = (index + 1) % picList.size();
            showPic(pic);
        });

        container.add(pic);
        container.add(prev);
        container.add(next);

        initPic();
        if (!picList.isEmpty())
            showPic(pic);

        frame.setVisible(true);
    }

    private static void initPic() {
        picList.clear();
        picNameList.clear();
        File picDir = new File("resource" + File.separator + "ch29_4" + File.separator + "pic");
        if (!picDir.isDirectory())
            return;
        Arrays.stream(Objects.requireNonNull(picDir.listFiles()))
                .peek(file -> picNameList.add(file.getName()))
                .map(File::getAbsolutePath)
                .map(ImageIcon::new)
                .forEach(picList::add);
    }

    private static void showPic(JLabel label) {
        label.setText(picNameList.get(index));
        label.setIcon(picList.get(index));
    }
}
