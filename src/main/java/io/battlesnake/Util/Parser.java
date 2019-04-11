package io.battlesnake.Util;

import io.battlesnake.models.GameEntity;
import io.battlesnake.models.GameObject;
import io.battlesnake.models.GameState;

import java.util.HashMap;

import static java.lang.Math.abs;

public class Parser {
    private HashMap<Double, GameObject> food_map;

    public Parser() {
        food_map = new HashMap<>();
    }

    private GameObject getClosestFood(GameState game_state)
    {
        Double shortest = 100000.0;
        GameObject shortest_food = null;
        Integer head_x = game_state.getLocalPlayer().getBody().get(0).getX();
        Integer head_y = game_state.getLocalPlayer().getBody().get(0).getY();

        for (GameObject food : game_state.getBoard().getFood())
        {
            return food;

            /*Integer food_x = food.getX();
            Integer food_y = food.getY();

            Integer delta_x = abs(head_x - food_x);
            Integer delta_y = abs(head_y - food_y);

            double distance = Math.sqrt(Math.pow(delta_x, 2) + Math.pow(delta_y, 2));

            food_map.put(shortest, shortest_food);

            if (distance < shortest)
            {
                shortest = distance;
                shortest_food = food;
            }*/
        }

        return shortest_food;
    }

    public char[][] parse(GameState game_state)
    {
        Integer width = game_state.getBoard().getWidth();
        Integer height = game_state.getBoard().getHeight();
        char[][] new_board = new char[height][width];

        // Create an empty board:
        for(Integer y=0; y<height; y++)
        {
            for (Integer x=0; x<width; x++)
            {
                new_board[y][x] = ' ';
            }
        }

        // Fill board with Snake bodies
        for (GameEntity snake : game_state.getBoard().getSnakes())
        {
            for (GameObject body_part : snake.getBody())
            {
                Integer x = body_part.getX();
                Integer y = body_part.getY();

                new_board[y][x] = 'X';
            }
        }

        // Place Starting pos: (assumes head is at index 0)
        {
            Integer x = game_state.getLocalPlayer().getBody().get(0).getX();
            Integer y = game_state.getLocalPlayer().getBody().get(0).getY();

            new_board[y][x] = 'S';
        }

        // Place closest food
        {
            GameObject closest_food = getClosestFood(game_state);
            if (closest_food != null)
            {
                Integer x = closest_food.getX();
                Integer y = closest_food.getY();

                new_board[y][x] = 'G';
            }
            else
            {
                for(Integer x=0; x<width; x++)
                {
                    for (Integer y=0; y<height; y++)
                    {
                       if (new_board[y][x] != 'X' && new_board[y][x] != 'S')
                       {
                           new_board[y][x] = 'G';
                           return new_board;
                       }
                    }
                }
            }
        }

        return new_board;
    }
}

