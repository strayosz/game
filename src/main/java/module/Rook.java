package module;

import java.util.Random;

import static module.Game.mapSizeX;
import static module.Game.mapSizeY;

public class Rook extends Entity {
    public Rook() {}

    public Rook(int corX, int corY){
        super("Ладья", corX, corY);
    }

    @Override
    public void move() {
        Random rd = new Random();
        int direction = rd.nextInt(4);
        switch (direction) {
            case 0:
                corY -= rd.nextInt(corY + 1);
                steps++;
                break;
            case 1:
                corX += rd.nextInt(mapSizeX - corX);
                steps++;
                break;
            case 2:
                corY += rd.nextInt(mapSizeY - corY);
                steps++;
                break;
            case 3:
                corX -= rd.nextInt(corX + 1);
                steps++;
                break;
        }
    }
}
