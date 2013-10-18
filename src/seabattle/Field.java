package seabattle;

public class Field {

    private Point[] field;

    public Field(){

        int hor = 1, size = 10, counter = 0;
        char vert = 'a';

        field = new Point[size * size];
        for (Point p : field){
            p = new Point(vert, hor, false);
            counter++;
            hor++;
            if (hor == 10){
                hor = 1;
                vert ++;
            }
        }

        System.out.println(counter);
    }

    public void showField(){
        for (Point p : field){
            System.out.print("(" + p.getH() + "," + p.getV() + ") ");
            if (p.getV() == 10){
                System.out.println();
            }
        }
    }
}
