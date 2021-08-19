package views;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.imageio.ImageIO;
import java.awt.image.*;
import java.io.*;
import java.util.Objects;

public class Search {
    JFrame frame;
    JLabel fieldLabel;
    JTextField searchField;
    JPanel buttonsPanel, fieldPanel;
    JButton buttonClean, buttonSearch;

    public Search() throws IOException {
        startComponents();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 350);
        frame.setLocation(700,400);
        frame.setVisible(true);

        setListeners();
    }

    public void startComponents() throws IOException {
        frame = new JFrame("Movies Searcher");

        buttonsPanel = new JPanel();
        fieldPanel = new JPanel();

        fieldLabel = new JLabel("Nome do Filme");

        searchField = new JTextField("");

        buttonClean = new JButton("Limpar");
        buttonSearch = new JButton("Buscar");

        fieldPanel.setLayout(new BoxLayout(fieldPanel, BoxLayout.PAGE_AXIS));
        buttonsPanel.setLayout(new FlowLayout());

        fieldPanel.add(fieldLabel);
        fieldPanel.add(searchField);

        JPanel gifPanel = new JPanel();
        Icon gif = new ImageIcon(Objects.requireNonNull(this.getClass().getResource("/public/search.gif")));
        JLabel gifLabel = new JLabel(gif);

        gifPanel.add(gifLabel);

        buttonsPanel.add(buttonClean);
        buttonsPanel.add(buttonSearch);

        frame.add(fieldPanel, BorderLayout.PAGE_START);
        frame.add(gifPanel, BorderLayout.CENTER);
        frame.add(buttonsPanel, BorderLayout.PAGE_END);
    }

    public void setListeners() {
        buttonClean.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                searchField.setText("");
            }
        });
    }
}
