package module;

import java.util.Random;

import static module.Game.mapSizeX;
import static module.Game.mapSizeY;

public class Knight extends Entity{
    public Knight() {}

    public Knight(int corX, int corY){
        super("Конь", corX, corY);
    }

    @Override
    public void move() {
        Random rd = new Random();
        int direction = rd.nextInt(8);
        switch (direction) {
            case 0:
                if (corY > 0 && corX > 1) {
                    corY -= 1;
                    corX -= 2;
                    steps++;
                }
                break;
            case 1:
                if (corY > 1 && corX > 0) {
                    corY -= 2;
                    corX -= 1;
                    steps++;
                }
                break;
            case 2:
                if (corY > 0 && corX < mapSizeX - 1) {
                    corY -= 1;
                    corX += 2;
                    steps++;
                }
                break;
            case 3:
                if (corY > 1 && corX < mapSizeX) {
                    corY -= 2;
                    corX += 1;
                    steps++;
                }
                break;
            case 4:
                if (corY < mapSizeY - 1 && corX < mapSizeX) {
                    corY += 2;
                    corX += 1;
                    steps++;
                }
                break;
            case 5:
                if (corY < mapSizeY && corX < mapSizeX - 1) {
                    corY += 1;
                    corX += 2;
                    steps++;
                }
                break;
            case 6:
                if (corY < mapSizeY && corX > 1) {
                    corY += 1;
                    corX -= 2;
                    steps++;
                }
                break;
            case 7:
                if (corY < mapSizeY - 1 && corX > 0) {
                    corY += 2;
                    corX -= 1;
                    steps++;
                }
                break;
        }
    }
}
