public class Main{

    public static void main(String[] args){
        int sayi1=50;
        int sayi2=25;
        int sayi3=200;
        int max=sayi1;

        if(sayi2>max){
            max=sayi2;
            System.out.println(max);
        }
        else if(sayi3>max){
            max=sayi3;
            System.out.println(max);
        }
        else{
            System.out.println(max);
        }

    }
}
