package com.academy.devdojo.repository;

import com.academy.devdojo.domain.Anime;

import java.util.List;

public interface AnimeRepository {
    public List<Anime> listAll();
}
