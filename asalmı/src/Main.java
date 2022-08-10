public class Main {

    public static void main(String[] args) {
        int number = 25;
        boolean asalmi = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                asalmi = false;
                //System.out.println("asal değil");
                //break;

            }

        }
        if (asalmi == true) {
            System.out.println("asal");
        } else {
            System.out.println("asal değil");
        }
    }
}
