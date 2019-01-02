package ch26_2;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Frame frame = new Frame("MyWin");
        frame.setLocation(400, 200);
        frame.setSize(300, 180);
        print("視窗 x 軸座標 : " + frame.getX());
        print("視窗 y 軸座標 : " + frame.getY());
        print("視窗高度 : " + frame.getHeight());
        print("視窗高度 : " + frame.getWidth());
        print("視窗名稱 : " + frame.getName());
        print("視窗背景色 : " + frame.getBackground());
        frame.setVisible(true);
    }

    private static void print(String message) {
        System.out.println(message);
    }
}
