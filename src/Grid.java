import java.util.ArrayList;

import static java.lang.Math.abs;

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
        int xAxis = 0, yAxis = 0;
        for(Cube elem: cubes){
            xAxis = (elem.coordinates.get(0)) ;
            //eL = abs(eX1 - eY1);

            //cX1 = elem.getX();
            //cY1 = elem.getY();
            //eC = abs(cX1 - cY1);



        }
    }
    public ArrayList<Cube> getCubes() {return cubes;}
    public void setCubes(ArrayList<Cube> cubes) {this.cubes = cubes;}

}
