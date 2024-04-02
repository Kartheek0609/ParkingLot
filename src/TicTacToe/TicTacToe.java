package TicTacToe;

import TicTacToe.Controller.GameController;
import TicTacToe.Model.*;
import TicTacToe.Service.winningStrategy.WinningStrategyName;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        GameController gameController = new GameController();
        int id=1;
        List<Player> players = new ArrayList<>();
        Scanner scn= new Scanner(System.in);
        System.out.println("Welcome to the TicTacToe Game");
        System.out.println("Please the enter the Dimension of the Board :");
        int dimension = scn.nextInt();
        System.out.println("Do you want a bot in the Game ? Y or N");
        String botAns= scn.next();
        if(botAns.equalsIgnoreCase("Y")){
            Player bot = new Bot(id++,'$', BotDifficultyLevel.HARD);
            players.add(bot);
        }
        while(id < dimension){
            System.out.println("Please enter the Player name "+id);
            String playerName= scn.next();
            System.out.println("Please enter the Symbol for the Player");
            char playerSymbol= scn.next().charAt(0);
            Player newPlayer =new Player(id++,playerName,playerSymbol, PlayerType.HUMAN);
            players.add(newPlayer);
        }
        Collections.shuffle(players);
        Game game= gameController.createGame(dimension,players,WinningStrategyName.ORDERONEWINNINGSTRATEGY);
        int playerIndex = -1;
        while(game.getGameStatus().equals(GameStatus.IN_PROGRESS)){
            System.out.println("Current board status");
            gameController.displayBoard(game);
            playerIndex++;
            playerIndex = playerIndex % players.size();
            Move movePlayed = gameController.executeMove(game, players.get(playerIndex));

            Player winner = gameController.checkWinner(game, movePlayed);
            if(winner != null){
                System.out.println("WINNER IS : " + winner.getName());
                break;
            }
        }
        System.out.println("Final Board Status");
        gameController.displayBoard(game);
        System.out.println("Do you want to replay? 1 or 0");
    }
}
