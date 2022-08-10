public class DortIslem {
    public int topla(int x,int y){
        return x+y;
    }
    public int cikar(int x,int y){
        return x-y;
    }
    public int carp(int x,int y){
        return x*y;
    }
    public int bol(int x,int y){
        if(y!=0){
            System.out.println("tanımsız");
            return -1;
        }
        return x/y;
    }
}
