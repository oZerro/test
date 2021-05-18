package com.javalesson.index.lesson1;

import java.util.Arrays;
import java.util.Scanner;

public class Computer extends Peremen{



    public static void converter(int a){
        String rimResalt = "";
        for(int i = 0; i < chisla1.length; i++){
            while(chisla1[i] <= a){
                rimResalt = rimResalt + rimChisla2[i];
                a = a - chisla1[i];
            }
        }
        System.out.println(rimResalt);
    }

    public static void schet(){
        Scanner virazenie = new Scanner(System.in);
        System.out.println("Введите выражение");


        while(true){
            String text = virazenie.nextLine();
            String[] words = text.split(" ");

            if(words.length < 3){
                System.out.println("Не корректное выражение");
                break;
            }

            int countInt1 = 0;
            for(int i = 0; i < chisla.length; i++){
                if(words[0].equals(chisla[i])){
                    countInt1++;
                }
            }
            int countInt2 = 0;
            for(int i = 0; i < chisla.length; i++){
                if(words[2].equals(chisla[i])){
                    countInt2++;
                }
            }


            int countRim1 = 0;
            for(int i = 0; i < rimChisla.length; i++){
                if(words[0].equals(rimChisla[i])){
                    countRim1++;
                }
            }
            int countRim2 = 0;
            for(int i = 0; i < rimChisla.length; i++){
                if(words[2].equals(rimChisla[i])){
                    countRim2++;
                }
            }

           if(countInt1 == 1 && countInt2 == 0){
               System.out.println("Калькулятор работает либо только с римскими," +
                       " либо только с арабскими числами в пределах 10");
               break;
           }

            if(countInt1 == 0 && countInt2 == 1){
                System.out.println("Калькулятор работает либо только с римскими," +
                        " либо только с арабскими числами в пределах 10");
                break;
            }

            if(countRim1 == 1 && countRim2 == 0){
                System.out.println("Калькулятор работает либо только с римскими," +
                        " либо только с арабскими числами в пределах 10");
                break;
            }

            if(countRim1 == 0 && countRim2 == 1){
                System.out.println("Калькулятор работает либо только с римскими," +
                        " либо только с арабскими числами в пределах 10");
                break;
            }



            if(words[2].equals("0") && words[1].equals("/")){
                System.out.println("На ноль делить нельзя!");
                break;
            }




            if(countRim1 == 1 && countRim2 == 1){
                int y1 = 0, y2 = 0;

                for(int i = 0; i < rimChisla.length; i++){
                    if(words[0].equals(rimChisla[i])){
                        y1 = Integer.parseInt(chisla[i + 1]);
                    }

                }

                for(int i = 0; i < rimChisla.length; i++){
                    if(words[2].equals(rimChisla[i])){
                        y2 = Integer.parseInt(chisla[i + 1]);
                    }
                }

                if(words[1].equals(simvol[1])){
                    System.out.println("Результат");
                    rez = y1 + y2;
                    converter(rez);
                    continue;
                }

                if(words[1].equals(simvol[2])){
                    System.out.println("Результат");
                    rez = y1 - y2;
                    converter(rez);
                    continue;
                }

                if(words[1].equals(simvol[0])){
                    System.out.println("Результат");
                    rez = y1 / y2;
                    converter(rez);
                    continue;
                }

                if(words[1].equals(simvol[3])){
                    System.out.println("Результат");
                    rez = y1 * y2;
                    converter(rez);
                    continue;
                }
            }


            if(countInt1 == 1 && countInt2 == 1){

                int x1 = Integer.parseInt(words[0]);
                int x2 = Integer.parseInt(words[2]);

                if(words[1].equals(simvol[1])){
                    System.out.println("Результат");
                    System.out.println(x1 + x2);
                    continue;
                }

                if(words[1].equals(simvol[2])){
                    System.out.println("Результат");
                    System.out.println(x1 - x2);
                    continue;
                }

                if(words[1].equals(simvol[0])){
                    System.out.println("Результат");
                    System.out.println(x1 / x2);
                    continue;
                }

                if(words[1].equals(simvol[3])){
                    System.out.println("Результат");
                    System.out.println(x1 * x2);
                    continue;
                }

            }

        }
    }


}
