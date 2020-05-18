package com.service;

import com.entity.Movie;
import static com.util.StorageCache.*;

import java.util.List;

public class MovieService {

    public void add(Movie movie) {
        MOVIE_CACHE_LIST.add(movie);
    }

    public void delete(Integer id) {
        for (Movie movie : MOVIE_CACHE_LIST) {
            if (movie.getId().equals(id)) {
                MOVIE_CACHE_LIST.remove(movie);
                break;
            }
        }
    }

    public Movie findById(int id) {
        for (Movie movie : MOVIE_CACHE_LIST) {
            if (movie.getId().equals(id)) {
                return movie;
            }
        }
        return null;
    }

    public List<Movie> findAll() {
        return MOVIE_CACHE_LIST;
    }

    public void update(Movie newMovie) {
        for (Movie movie : MOVIE_CACHE_LIST) {
            if (movie.getId().equals(newMovie)) {
                movie = newMovie;
                break;
            }
        }
    }
}
