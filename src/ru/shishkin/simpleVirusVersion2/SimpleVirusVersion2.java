package ru.shishkin.simpleVirusVersion2;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class SimpleVirusVersion2 {
    public static void main(String[] args) {
        Random rnd = new Random();

        for (int i = 0; i < 100; i++) {
            // создаём окно
            JFrame okno = new JFrame("Моё первое окно");
            // создаём размеры окна
            okno.setBounds(100 + rnd.nextInt(200), 100 + rnd.nextInt(200), rnd.nextInt(966), rnd.nextInt(368));
            // убираем рамки окна
            okno.setUndecorated(true);
            // прикепляем панель к окну
            okno.add(new Panel());
            // сделать окно выдимым
            okno.setVisible(true);

            try {
                Robot robot = new Robot();
                robot.mouseMove(0, 0);
            } catch (AWTException e) {
                e.printStackTrace();
            }
        }
    }
}