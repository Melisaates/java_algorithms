public class Customer {

    private BaseLogger b;
    public Customer(BaseLogger b){
        this.b=b;
    }

    public void Add(){
        System.out.println("Müşteri eklendi.");
        this.b.log();
    }

    //bagimli hale geliyor customer bunu kullanma.
    //DataBaseLogger b=new DataBaseLogger();
    //b.log();
}
