package com.company;
import java.util.Random;
public class generate {
    private int generateNumber;
    public generate(){
        Random rnd=new Random ();
        generateNumber= (int)(rnd.nextInt(9));

    }
    public int getgenerateNumber (){
        return generateNumber;
    }


}
