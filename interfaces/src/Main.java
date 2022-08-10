public class Main {

    public static void main(String[] args) {
	// write your code here
        //ICustomerDal iCustomerDal=new OracleCustomerDal();
        //iCustomerDal.add();

        //CustomerManager customerManager=new CustomerManager();
        //customerManager.customerDal=new OracleCustomerDal();
        //customerManager.add();
        CustomerManager customerManager=new CustomerManager(new OracleCustomerDal());
        customerManager.add();





    }
}
