public class Main {

    public static void main(String[] args) {
        int a = 15, b = 7, c = 4, max = a;

        if (max < b) {
            max = b;
        } else if (max < c) {
            max = c;
        }
        System.out.println("en büyük sayı: " + max);
    }
}
