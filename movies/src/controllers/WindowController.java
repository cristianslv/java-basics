package controllers;

import helpers.MovieHelper;
import models.MovieModel;
import views.MovieView;
import views.SearchView;

import java.io.IOException;

public class WindowController {
    SearchView searchView;
    MovieView movieView;
    MovieHelper movieHelper;

    public WindowController() throws IOException {
        searchView = new SearchView(this);
        movieView = new MovieView();

        movieHelper = new MovieHelper();
    }

    public void searchMovie(String movie) throws IOException {
        MovieModel movieModel =  movieHelper.getMovie(movie);

        movieView.setValues(movieModel);
    }
}
