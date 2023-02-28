import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class IphoneCart {

    public static void main(String[] args) {
        System.out.println("Welcome To Iphone Services");

        Iphone I1=new Iphone("14 ProMax |","Iphone |",150000 ,"48 Mp |","6.7 inches |",IphoneType._5G,"  128 GB |");
        Iphone I2=new Iphone("13 Max |","Iphone |",125000,"32 Mp |","5.5 inches |",IphoneType._6G,"64 GB |");
        Iphone I3=new Iphone("10 ProMax |","Iphone |",19000,"30 Mp |","4.5inches |",IphoneType._6G,"64 GB |");
        Iphone I4=new Iphone("12 |","Iphone |",112000,"25 Mp |","4.5inches |",IphoneType._5G,"64 GB |");
        Iphone I5=new Iphone("12 |","Iphone |",115000,"25 Mp |","4.5inches |",IphoneType._5G,"64 GB |");

        ArrayList<Iphone> Iph=new ArrayList<>();
        Iph.add(I1);
        Iph.add(I2);
        Iph.add(I3);
        Iph.add(I4);
        Iph.add(I5);

        System.out.println("-------------------------------------------------------------");
        Iph.forEach((iphone)->{
            System.out.println(iphone);
        });

        System.out.println("-------------------------------------------------------------");
        I3.Exchangable();
        I4.Repairable();
        I1.Sellable();
        I2.Lostable();
    }



}
