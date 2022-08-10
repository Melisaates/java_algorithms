import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int sayi , toplam = 0;
        Scanner s=new Scanner(System.in);
        System.out.println("sayı giriniz");
        sayi=s.nextInt();
        for (int i = 1; i < sayi; i++) {
            if(sayi%i==0){
                toplam+=i;
            }
        }
        if(toplam==sayi){
            System.out.println("mükemmel sayıdır");
        }
        else{
            System.out.println("mükemmel sayı değildir");
        }
    }
}
