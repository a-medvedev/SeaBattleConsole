package seabattle;


public class Point {

    private boolean occupied;
    private char vert;
    private int hor;

    public Point(char v, int h){
        vert = v;
        hor = h;
    }

    public Point(char v, int h, boolean isOccupied){
        vert = v;
        hor = h;
        occupied = isOccupied;
    }

    public int getV(){

        switch(vert){
            case 'a':
                return 1;
            case 'b':
                return 2;
            case 'c':
                return 3;
            case 'd':
                return 4;
            case 'e':
                return 5;
            case 'f':
                return 6;
            case 'g':
                return 7;
            case 'h':
                return 8;
            case 'i':
                return 9;
            case 'j':
                return 10;
            default:
                return 0;
        }
    }

    public int getH(){
        return hor;
    }

    public boolean isOccupied(){
        return occupied;
    }
}
