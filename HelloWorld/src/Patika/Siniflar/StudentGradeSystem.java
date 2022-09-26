
package Patika.Siniflar;

public class StudentGradeSystem {
    public StudentGradeSystem() {
    }

    public static void main(String[] args) {
        Teacher t1 = new Teacher("Rita", "History", "7681237");
        Teacher t2 = new Teacher("Graham Bell", "PHS", "675");
        Teacher t3 = new Teacher("Francesco", "APP1", "123123");
        Course history = new Course("history", "101", "History");
        history.addTeacher(t1);
        Course physis = new Course("Fizik", "102", "PHS");
        physis.addTeacher(t2);
        Course bio = new Course("Bioloji", "103", "APP1");
        bio.addTeacher(t3);
        Student s1 = new Student("Adil", "123", "5", history, physis, bio);
        s1.addBulkExamNote(100.0, 80.0, 50.0, 20.0, 30.0, 40.0);
        s1.isPass();
        Student s2 = new Student("Ahmet", "3131", "11", history, physis, bio);
        s2.addBulkExamNote(50.0, 90.0, 99.0, 20.0, 100.0, 90.0);
        s2.isPass();
    }
}
