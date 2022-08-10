public class Main {

    public static void main(String[] args) {
	// write your code here
        Customer c=new Customer();
        Emploee e=new Emploee();
        System.out.println(e.name+" "+c.name);
        c.add();
        e.add();
        c.list();
    }
}
