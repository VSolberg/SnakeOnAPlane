package io.battlesnake.Util;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.battlesnake.models.GameState;

import java.io.IOException;

public class GameStateUtil {

    public static GameState parseGameState(JsonNode request) {
        ObjectMapper mapper = new ObjectMapper();
        String json = request.toString();
        GameState gameState = new GameState();

        try {
            gameState = mapper.readValue(request.toString(), GameState.class);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return gameState;
    }

}
