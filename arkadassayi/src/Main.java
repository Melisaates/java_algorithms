public class Main {

    public static void main(String[] args) {
	int n=265,m=284,toplam=0;
	for(int i=1;i<n;i++){
	    if(n%i==0){
	        toplam+=i;
        }
    }
	if(toplam==m){
	    toplam=0;
	    for(int j=1;j<m;j++){
            if(m%j==0){
                toplam+=j;
            }
        }
	    if(toplam==n){
	        System.out.println("arkadaş sayıdır");
        }

    }else{
        System.out.println("arkadaş değildir.");
    }
    }
}
