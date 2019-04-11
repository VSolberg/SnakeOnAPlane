package io.battlesnake.pathfinding;

import es.usc.citius.hipster.algorithm.Hipster;
import es.usc.citius.hipster.model.Transition;
import es.usc.citius.hipster.model.function.CostFunction;
import es.usc.citius.hipster.model.function.HeuristicFunction;
import es.usc.citius.hipster.model.function.impl.StateTransitionFunction;
import es.usc.citius.hipster.model.problem.ProblemBuilder;
import es.usc.citius.hipster.model.problem.SearchProblem;
import es.usc.citius.hipster.util.examples.maze.Maze2D;
import es.usc.citius.hipster.util.examples.maze.Mazes;
import java.util.List;

import java.awt.*;

public class AStar {

    private Integer optimalPathIndex;
    List<List<Point>> allPaths;

    public AStar() {
        optimalPathIndex = 0;
        allPaths = null;
    }

    private SearchProblem createAStarSearchProblem(Maze2D map, Point localPlayer, Point goal) {
        StateTransitionFunction<Point> stateTransitionFunction = new StateTransitionFunction<Point>() {
            @Override
            public Iterable<Point> successorsOf(Point state) {
                return map.validLocationsFrom(state);
            }
        };

        CostFunction<Void, Point, Double> costFunction = new CostFunction<Void, Point, Double>() {
            @Override
            public Double evaluate(Transition<Void, Point> transition) {
                Point source = transition.getFromState();
                Point destination = transition.getState();
                return source.distance(destination);
            }
        };

        HeuristicFunction<Point, Double> heuristicFunction = new HeuristicFunction<Point, Double>() {
            @Override
            public Double estimate(Point point) {
                return point.distance(goal);
            }
        };

        return ProblemBuilder.create()
                .initialState(localPlayer)
                .defineProblemWithoutActions()
                .useTransitionFunction(stateTransitionFunction)
                .useCostFunction(costFunction).useHeuristicFunction(heuristicFunction)
                .build();
    }

    private List<List<Point>> getOptimalPaths() {
        Mazes.TestMaze test = Mazes.TestMaze.MAZE2;
        Maze2D maze = test.getMaze();

        System.out.println("Test maze:");
        System.out.println(test.getMaze());

        Point localPlayer = maze.getInitialLoc();
        Point food = maze.getGoalLoc();

        SearchProblem searchProblem = createAStarSearchProblem(maze, localPlayer, food);

        List<List<Point>> optimalPaths = Hipster.createAStar(searchProblem).search(food).getOptimalPaths();
        System.out.println(optimalPaths);
        return optimalPaths;
    }

    public List<Point> getNextPath() {
        allPaths = getOptimalPaths();

        if(allPaths.size() <= 0 || allPaths.size() < optimalPathIndex)
            return null;

        List<Point> nextPath = allPaths.get(optimalPathIndex);
        optimalPathIndex++;

        return nextPath;
    }

    public void reset() {
        optimalPathIndex = 0;
        allPaths = null;
    }

}
