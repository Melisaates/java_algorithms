public class Main{
    public static void main(String[] args){
        String[] name=new String[3];
        name[0]="me";
        name[1]="li";
        name[2]="sa";

        for(int i=0;i<name.length;i++){
            System.out.println(name[i]);
        }
        System.out.println(".............");

        for(String m:name){
            System.out.println(m);
        }
    }
}