package ru.shishkin.maxim.viruses.virus1;

import java.awt.Color;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class AppVirus1 {
    public static void main(String[] args) {
        // переменна для случайных значений
        Random rnd = new Random();
        // блок цикла
        for (int i = 0; i < 50; i = i + 1) {
            // создание окна и добавление имени
            JFrame window = new JFrame("Окно под номером " + i);
            // установим размеры
            window.setBounds(rnd.nextInt(700), rnd.nextInt(200), 300 + rnd.nextInt(200), 300 + rnd.nextInt(200));
            // запретить изменять размер окна
            window.setResizable(false);
            // убрать рамку окна
            window.setUndecorated(true);

            // создаём панель
            JPanel panel = new JPanel();
            // устанавливаем цвет панели
            panel.setBackground(rndColor());
            // добавляем панель к окну
            window.add(panel);

            // установим видимость
            window.setVisible(true);
            // закрытие программы
            window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
    }

    // метод для получения случайного цвета
    private static Color rndColor() {
        Random rnd = new Random();
        int r = rnd.nextInt(255);
        int g = rnd.nextInt(255);
        int b = rnd.nextInt(255);
        return new Color(r, g, b);
    }
}
