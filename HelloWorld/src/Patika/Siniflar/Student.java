package Patika.Siniflar;

public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNo;
    String classes;
    double avarage;
    boolean isPass;

    Student (String name, String stuNo,String classes,Course c1, Course c2, Course c3){
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.avarage = 0.0;
        this.isPass = false;
    }

    void addBulkExamNote (double note1, double note2, double note3,double verbal1, double verbal2,double verbal3){
        //input notes should be between zero to hunderd
        if (note1>=0 && note1<=100){
//            this.c1.note = note1*0.8;
//            this.c1.verbalNote=verbal1*0.2;
            this.c1.note=note1*0.8+verbal1*0.2;
        }
        if (note2>=0 && note2<=100){
//            this.c2.note = note2;
//            this.c2.verbalNote=verbal2;
            this.c2.note=note2*0.7+verbal2*0.3;
        }
        if (note3>=0 && note3<=100){
//           this.c3.note = note3;
//           this.c3.verbalNote = verbal3;
            this.c3.note=note3*0.9+verbal3*0.1;
        }


    }

    void isPass(){
        this.avarage = (this.c1.note + this.c2.note+this.c3.note)/3.0;
        if (this.avarage >55){
            System.out.println("Congrats, you passed the classes");
            this.isPass =true;
        }else {
            System.out.println("you are not passed the clasees!!");
            this.isPass=false;
        }
        printNode();
    }

    void printNode(){
        System.out.println("=======================");
        System.out.println(c1.name + "Notu\t:" + c1.note);
        System.out.println(c2.name + "Notu\t:" + c2.note);
        System.out.println(c3.name + "Notu\t:" + c3.note);
        System.out.println("Ortalamaniz : " + this.avarage);
    }
}
