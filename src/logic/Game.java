package logic;


public class Game {

    private int currentRound;
    private Player[] players = new Player[2];
    private int maxRound;
    private int roundToWin;
    private boolean aiOpponent=false;
    private boolean isGameOver = false;
    private int currentPlayerIndex;

    public Game(String playerName1, String playerName2 ,int maxRound, int roundToWin, boolean aiOpponent) {
        this.maxRound = maxRound;
        this.roundToWin = roundToWin;
        this.aiOpponent = aiOpponent;
        this.players[0] = new Player(playerName1);
        this.players[1] = new Player(playerName2);
    }






}
