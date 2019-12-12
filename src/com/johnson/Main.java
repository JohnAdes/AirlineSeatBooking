package com.johnson;

import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner seat = new Scanner(System.in);

        int counter = 78;
        char [][] pSeats = new char [27][11];
        for (int r=1; r<27; r++) {
            for (int c = 1; c <11; c++) {
                pSeats[r][c]=' ';

            }
        }

        int usrRow;
        int usrC;
        int s;
        do {

            System.out.println("enter the seat you want (row column)");
            usrRow = seat.nextInt();
            usrC = seat.nextInt();

            if (pSeats[usrRow][usrC] == 'X') {
                System.out.println("seat already taken.");
            }else{
                pSeats[usrRow][usrC] = 'X';

            }
            try {
                System.out.println("do you wish top enter another seat? (1:yes)");
                s = seat.nextInt();
            }catch(Exception e){
                s=0;
            }
        }while(s==1);


        for (int l=1;l<=26;l++) {
            if (pSeats[l][1]=='X' || pSeats[l][2]=='X' || pSeats[l][3]=='X')
                counter--;
            if (pSeats[l][5]=='X'|| pSeats[l][6]=='X' )
                counter--;
            if (pSeats[l][8]=='X' || pSeats[l][9]=='X' || pSeats[l][10]=='X')
                counter--;
            if (pSeats[l][4]=='X'&& pSeats[l][7]=='X')
                counter--;

        }

        System.out.println("number of family seating left: "+counter);
        for (int r=1; r<27; r++) {
            int c;
            for (c = 1; c <11; c++) {

                System.out.print("("+pSeats[r][c]+ ")");
                if (c == 3) {
                    System.out.print("   ");
                }
                if (c == 7) {
                    System.out.print("   ");
                }  //                    System.out.print(" - ");


            }
            System.out.println();


        }

    }


}