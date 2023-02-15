package w01d3;

import java.time.LocalDate;

public class Movie {

    //Minden filmnek legyen egy egyedi azonosítója, egy címe,
    // egy gyártási dátuma egy hossza,
    // és egy műfaja ami enum típusú.

    private long id;
    private String title;
    private LocalDate date;
    private int length;
    private MovieGenre movieGenre;

    public Movie(long id, String title, LocalDate date, int length, MovieGenre movieGenre) {
        this.id = id;
        this.title = title;
        this.date = date;
        this.length = length;
        this.movieGenre = movieGenre;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public MovieGenre getMovieGenre() {
        return movieGenre;
    }

    public void setMovieGenre(MovieGenre movieGenre) {
        this.movieGenre = movieGenre;
    }
}
