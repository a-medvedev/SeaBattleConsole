package seabattle;

public class Field {

    private Point[] field;

    public Field(){

        int hor = 1, size = 10;
        char vert = 'a';

        field = new Point[size * size];
        for (Point p : field){
            p = new Point(vert, hor, false);
            hor++;
            if (hor == 10){
                hor = 1;
                vert ++;
            }
        }
    }
}
