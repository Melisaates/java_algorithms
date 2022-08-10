public class Main{
    public static void main(String[] args){
        double[] mylist={1.3,1.2,4.3,5.6};
        double total=0,max=mylist[0];

        for(double number:mylist){
            total+=number;
            if(max<number){
                max=number;
            }
        }
        System.out.println("en büyük sayı: "+max+"\n"+"toplam: "+total);

    }
}