package manager;

import views.Search;

import java.io.IOException;

public class Manager {
    Search search;

    public Manager() throws IOException {
        search = new Search();
    }
}
