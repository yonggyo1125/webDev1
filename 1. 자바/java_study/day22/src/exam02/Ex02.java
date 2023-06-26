package exam02;

import static exam02.Transportation.*;

public class Ex02 {
    public static void main(String[] args) {
        Transportation trans = BUS;
        System.out.println(BUS instanceof Transportation);
        //Transportation trans2 = Transportation.valueOf("BUS");

        //System.out.println(trans == trans2);

        switch(trans) {
            case BUS :
                System.out.println("버스!");
                break;
            case SUBWAY:
                System.out.println("지하철!");
                break;
            case TAXI :
                System.out.println("택시!");
                break;
        }
    }
}
