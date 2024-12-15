package module;

import java.util.Random;

import static module.Game.mapSizeX;
import static module.Game.mapSizeY;

public class Bishop extends Entity{
    public Bishop() {}

    public Bishop(int corX, int corY){
        super("Слон", corX, corY);
    }

    @Override
    public void move() {
        Random rd = new Random();
        int direction = rd.nextInt(4);
        switch (direction) {
            case 0:
                if (corY > 0 && corX > 0) {
                    corY--;
                    corX--;
                    steps++;
                }
                break;
            case 1:
                if (corY > 0 && corX < mapSizeX) {
                    corY--;
                    corX++;
                    steps++;
                }
                break;
            case 2:
                if (corY < mapSizeY && corX < mapSizeX) {
                    corY++;
                    corX++;
                    steps++;
                }
                break;
            case 3:
                if (corY < mapSizeY && corX > 0) {
                    corY++;
                    corX--;
                    steps++;
                }
                break;
        }
    }
}
