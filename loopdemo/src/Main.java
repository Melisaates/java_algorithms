public class Main {

    public static void main(String[] args) {

        int i = 1;
        while (i < 10) {
            System.out.println(i);
            i++;
        }
        System.out.println("while finished");
        for (i = 1; i < 10; i++) {
            System.out.println(i);
        }
        System.out.println("for finished");
        int j = 1;
        do {
            System.out.println(j);
            j++;
        } while (j < 10);
        System.out.println("do-while finished");
    }
}