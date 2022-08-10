import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        DortIslem d=new DortIslem();
        Scanner sc=new Scanner(System.in);
        int x= sc.nextInt();
        int y=sc.nextInt();


        System.out.println(d.topla(x,y));
    }
}
