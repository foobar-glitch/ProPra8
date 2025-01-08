import java.util.ArrayList;

import static java.lang.Math.abs;
import static java.lang.Math.sqrt;

public class Grid {
    private ArrayList<Cube> cubes;
    Grid(){
        cubes = new ArrayList<>();
    }

    public void addCube(Cube c){
        if(this.fits(c)){
            cubes.add(c);
        }
    }


    public boolean fits(Cube c){
        double xAxis = 0, yAxis = 0;
        /*
        c2 --- c3
        |       |
        |       |
        c0 --- c1
         */
        Coordinate c0, c1, c2, c3;
        for(Cube elem: cubes){
            ArrayList<Coordinate>  cubeCoordinates = elem.getCoordinates();
            c0 = cubeCoordinates.get(0);
            c1 = cubeCoordinates.get(1);
            c2 = cubeCoordinates.get(2);
            c3 = cubeCoordinates.get(3);

            //c0-c1 distance
            //double dx0x1 = sqrt((c1.getX() - c0.getX())^2 + (c1.getY() - c0.getY()^2));

            //Euklid. Abstand zwischen zwischen zwei Punkten im Koordinaten system
            double d01 = c0.getEuclidianDistance(c1), d03 = c0.getEuclidianDistance(c3);
            xAxis += d01;
            yAxis += d03;


        }
        //Punkt liegt in gerade?
        //if(xAxis >= c.)
    }
    public ArrayList<Cube> getCubes() {return cubes;}
    public void setCubes(ArrayList<Cube> cubes) {this.cubes = cubes;}

}
