public class Main {

    public static void main(String[] args) {
	char harf='e';
	/*char[] kalin={'a','o','u','ı'};
	boolean kalinmi=true;
	char[] ince={'e','i','ü','ö'};

	for(char h: ince){
	    if(harf==h){
	        kalinmi=false;
        }
    }
	if(kalinmi){
	    System.out.println("kalin");
    }
	else{
	    System.out.println("ince");
    }*/
		switch(harf){
			case'a':
			case'u':
			case'ı':
			case'o':
				System.out.println("kalın");
				break;
			default:
			System.out.println("ince");
		}

    }
}
