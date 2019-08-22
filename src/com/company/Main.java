package com.company;
import com.company.generate;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        boolean ulang = true;
        int pilih;
        generate gen= new generate();
        int generateNumber=gen.getgenerateNumber();
        Scanner scan= new Scanner (System.in);
        SingleLinkList sll = new SingleLinkList();
        System.out.println("arrange me");
        System.out.println("Press [enter] to play");
        scan.nextLine();
        do{
        System.out.println("new Number"+generateNumber);
        sll.tampil();

            System.out.println("1.first");
            System.out.println("2.Last");
            System.out.println("3.middle");
            System.out.println("4.Skip");
            System.out.println("5.remove");
            System.out.println("6.exit");
            System.out.println("action");
            pilih=scan.nextInt ();
            if(pilih==1){
                sll.fist(generateNumber);
            }
            if(pilih==2){
                sll.last(generateNumber);
            }
            if(pilih==3){

            }
        }while(pilih!=6);
    }
}
