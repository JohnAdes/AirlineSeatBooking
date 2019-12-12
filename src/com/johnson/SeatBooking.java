package com.johnson;

import java.util.Scanner;

class SeatBooking {

    public static void main(String[] args) {
    // In a matrix, we are initializing 26 rows and 10 columns seats with space.
    // Taking starting index for [r][c] as [1][1]

    char[][] pSeats = new char[27][11];
        for (int r = 1; r < 27; r++) {
        for (int c = 1; c < 11; c++) {
            // Assigning space for each cell
            pSeats[r][c] = ' ';

        }
    }

    // creating scanner object to get user input from keyboard
    Scanner seat = new Scanner(System.in);

    // Enter booked seat numbers as Strings separated by comma(i.e A4, A10, C5, D3,
    // E6, F8.)
        System.out.println("Welcome to American Airlines \nEnter the seat numbers in Uppers Case from A1-Z10:");
    String booked_Seating_Numbers = seat.nextLine();

    // splitting user input string into array
    String[] booked_Seating_Numbers_Split = booked_Seating_Numbers.split(",");
    // System.out.println(Arrays.toString(booked_Seating_Numbers_Split));

    // looping every seat number into string array to calculate row and column number
        for (String s : booked_Seating_Numbers_Split) {
            // System.out.println(booked_Seating_Numbers_Split[i].substring(0,1));

            // extracting the first letter from seat number(ie A1 -extracting A from A1)
            String current_Seat_Row = s.substring(0, 1);

            // extracting the column number from seat number(ie A10 -extracting 10 from A10)
            String current_Seat_Col = s.substring(1);

            //initializing userrow and usercolumn
            int usrRow = 0;
            int usrC;

            // row -converting seat Alphabet to seat number(ie A to 1)
            switch (current_Seat_Row) {
                case "A":
                    usrRow = 1;
                    break;
                case "B":
                    usrRow = 2;
                    break;
                case "C":
                    usrRow = 3;
                    break;
                case "D":
                    usrRow = 4;
                    break;
                case "E":
                    usrRow = 5;
                    break;
                case "F":
                    usrRow = 6;
                    break;
                case "G":
                    usrRow = 7;
                    break;
                case "H":
                    usrRow = 8;
                    break;
                case "I":
                    usrRow = 9;
                    break;
                case "J":
                    usrRow = 10;
                    break;
                case "K":
                    usrRow = 11;
                    break;
                case "L":
                    usrRow = 12;
                    break;
                case "M":
                    usrRow = 13;
                    break;
                case "N":
                    usrRow = 14;
                    break;
                case "O":
                    usrRow = 15;
                    break;
                case "P":
                    usrRow = 16;
                    break;
                case "Q":
                    usrRow = 17;
                    break;
                case "R":
                    usrRow = 18;
                    break;
                case "S":
                    usrRow = 19;
                    break;
                case "T":
                    usrRow = 20;
                    break;
                case "U":
                    usrRow = 21;
                    break;
                case "V":
                    usrRow = 22;
                    break;
                case "W":
                    usrRow = 23;
                    break;
                case "X":
                    usrRow = 24;
                    break;
                case "Y":
                    usrRow = 25;
                    break;
                case "Z":
                    usrRow = 26;
                    break;


            }

            // converting string to integer using integer.value of ("ie "10" to 10)

            usrC = Integer.parseInt(current_Seat_Col);

            // Assigning seats by marking X in the matrix
            pSeats[usrRow][usrC] = 'X';
        }


    // counter = 78 (26 rows * 3 Passengers = 78 total possible Family combinations
    // )
    int counter = 78;


        for (int l = 1; l <= 26; l++) {

        // checking first row left seats combinations
        if (pSeats[l][1] == 'X' || pSeats[l][2] == 'X' || pSeats[l][3] == 'X')
            counter--;
        // checking first row middle seats combinations
        if (pSeats[l][5] == 'X' || pSeats[l][6] == 'X')
            counter--;
        else if (pSeats[l][4] == 'X' && pSeats[l][7] == 'X')
            counter--;

        // checking first row right seats combinations
        if (pSeats[l][8] == 'X' || pSeats[l][9] == 'X' || pSeats[l][10] == 'X')
            counter--;

    }
    // displaying output for seats left
        System.out.println("Number of family seating left: " + counter);


    // Printing seating display in the matrix form
        for (int r = 1; r < 27; r++)
    {
        for (int c = 1; c < 11; c++)
        {

            System.out.print("(" + pSeats[r][c] + ")");

            // creating Aisle space after 3rd column
            if (c == 3) {
                System.out.print("   ");
            }

            // Creating aisle space after 7th column
            if (c == 7) {
                System.out.print("   ");
            }

        }
        // After printing each row. println goes to next new line for printing next row
        // and so on..
        System.out.println();
    }
    //closing scanner
        seat.close();
}
}
