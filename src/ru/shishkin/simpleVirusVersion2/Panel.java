package ru.shishkin.simpleVirusVersion2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Panel extends JPanel {
    // конструктор класса
    Panel() {
        Random rnd = new Random(); // переменная rnd для случайных значений

        // Создание таймера
        Timer timer = new Timer(100, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setBackground(new Color(rnd.nextInt(255), rnd.nextInt(255), rnd.nextInt(255)));
            }
        });

        // Запуск таймера
        timer.start();
    }
}