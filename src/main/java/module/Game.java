package module;

public class Game {
    protected static int mapSizeX;
    protected static int mapSizeY;
    private int finishCorX1;
    private int finishCorY1;
    private int finishCorX2;
    private int finishCorY2;
    private Entity[] players;

    public Game(int mapSizeX, int mapSizeY, int finishCorX1,
                int finishCorY1, int finishCorX2, int finishCorY2, Entity[] players){
        this.mapSizeX = mapSizeX;
        this.mapSizeY = mapSizeY;
        this.finishCorX1 = finishCorX1;
        this.finishCorY1 = finishCorY1;
        this.finishCorX2 = finishCorX2;
        this.finishCorY2 = finishCorY2;
        this.players = players;
    }

    public Entity startGame() {
        while (true) {
            for (int i = 0; i < players.length; i++) {
                players[i].move();
            }

            for (int i = 0; i < players.length; i++) {
                if (players[i].getCorX() >= finishCorX1
                        && players[i].getCorX() <= finishCorX2
                        && players[i].getCorY() >= finishCorY1
                        && players[i].getCorY() <= finishCorY2){
                    return players[i];
                }
            }
        }

    }
}
