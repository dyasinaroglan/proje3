package java.Laptop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Data d1=new Data();
        Scanner scanner=new Scanner(System.in);
        System.out.println("indirim oranı yazınız ");
        int discountRate=scanner.nextInt();
        PriceForOneLaptop p1=new PriceForOneLaptop();
        //System.out.println("total "+ p1.getPrice(1100006));
        int total= p1.getPrice(1100006);
        System.out.println("Toplam fiyat "+total);
        int sonHal= p1.getDiscount(total,discountRate);

        System.out.println("indirimli fiyatı "+sonHal);
    }

    }

