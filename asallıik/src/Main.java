public class Main {

    public static void main(String[] args) {
	int sayi=81;
	boolean asalmi=true;
	for(int i=2;i<sayi;i++){
	    if(sayi%i==0){
	        asalmi=false;
        }
    }
	System.out.println(asalmi);
    }
}
