import module.*;

public class Main {
    public static void main(String[] args) {
        Entity pawn = new Pawn(0, 0);
        Entity knight = new Knight(0, 0);
        Entity bishop = new Bishop(0, 0);
        Entity rook = new Rook(0, 0);
        Entity[] players = {pawn, knight, bishop, rook};
        Game game = new Game(1000, 1000, 495,
                495, 505, 505, players);
        Entity champion = game.startGame();
        System.out.println(champion.getName() + " " + champion.getSteps());

    }
}