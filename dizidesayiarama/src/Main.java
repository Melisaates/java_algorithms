public class Main {

    public static void main(String[] args) {
        int[] sayilar = new int[]{1, 5, 7, 9, 0};
        int aranacak = 9;
        boolean varmi = false;
        for (int o : sayilar) {
            if (o == aranacak) {
                varmi = true;
                System.out.println("bulundu");
            }
        }
        if (varmi == false) {
            System.out.println("bulunamadı");
        }
    }
}