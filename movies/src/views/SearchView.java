package views;

import controllers.WindowController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.Objects;

public class SearchView {
    Icon gif;
    JFrame frame;
    JTextField searchField;
    JLabel fieldLabel, gifLabel;
    WindowController controller;
    JButton buttonClean, buttonSearch;
    JPanel buttonsPanel, fieldPanel, gifPanel;

    public SearchView(WindowController controller) throws IOException {
        this.controller = controller;

        startComponents();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 320);
        frame.setLocation(700,70);
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

        gif = new ImageIcon(Objects.requireNonNull(this.getClass().getResource("/public/search.gif")));
        gifLabel = new JLabel(gif);

        gifPanel = new JPanel();
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

        buttonSearch.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    controller.searchMovie(searchField.getText());
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }

                searchField.setText("");
            }
        });
    }
}
