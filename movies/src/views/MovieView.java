package views;

import models.MovieModel;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

public class MovieView {
    JPanel panel;
    JFrame frame;
    JLabel nameLabel, name, dateLabel, date, synopsisLabel, synopsis, posterLabel, poster, emptyLabel;

    public MovieView() throws IOException {
        startComponents();

        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(1000, 620);
        frame.setLocation(500,370);
        frame.setVisible(false);
    }

    public void startComponents() throws IOException {
        frame = new JFrame("Movie");

        panel = new JPanel();

        nameLabel = new JLabel("Nome");
        name = new JLabel("");

        dateLabel = new JLabel("Data de Lançamento");
        date = new JLabel("");

        synopsisLabel = new JLabel("Sinopse");
        synopsis = new JLabel("");

        posterLabel = new JLabel("Poster");
        poster = new JLabel("");

        emptyLabel = new JLabel("");

        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));

        name.setFont(new Font("Arial", Font.PLAIN, 18));
        panel.add(nameLabel);
        panel.add(emptyLabel);
        panel.add(name);
        panel.add(emptyLabel);

        date.setFont(new Font("Arial", Font.PLAIN, 18));
        panel.add(dateLabel);
        panel.add(emptyLabel);
        panel.add(date);
        panel.add(emptyLabel);

        synopsis.setFont(new Font("Arial", Font.PLAIN, 10));
        panel.add(synopsisLabel);
        panel.add(emptyLabel);
        panel.add(synopsis);
        panel.add(emptyLabel);
    }

    public void setValues(MovieModel movieModel) throws IOException {
        name.setText(movieModel.name);
        date.setText(movieModel.date);
        synopsis.setText(movieModel.synopsis);

        URL url = new URL(movieModel.imagePath);
        BufferedImage image = ImageIO.read(url);

        poster.setIcon(new ImageIcon(image));

        panel.add(poster);

        frame.getContentPane().add(panel, BorderLayout.CENTER);

        frame.setVisible(true);
    }
}
