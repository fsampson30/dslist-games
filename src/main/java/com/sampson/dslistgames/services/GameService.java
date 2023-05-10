package com.sampson.dslistgames.services;

import com.sampson.dslistgames.dto.GameDTO;
import com.sampson.dslistgames.dto.GameMinDTO;
import com.sampson.dslistgames.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll() {
        return gameRepository.findAll().stream().map(x -> new GameMinDTO(x)).toList();
    }

    @Transactional(readOnly = true)
    public GameDTO findById(Long gameId) {
        return new GameDTO(gameRepository.findById(gameId).get());
    }




}
