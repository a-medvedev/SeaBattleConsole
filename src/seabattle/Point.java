package seabattle;

/**
 * Created with IntelliJ IDEA.
 * User: tantal
 * Date: 16.10.13
 * Time: 12:53
 * To change this template use File | Settings | File Templates.
 */
public class Point {

    private char vert;
    private int hor;

    public Point(char v, int h){
        vert = v;
        hor = h;
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
}
