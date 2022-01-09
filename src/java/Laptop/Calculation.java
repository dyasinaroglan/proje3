package java.Laptop;

import java.util.ArrayList;
import java.util.Locale;

public class Calculation {
    int price;


     /*
        Parametresi  ArrayList<String> olan  getRam(); methodunu oluşturun
        Eğer ram 32 gb ise price 300 ekle
        Eğer ram 16 gb ise price 200 ekle
        Eğer ram 8 gb ise price 100 ekle
        Eğer ram 4 gb ise price 50 ekle
        return  price  olmalı.
     */
    // Method yazmaya buradan başlayın

    public int getRam (ArrayList<String> list){
        if(list.get(2).toLowerCase(Locale.ROOT).equals("32 gb")){
            price+= 300;
        }else if(list.get(2).toLowerCase(Locale.ROOT).equals("16 gb")){
            price+=200;
        }else if(list.get(2).toLowerCase(Locale.ROOT).equals("8 gb")){
            price+=100;
        }else if(list.get(2).toLowerCase(Locale.ROOT).equals("4 gb")){
            price+=50;
        }
        return price;

    }

      /*
        Parametresi  ArrayList<String> olan  getCPU(); methodunu oluşturun
        Eğer CPU i3 ise price 200 ekle
        Eğer CPU i5 ise price 300 ekle
        Eğer CPU i7 ise price 500 ekle
        return  price  olmalı
     */
    // Method yazmaya buradan başlayın
    public int getCPU(ArrayList<String> list){
        if(list.get(3).toLowerCase(Locale.ROOT).equals("i3")){
            price+=200;
        }else if(list.get(3).toLowerCase(Locale.ROOT).equals("i5")){
            price+=300;
        }else if(list.get(3).toLowerCase(Locale.ROOT).equals("i7")){
            price+=500;
        }
        return price;
    }
     /*
        Parametresi  ArrayList<String> olan getColor(); methodunu oluşturun
        return türü int olmalı
        Eğer Color Red ise ise price 400 ekle
        Eğer Color Orange ise price 300 ekle
        Eğer Color Silver ise price 200 ekle
        Eğer Color Black ise price 150 ekle
        return  price  olmalı
     */
    // Method yazmaya buradan başlayın

    public int getColor(ArrayList<String> list){
        if(list.get(4).toLowerCase(Locale.ROOT).equals("red")){
            price+=400;
        }else if(list.get(4).toLowerCase(Locale.ROOT).equals("orange")){
            price+=300;
        }else if(list.get(4).toLowerCase(Locale.ROOT).equals("silver")){
            price+=200;
        }else if(list.get(4).toLowerCase(Locale.ROOT).equals("black")){
            price+=150;
        }
        return price;
    }

    /*
        Parametresi  ArrayList<String> olan getSize(); methodunu oluşturun
        return türü int olmalı
        Eğer Size "Mini" içeriyorsa price 100 ekle
        Eğer Size "Middle" içeriyorsa price 200 ekle
        Eğer Size "Max" içeriyorsa price 300 ekle
        return  price  olmalı
    */
    // Method yazmaya buradan başlayın
    public int getSize (ArrayList<String> list){
        if(list.get(1).toLowerCase(Locale.ROOT).equals("mini")){
            price+=100;
        }else if(list.get(1).toLowerCase(Locale.ROOT).equals("middle")){
            price+=200;
        }else if(list.get(1).toLowerCase(Locale.ROOT).equals("max")){
            price+=300;
        }
        return price;
    }

}
