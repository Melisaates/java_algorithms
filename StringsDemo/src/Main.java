public class Main{
    public static void main(String[] args){
        String s="MELİSA ATEŞ";

        System.out.println("eleman sayısı: "+s.length());
        System.out.println("1.eleman: "+s.charAt(0));
        System.out.println(s.concat(" gs"));
        System.out.println(s.startsWith("M"));
        System.out.println(s.endsWith("Ş"));
        char[] name=new char[4];
        s.getChars(2,6,name,0);
        System.out.println(name);
        System.out.println(s.indexOf("E"));
        System.out.println(s.lastIndexOf("E"));
        System.out.println(s.replace(" ","*"));
        System.out.println(s.substring(7,11));
        for(String m:s.split(" ")){
            System.out.println(m);
        }
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        String news="  MELİSA ATEŞ   ";
        System.out.println(news.trim());



    }
}