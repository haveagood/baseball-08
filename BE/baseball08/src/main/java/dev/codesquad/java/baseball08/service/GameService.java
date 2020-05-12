package dev.codesquad.java.baseball08.service;

import dev.codesquad.java.baseball08.dao.henry.GameDao2;
import dev.codesquad.java.baseball08.dto.henry.AvailabilityResponse;
import dev.codesquad.java.baseball08.dto.henry.GameListResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {
    private Logger logger = LoggerFactory.getLogger(GameService.class);

    @Autowired
    private GameDao2 gameDao2;

    public AvailabilityResponse isGameAvailable(Long id) {
        return gameDao2.IsGameAvailable(id);
    }

    public List<GameListResponse> getGameList() {
        return gameDao2.findAllGame();
    }
}
