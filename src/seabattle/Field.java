package seabattle;

import java.util.Random;

public class Field {

    private Point[] field;

    public Field(){

        int hor = 1, size = 10, counter = 0;
        char vert = 'a';

        field = new Point[size * size];

        for (int i = 0; i < field.length; i++){
            field[i] =  new Point(vert, hor, false);
            counter ++;
            hor++;
            if (hor == 11){
                hor = 1;
                vert ++;
            }
        }

        System.out.println(counter);
    }

    public void showField(){
        for (Point p : field){
            System.out.print("(" + p.getH() + "," + p.getV() + ") ");
            if (p.getH() == 10){
                System.out.println();
            }
        }
    }

    public void placeShip(int size){
        boolean orientation = new Random().nextBoolean(); //true - vertical, false - horizontal
        int squareNumber = new Random().nextInt(100);
            if (orientation){
                if((field[squareNumber].getV() - size) < 0){
                    //TODO ship doesn't place at this position, not enough squares
                } else {
                    //TODO ship can be placed
                }
            } else {
                if((field[squareNumber].getH() - size) < 0){
                    //TODO ship doesn't place at this position, not enough squares
                } else {
                    //TODO ship can be placed
                }
            }

    }


}
