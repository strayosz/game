package module;

import java.util.Random;

import static module.Game.mapSizeX;
import static module.Game.mapSizeY;

public class Pawn extends Entity{

    public Pawn() {}

    public Pawn(int corX, int corY){
        super("Пешка", corX, corY);
    }

    @Override
    public void move() {
        Random rd = new Random();
        int direction = rd.nextInt(4);
        switch (direction) {
            case 0:
                if (corY > 0){
                    corY--;
                    steps++;
                }
                break;
            case 1:
                if (corX < mapSizeX){
                    corX++;
                    steps++;
                }
                break;
            case 2:
                if (corY < mapSizeY){
                    corY++;
                    steps++;
                }
                break;
            case 3:
                if (corX > 0){
                    corX--;
                    steps++;
                }
                break;
        }
    }
}
