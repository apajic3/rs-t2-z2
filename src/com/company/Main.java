package com.company;

import java.util.Scanner;


public class Main {

    public static int sumacifara(int n){
	int s = 0;
	while(n!=0){

	    s=s+n%10;
	    n=n/10;
    }
   return s;

    }
    public static void main(String [] args){

        int n;
        Scanner ulaz=new Scanner(System.in);
        System.out.println("Unesite do kojeg broja zelite ispis");
        n=ulaz.nextInt();
        for (int i=1;i<n;i++){
            if((i%sumacifara(i))==0){
                System.out.println(i);
            }
        }
    }




}
