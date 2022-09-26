package Patika.Siniflar;

public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    double note;
    double verbalNote;

    //Yeni bir sey ogreniyoruz, teacher i course sinifina atayacagiz!

    Course (String name, String code, String prefix){
        this.name = name;
        this.code=code;
        this.prefix= prefix;
        double note = 0;
        double verbalNote = 0;

    }

    void addTeacher(Teacher teacher) {
        if (teacher.branch.equals(this.prefix)) {
            this.teacher = teacher;
        } else {
            System.out.println("The teacher and branch are not matched.");
        }
    }

//
    void printTeacherInfo(){
        this.teacher.print();
    }
}
