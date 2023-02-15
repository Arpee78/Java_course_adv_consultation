package w01d3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MovieService {

    private List<Movie> movies = new ArrayList<>();

    public void addMovie(Movie movie){
        if (!movie.getDate().isAfter(LocalDate.of(1911,1,1))){
            throw new IllegalArgumentException("Date of the movie must be after 1911.1.1.");
        }
        movies.add(movie);
    }

    //Legyen egy metódus ami cím alapján talál meg egy filmet.
    // Feltételezhetjük, hogy nincs két ugyanolyan című film.
    public Movie findMovieByTitle(String title){
        for (Movie actual: movies) {
            if (actual.getTitle().equals(title)){
                return actual;
            }
        }
        throw new IllegalArgumentException("There isnt any movie with this title: " + title);
    }

    //Legyen egy metódus, ami csak egy paraméterül kapott
    // bizonyos évszám utáni filmeket ad vissza egy listában.
    public List<Movie> findMoviesAfterDate(int year){
        List<Movie> result = new ArrayList<>();
        for (Movie actual: movies) {
            if (actual.getDate().getYear()>year){
                result.add(actual);
            }
        }
        return result;
    }


    //Legyen egy metódus ami egy map-ben visszaadja műfajonként a filmeket egy listában.
    public Map<MovieGenre, Movie> returnMoviesByGenre() {
        Map<MovieGenre, Movie> result = new HashMap<>();
        for (Movie actual : movies) {
            result.put(actual.getMovieGenre(), actual);
        }
        return result;
    }


}
