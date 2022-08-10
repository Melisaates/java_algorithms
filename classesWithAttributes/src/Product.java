public class Product {
    private int _id;
    private String name;
    private int stockamount;
    private int price;
    private String kod;


    public String getkod(){
        return this.name.substring(0,1)+this._id;
    }
    public void setkod(String kod){
        this.kod=kod;
    }




    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStockamount() {
        return stockamount;
    }

    public void setStockamount(int stockamount) {
        this.stockamount = stockamount;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
