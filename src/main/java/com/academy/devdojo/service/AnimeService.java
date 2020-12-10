package com.academy.devdojo.service;

import com.academy.devdojo.domain.Anime;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimeService {

//    private final AnimeRepository animeRepository;

    public List<Anime> listAll(){
        return List.of(new Anime(1L, "Doku no hero"), new Anime(2L, "Berzerk"), new Anime(3L, "Hakino no arame"), new Anime(4L, "Sword art online"), new Anime(5L, "haspayo bushono asphato"));
    }
}
