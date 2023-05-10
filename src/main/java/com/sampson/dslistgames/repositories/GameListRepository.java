package com.sampson.dslistgames.repositories;

import com.sampson.dslistgames.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameListRepository  extends JpaRepository<GameList, Long> {
}
