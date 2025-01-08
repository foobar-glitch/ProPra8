import java.util.ArrayList;

public class Cube {
    ArrayList<Coordinate> cubeCoordinates;

    /*
       c2 --c-- c3
        |        |
       d|        |b
        |        |
        c0 --a-- c1
    */

    public Cube(Coordinate c0, Coordinate c1, Coordinate c2, Coordinate c3){
        cubeCoordinates = new ArrayList<>();
        cubeCoordinates.set(0, c0);
        cubeCoordinates.set(1, c1);
        cubeCoordinates.set(2, c2);
        cubeCoordinates.set(3, c3);
    }

    public Cube(ArrayList<Coordinate> c){
        cubeCoordinates = new ArrayList<>();
        for(int i = 0; i<4; i++) cubeCoordinates.set(i, c.get(i));
    }


    ArrayList<Coordinate> getCoordinates(){return this.cubeCoordinates;}

    public Cube addCubes(Cube o){
        return new Cube(
                this.cubeCoordinates.get(0).addCoordinate(o.cubeCoordinates.get(0)),
                this.cubeCoordinates.get(1).addCoordinate(o.cubeCoordinates.get(1)),
                this.cubeCoordinates.get(2).addCoordinate(o.cubeCoordinates.get(2)),
                this.cubeCoordinates.get(3).addCoordinate(o.cubeCoordinates.get(3))
        );
    }

    // Length of line a
    double getLowerLine(){
        return cubeCoordinates.get(1).getEuclidianDistance(cubeCoordinates.get(0));
    }

    double getRightLine(){
        return cubeCoordinates.get(3).getEuclidianDistance(cubeCoordinates.get(1));
    }

    // Length of line c
    double getUpperLine(){
        return cubeCoordinates.get(3).getEuclidianDistance(cubeCoordinates.get(2));
    }

    double getLeftLine(){
        return cubeCoordinates.get(0).getEuclidianDistance(cubeCoordinates.get(2));
    }



}
