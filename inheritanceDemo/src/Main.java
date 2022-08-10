public class Main {

    public static void main(String[] args) {
	// write your code here
        TarimKrediManager t=new TarimKrediManager();
        EmekliKrediManager e=new EmekliKrediManager();
        KrediUI k=new KrediUI();
        k.KrediHesapla(e);
        k.KrediHesapla(t);
        //sadece emekli girmek zorunda degiliz.bunun icin de base i kullniriz.

    }
}
