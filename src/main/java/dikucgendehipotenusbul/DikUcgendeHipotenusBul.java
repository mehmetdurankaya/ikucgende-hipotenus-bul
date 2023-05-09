package dikucgendehipotenusbul;

import java.util.Scanner;

/*
    @author Mehmet Duran Kaya

**/
public class DikUcgendeHipotenusBul {
    public static void main(String[] args) {
    //variables declaration
        int a,b;
        double c;
        Scanner scan=new Scanner(System.in);
        System.out.print("Birinci kenarı giriniz ");
        a=scan.nextInt();
        System.out.print("İkinci kenarı giriniz ");
        b=scan.nextInt();

        c=Math.sqrt((a*a)+(b*b));
        System.out.println("Hipotenus " + c);


    }
}
