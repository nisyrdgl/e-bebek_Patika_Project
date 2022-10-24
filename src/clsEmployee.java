import java.util.Scanner;

public class clsEmployee {
    static String sName;
    static double dSalary;
    static double dWorkHours;
    static int iHireYear;

    public clsEmployee(String sName,double dSalary,double dWorkHours,int iHireYear) {
        this.sName = sName;
        this.dSalary = dSalary;
        this.dWorkHours=dWorkHours;
        this.iHireYear = iHireYear;
    }

    public clsEmployee() {

    }

    public static void main(String[] args) {


       clsEmployee employee=new clsEmployee("Kemal",2000,45,1985);
        employee.tax();
        employee.bonus();
        employee.raiseSalary();
        employee.toString();
        System.out.println(employee.toString());
    }

    public double  tax(){
       double vergi=0;
        if(dSalary<1000)
        {
            vergi=0;
            //System.out.println("çalışanın vergi miktarı:"+vergi);
        }
        else if(dSalary>=1000) {
            vergi = dSalary * 0.03;
            //System.out.println("çalışanın vergi miktarı:"+vergi);
        }
        return vergi;
    }
    public  double bonus(){
        double ucret=0;
        if(dWorkHours<40)
        {
            ucret=0;
            //System.out.println("çalışanın ekstra çalışma saati yoktur");
        }
        else if(dWorkHours>=40){
            ucret=(dWorkHours-40)*30;
            //System.out.println("çalışanın fazla bonus miktarı:" +ucret);
        }
        return ucret;
    }
    public  double raiseSalary(){
        int year=2021;
        double zam=0;
        if((year-iHireYear)<10)
        {
            zam=dSalary*0.05;
        }
        else if((year-iHireYear)>9&&(year-iHireYear)<20){
            zam=dSalary*0.1;

        }
        else if((year-iHireYear)>19){
            zam=dSalary*0.15;
        }
        return zam ;
    }

    public String toString(){

        String calisan="Adı: "+sName+"\nMaaşı: "+dSalary+"\nÇalışma Saati: "+dWorkHours+"\nİşe giriş yılı: "+iHireYear+
                "\nÇalışanın vergisi: "+tax()+"\nBonus: "+bonus()+"\nMaaş artışı: "+raiseSalary()+"\nVergi ve bonuslarla beraber maaş: "
                +(dSalary+bonus()-tax())+"\ntoplam maaş: "+
                (this.dSalary+raiseSalary()+bonus()-tax());
        return calisan;
    }


}
