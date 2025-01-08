import static java.lang.Math.sqrt;

public class Coordinate {
    private final int x;
    private final int y;

    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    int getX(){return this.x;}
    int getY(){return this.y;}


    public double getEuclidianDistance(Coordinate o){
        return sqrt((o.getX() - this.getX())^2 + (o.getY() - this.getY()^2));
    }
}
