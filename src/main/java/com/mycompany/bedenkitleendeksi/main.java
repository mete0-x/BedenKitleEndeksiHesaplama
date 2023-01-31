package com.mycompany.bedenkitleendeksi;

import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        /*
          Kullanıcadan aldığınız boy ve kilo değerlerine göre kullanıcının beden kitle indeksini(indk) bulun.

          Beden Kitle İndeksi : Kilo / Boy(m) * Boy(m)


       */

      Scanner scanner = new Scanner(System.in);

        System.out.println("Kilonuzu Girin  : ");
        int kilo = scanner.nextInt();

        System.out.println("Boyunuzu Girin (örnk :1,78):");
        double boy = scanner.nextDouble();
       
        double indk = kilo / (boy *boy);
        System.out.println("Beden indeksiniz :" + indk);



    }

}
