import java.util.Random;

/*
 * @author Melisa Ates
 * atesmel12@gmail.com
 * 23.04.2021
 * This program generates a minesweeper board
 */

public class Minesweeper {

    boolean[][] mineField; // board with mines marked as true
    int rows; // number of rows of the board
    int cols; // number of columns of the board
    int numMines;

    /*
     * Class Constructor
     *
     * @param int rows Number of rows of the board
     *
     * @param int cols Number of columns of the board
     *
     * @param int numMines Number of mines to be placed on the board
     *
     */
    Minesweeper(int rows, int cols, int numMines) {//constructor
        //Minesweeper classinin uyelerinin ilk elemanlarini atadim.
        this.rows = rows;
        this.cols = cols;
        this.numMines = numMines;

        mineField = new boolean[rows][cols];//mineField arrayini olusturdum.
        generateBoard();//Mayin tarlasinin mayinlarini yerlestirmek icin bu metodu cagirdim.

    }

    /*
     * Generates the mineField
     *
     * @param int numMines Number of mines to be placed on the mineField
     *
     * @return boolean[][] Game board with mines placed at random position
     */
    public void generateBoard() {
        //TODO
        Random r = new Random();//Rastegele sayi atamasi yapmasi icin bir random cinsinden r degeri olusturdum.

        int n = numMines;//Yerlestirilmek istenen toplam mayin sayisini n integerina atadim.
        while (n > 0) {//Tum mayinlari yerlestirene kadar islemlerin yapilmasini saglayan bir while dongusu kullandim.
            int x = r.nextInt(rows);//0'la satir sayisi arasinda bir random sayi alip x'e atadim.
            int y = r.nextInt(cols);//0'la sutun sayisi arasinda bir random sayi alip y'ye atadim.
            if (mineField[x][y] != true) {//Eger mayin yoksa o lokasyona mayin yerlestirilir.
                mineField[x][y] = true;
                n--;//1 mayini yerlestirince toplam yerlestirmemiz gereken mayin sayisindan 1 eksilttim.
            } else {
                continue;//Egermayin varsa dongu devam etsin dedim.
            }
        }
    }

    /*
     * Creates the game
     *
     * @return int[][] The board with cell values computed
     */
    public int[][] generateClues() {
        //TODO
        int[][] clues = new int[rows][cols];//Oyundaki ipuclari icin bir mineField dizisi kadarlik yeni bir dizi olusturdum.
        for (int i = 0; i < rows; i++) {//Satirlarda gezebilmesi icin for dongusu olusturdum.
            for (int j = 0; j < cols; j++) {//Sutunlarda gezilmesini saglayan bir for dongusu olusturdum.
                if (mineField[i][j] == true) {//Eger tablomuzun herhangi bir lokasyonunda mayin varsa ipucu tablomuzda o lokasyona -1 yazilmasini sagladim.
                    clues[i][j] = -1;
                } else {//Eger mayin yoksa ipucu tablomuzdaki o lokasyona cevresindeki mayin sayilarini veren counMines metodunu cagirarak atama yaptim.
                    clues[i][j] = countMines(i, j);
                }
            }
        }

        return clues;//Ipuclarini tutan dizimizi en sonda dondurdum.
    }

    /*
     * counts the number of adjacent mines to a given cell position
     *
     * @param int r row position
     *
     * @param int c column position
     *
     * @return int number of mines in the surrounding cells
     */
    public int countMines(int r, int c) {
        int count = 0;//Istenilen lokasyonun komsusunda olan mayin sayilarini tutan count degiskeni olusturdum.

        if (r >= 1 && c >= 1 && r + 1 < rows && c + 1 < cols) {//Indekslerin 0'dan kucuk olmamasi icin ve satir ve sutun miktarini gecmemeleri icin sart kostum.
            //Istenilen lokasyonun tum komsulugundaki lokasyonlara bakabilmek icin ic ice for kulladim.
            for (int i = r - 1; i <= r + 1; i++) {//Lokasyonun bir ustundeki satirdan bir altindakine dogru giden for fongusu kullandim.
                for (int j = c - 1; j <= c + 1; j++) {//Lokasyonun bir ustundeki sutundan 1 altindakine dogru giden for fongusu kullandim.
                    if (mineField[i][j] == true) {//Eger o bolgede mayin varsa count degiskeni arttirilir.
                        count++;
                    }
                }
            }
        }
        if (mineField[r][c] == true)//Lokasyonun kendisinde mayin varsa onu hesaba katmamak icin en sonda count degiskenini bir azalttim.
            return count - 1;

        return count;
    }

    /*
     * prints the game mine is represented by *
     *
     * @param int[][] game The game board
     */
   /* public static void printClues(int[][] clues) {
    //TODO
        for (int i = 0; i < rows; i++) {//Satirlarda gezebilmesi icin for dongusu olusturdum.
            for (int j = 0; j < cols; j++) {//Sutunlarda gezilmesini saglayan bir for dongusu olusturdum.
                if (cluesField[i][j] == -1) {//Eger tablomuzun herhangi bir lokasyonunda mayin varsa ipucu tablomuzda o lokasyona -1 yazilmasini sagladim.
                    clues[i][j] = *;
                }

    }*/


    public static void main(String[] args) {
        Minesweeper m = new Minesweeper(3, 3, 2);
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(m.mineField[i][j]);
            }
        }


    }

}
