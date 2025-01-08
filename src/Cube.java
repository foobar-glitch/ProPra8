import java.util.ArrayList;

public class Cube {
    ArrayList<Coordinate> cubeCoordinates = new ArrayList<>();

    Cube(Coordinate x1, Coordinate x2, Coordinate x3, Coordinate x4){
        cubeCoordinates.set(0, x1);
        cubeCoordinates.set(1, x2);
        cubeCoordinates.set(2, x3);
        cubeCoordinates.set(3, x4);
    }

    ArrayList<Coordinate> getCoordinates(){return this.cubeCoordinates;}

}
