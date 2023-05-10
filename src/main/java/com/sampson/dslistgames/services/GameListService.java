package com.sampson.dslistgames.services;

import com.sampson.dslistgames.dto.GameListDTO;
import com.sampson.dslistgames.repositories.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    GameListRepository gameListRepository;

    public List<GameListDTO> findAll() {
        return gameListRepository.findAll().stream().map(x -> new GameListDTO(x)).toList();
    }
}
