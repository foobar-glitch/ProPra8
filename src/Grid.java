import java.util.ArrayList;

import static java.lang.Math.abs;
import static java.lang.Math.sqrt;

public class Grid {
    private ArrayList<Cube> cubes;
    Grid(){
        cubes = new ArrayList<>();
    }



    public Cube addCubeToGrid(Cube c){
        double horizontalAxis = 0;
        /*
        c2 --- c3
        |       |
        |       |
        c0 --- c1
         */
        Coordinate c0, c1, c2, c3;
        Cube s = new Cube(cubes.get(0).getCoordinates());
        for(Cube elem: cubes){
            s = s.addCubes(elem);
        }
        return s;
    }

    public ArrayList<Cube> getCubes() {return cubes;}
    public void setCubes(ArrayList<Cube> cubes) {this.cubes = cubes;}

}
