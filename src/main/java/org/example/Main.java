package org.example;
import java.lang.Math;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(shouldWakeUp(true,23));
        System.out.println(hasTeen(15,25,40));
        System.out.println(isCatPlaying(false,44));

        Scanner scanner = new Scanner(System.in);
        //Dikdörtgen alanı için..
        System.out.print("Dikdörtgenin genişliğini girin: ");
        double width = scanner.nextDouble();

        System.out.print("Dikdörtgenin yüksekliğini girin: ");
        double height = scanner.nextDouble();

        double result = area(width, height);

        if (result == -1) {
            System.out.println("Hatalı giriş! Genişlik ve yükseklik değerleri pozitif olmalıdır.");
        } else {
            System.out.println("Dikdörtgenin alanı: " + result);
        }

        //Daire alanı için..

        System.out.println("Dairenin yarıçapını girin: ");
        double radius=scanner.nextDouble();

        double resultDaire=area(radius);

        if(result==-1){
            System.out.println("Hatalı giriş! Yarıçap değeri pozitif olmalıdır.");
        }else{
            System.out.println("Dairenin alanı: " + resultDaire);
        }

        scanner.close();
    }

    public static boolean shouldWakeUp(boolean isBarking, int clock) {
        /*if(isBarking && (20<clock && clock<=23) ||( 0<=clock && clock<8)){
            return true;
        }else{
            return false;
        }*/

        if(clock<0 || clock>23 || !isBarking) return false;
         return clock<8 || clock >=20;///----->Bu da başka ve daha doğru bir yöntem.
    }

    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {

        int[] ages={firstAge,secondAge,thirdAge};

        //foreach
        for(int age:ages ){
            if(age>=13 && age<=19){
                return true;
            }
        }

        return false;
    }

    public static boolean isCatPlaying(boolean isSummer, int temp) {

        if (isSummer) {
            if (temp >= 25 && temp <= 45) {
                return true;
            } else {
                return false;
            }
        } else {
            if (temp >= 25 && temp <= 35) {
                return true;
            } else {
                return false;
            }
        }


    }

    public static double area(double width, double height) {
        if(width>0 && height>0 ){
            return width * height;
        }else{
            return -1;
        }
    }

    public static double area(double radius) {
    if(radius>0){
        return radius*radius*Math.PI;
    }else {
        return -1;
    }


    }


}
