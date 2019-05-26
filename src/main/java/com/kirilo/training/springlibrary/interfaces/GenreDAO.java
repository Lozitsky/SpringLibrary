package com.kirilo.training.springlibrary.interfaces;

import com.kirilo.training.springlibrary.entities.Genre;

import java.util.Set;

public interface GenreDAO {
    Set<Genre> getGenres();
}
