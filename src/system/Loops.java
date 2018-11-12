package system;
import sun.awt.FontConfiguration;

import java.util.Scanner;

import static java.lang.System.out;

public class Loops {
    private static Scanner result;


    public static void main(String[] args) {

        out.println("Please type your name below");

        Scanner will = new Scanner(System.in);

        System.out.println("Hie " + will.nextLine());


        out.println("You got a Bone to pick");

        System.out.println("Whats your favourate movie?");

        Scanner movie = new Scanner(System.in);
        System.out.println("Nooo way!! " + movie.nextLine() + "  is my favorate too!! ");

        System.out.println("Let me sum up your favourate number");

        Scanner sum = new Scanner(System.in);
        System.out.println("Cool!! you have chosen "+sum.nextLine() );

    }
    public Loops (int result ){



        int sum = result;

       // for(int sum<=0;  sum <10; sum ++){
       //     sum=sum +result ;
        }

    }



    //public Loops (int sum){












/*
//for (int q =10; q<=30 ; q++){
Scanner will = new Scanner(System.in);
	System.out.println("Type your name here:");
	System.out.println(will.nextLine());
	System.out.println("Hi "+ System.in);
	//out.println("Bomboclaat like lm from kingston");
 */