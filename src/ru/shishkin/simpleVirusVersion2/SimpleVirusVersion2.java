package ru.shishkin.simpleVirusVersion2;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class SimpleVirusVersion2 {
    public static void main(String[] args) {
        Random rnd = new Random(); // переменная rnd для случайных значений

        for (int i = 0; i < 100; i++) {
            JFrame okno = new JFrame("Моё первое окно"); // создаём окно
            // создаём размеры окна
            okno.setBounds(100 + rnd.nextInt(200), 100 + rnd.nextInt(200), rnd.nextInt(966), rnd.nextInt(368));
            okno.setUndecorated(true);    // убираем рамки окна
            okno.add(new Panel()); // прикепляем панель к окну
            okno.setVisible(true); // сделать окно выдимым

            try {
                Robot robot = new Robot();
                robot.mouseMove(0, 0);
            } catch (AWTException e) {
				e.printStackTrace();
            }
        }
    }
}