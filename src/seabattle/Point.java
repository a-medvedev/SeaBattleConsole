package seabattle;


public class Point {

    private boolean occupied;
    private char vert;
    private int hor;

    public Point(){
        vert = '\0';
        hor = 0;
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

    public void setH(int h){
        hor = h;
    }
    
    public void setV(char v){
        vert = v;
    }

    public boolean isOccupied(){
        return occupied;
    }
}
