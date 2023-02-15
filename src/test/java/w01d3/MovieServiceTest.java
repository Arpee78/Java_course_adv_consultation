package w01d3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class MovieServiceTest {

    MovieService movieService = new MovieService();

    @BeforeEach
    void init(){
        movieService.addMovie(
                new Movie(1,"Star Wars", LocalDate.of(1970,10,10), 20, MovieGenre.SCIFI));
        movieService.addMovie(
                new Movie(2,"Braveheart", LocalDate.of(1995,5,10), 15, MovieGenre.HISTORY));
        movieService.addMovie(
                new Movie(3,"Godfather", LocalDate.of(1980,8,10), 10, MovieGenre.THRILLER));
    }

    @Test
    void addMovie() {
        movieService.addMovie(
                new Movie(4,"Godfather2", LocalDate.of(1983,7,3), 10, MovieGenre.THRILLER));
        assertEquals(4, movieService.findMovieByTitle("Godfather2").getId());
    }

    @Test
    void findMovieByTitle() {
        assertEquals(3, movieService.findMovieByTitle("Godfather").getId());
    }

    @Test
    void findMoviesAfterDate() {
        assertEquals("Braveheart", movieService.findMoviesAfterDate(1990).get(0).getTitle());
    }

    @Test
    void returnMoviesByGenre() {
        assertEquals(3, movieService.returnMoviesByGenre().size());
    }
}