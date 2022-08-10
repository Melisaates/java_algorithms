/**@author Melisa Ates-20120205045
 *atesmel12@gmail.com
 *Tanimlanan kisi icin  kolesterol degerinin kontrolunu yapan program. 
 *25.03.2021
 */
public class Person{
    String id;
    String gender;//gender=cinsiyet
    double tChol;//tChol=toplam kolesterol
    double hdl;//hdl=HDL(iyi kolesterol)

    Person(String id, String gender, double tChol, double hdl){
        this.id=id;
        this.gender=gender;
        this.gender= gender;
        this.tChol=tChol;
        this.hdl=hdl;
    }

    public double getCholesterolRatio(){
        //Toplam kolesterolun  HDL degerine oranini hesaplayip return etmektedir.
        double sonuc=tChol/hdl;
        return sonuc;
    }

    public boolean hasGoodTotalCholesterol(){
        //Eger kolesterol saglikli aralikta ise true, degilse false return etmektedir.
        if(tChol<200){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean hasGoodHDL(){
        //Eger HDL saglikli aralikta ise true degilse false return etmektedir.
        if(gender.equalsIgnoreCase("female")==true){
            if(hdl>=45){
                return true;
            }
            else{
                return false;
            }
        }
        else if(gender.equalsIgnoreCase("male")==true){
            if(hdl>=40){
                return true;
            }
            else{
                return false;
            }
        }
        return false;
    }

    public boolean hasGoodCholesterolRatio(){
        //Kolesterol orani saglikli aralikta ise true degilse false return etmektedir.
        if(getCholesterolRatio()<=4.5){
            return true;
        }
        else{
            return false;
        }
    }

    public void printReport(){

        System.out.println(id + "'s Report:");
        System.out.println("Total Cholesterol : " + tChol + hasGoodTotalCholesterol());
        System.out.println("HDL : " + hdl + hasGoodHDL());
        System.out.println("TC/HDL Ratio : " + getCholesterolRatio() + hasGoodCholesterolRatio());
    }

    public static void main(String[] args){

        Person p=new Person("0022212345","Male",156,30);
        //p.gender=equalsIgnoreCase(String gender);
        p.printReport();

    }
}