package com.kirilo.training.springlibrary.interfaces;

import com.kirilo.training.springlibrary.entities.Genre;

import java.util.List;

public interface GenreDAO {
    List<Genre> getGenres();
}
