package views;

import models.Counter;
import models.CounterListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Default extends JFrame {
    private JButton increaser;
    private JButton decreaser;

    private JLabel label;

    private Counter counter;

    public Default() {
        counter = new Counter();

        startComponentes();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("UDESC - Java Project");
        setSize(500, 200);
        setLocation(710,400);
        setVisible(true);
    }

    private void startComponentes() {
        increaser = new JButton("INCREMENTAR");
        decreaser = new JButton("DECREMENTAR");

        label = new JLabel(counter.getValue(), SwingConstants.LEFT);

        increaser.setBackground(Color.RED);
        decreaser.setBackground(Color.ORANGE);

        setLayout(new GridLayout(2,2));

        add(increaser, BorderLayout.WEST);
        add(decreaser, BorderLayout.EAST);

        add(new JLabel("O valor do contador: ", SwingConstants.RIGHT), BorderLayout.CENTER);
        add(label, BorderLayout.CENTER);

        addListeners();
    }

    public void addListeners() {
        ActionListener listenerDecreaser = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                counter.decrease();
                System.out.println("O Botão#2 foi pressionado.");
            }
        };

        ActionListener listenerIncreaser = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                counter.increase();
                System.out.println("O Botão#1 foi pressionado.");
            }
        };

        decreaser.addActionListener(listenerDecreaser);
        increaser.addActionListener(listenerIncreaser);

        counter.addListener(new CounterListener() {
            @Override
            public void oValorMudou(Integer novoValor) {
                label.setText(novoValor.toString());
            }
        });
    }
}