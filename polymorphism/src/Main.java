public class Main {

    public static void main(String[] args) {
	// write your code here
        //polymorphism
        BaseLogger[] b=new BaseLogger[]{new FileLogger(),new DataBaseLogger()};
        for(BaseLogger a:b){
            a.log();//override yapildi
        }
        Customer c=new Customer(new FileLogger());
        c.Add();
    }
}
