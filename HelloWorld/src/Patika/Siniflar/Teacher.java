package Patika.Siniflar;

public class Teacher {

    //Define the quantities of Teacher Class
    String name;
    String phoneNummer;
    String branch;

    Teacher(String name, String branch, String phoneNummer){
        this.name = name;
        this.branch = branch;
        this.phoneNummer=phoneNummer;

    }
    void print (){
        System.out.println("Adi : " + this.name);
        System.out.println("Bolumu : " + this.branch);
        System.out.println("Telefonu : " + this.phoneNummer);

    }
}
