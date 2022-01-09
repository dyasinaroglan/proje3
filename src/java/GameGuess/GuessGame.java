package java.GameGuess;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class GuessGame {

    /*
        int randomGenerator();  methodu oluşturun.
        Bu method 0 ile 100 arasında random bir sayı oluşturmalı.
        Bu method random sayıyı return etmeli.
     */
    // Method yazmaya buradan başlayın
    public int randomGenerator(){
         Random random = new Random();
         int sayı = random.nextInt(100);
         return sayı;
    }

















    /*
        void letsGuess ()  methodunu oluşturalım.
        Bu method parametre olarak bir int almalı.
        Bu method, kullanici doğru sayıyı bulana ya da tahmin etme limitine ulaşana kadar sormaya devam edecek.
        Girilen sayı random sayıdan küçükse "Your number is too low" yazdıralım.
        Girilen sayı random sayıdan büyükse "Your number is too high" yazdıralım.
        Girilen sayı random sayıya eşit olduğunda "You got it !!" yazdıralım
        Ve loop sonlandırılsın.
        Tahmin girişiminiz maksimum 5'tir.
        Eğer tahmininiz  5'e ulaşırsa "Anlamadım dostum !!!"

        Not:
         1) Sayıları tahmin ederken Scanner Class kullanmanız gerekir.
         2) Bu methodların her ikisi de statik bir method değildir
    */
    // Method yazmaya buradan başlayın

    public void letsGuess(int randomSayı){
        Scanner scanner = new Scanner(System.in);
        int sayac =0;
        while (sayac<5){
            System.out.println("sayı giriniz");
            int sayı=scanner.nextInt();
            if(sayı<randomSayı){
                System.out.println("Your number is too low");
            }
            else if(sayı>randomSayı){
                System.out.println("Your number is too high" );
            }else {
                System.out.println("You got it !!");
                break;

            }
            sayac++;

        }if(sayac>=5){
            System.out.println("Anlamadım dostum !!!");
        }
    }


}
