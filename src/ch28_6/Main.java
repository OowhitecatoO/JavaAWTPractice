package ch28_6;

import utils.WindowsCloser;

import java.awt.*;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Frame frame = new Frame();
        frame.addWindowListener(new WindowsCloser());

        frame.setLayout(new BorderLayout());
        frame.setSize(250, 160);

        TextArea textArea = new TextArea();

        MenuBar bar = new MenuBar();
        Menu file = new Menu("File");

        FileDialog fileDialog = new FileDialog(frame);

        file.add(getMenuItem("Open", e -> {
            fileDialog.setTitle("開啟檔案");
            fileDialog.setMode(FileDialog.LOAD);
            fileDialog.setVisible(true);
            if (fileDialog.getFile() == null)
                return; // 取消了
            String file_path = fileDialog.getDirectory() + fileDialog.getFile();
            frame.setTitle(fileDialog.getFile());
            try {
                FileInputStream src = new FileInputStream(file_path);
                byte[] in = new byte[src.available()];
                //noinspection ResultOfMethodCallIgnored
                src.read(in);
                textArea.setText(new String(in));
                src.close();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }));
        file.add(getMenuItem("Save as", e -> {
            fileDialog.setTitle("儲存檔案");
            fileDialog.setMode(FileDialog.SAVE);
            fileDialog.setVisible(true);
            if (fileDialog.getFile() == null)
                return; // 取消了
            String file_path = fileDialog.getDirectory() + fileDialog.getFile();
            frame.setTitle(fileDialog.getFile());
            try {
                FileOutputStream src = new FileOutputStream(file_path);
                src.write(textArea.getText().getBytes());
                src.flush();
                src.close();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }));
        file.add(getMenuItem("Exit", e -> frame.dispose()));
        bar.add(file);

        frame.setMenuBar(bar);
        frame.add(textArea, BorderLayout.CENTER);

        frame.setVisible(true);
    }

    private static MenuItem getMenuItem(String label, ActionListener listener) {
        MenuItem item = new MenuItem(label);
        if (listener != null)
            item.addActionListener(listener);
        return item;
    }
}
