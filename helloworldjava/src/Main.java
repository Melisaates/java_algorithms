class Cat{
    int yas;
    String name;

    Cat(int a,String c){
        yas =a;
        name=c;
    }

    public static void main(String[] args){
        Cat MyCat=new Cat(12,"elisa");
        System.out.println(MyCat.yas + MyCat.name);
    }

}