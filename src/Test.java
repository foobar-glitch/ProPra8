public class Test {

    public static void main(String[] args) {
        Coordinate c00 = new Coordinate(0, 0);
        Coordinate c10 = new Coordinate(1, 0);
        Coordinate c01 = new Coordinate(0, 1);
        Coordinate c11 = new Coordinate(1, 1);

        Coordinate c20 = new Coordinate(2, 0);
        Coordinate c21 = new Coordinate(2, 1);

        Cube cube0 = new Cube(c00, c10, c01, c11);
        Cube cube1 = new Cube(c01, c11, c20, c21);

        Cube cubeGes = cube0.addCubes(cube1);


        System.out.println("=======================");
        System.out.println(cube0.printCoordinates());
        System.out.println("=======================");
        System.out.println(cube1.printCoordinates());
        System.out.println("=======================");
        System.out.println(cubeGes.printCoordinates());
        System.out.println("=======================");
    }
}