public class Main {

    public static void main(String[] args) {
	// write your code here
        Product p=new Product();
        p.setName("laptop");
        p.set_id(1);
        ProductManager pm=new ProductManager();
        pm.Add(p);
        System.out.println(p.get_id());
        //System.out.println(p.name);
        System.out.println(p.getkod());
    }
}
