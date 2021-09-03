package helpers;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import models.MovieModel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class MovieHelper {
    Socket socket;
    PrintStream out;
    BufferedReader in;

    public MovieModel getMovie(String movie) throws IOException {
        MovieModel movieModel = new MovieModel();

        try {
            socket = new Socket("www.omdbapi.com", 80);

            out = new PrintStream(socket.getOutputStream());
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            movie = movie.replace(' ', '+');

            out.println( "GET /?t=" + movie + "&apikey=6cfab540 HTTP/1.0" );
            out.println( "Host: www.omdbapi.com" );
            out.println();

            StringBuilder sb = new StringBuilder();

            String line = in.readLine();

            while(line != null) {
                System.out.println(line);

                if (line.contains("{") && line.contains("}")) {
                    sb.append(line);
                }

                line = in.readLine();
            }

            JsonParser parser = new JsonParser();
            JsonElement element = parser.parse(sb.toString());
            JsonObject jsonObject = element.getAsJsonObject();

            movieModel.name = jsonObject.get("Title").getAsString();
            movieModel.date = jsonObject.get("Released").getAsString();
            movieModel.synopsis = jsonObject.get("Plot").getAsString();
            movieModel.imagePath = jsonObject.get("Poster").getAsString();

            in.close();
            out.close();
            socket.close();
        } catch(Exception e) {
            e.printStackTrace();
        }

        return movieModel;
    }
}
