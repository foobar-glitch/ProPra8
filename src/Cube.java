import java.util.ArrayList;

public class Cube {
    ArrayList<Coordinate> cubeCoordinates = new ArrayList<>();

    /*
       c2 --c-- c3
        |        |
       d|        |b
        |        |
        c0 --a-- c1
    */
    Cube(Coordinate c0, Coordinate c1, Coordinate c2, Coordinate c3){
        cubeCoordinates.set(0, c0);
        cubeCoordinates.set(1, c1);
        cubeCoordinates.set(2, c2);
        cubeCoordinates.set(3, c3);
    }

    ArrayList<Coordinate> getCoordinates(){return this.cubeCoordinates;}


    // Length of line a
    double getLowerLine(){
        return cubeCoordinates.get(1).getEuclidianDistance(cubeCoordinates.get(0));
    }

    double getRightLine(){
        return cubeCoordinates.get(3).getEuclidianDistance(cubeCoordinates.get(1))
    }

    // Length of line c
    double getUpperLine(){
        return cubeCoordinates.get(3).getEuclidianDistance(cubeCoordinates.get(2));
    }

    double getLeftLine(){
        return cubeCoordinates.get(0).getEuclidianDistance(cubeCoordinates.get(2));
    }



}
